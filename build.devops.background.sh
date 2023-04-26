#!/bin/bash

#if [ -n "$JAVA_HOME" ]; then
#	export JAVA_HOME=${JAVA_HOME}
#	export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH
#fi

#if [ "x$MAVEN_HOME" != "x" ]; then
#   MVN_BIN=$MAVEN_HOME/bin/mvn
#else
#	MVN_BIN=mvn
#fi

export JAVA_HOME=/usr/local/openjdk-8
#export JAVA_HOME=/opt/jdk1.8.0_271
export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH:$HOME/bin

MVN_BIN=/usr/share/maven/bin/mvn
#MVN_BIN=/opt/apache-maven-3.5.0/bin/mvn

#编译的代码包保存路径常量
output_const="output"
app_version="wecaht-background-1.0.0-SNAPSHOT"
app_version_tar_gz="wecaht-background-1.0.0-SNAPSHOT.tar.gz"

app_jar_version="wecaht-background-1.0.0-SNAPSHOT.jar"
app_jar="wecaht-background.jar"

app_const="wecaht-background"
app_tar_gz="wecaht-background.tar.gz"

app_conf_build="conf"
app_conf_tar_gz="wecaht-background-conf.tar.gz"

app_tar_gz="wecaht-background.tar.gz"

#模块编译的代码包带时间戳的存储路径
source_server_config="http://21.130.11.10:8096"
base_package_path="/root/data/prod"
build_main_module_name="wechat/deposit_product/wecaht-background"

cd `dirname $0`
BUILD_DIR=`pwd`

echo $BUILD_DIR

function check_error()
{
	if [ $? -ne 0 ]
	then
		echo "Build Error! Please Check..."
 		exit 1
	fi
}

#------------------------------------------------------------------
#mvn install,profile value:develop or test or preOnline or online
#------------------------------------------------------------------

PROFILE=online
if [ $# -ne 0 ]; then
	PROFILE=$1
fi
if [[ "${PROFILE}"x == "develop"x ]]; then
	$MVN_BIN clean install -U -P$PROFILE
else
	$MVN_BIN clean install -U -P$PROFILE
fi
check_error
cd ${BUILD_DIR} && rm -rf ${output_const} && mkdir -p ${output_const}
cp -r ./${app_const}/target/${app_version_tar_gz} ./${output_const}/
cd ${BUILD_DIR}/${output_const} && tar -zxvf ${app_version_tar_gz}

cd ${BUILD_DIR}/${output_const} && mkdir -p ${app_const} 
cd ${BUILD_DIR}/${output_const} && cp -r ${app_version}/${app_conf_build} ${app_const}/
cd ${BUILD_DIR}/${output_const} && tar -zcvf ${app_conf_tar_gz} ${app_const} && md5sum ${app_conf_tar_gz} >${app_conf_tar_gz}.md5
cd ${BUILD_DIR}/${output_const} && rm -rf ${app_const}

cd ${BUILD_DIR}/${output_const}/${app_version} && mv ${app_jar_version} ${app_jar}
cd ${BUILD_DIR}/${output_const} && mv ${app_version} ${app_const}

#cd ${BUILD_DIR}/${output_const} && tar -zcvf ${app_tar_gz} --exclude=${app_const}/conf ${app_const} && md5sum ${app_tar_gz} >${app_tar_gz}.md5
cd ${BUILD_DIR}/${output_const} && tar -zcvf ${app_tar_gz} ${app_const} && md5sum ${app_tar_gz} >${app_tar_gz}.md5

cd ${BUILD_DIR}/${output_const} && rm -rf ${app_version_tar_gz} && rm -rf ${app_const}
check_error

conf_tar_gz="${BUILD_DIR}/${output_const}/${app_conf_tar_gz}"
conf_tar_gz_md5="${BUILD_DIR}/${output_const}/${app_conf_tar_gz}.md5"
conf_md5_value=$(cat ${app_conf_tar_gz}.md5|awk '{print $1}')

module_tar_gz="${BUILD_DIR}/${output_const}/${app_tar_gz}"
module_tar_gz_md5="${BUILD_DIR}/${output_const}/${app_tar_gz}.md5"
module_md5_value=$(cat ${app_tar_gz}.md5|awk '{print $1}')
module_version=`date +%Y.%m.%d.%H%M%S`
echo "**************************************************"
echo "conf_tar_gz:"${conf_tar_gz}
echo "conf_tar_gz_md5:"${conf_tar_gz_md5}
echo "conf_md5_value:"${conf_md5_value}

echo "module_tar_gz:"${module_tar_gz}
echo "module_tar_gz_md5:"${module_tar_gz_md5}
echo "module_md5_value:"${module_md5_value}
echo "module_version:"${module_version}
echo "***************************************************"
if [[ "${PROFILE}"x == "online"x ]]; then
	echo "online env generate package"
	base_package_path="${base_package_path}/${build_main_module_name}/${module_version}"
	mkdir -p ${base_package_path}
	cp -r ${module_tar_gz} ${base_package_path}/
	cp -r ${module_tar_gz_md5} ${base_package_path}/
	if [ -f "${base_package_path}/${app_tar_gz}" -a -f "${base_package_path}/${app_tar_gz}.md5" ]; then
		echo "**************************************************"
		echo "module_scm_path:"${source_server_config}${base_package_path}/${app_tar_gz}
		echo "***************************************************"
	else
		echo "online env generate package fail"
		exit 1
	fi
	echo "online env git tag version to hotfix"
	tag_name="release.${module_version}"
	cd ${BUILD_DIR} && git tag -l|grep "${tag_name}"
	if [ $? -eq 0 ];then
    	echo "tag name:${tag_name} has been exists,please check!"
	else
    	cd ${BUILD_DIR} && git tag -a ${tag_name} -m "${tag_name}"
    	cd ${BUILD_DIR} && git push http://liuyy:liuyy123@21.129.125.2/jhc/app.git ${tag_name}
	fi
fi
exit 0






