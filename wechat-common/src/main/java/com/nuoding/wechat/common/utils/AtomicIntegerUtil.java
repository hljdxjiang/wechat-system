package com.nuoding.wechat.common.utils;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerUtil {
    static AtomicInteger version = new AtomicInteger(1);

    public static int increment(int versionNumber) {
        version.set(versionNumber);
        return version.incrementAndGet();
    }

    public static int decrement(int versionNumber) {
        version.set(versionNumber);
        return version.decrementAndGet();
    }
}
