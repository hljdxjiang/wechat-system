package com.nuoding.wechat.common.utils;

import org.apache.commons.codec.binary.StringUtils;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.SM2Engine;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.custom.gm.SM2P256V1Curve;
import org.bouncycastle.util.encoders.Base64;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.spec.ECFieldFp;
import java.security.spec.EllipticCurve;

/**
 * @author ：ji
 * @date ：Created in 2022/5/17 10:13
 * @description：基于bouncycastle
 */
public class SM2Util extends GMBase {
    /*
     * 以下为SM2推荐曲线参数
     */
    public static final SM2P256V1Curve CURVE = new SM2P256V1Curve();
    public final static BigInteger SM2_ECC_P = CURVE.getQ();
    public final static BigInteger SM2_ECC_A = CURVE.getA().toBigInteger();
    public final static BigInteger SM2_ECC_B = CURVE.getB().toBigInteger();
    public final static BigInteger SM2_ECC_N = CURVE.getOrder();
    public final static BigInteger SM2_ECC_H = CURVE.getCofactor();
    public final static BigInteger SM2_ECC_GX = new BigInteger(
            "32C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7", 16);
    public final static BigInteger SM2_ECC_GY = new BigInteger(
            "BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0", 16);
    public static final ECPoint G_POINT = CURVE.createPoint(SM2_ECC_GX, SM2_ECC_GY);
    public static final ECDomainParameters DOMAIN_PARAMS = new ECDomainParameters(CURVE, G_POINT,
            SM2_ECC_N, SM2_ECC_H);
    public static final EllipticCurve JDK_CURVE = new EllipticCurve(new ECFieldFp(SM2_ECC_P), SM2_ECC_A, SM2_ECC_B);
    public static final java.security.spec.ECPoint JDK_G_POINT = new java.security.spec.ECPoint(
            G_POINT.getAffineXCoord().toBigInteger(), G_POINT.getAffineYCoord().toBigInteger());

    private static final String ALGO_NAME_EC = "EC";
    public static final java.security.spec.ECParameterSpec JDK_EC_SPEC = new java.security.spec.ECParameterSpec(
            JDK_CURVE, JDK_G_POINT, SM2_ECC_N, SM2_ECC_H.intValue());
    public static final int SM3_DIGEST_LENGTH = 32;
    private static final String ENCODING = "UTF-8";


    /**
     * @param pubKey
     * @param srcData
     * @return 默认输出C1C3C2顺序的密文
     * @throws InvalidCipherTextException
     */
    public static byte[] encrypt(BCECPublicKey pubKey, byte[] srcData) throws InvalidCipherTextException {
        return encrypt(SM2Engine.Mode.C1C3C2, pubKey, srcData);
    }

    /**
     * @param mode    指定密文结构，旧标准的为C1C2C3，新的[《SM2密码算法使用规范》 GM/T 0009-2012]标准为C1C3C2
     * @param pubKey
     * @param srcData
     * @return
     * @throws InvalidCipherTextException
     */
    public static byte[] encrypt(SM2Engine.Mode mode, BCECPublicKey pubKey, byte[] srcData) throws InvalidCipherTextException {
        ECParameterSpec parameterSpec = pubKey.getParameters();
        ECDomainParameters domainParameters = new ECDomainParameters(parameterSpec.getCurve(), parameterSpec.getG(),
                parameterSpec.getN(), parameterSpec.getH());
        ECPublicKeyParameters pubKeyParameters = new ECPublicKeyParameters(pubKey.getQ(), domainParameters);

        return encrypt(mode, pubKeyParameters, srcData);
    }

    /**
     * @param pubKeyParameters
     * @param srcData
     * @return 默认输出C1C3C2顺序的密文
     * @throws InvalidCipherTextException
     */
    public static byte[] encrypt(ECPublicKeyParameters pubKeyParameters, byte[] srcData)
            throws InvalidCipherTextException {
        return encrypt(SM2Engine.Mode.C1C3C2, pubKeyParameters, srcData);
    }

    /**
     * @param mode             指定密文结构，旧标准的为C1C2C3，新的[《SM2密码算法使用规范》 GM/T 0009-2012]标准为C1C3C2
     * @param pubKeyParameters
     * @param srcData
     * @return
     * @throws InvalidCipherTextException
     */
    public static byte[] encrypt(SM2Engine.Mode mode, ECPublicKeyParameters pubKeyParameters, byte[] srcData)
            throws InvalidCipherTextException {
        SM2Engine engine = new SM2Engine(mode);
        ParametersWithRandom pwr = new ParametersWithRandom(pubKeyParameters, new SecureRandom());
        engine.init(true, pwr);
        return engine.processBlock(srcData, 0, srcData.length);
    }

    /**
     * @param priKey
     * @param sm2Cipher 默认输入C1C3C2顺序的密文
     * @return
     * @throws InvalidCipherTextException
     */
    public static byte[] decrypt(BCECPrivateKey priKey, byte[] sm2Cipher) throws InvalidCipherTextException {
        return decrypt(SM2Engine.Mode.C1C3C2, priKey, sm2Cipher);
    }

    /**
     * @param mode      指定密文结构，旧标准的为C1C2C3，新的[《SM2密码算法使用规范》 GM/T 0009-2012]标准为C1C3C2
     * @param priKey
     * @param sm2Cipher
     * @return
     * @throws InvalidCipherTextException
     */
    public static byte[] decrypt(SM2Engine.Mode mode, BCECPrivateKey priKey, byte[] sm2Cipher) throws InvalidCipherTextException {
        ECParameterSpec parameterSpec = priKey.getParameters();
        ECDomainParameters domainParameters = new ECDomainParameters(parameterSpec.getCurve(), parameterSpec.getG(),
                parameterSpec.getN(), parameterSpec.getH());
        ECPrivateKeyParameters priKeyParameters = new ECPrivateKeyParameters(priKey.getD(), domainParameters);

        return decrypt(mode, priKeyParameters, sm2Cipher);
    }

    /**
     * @param key       hex
     * @param sm2Cipher 默认输入C1C3C2顺序的密文
     * @return
     * @throws InvalidCipherTextException
     */
    public static String decrypt(String key, byte[] sm2Cipher) throws InvalidCipherTextException {
        byte[] k = CommonUtil.hexStringToBytes(key);
        BigInteger d = new BigInteger(k);
        ECPrivateKeyParameters priKeyParameters = new ECPrivateKeyParameters(d, DOMAIN_PARAMS);

        return StringUtils.newStringUtf8(decrypt(SM2Engine.Mode.C1C3C2, priKeyParameters, sm2Cipher));
    }

    /**
     * @param priKeyParameters
     * @param sm2Cipher        默认输入C1C3C2顺序的密文
     * @return
     * @throws InvalidCipherTextException
     */
    public static byte[] decrypt(ECPrivateKeyParameters priKeyParameters, byte[] sm2Cipher)
            throws InvalidCipherTextException {
        return decrypt(SM2Engine.Mode.C1C3C2, priKeyParameters, sm2Cipher);
    }

    /**
     * @param mode             指定密文结构，旧标准的为C1C2C3，新的[《SM2密码算法使用规范》 GM/T 0009-2012]标准为C1C3C2
     * @param priKeyParameters
     * @param sm2Cipher
     * @return
     * @throws InvalidCipherTextException
     */
    public static byte[] decrypt(SM2Engine.Mode mode, ECPrivateKeyParameters priKeyParameters, byte[] sm2Cipher)
            throws InvalidCipherTextException {
        SM2Engine engine = new SM2Engine(mode);
        engine.init(false, priKeyParameters);
        return engine.processBlock(sm2Cipher, 0, sm2Cipher.length);
    }

    /**
     * C1C3C2
     *
     * @param key  hex
     * @param data base64格式密文
     * @return
     * @throws InvalidCipherTextException
     */
    public static String decryptBase64(String key, String data) throws Exception {
        byte[] k = CommonUtil.hexStringToBytes(key);
        BigInteger d = new BigInteger(k);
        ECPrivateKeyParameters priKeyParameters = new ECPrivateKeyParameters(d, DOMAIN_PARAMS);

        byte[] dectypt = decrypt(SM2Engine.Mode.C1C3C2, priKeyParameters, Base64.decode(data.getBytes(ENCODING)));
        return new String(dectypt, ENCODING);
    }

    /**
     * @param pubkey
     * @param srcData
     * @return 默认输出C1C3C2顺序的密文
     * @throws InvalidCipherTextException
     */
    public static String encryptBase64(String pubkey, String srcData) throws Exception {
        byte[] k = CommonUtil.hexStringToBytes(pubkey);
        ECPoint Q = DOMAIN_PARAMS.getCurve().decodePoint(k);
        ECPublicKeyParameters pubKeyParameters = new ECPublicKeyParameters(Q, DOMAIN_PARAMS);
        byte[] encrypt = encrypt(SM2Engine.Mode.C1C3C2, pubKeyParameters, srcData.getBytes(ENCODING));
        return new String(Base64.encode(encrypt), ENCODING);
    }

}
