package com.nuoding.wechat.common.constant;

/**
 * @author :tf
 * @create :2022/06/02
 * @desc :
 **/
public class ESCConstant {
    private ESCConstant() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 源系统标识
     */
    public static final String SOURCE_SYSTEM = "CPC";
    /**
     * 源系统
     */
    public static final String SOURCE_SPN = "01";
    /**
     * 目标系统标识
     */
    public static final String DEST_SYSTEM = "CBS";
    /**
     * 目标系统标识
     */
    public static final String DEST_SYSTEM_MSC = "MSC";
    /**
     * 服务版本
     */
    public static final String SERVICE_VERSION = "default";
    /**
     * 公共报文公司
     */
    public static final String COMPANY_REQ = "YillionBank";
    /**
     * 系统报文公司
     */
    public static final String COMPANY_SYS = "YLBANK";
    /**
     * 操作员语言
     */
    public static final String USER_LANG = "CHINESE";
    /**
     * 交易模式
     */
    public static final String TRAN_MODE = "ONLINE";
    /**
     * 机构号
     */
    public static final String BRANCH_ID = "10001";
    /**
     * 柜员号
     */
    public static final String USER_ID = "CPC01";
    /**
     * 本地ip
     */
    public static final String LOCALHOST_IP = "127.0.0.1";
    /**
     * Content-Type
     */
    public static final String CONTENT_TYPE = "Content-Type";
    /**
     * application
     */
    public static final String CONTENT_JSON = "application/json; charset=UTF-8";

    /**
     * 查询产品明细 interfaceCode
     */
    public static final String MBSDCORE_1400_0108_INTERFACE_CODE = "MbsdCore_1400_0108";
    /**
     * 查询产品明细 serviceId
     */
    public static final String MBSDCORE_1400_0108_SERVICE_ID = "CBS0000093";
    /**
     * 查询产品明细 destServiceCode
     */
    public static final String MBSDCORE_1400_0108_DEST_SERVICE_CODE = "CBS301303311100";

    /**
     * 多用途白名单查询 interfaceCode
     */
    public static final String MBSDCORE_1400_9502_INTERFACE_CODE = "MbsdCore_1400_9502";
    /**
     * 多用途白名单查询 serviceId
     */
    public static final String MBSDCORE_1400_9502_SERVICE_ID = "";
    /**
     * 多用途白名单查询 destServiceCode
     */
    public static final String MBSDCORE_1400_9502_DEST_SERVICE_CODE = "CBS501303326900";
    /**
     * 营销积分产品利率查询 destServiceCode
     */
    public static final String CREDIT_RATE_SERVICE_CODE = "MSC310301160000";

    /**
     * ESC 成功
     */
    public static final String ESC_SUCCESS = "S";
    /**
     * ESC 失败
     */
    public static final String ESC_FAIL = "F";
    /**
     * ESC 未知
     */
    public static final String ESC_UNKNOWN = "U";


}
