package com.nuoding.wechat.common.utils;

import com.nuoding.wechat.common.constant.ESCConstant;
import org.apache.commons.lang3.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author :tf
 * @create :2022/06/02
 * @desc : 不知怎么描述的工具类
 **/
public class CommonUtil {

    public static final String DATE_TIME = "yyyyMMddHHmmss";
    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    private static final String string = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /**
     * 获取本地ip
     */
    public static String localIp() {
        String ip = "";
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            ip = ESCConstant.LOCALHOST_IP;
        }
        return ip;
    }

    public static String conString(Object o) {
        try {
            if (o instanceof String) {
                return (String) o;
            }

            if (o instanceof Integer) {
                return String.valueOf(o);
            }

            if (o instanceof Long) {
                return String.valueOf(o);
            }
        } catch (Exception e) {
            return o.toString();
        }

        return o.toString();
    }


    public static Integer conInt(Object o) {
        try {
            if (o instanceof Integer) {
                return (Integer) o;
            }

            if (o instanceof Long) {
                return ((Long) o).intValue();
            }

            if (o instanceof String) {
                return Integer.valueOf((String) o);
            }
        } catch (Exception e) {
            return null;
        }

        return null;
    }

    public static Long conLong(Object o) {
        try {
            if (o instanceof Long) {
                return (Long) o;
            }

            if (o instanceof Integer) {
                return ((Integer) o).longValue();
            }

            if (o instanceof String) {
                return Long.valueOf((String) o);
            }
        } catch (Exception e) {
            return null;
        }

        return null;
    }

    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    /**
     * 生成指定位数的随机字符串（只包含大小写字母、数字）
     *
     * @param num
     * @return
     */
    public static String generateRandomChars(Integer num) {
        if (num <= 0) {
            return "";
        }

        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        if (StringUtils.isEmpty(uuidString)) {
            return "";
        }
        // 处理uuidString中的字符串：只截取其中的大小写字母、数字，并且只截取最后num位
        String patternUUID = uuidString.replaceAll("[^a-zA-Z0-9]", "");
        if (StringUtils.isEmpty(patternUUID)) {
            return "";
        }
        String splitUUID = "";
        if (patternUUID.length() <= num) {
            splitUUID = patternUUID;
        } else {
            splitUUID = patternUUID.substring(patternUUID.length() - num);
        }
        return splitUUID;
    }

    /**
     * @param strs      对利率补零，不足{strLength}位小数时补零，多于{strLength}位小数不处理
     *                  2   -->    2.00
     *                  2.368-->   2.368
     * @param strLength 补零的长度
     * @return 处理后的字符串
     */
    public static String roundStr(String strs, int strLength) {
        StringBuilder str = new StringBuilder(strs);
        if (strs.contains(".")) {
            int index = str.indexOf(".");
            int subLen = str.substring(index).length();
            for (int i = subLen - 1; i < strLength; i++) {
                str.append("0");
            }
        } else {
            str.append(".");
            for (int i = 0; i < strLength; i++) {
                str.append("0");
            }
        }
        return str.toString();
    }

    /**
     * 将发送短信返回的报文转换为map
     *
     * @param result
     * @return
     */
    public static Map result2Map(String result) {
        Map map = new HashMap();
        String[] splitValue = result.split("&");
        for (int a = 0; a < splitValue.length; a++) {
            String[] split = splitValue[a].split("=");
            if (split != null && split.length == 2) {
                map.put(split[0], split[1]);
            }
        }
        return map;
    }

    public static Date getDateFromString(String time, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            return simpleDateFormat.parse(time);
        } catch (Exception e) {
            return null;
        }
    }

    public static String generateUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static String getDateWithFormat(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(System.currentTimeMillis());
    }

    public static String getRandomString(int length) {
        StringBuffer sb = new StringBuffer();
        int len = string.length();
        for (int i = 0; i < length; i++) {
            sb.append(string.charAt(getSecureRandom(len)));
        }
        return sb.toString();
    }

    //获取安全随机数
    public static int getSecureRandom(int len) {
        SecureRandom random = new SecureRandom();
        int nextInt = random.nextInt(len);
        return nextInt;
    }

    /**
     * 渠道端调用第三方服务前缀标识 后续所有调用第三方依赖服务流水号为30位：渠道端调用第三方服务前缀标识 + generateTranNo29
     * 保证同一笔交易，有迹可查
     */
    public enum InvokeOthSerPrefix {
        PAY("P", "统一支付"),
        NPAY("NP", "新统一支付"),
        XPAY("XP", "协议支付"),
        CORE("C", "核心"),
        UNCENTER("UC", "统一用户中心"),
        WXB("WXB", "微信银行"),
        UNKNOWN("N", "未知");

        private final String code;
        private final String codeDetails;

        InvokeOthSerPrefix(String code, String codeDetails) {
            this.code = code;
            this.codeDetails = codeDetails;
        }

        public String getCode() {
            return code;
        }

        public String getCodeDetails() {
            return codeDetails;
        }

    }

    private static final char[] CHAR_STR = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
    };

}
