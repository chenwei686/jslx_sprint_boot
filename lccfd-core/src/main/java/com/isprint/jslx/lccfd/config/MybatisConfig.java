package com.isprint.jslx.lccfd.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author HYL
 * @create 2017-08-19 下午5:58
 **/
@Configuration
@MapperScan("com.isprint.jslx.lccfd.dao")
public class MybatisConfig {
    @Autowired
    DataSource dataSource;

    @Bean
    public DataSourceTransactionManager txManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws PropertyVetoException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.isprint.jslx.lccfd.model");
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("/config/mybatis-config.xml"));
        return sqlSessionFactoryBean;
    }
}
