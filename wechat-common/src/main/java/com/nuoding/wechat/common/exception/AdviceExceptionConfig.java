package com.nuoding.wechat.common.exception;


import com.alibaba.excel.exception.ExcelAnalysisException;
import com.nuoding.wechat.common.enums.RespStatusEnum;
import com.nuoding.wechat.common.model.MapResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.Collectors;


/**
 * @desc : 全局统一异常处理
 **/
@ControllerAdvice
public class AdviceExceptionConfig {
    private static final Logger log = LoggerFactory.getLogger(AdviceExceptionConfig.class);

    /**
     * 全局异常处理Exception
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    MapResponse handleException(Exception e) {
        log.error("【全局异常处理】-----------接口发生异常：{}", e);
        MapResponse response = new MapResponse();
        response.setCode(RespStatusEnum.FAIL.getStatus());
        response.setMessage(e.getMessage());
        return response;
    }

    /**
     * 全局异常处理RuntimeException
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    MapResponse handleException(RuntimeException e) {
        log.error("【RuntimeException全局异常处理】-----------接口发生异常：{}", e);
        MapResponse response = new MapResponse();
        response.setCode(RespStatusEnum.FAIL.getStatus());
        response.setMessage(RespStatusEnum.FAIL.getMessage());
        return response;
    }

    /**
     * 全局异常处理BusException
     */
    @ExceptionHandler(BusException.class)
    @ResponseBody
    MapResponse handleException(BusException e) {
        log.error("【BusException全局异常处理】-----------接口发生异常：{}", e);
        MapResponse response = new MapResponse();
        if (null != e.getRspStatus()) {
            response.setCode(e.getRspStatus().getStatus());
            if (StringUtils.isNoneBlank(e.getMessage())) {
                response.setMessage(e.getMessage());
            } else {
                response.setMessage(e.getRspStatus().getMessage());
            }
            return response;
        }
        response.setCode(RespStatusEnum.FAIL.getStatus());
        response.setMessage(RespStatusEnum.FAIL.getMessage());
        return response;
    }

    /**
     * 全局异常处理NoRollBackException
     */
    @ExceptionHandler(NoRollBackException.class)
    @ResponseBody
    MapResponse handleException(NoRollBackException e) {
        log.error("【NoRollBackException全局异常处理】-----------接口发生异常：{}", e);
        MapResponse response = new MapResponse();
        if (null != e.getRspStatus()) {
            response.setCode(e.getRspStatus().getStatus());
            if (StringUtils.isNoneBlank(e.getMessage())) {
                response.setMessage(e.getMessage());
            } else {
                response.setMessage(e.getRspStatus().getMessage());
            }
            return response;
        }
        response.setCode(RespStatusEnum.FAIL.getStatus());
        response.setMessage(RespStatusEnum.FAIL.getMessage());
        return response;
    }

    /**
     * 全局异常处理MethodArgumentNotValidException
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    MapResponse handleException(MethodArgumentNotValidException e) {
        log.error("【MethodArgumentNotValidException全局异常处理】-----------接口发生异常：{}", e);
        MapResponse response = new MapResponse();
        BindingResult bs = e.getBindingResult();
        String message = "";
        if (bs.hasErrors()) {
            message = bs.getFieldErrors().stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(","));
        }
        response.setCode(RespStatusEnum.ARGS_NULL.getStatus());
        response.setMessage(StringUtils.isEmpty(message) ? RespStatusEnum.FAIL.getMessage() : message);
        return response;
    }


    @ExceptionHandler(ExcelAnalysisException.class)
    @ResponseBody
    MapResponse handleException(ExcelAnalysisException e) {
        log.error("【ExcelAnalysisException全局异常处理】-----------接口发生异常：{}", e);
        MapResponse response = new MapResponse();
        response.setCode(RespStatusEnum.FAIL.getStatus());
        response.setMessage(e.getCause().getMessage());
        return response;
    }

}
