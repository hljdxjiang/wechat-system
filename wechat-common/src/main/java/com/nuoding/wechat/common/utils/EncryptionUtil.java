package com.nuoding.wechat.common.utils;

import com.nuoding.wechat.common.utils.crypto.AESUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.Strings;

import java.util.HashMap;
import java.util.Map;

public class EncryptionUtil {
    public static String encrypt(String value) {
        String key = AESUtil.generateKey();
        int random = IdGenerateUtils.generateRandomNumber(5, 9);
        String salt = IdGenerateUtils.generateRandomString(random);
        System.out.println("key== "+key+" salt== "+salt+" value== "+value);
        if (StringUtils.isNotBlank(key) && StringUtils.isNotBlank(salt)) {
            String k1 = buildKeyWithSalt(key, salt);
            String k2 = AESUtil.encrypt(value, key, salt);
            Map map = new HashMap();
            map.put("k1", k1);
            map.put("k2", k2);
            return JsonUtil.obj2Json(map);

        }
        return Strings.EMPTY;
    }

    public static String decrypt(String value) {
        Map map = JsonUtil.json2Map(value);
        if (map != null) {
            String k1 = (String) map.get("k1");
            String k2 = (String) map.get("k2");
            String[] val = extractOriginalValues(k1);
            if (val != null) {
                return AESUtil.decrypt(k2, val[0], val[1]);
            }
        }

        return value;
    }

    private static String buildKeyWithSalt(String pwd, String salt) {
        int random = salt.length();
        return pwd.substring(0, random) + salt + pwd.substring(random) + String.valueOf(random);
    }

    /**
     * @Ahther:JHC
     * @Description:还原秘钥和盐
     * @Date:2024/2/1 14:27
     */
    private static String[] extractOriginalValues(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        int random = Integer.parseInt(key.substring(key.length() - 1));
        // Remove the random number from the key
        String base64Key = key.substring(0, key.length() - 1);

        String pwd = base64Key.substring(0, random) + base64Key.substring(random + random);
        String salt = base64Key.substring(random, random + random);
        return new String[]{pwd, salt};
    }


    public static void main(String[] args){
        Map map=new HashMap();
        map.put("aaa","aaa");
        String value=JsonUtil.obj2Json(map);
        System.out.println(AESUtil.decrypt("P1lL5pUu6wuTJppUUFLfuA==plKbU5wGrfg6TT35cs/EEQ=="
                ,"oy/tCuE3LETRMaC+3H+A1JlfBtv5m9SIQqTv2Sun8cc=","ztgYWXo"));
        String val=encrypt(value);
        System.out.println(val);
        System.out.println(decrypt(val));
    }
}
