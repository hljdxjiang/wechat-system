package com.nuoding.wechat.common.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author :tf
 * @create :2022/04/29
 * @desc : Gson单例，避免多处 new Gson()
 **/
public class GsonSingleton {
    private volatile static Gson instance = null;

    private GsonSingleton() {
    }

    public static Gson getInstance() {
        if (null == instance) {
            synchronized (GsonSingleton.class) {
                if (null == instance) {
                    instance = new GsonBuilder().disableHtmlEscaping().create();
                }
            }
        }
        return instance;
    }

    public static String beanToJson(Object obj) {
        if (instance == null) {
            instance = getInstance();
        }
        return instance.toJson(obj);
    }
}
