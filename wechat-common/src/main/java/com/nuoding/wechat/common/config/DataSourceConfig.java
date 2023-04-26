package com.nuoding.wechat.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 多数据源配置
 *
 * @description
 */
@Configuration
public class DataSourceConfig {

    //主数据源ds1数据源
    @Primary
    @Bean(name = "ds1DataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource ds1DataSource() {
        return DataSourceBuilder.create().build();
    }

    //从数据源ds2数据源
//    @Bean(name = "ds2DataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.ds2")
//    public DataSource ds2DataSource() {
//        return DataSourceBuilder.create().build();
//    }


}
