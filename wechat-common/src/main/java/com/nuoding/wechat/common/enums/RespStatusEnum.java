package com.nuoding.wechat.common.enums;

public enum RespStatusEnum {
    //通用类
    SUCCESS("000000", "操作成功"),
    ARGS_ERROR("000001", "参数错误"),
    ARGS_NULL("000002", "参数缺失"),
    ARGS_TRANS_CODE_NULL("000003", "交易码为空"),
    ARGS_TRANS_CODE_ERROR("000004", "交易码错误"),
    SESSION_ERROR("000100", "会话异常"),
    FAIL("999999", "系统异常"),
    FAIL_WITH_EXCEPTION("900000", "操作失败"),
    REQUEST_REPEAT("900001", "请求重复"),
    REQUEST_ILLEGAL("900002", "请求非法"),
    REQUEST_SESSION_ERROR("900003", "会话异常"),
    REQUEST_TIME_ERROR("900004", "机器时钟异常"),


    DATA_NOT_FOUND("100001", "数据查询失败"),
    DATA_UPDATE_FAIL("100101", "更新数据失败"),
    DATA_CAN_NOT_UPDATE("100102", "数据不允许更新"),
    DATA_DELETE_FAIL("100201", "删除数据失败"),
    DATA_CAN_NOT_DELETE("100202", "数据不允许删除"),
    DATA_INSERT_FAIL("100301", "插入数据失败"),
    DATA_CAN_NOT_INSERT("100302", "数据不允许新增"),


    TRANS_TYPE_ERROR("200005", "类型转换错误"),
    FILENAME_ERROR("200007", "文件名不规范，请修改"),
    SMS_CODE_ERROR("0070", "验证码输入错误，请重新输入"),

    PASSWD_ERROR_TOO_MATCH("300000", "密码错误次数过多,请稍后重试"),
    PASSWD_CODE_LOCK("300001", "登录密码锁定"),
    PASSWD_CODE_ERROR("300002", "登录密码错误"),
    PASSWD_GESTURE_LOCK("300011", "手势密码锁定"),
    PASSWD_GESTURE_ERROR("300012", "手势密码错误"),
    PASSWD_FINGER_LOCK("300022", "指纹密码锁定"),
    PASSWD_FINGER_ERROR("300022", "指纹密码错误"),
    PASSWD_FINGER_FAIL("300023", "指纹密码失效"),


    /**
     * 用户错误码
     */
    GESTURE_SET_ERROR("3019", "已设置通用手势密码，不可设置本渠道专用密码"),
    LOGIN_SUCCESS("000000", "登录成功"),
    USER_NOT_ALLOW_LOGIN("310000", "用户异常，禁止登录，请稍后重试"),
    USER_NO_ROLEID("310100", "用户未配置角色，请于管理员联系"),
    USER_NULL("310000", "用户不存在"),
    USER_BEEN_REGISTER("310001", "用户已注册"),
    USER_UPDATE_FAIL("310003", "用户信息修改失败"),
    USER_REGISTER_FAIL("310002", "用户注册失败"),
    USER_LOGIN_FAIL_COUNT_MAX("310003", "用户登录已锁定"),
    USER_ACCOUNT_DISABLED("310004", "账号未激活，请联系管理员激活账号"),
    PASSWORD_ERROR("3005", "账号或密码错误"),
    LOGIN_TIMEOUT("3006", "登录失效，请重新登录"),
    LOGIN_FAIL("3007", "登录失败，请重新登录"),
    USERID_NULL("3008", "用户编号不能为空"),
    WECHAT_INFO_NULL("3009", "微信号信息不能为空"),
    MOBILE_USERID_NULL("3010", "手机用户ID不能为空"),
    MOBILE_BEEN_REGISTER("3014", "手机号码已被注册"),
    USER_NOT_REAL_NAME("3011", "客户未实名"),
    MOBILENO_NULL("3012", "手机号不能为空"),
    PASSWD_NOT_NULL("3013", "密码不可为空"),
    PASSWD_NOT_VAILD("3016", "验证方式不可用"),
    PASSWD_EXCEEDED_MAX_ATTEMPTS("3017", "密码验证错误次数过多"),
    USER_ERROR("3014", "注册信息有无"),
    USER_CUSTINFO_ERROR("3015", "客户信息信息不匹配"),

    SMS_TRY_ERROR("0053", "密码验证错误次数过多，请耐心等待明天再尝试，此期间不建议重新发送验证码"),
    SMS_SEND_FAIL("5003", "短信发送失败"),
    SMS_CODE_VALID("5004", "验证码还在有效期内"),
    SMS_CODE_INVALID("0027", "验证码已失效，请重新获取后尝试！"),

    REQUEST_FAIL("6001", "请求超时"),

    /***
     * Token认证类型错误
     */
    TOKEN_TYPE_ERROR("4001", "Token类型错误"),
    /**
     * 特殊返回码，前端拿到不处理
     */
    SPECIAL_STATUS("6001", "%s");


    private final String status;

    private final String message;

    RespStatusEnum(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}
