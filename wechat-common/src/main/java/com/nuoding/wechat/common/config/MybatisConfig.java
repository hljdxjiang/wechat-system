package com.nuoding.wechat.common.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * mybatis根据扫描包的不同自动进行数据源配置
 */
@Configuration
@MapperScan(basePackages = "com.nuoding.wechat.common.mapper", sqlSessionTemplateRef = "ds1SqlSessionTemplate")
public class MybatisConfig {

    @Value("${mybatis.config-location}")
    private String configLocation;

    @Value("${mybatis.mapper-locations}")
    private String mapperLocation;

    @Value("${mybatis.type-aliases-package}")
    private String typeAliasesPackage;

    @Primary
    @Bean("ds1SqlSessionFactory")
    public SqlSessionFactory ds1SqlSessionFatory(@Qualifier("ds1DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(resolver.getResources(mapperLocation));
        factoryBean.setConfigLocation(resolver.getResource(configLocation));
        factoryBean.setTypeAliasesPackage(typeAliasesPackage);
        return factoryBean.getObject();
    }

    @Primary
    @Bean(name = "ds1TransactionManager")
    public DataSourceTransactionManager ds1TransactionManager(@Qualifier("ds1DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean(name = "ds1SqlSessionTemplate")
    public SqlSessionTemplate ds1SqlSessionTemplate(@Qualifier("ds1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }


}
