package com.nuoding.wechat.background;

/**
 * @Author:JHC
 * @Date:2022/3/17 - 16:06
 * @Description:
 */

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.nuoding.wechat")
@MapperScan("com.nuoding.wechat.common.dao")
@EnableTransactionManagement
@ServletComponentScan
@EnableAsync
@EnableEncryptableProperties
@EnableScheduling
public class BackGroupApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackGroupApplication.class, args);
    }
}

