package com.nuoding.wechat.common.constant;

public class ConfigManageName {

    public enum ConfigManageNameEnum {
        /**
         * 常量配置
         */
        SMS_VALID_CODE_ERROR_NUMBER("SMS_VALID_CODE_ERROR_NUMBER", "10", "短信验证码错误次数限制"),
        SMS_VALID_EXCEED_TIME_SECONDS("SMS_VALID_EXCEED_TIME_SECONDS", "300", "短信验证码错误失效时间，单位：秒"),
        SMS_RESEND_EXCEED_TIME_SECONDS("SMS_SEND_EXCEED_TIME_SECONDS", "60", "短信重发时间间隔"),
        LOGIN_EXPIRE_DAYS("LOGIN_EXPIRE_DAYS", "30", "登录超时天数"),
        ;

        private final String code;
        private final String defaultValue;
        private final String codeDetails;

        ConfigManageNameEnum(String code, String defaultValue, String codeDetails) {
            this.code = code;
            this.defaultValue = defaultValue;
            this.codeDetails = codeDetails;
        }

        public String getCode() {
            return code;
        }

        public String getDefaultValue() {
            return defaultValue;
        }

        public String getCodeDetails() {
            return codeDetails;
        }

    }
}
