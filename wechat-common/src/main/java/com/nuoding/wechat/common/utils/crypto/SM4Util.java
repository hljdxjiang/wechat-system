package com.nuoding.wechat.common.utils.crypto;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import java.security.Security;
import java.util.Base64;

/**
 * @Ahther:JHC
 * @Description:SM4工具类 
 * @Date:2024/1/12 15:40 
 */
public class SM4Util extends GMBase {

    private static final Logger logger = LoggerFactory.getLogger(SM4Util.class);

    private static final String SM4_ALGORITHM = "SM4";
    private static final String ENCRYPT_MODE = "ENCRYPT";
    private static final String DECRYPT_MODE = "DECRYPT";

    public static String sm4Encrypt(String key, String data) {
        return sm4(key, data, ENCRYPT_MODE);
    }

    public static String sm4Decrypt(String key, String data) {
        return sm4(key, data, DECRYPT_MODE);
    }

    private static String sm4(String key, String data, String mode) {
        try {
            Cipher cipher = Cipher.getInstance(SM4_ALGORITHM, "BC");
            SecretKey secretKey = generateKey(key);
            cipher.init(mode.equals(ENCRYPT_MODE) ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, secretKey);
            byte[] result = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(result);
        } catch (Exception e) {
            logger.error("sm4 with error.message:{0}", e.getCause());
            return null;
        }
    }

    private static SecretKey generateKey(String key) throws Exception {
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("SM4", "BC");
        byte[] keyData = Base64.getDecoder().decode(key);
        return new SecretKeySpec(keyData, SM4_ALGORITHM);
    }
}
