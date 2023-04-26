package com.nuoding.wechat.common.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @Author:JHC
 * @Date:2022/3/30 - 16:16
 * @Description:异步处理配置
 */
@Configuration
@ComponentScan("com.nuoding.wechat")
public class AsyncTaskConfig implements AsyncConfigurer {

    @Value("${task.pool.core.size}")
    private Integer corePoolSize;

    @Value("${task.pool.max.size}")
    private Integer maxPoolSize;

    @Value("${task.pool.queue.capacity}")
    private Integer queueCapacity;

    @Value("${task.pool.keep.alive}")
    private Integer keepAliveSeconds;

    @Value("${task.pool.thread.prefix}")
    private String threadNamePrefix;

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(corePoolSize);
        taskExecutor.setMaxPoolSize(maxPoolSize);
        taskExecutor.setQueueCapacity(queueCapacity);
        taskExecutor.setKeepAliveSeconds(keepAliveSeconds);
        taskExecutor.setThreadNamePrefix(threadNamePrefix);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return AsyncConfigurer.super.getAsyncUncaughtExceptionHandler();
    }
}
