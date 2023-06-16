package com.nuoding.wechat.api.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class ItemShowCheckUtil {
    public static boolean checkStatus(Date validDate, Date expireDate) {
        boolean ret = true;
        Long now = System.currentTimeMillis();
        if (ret && validDate != null) {
            long valid = validDate.getTime();
            if (valid > now) {
                ret = false;
            }
        }
        if (ret && expireDate != null) {
            long expire = expireDate.getTime();
            if (now > expire) {
                ret = false;
            }
        }

        return ret;
    }

    public static boolean checkChannel(String channel, String itemChannel) {
        if (StringUtils.isBlank(itemChannel)) {
            return true;
        }
        if (StringUtils.containsIgnoreCase(itemChannel, channel)) {
            return true;
        }
        return false;
    }

}
