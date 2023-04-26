package com.nuoding.wechat.common.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author :tf
 * @create :2022/05/08
 * @desc : 获取spring 容器中bean
 **/
@Component
public class ApplicationSpringUtils implements ApplicationContextAware {

    private static final Logger log = LoggerFactory.getLogger(ApplicationSpringUtils.class);

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        if (applicationContext == null) {
            applicationContext = context;
        }
        log.info("---------------------注入springContext-------------------------------");
    }

    /**
     * 通过name获取bean
     */
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    /**
     * 通过class获取bean
     */
    public static <T> T getBean(Class<T> tClass) {
        return getApplicationContext().getBean(tClass);
    }

    /**
     * 通过name、class获取bean
     */
    public static <T> T getBean(String name, Class<T> tClass) {
        return getApplicationContext().getBean(name, tClass);
    }
}
