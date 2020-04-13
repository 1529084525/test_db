package com.xzx.testddb.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

public class DataSourceConfig {

    @Bean(initMethod = "init", destroyMethod = "close")
    @Primary
    public DruidDataSource dataSource(DataSourceProperties properties) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(properties.getUsername());
        druidDataSource.setPassword(properties.getPassword());
        druidDataSource.setUrl(properties.getUrl());
        druidDataSource.setDriverClassName(properties.getDriverClassName());
        druidDataSource.setValidationQuery("select 1");
        return druidDataSource;
    }

}
