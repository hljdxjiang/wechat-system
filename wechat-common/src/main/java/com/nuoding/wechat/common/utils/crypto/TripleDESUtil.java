package com.nuoding.wechat.common.utils.crypto;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.spec.KeySpec;
import java.util.Base64;

public class TripleDESUtil {

    private static final String TRIPLE_DES_ALGORITHM = "DESede";

    public static String encrypt(String plaintext, String key) {
        try {
            Cipher cipher = Cipher.getInstance(TRIPLE_DES_ALGORITHM);
            SecretKey secretKey = generateKey(key);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            return null;
        }
    }

    public static String decrypt(String ciphertext, String key) {
        try {
            Cipher cipher = Cipher.getInstance(TRIPLE_DES_ALGORITHM);
            SecretKey secretKey = generateKey(key);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(ciphertext));
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            return null;
        }
    }

    private static SecretKey generateKey(String key) throws Exception {
        KeySpec keySpec = new DESedeKeySpec(key.getBytes(StandardCharsets.UTF_8));
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(TRIPLE_DES_ALGORITHM);
        return keyFactory.generateSecret(keySpec);
    }

    public static void main(String[] args) {
        String plaintext = "Hello, 3DES!";
        String key = "YourSecretKeyFor3DES"; // 密钥长度应该为24字节

        // 加密
        String encryptedText = encrypt(plaintext, key);
        System.out.println("Encrypted Text: " + encryptedText);

        // 解密
        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
