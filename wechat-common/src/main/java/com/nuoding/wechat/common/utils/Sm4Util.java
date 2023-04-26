package com.nuoding.wechat.common.utils;

import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;


/**
 * @Classname Sm4Util
 * @Description 客服加密工具类
 * @Date 2022/4/29 11:30
 * @Created by jhc
 */
public class Sm4Util {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    private static final String ENCODING = "UTF-8";
    public static final String ALGORITHM_NAME = "SM4";
    public static final String ALGORITHM_NAME_ECB_PADDING = "SM4/ECB/PKCS5Padding";
    // 128-32位16进制；256-64位16进制
    public static final int DEFAULT_KEY_SIZE = 128;
    // 32位16进制密钥
    public static final String SM_KEY = "699868c65c6d51e58b4aaf0058f685ce";

    /**
     * 自动生成密钥SM_
     *
     * @return
     * @explain
     */
    public static String generateKey() throws Exception {
        return new String(Hex.encodeHex(generateKey(DEFAULT_KEY_SIZE)));
    }

    /**
     * @param keySize
     * @return
     * @throws Exception
     * @explain
     */
    public static byte[] generateKey(int keySize) throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance(ALGORITHM_NAME, BouncyCastleProvider.PROVIDER_NAME);
        kg.init(keySize, new SecureRandom());
        return kg.generateKey().getEncoded();
    }

    /**
     * 生成ECB暗号
     *
     * @param algorithmName 算法名称
     * @param mode          模式
     * @param key
     * @return
     * @throws Exception
     * @explain ECB模式（电子密码本模式：Electronic codebook）
     */
    private static Cipher generateEcbCipher(String algorithmName, int mode, byte[] key) throws Exception {
        Cipher cipher = Cipher.getInstance(algorithmName, BouncyCastleProvider.PROVIDER_NAME);
        Key sm4Key = new SecretKeySpec(key, ALGORITHM_NAME);
        cipher.init(mode, sm4Key);
        return cipher;
    }

    /**
     * sm4加密
     *
     * @param hexKey   16进制密钥（忽略大小写）
     * @param paramStr 待加密字符串
     * @return 返回16进制的加密字符串
     * @explain 加密模式：ECB 密文长度不固定，会随着被加密字符串长度的变化而变化
     */
    public static String encryptEcb(String hexKey, String paramStr) {
        try {
            String cipherText = "";
            byte[] keyData = ByteUtils.fromHexString(hexKey);
            byte[] srcData = paramStr.getBytes(ENCODING);
            byte[] cipherArray = encrypt_Ecb_Padding(keyData, srcData);
            cipherText = ByteUtils.toHexString(cipherArray);
            return cipherText;
        } catch (Exception e) {
            return paramStr;
        }
    }

    /**
     * 加密模式之Ecb
     *
     * @param key
     * @param data
     * @return
     * @throws Exception
     * @explain
     */
    public static byte[] encrypt_Ecb_Padding(byte[] key, byte[] data) throws Exception {
        Cipher cipher = generateEcbCipher(ALGORITHM_NAME_ECB_PADDING, Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(data);
    }

    /**
     * sm4解密
     *
     * @param hexKey     16进制密钥
     * @param cipherText 16进制的加密字符串（忽略大小写）
     * @return 解密后的字符串
     * @throws Exception
     * @explain 解密模式：采用ECB
     */
    public static String decryptEcb(String hexKey, String cipherText) {
        String decryptStr = "";
        byte[] keyData = ByteUtils.fromHexString(hexKey);
        byte[] cipherData = ByteUtils.fromHexString(cipherText);
        // 解密
        byte[] srcData = new byte[0];
        try {
            srcData = decrypt_Ecb_Padding(keyData, cipherData);
            decryptStr = new String(srcData, ENCODING);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decryptStr;
    }

    /**
     * 解密
     *
     * @param key
     * @param cipherText
     * @return
     * @throws Exception
     * @explain
     */
    public static byte[] decrypt_Ecb_Padding(byte[] key, byte[] cipherText) throws Exception {
        Cipher cipher = generateEcbCipher(ALGORITHM_NAME_ECB_PADDING, Cipher.DECRYPT_MODE, key);
        return cipher.doFinal(cipherText);
    }

    /**
     * 校验加密前后的字符串是否为同一数据
     *
     * @param hexKey     16进制密钥（忽略大小写）
     * @param cipherText 16进制加密后的字符串
     * @param paramStr   加密前的字符串
     * @return 是否为同一数据
     * @throws Exception
     * @explain
     */
    public static boolean verifyEcb(String hexKey, String cipherText, String paramStr) throws Exception {
        // 用于接收校验结果
        boolean flag = false;
        // hexString--&gt;byte[]
        byte[] keyData = ByteUtils.fromHexString(hexKey);
        // 将16进制字符串转换成数组
        byte[] cipherData = ByteUtils.fromHexString(cipherText);
        // 解密
        byte[] decryptData = decrypt_Ecb_Padding(keyData, cipherData);
        // 将原字符串转换成byte[]
        byte[] srcData = paramStr.getBytes(ENCODING);
        // 判断2个数组是否一致
        flag = Arrays.equals(decryptData, srcData);
        return flag;
    }

    public static void main(String[] args) {
        try {
            String[] aa = {"13112345678",
                    "13112349999",
                    "15811110008",
                    "15147854587",
                    "15200005858",
                    "15911110007",
                    "15911111101",
                    "15911111234",
                    "15911110006",
                    "15911111233",};
            for (int i = 0; i < aa.length; i++) {
                String key = aa[i];
                String pass = Sm4Util.encryptEcb(SM_KEY, key);
                System.out.println(key.concat(":").concat(pass));
            }
            System.out.println(Sm4Util.encryptEcb(SM_KEY, "18900000000"));
//            String cipher = Sm4Util.encryptEcb(SM_KEY, "MB00000000000330001");
//            String cipher2 = Sm4Util.encryptEcb(SM_KEY, "WX00000000000000330001");
//            System.out.println("加密串：" + cipher);
//            System.out.println("加密串：" + cipher2);
//            System.out.println(Sm4Util.verifyEcb(SM_KEY, cipher, "2"));
//            String str = Sm4Util.decryptEcb(SM_KEY, cipher);
//            System.out.println("解密串：" + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
