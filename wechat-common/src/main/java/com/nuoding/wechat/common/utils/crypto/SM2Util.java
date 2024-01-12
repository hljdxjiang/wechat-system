package com.nuoding.wechat.common.utils.crypto;

import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.SM2Engine;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.*;
import org.bouncycastle.crypto.util.PrivateKeyFactory;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.util.encoders.Base64;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * @Ahther:JHC
 * @Description:SM2工具类
 * @Date:2024/1/12 15:40
 */
public class SM2Util extends GMBase {

    private static final String SM2_ALGORITHM = "SM2";
    private static final String PROVIDER_NAME = "BC";

    // 生成SM2密钥对
    public static KeyPair generateKeyPair() throws Exception {
        ECKeyPairGenerator generator = new ECKeyPairGenerator();
        generator.init(new ECKeyGenerationParameters(getDomainParameters(), null));
        AsymmetricCipherKeyPair keyPair = generator.generateKeyPair();

        ECPrivateKeyParameters privateKey = (ECPrivateKeyParameters) keyPair.getPrivate();
        ECPublicKeyParameters publicKey = (ECPublicKeyParameters) keyPair.getPublic();

        return new KeyPair(privateKey.getD().toByteArray(), publicKey.getQ().getEncoded(true));
    }

    // SM2加密
    public static byte[] encrypt(byte[] publicKey, byte[] data) throws Exception {
        ECPublicKeyParameters ecPublicKeyParameters = getPublicKeyParameters(publicKey);
        CipherParameters encryptParams = new ParametersWithRandom(ecPublicKeyParameters);

        SM2Engine engine = new SM2Engine();
        engine.init(true, encryptParams);

        return engine.processBlock(data, 0, data.length);
    }

    // SM2解密
    public static byte[] decrypt(byte[] privateKey, byte[] encryptedData) throws Exception {
        ECPrivateKeyParameters ecPrivateKeyParameters = getPrivateKeyParameters(privateKey);
        CipherParameters decryptParams = new ParametersWithRandom(ecPrivateKeyParameters);

        SM2Engine engine = new SM2Engine();
        engine.init(false, decryptParams);

        return engine.processBlock(encryptedData, 0, encryptedData.length);
    }

    // 将SM2公钥字节数组转换为ECPublicKeyParameters
    private static ECPublicKeyParameters getPublicKeyParameters(byte[] publicKeyBytes) throws Exception {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("EC", PROVIDER_NAME);
        PublicKey publicKey = keyFactory.generatePublic(keySpec);
        return (ECPublicKeyParameters) PublicKeyFactory.createKey(publicKey.getEncoded());
    }

    // 将SM2私钥字节数组转换为ECPrivateKeyParameters
    private static ECPrivateKeyParameters getPrivateKeyParameters(byte[] privateKeyBytes) throws Exception {
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("EC", PROVIDER_NAME);
        PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
        return (ECPrivateKeyParameters) PrivateKeyFactory.createKey(privateKey.getEncoded());
    }

    // 获取SM2的椭圆曲线参数
    private static ECDomainParameters getDomainParameters() {
        X9ECParameters x9ECParameters = SECNamedCurves.getByName("sm2p256v1");
        return new ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }


    public static void main(String[] args) throws Exception {
        // 生成密钥对
        KeyPair keyPair = SM2Util.generateKeyPair();
        System.out.println("Private Key: " + Base64.toBase64String(keyPair.getPrivateKey()));
        System.out.println("Public Key: " + Base64.toBase64String(keyPair.getPublicKey()));

        // 要加密的数据
        byte[] dataToEncrypt = "Hello, SM2!".getBytes();

        // 加密
        byte[] encryptedData = SM2Util.encrypt(keyPair.getPublicKey(), dataToEncrypt);
        System.out.println("Encrypted Data: " + Base64.toBase64String(encryptedData));

        // 解密
        byte[] decryptedData = SM2Util.decrypt(keyPair.getPrivateKey(), encryptedData);
        System.out.println("Decrypted Data: " + new String(decryptedData));
    }

    // 内部类，用于存储SM2密钥对
    public static class KeyPair {
        private final byte[] privateKey;
        private final byte[] publicKey;

        public KeyPair(byte[] privateKey, byte[] publicKey) {
            this.privateKey = privateKey;
            this.publicKey = publicKey;
        }

        public byte[] getPrivateKey() {
            return privateKey;
        }

        public byte[] getPublicKey() {
            return publicKey;
        }
    }
}

