package com.nuoding.wechat.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;


public class IpUtil {

    private final static Logger logger = LoggerFactory.getLogger(IpUtil.class);

    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        logger.info("x-forwarded-for ip:" + ip);
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        logger.info("final getIp:" + ip);
        if (StringUtils.isBlank(ip)) {
            return null;
        }
        String[] splitIp = ip.split("\\s+|,");
        String clientIp = splitIp[0];
        logger.info("response clientIp:" + clientIp);
        return clientIp;
    }
}
