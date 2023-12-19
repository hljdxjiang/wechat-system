package com.nuoding.wechat.api.service.base.impl;

import com.nuoding.wechat.api.service.base.BaseProcessService;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.model.BaseDTO;
import com.nuoding.wechat.common.model.base.MapRequest;
import com.nuoding.wechat.common.model.base.MapResponse;
import com.nuoding.wechat.common.service.strategy.BaseStrategy;
import com.nuoding.wechat.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

@Service
public class BaseProcessServiceImpl implements BaseProcessService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Map<String, BaseStrategy> map;

    @Override
    public MapResponse processTask(MapRequest request) {
        MapResponse mapResponse = null;
        String transCode = request.getHeader().getTransCode();
        logger.info("processTask begin.transCode:{}", transCode);
        BaseStrategy strategy = map.get(transCode);
        if (strategy == null) {
            logger.info("processTask.transCode is not exists");
            mapResponse = new MapResponse();
            mapResponse.setResponse(RespStatusEnum.ARGS_TRANS_CODE_ERROR);
        } else {
            Class<?> strategyClass = strategy.getClass();

// 获取 BaseStrategy 接口的泛型参数类型 DTO
            ParameterizedType genericInterface = (ParameterizedType) strategyClass.getGenericInterfaces()[0];
            Type[] typeArguments = genericInterface.getActualTypeArguments();
            Class<?> dtoClass = (Class<?>) typeArguments[0];
            System.out.println("DTO Type: " + dtoClass.getName());
            Field[] fields = dtoClass.getDeclaredFields();

            String reqBodyStr = JsonUtil.obj2Json(request.getBody());
            System.out.println("reqBodyStr: " + reqBodyStr);
// 遍历DTO的字段
            BaseDTO base = (BaseDTO) JsonUtil.json2Obj(reqBodyStr, dtoClass);
            for (Field field : fields) {
                // 获取字段名称
                String fieldName = field.getName();
                System.out.println("fieldName: " + fieldName);

                // 获取字段类型
                Class<?> fieldType = field.getType();
                System.out.println("fieldType: " + fieldType.getClass().getName());
                // 设置字段为可访问，以便获取字段的值
                field.setAccessible(true);
                try {
                    // 获取字段的值
                    Object fieldValue = field.get(base);
                    // 输出字段的名称、类型和值
                    System.out.println("Field Name: " + fieldName);
                    System.out.println("Field Type: " + fieldType.getName());
                    System.out.println("Field Value: " + fieldValue);
                } catch (IllegalAccessException e) {
                    // 处理异常，例如字段无法访问的情况
                    e.printStackTrace();
                }
            }
            mapResponse = strategy.process(request.getHeader(), base);
        }
        return mapResponse;
    }
}
