package com.nuoding.wechat.common.utils.crypto;

import org.apache.logging.log4j.util.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.Base64;

/**
 * @Ahther:JHC
 * @Description:AES工具类
 * @Date:2024/1/12 15:46
 */
public class AESUtil {

    private final static Logger logger = LoggerFactory.getLogger(AESUtil.class);

    private static final String AES_ALGORITHM = "AES";
    private static final String AES_CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding"; // 使用CBC模式和PKCS5Padding填充
    private static final String SECRET_KEY_FACTORY_ALGORITHM = "PBKDF2WithHmacSHA256";
    private static final int ITERATION_COUNT = 256; // 迭代次数
    private static final int KEY_LENGTH = 256; // 密钥长度
    private static final int GCM_NONCE_LENGTH = 16; // GCM模式下的Nonce长度

    public static String encrypt(String plaintext, String password) {
        return encrypt(plaintext, password, "0");
    }

    public static String encrypt(String plaintext, String password, String salt) {
        try {
            SecretKey secretKey = generateKey(password, salt);

            Cipher cipher = Cipher.getInstance(AES_CIPHER_ALGORITHM);
            byte[] iv = generateIV();
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, new IvParameterSpec(iv));

            byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes(StandardCharsets.UTF_8));

            // 将IV与密文一起进行Base64编码
            byte[] combined = new byte[iv.length + encryptedBytes.length];
            System.arraycopy(iv, 0, combined, 0, iv.length);
            System.arraycopy(encryptedBytes, 0, combined, iv.length, encryptedBytes.length);

            return Base64.getEncoder().encodeToString(combined);
        } catch (Exception e) {
            logger.error("encrypt end with exception:[{}].stackTrance:[{}]", e.getMessage(), e.getStackTrace());
            return Strings.EMPTY;
        }
    }

    public static String decrypt(String ciphertext, String password, String salt) {
        try {
            SecretKey secretKey = generateKey(password, salt);

            Cipher cipher = Cipher.getInstance(AES_CIPHER_ALGORITHM);
            byte[] combined = Base64.getDecoder().decode(ciphertext);
            byte[] iv = new byte[GCM_NONCE_LENGTH];
            System.arraycopy(combined, 0, iv, 0, GCM_NONCE_LENGTH);
            cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(iv));

            // Use combined array instead of ciphertext.getBytes()
            byte[] decryptedBytes = cipher.doFinal(combined, GCM_NONCE_LENGTH, combined.length - GCM_NONCE_LENGTH);

            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            logger.error("decrypt end with exception:[{}].stackTrace:[{}]", e.getMessage(), e.getStackTrace());
            return Strings.EMPTY;
        }
    }


    public static String decrypt(String ciphertext, String password) {
        return decrypt(ciphertext, password, "0");
    }

    private static SecretKey generateKey(String password, String salt) throws Exception {
        SecretKeyFactory factory = SecretKeyFactory.getInstance(SECRET_KEY_FACTORY_ALGORITHM);
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), ITERATION_COUNT, KEY_LENGTH);
        return new SecretKeySpec(factory.generateSecret(spec).getEncoded(), AES_ALGORITHM);
    }

    private static byte[] generateIV() {
        // 在CBC模式下，需要一个随机的Initialization Vector (IV)
        byte[] iv = new byte[GCM_NONCE_LENGTH];
        // 在实际应用中，应该使用SecureRandom来生成IV
        for (int i = 0; i < GCM_NONCE_LENGTH; i++) {
            iv[i] = (byte) (Math.random() * 256);
        }
        return iv;
    }

    /**
     * @Ahther:JHC
     * @Description:生成随机秘钥
     * @Date:2024/1/31 17:52 
     */
    public static String generateKey() {
        KeyGenerator keyGenerator;
        try {
            keyGenerator = KeyGenerator.getInstance(AES_ALGORITHM);
            keyGenerator.init(KEY_LENGTH);
            SecretKey secretKey = keyGenerator.generateKey();
            return Base64.getEncoder().encodeToString(secretKey.getEncoded());
        } catch (NoSuchAlgorithmException e) {
            logger.error("generateKey end with exception:[{}].stackTrance:[{}]", e.getMessage(), e.getStackTrace());
            return Strings.EMPTY;
        }
    }
}

