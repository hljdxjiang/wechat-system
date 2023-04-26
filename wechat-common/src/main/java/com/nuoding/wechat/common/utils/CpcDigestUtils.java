package com.nuoding.wechat.common.utils;

import com.nuoding.wechat.common.constant.Constants;
import org.springframework.util.Base64Utils;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * @author :tf
 * @create :2022/05/07
 * @desc : 编码工具类
 **/
public class CpcDigestUtils {
    private CpcDigestUtils() {
    }

    /**
     * 用户密码加密 使用md5+salt
     */
    public static String digestPassword(String password, String salt) {
        return DigestUtils.md5DigestAsHex(String.format(Constants.USER_PWD_PREFIX_TEMPLATE, password, salt).getBytes(StandardCharsets.UTF_8));
    }

    /**
     * token base64编码
     */
    public static String encodeToken(String token) {
        return Base64Utils.encodeToString(token.getBytes());
    }

    /**
     * token base64解码
     */
    public static String decodeToken(String tokenBase64) {
        return new String(Base64Utils.decodeFromString(tokenBase64));
    }
}
