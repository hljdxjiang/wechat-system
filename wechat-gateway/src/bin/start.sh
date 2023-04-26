#!/bin/bash
#################################
#   start or stop the service
#    written by jhc
#      at 201380104
#################################

cd $(dirname $0)

#######################################
# Brief:
#   select attribute
# Arguments:
#
# Returns:
#   value
#######################################
function select_attribute() {
    local attr_config_file=$1
    local filter=$2
    local value=''
    if [[ ! -f "${attr_config_file}" ]]; then
        echo $value
        return
    fi
    cat $attr_config_file | while read line
    do
        key=`echo $line | awk -F ':' '{print $1}'`
        key=$(echo $key)
        if [ "$key"X == "$filter"X ];then
            value=`echo $line | cut -d ':' -f2-`
            echo $value
            value=$(echo $value)
            return
        fi
    done
    echo $value
}

function function_check()
{	
    local function_check=$1
    local total_retry_times=$2
    local time_interval=$3
    local service_status=$4
    local check_result=0
    local retry_time=0

    while (( 1 ))
    do 
    	if [ $retry_time -ge $total_retry_times ];then
	    echo -e "[ERROR] Check Retry too many times!"
            return 1
    	fi
    	${function_check} ${service_status}
        eval check_result=$? 
    	if [ $check_result -eq 0 ];then        
    	    return 0
    	elif [ $check_result -eq 1 ]; then
    	    echo "Waiting.........."
    	fi
    	sleep $time_interval && let "retry_time += 1"
    done
	return 0
}

function service_check()
{
	local check=$1
	if [ "${check}" == "start" ];then
	    function_check check_port ${basic_retry_times} ${basic_time_interval} start
	    eval result=$?
	elif [ "${check}" == "stop" ];then
	    function_check check_port ${basic_retry_times} ${basic_time_interval} stop
	    eval result=$?
	fi
	if [ $result -eq 0 ];then
	    echo -e "[INFO] ${check} the $service SUCCESS!"
	    return 0
	else
	    echo -e "[ERROR] ${check} the $service FAIL!"
	    return 1
	fi
}

function check_port()
{
	#/usr/sbin/ss命令Local Address:Port关键词所在的列数:5
	check_status=$1
    for port in ${ports[@]}
    do
		/usr/sbin/ss -nl  2>/dev/null |grep -v 'Send-Q'|awk '{print $5}'|awk -F':' '{print $NF}'|grep -w "${port}"  &>/dev/null
        if [ $? -ne 0 ];then
	    	echo "[INFO] The ${port} is CLOSED"
	    	if [ "${check_status}" == "start" ];then
				return 1
	    	else
				continue
	    	fi
		else
	    	echo "[INFO] The ${port} is OPENED"
	    	if [ "${check_status}" == "stop" ];then
				return 1
	    	else
				continue
	    	fi
		fi
    done
    return 0
}

filemove()
{
	if [ -f "$1" ]; then
		mv $1 $1_`date +%Y%m%d%H%M%S`
	fi
}

service="wecaht-gateway"
jar_name="wecaht-gateway-1.0.0-SNAPSHOT.jar"

#the varable for total_check_times and time_interval
basic_retry_times=60
basic_time_interval=2

export JAVA_HOME=/usr/jdk1.8.0_271
export CLASSPATH=$JAVA_HOME/lib:$JAVA_HOME/jre/lib
export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH:$HOME/bin

#dir config
cd `dirname $0`
DEPLOY_DIR=`pwd`
CONF_DIR=$DEPLOY_DIR/conf
LIB_DIR=$DEPLOY_DIR/lib

#devops.properties const
package_properties_const="devops.properties"
instance_tag_config="${CONF_DIR}/${package_properties_const}"

JAVA_TEST_OPTS=$(select_attribute $instance_tag_config 'JAVA_TEST_OPTS')

#base port value
base_port_value="22456"
#main port
main=$(select_attribute $instance_tag_config 'main_port')
main=${main:-${base_port_value}}
ports[0]=${main}
server_port="server.port=${main}"

EXEC_LOG_DIR="/home/wechat/logs/wechat_gateway"
if [[ ! -e "${DEPLOY_DIR}/logs" ]]; then
	mkdir -p ${EXEC_LOG_DIR}
	ln -s ${EXEC_LOG_DIR} logs
fi

#LIB_JARS=`ls $LIB_DIR|grep .jar|awk '{print "'$LIB_DIR'/"$0}'|tr "\n" ":"`
#JAVA_CP=" -classpath $CONF_DIR:$LIB_JARS "

JAVA_PROD_OPTS=" -jar -DAPP_HOME=${DEPLOY_DIR} $jar_name --$server_port"
JAVA_PROD_OPTS=" $JAVA_TEST_OPTS $JAVA_PROD_OPTS"
RUNJAVA="$JAVA_HOME/bin/java"

STDOUT_FILE=$EXEC_LOG_DIR/startup.out.log

PIDS=`ps ux | grep "$service" | grep "$server_port" | awk '{print $2}'`
if [ -n "$PIDS" ]; then
	echo "ERROR: The $service service already started!"
	echo "PID: $PIDS"
	exit 0
fi

echo  "Starting $service service ... "
	
filemove $STDOUT_FILE
	
$RUNJAVA $JAVA_PROD_OPTS >> $STDOUT_FILE 2>&1 &

#port check
service_check start
if [ $? -eq 0 ];then
	exit 0
else
	echo -e "[START_CHECK] ERROR, Not Started!"
	exit 1
fi

exit 0
