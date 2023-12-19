package com.nuoding.wechat.api.util;

import com.nuoding.wechat.common.constant.CommonConstant;
import com.nuoding.wechat.common.constant.SessionKey;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemShowCheckUtil<statiic> {
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

    private static boolean checkLabel(String label) {
        if (StringUtils.isBlank(label)) {
            return true;
        }
        String userLabel = SessionKey.getLoginUserLabel();
        if (StringUtils.isBlank(userLabel)) {
            return false;
        }
        String[] uarr = userLabel.split(CommonConstant.LABEL_SPLIT_FLAG);
        String[] larr = label.split(CommonConstant.LABEL_SPLIT_FLAG);
        for (String u : uarr) {
            for (String l : larr) {
                if (StringUtils.equalsIgnoreCase(u, l)) {
                    return true;
                }
            }
        }
        return false;
    }

    /***
     * 返回所有可展示的数据
     * @param list
     * @return
     */
    public static List getCheckedLIst(String channel, List list) {
        List ret = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list)) {
            for (Object t : list) {
                boolean isShow = true;
                if (!checkChannel(channel, (String) getFieldValueByName("channelNo", t))) {
                    isShow = false;
                }
                if (isShow && !checkStatus((Date) getFieldValueByName("validTime", t), (Date) getFieldValueByName("expireTime", t))) {
                    isShow = false;
                }
                if (isShow && checkLabel((String) getFieldValueByName("labelId", t))) {
                    isShow = false;
                }

                if (isShow) {
                    ret.add(t);
                }
            }
        }

        return ret;
    }


    private static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = ((Method) method).invoke(o, new Object[]{});
            return value;
        } catch (Exception e) {

            return null;
        }
    }

}
