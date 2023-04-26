package com.nuoding.wechat.common.context;

import com.nuoding.wechat.common.base.CurrentUser;
import com.nuoding.wechat.common.constant.Constants;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :tf
 * @create :2022/05/08
 * @desc : 服务上下文
 **/
public class AppContext {

    private static final ThreadLocal<Map<String, Object>> THREAD_LOCAL = ThreadLocal.withInitial(() -> new HashMap<>(1));

    private AppContext() {

    }

    /**
     * 获取key对应value
     */
    public static <T> T get(String key) {
        Map map = THREAD_LOCAL.get();
        return (T) map.get(key);
    }

    /**
     * 放入 key-value
     */
    public static void set(String key, Object value) {
        Map map = THREAD_LOCAL.get();
        map.put(key, value);
    }

    /**
     * 清空所有
     */
    public static void remove() {
        THREAD_LOCAL.remove();
    }

    /**
     * 清空指定key-value
     */
    public static <T> T remove(String key) {
        Map map = THREAD_LOCAL.get();
        return (T) map.remove(key);
    }

    /**
     * 获取上下文中的当前登录用户
     */
    public static CurrentUser getCurrentUser() {
        return get(Constants.CURRENT_USER_INFO);
    }

}
