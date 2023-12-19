package com.nuoding.wechat.common.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Ahther:JHC
 * @Description:
 * @Date:2023/4/11 下午6:31
 */
public class CollectionUtil {
    public static <T> List<T> containsByField(List<T> list, String field, Object value, Class<T> clazz) {
        List<T> res = new ArrayList<>();

        try {
            // 通过反射获取对应的属性
            Field dbField = clazz.getDeclaredField(field);
            // 设置属性为可访问
            dbField.setAccessible(true);
            for (T t : list) {
                // 遍历list,获取到对应属性的值
                Object o = dbField.get(t);
                if (value.equals(o)) {
                    // 如值和预期想等的话,则加入到返回值中
                    res.add(t);
                }
            }
        } catch (NoSuchFieldException e) {
            // 如果不存在这个字段,则直接返回空
            return res;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return res;
    }

}
