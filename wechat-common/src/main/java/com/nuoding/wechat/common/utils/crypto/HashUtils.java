package com.nuoding.wechat.common.utils.crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtils {

    private static final String SHA512 = "SHA-512";
    private static final String SHA256 = "SHA-256";
    private static final String SHA224 = "SHA-224";
    private static final String SHA384 = "SHA-384";

    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }

    public static String sha224(String input) {
        return sha(input, SHA224);
    }

    public static String sha256(String input) {
        return sha(input, SHA256);
    }

    public static String sha384(String input) {
        return sha(input, SHA384);
    }

    public static String sha512(String input) {
        return sha(input, SHA512);
    }

    private static String sha(String input, String method) {
        try {
            MessageDigest md = MessageDigest.getInstance(method);
            byte[] hashBytes = md.digest(input.getBytes());
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        String input = "Hello, SHA!";
        System.out.println("SHA-256: " + sha256(input));
        System.out.println("SHA-512: " + sha512(input));
    }
}

