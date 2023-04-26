package com.nuoding.wechat.common.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsonUtil {

    private static ObjectMapper mapper = new ObjectMapper();

    private static ObjectMapper mapperNotNull = new ObjectMapper();

    static {
        mapperNotNull.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static <T> T jsonMap2Obj(Map m, Class<T> valueType) {
        return json2Obj(obj2Json(m), valueType);
    }


    public static Map json2Map(String json) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }

        try {
            return mapper.readValue(json, Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static <T> List<T> redisList2List(List<String> redisList, Class<T> valueType) {
        if (redisList == null || redisList.size() < 1) {
            return null;
        }

        try {
            List<T> list = new ArrayList<>();
            for (String s : redisList) {
                list.add(json2Obj(s, valueType));
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T json2Obj(String json, Class<T> valueType) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }

        try {
            return mapper.readValue(json, valueType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String obj2JsonWithNull(Object obj) {
        if (obj == null)
            return null;

        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String obj2Json(Object obj) {
        if (obj == null)
            return null;

        try {
            return mapperNotNull.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List json2List(String json) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }

        try {
            return mapper.readValue(json, List.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static List json2ListObject(String json, Class obj) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }

        CollectionType listType = mapper.getTypeFactory().constructCollectionType(ArrayList.class, obj);
        try {
            return mapper.readValue(json, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
