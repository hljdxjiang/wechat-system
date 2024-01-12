package com.nuoding.wechat.common.utils.crypto;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.Security;

/**
 * @author ：ji
 * @date ：Created in 2020/5/17 10:15
 * @description：
 */
public class GMBase {
    static {
        // 注册三方算法提供商
        Security.addProvider(new BouncyCastleProvider());
    }
}
