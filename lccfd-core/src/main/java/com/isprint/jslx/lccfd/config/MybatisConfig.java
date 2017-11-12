package com.isprint.jslx.lccfd.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author HYL
 * @create 2017-08-19 下午5:58
 **/
@Configuration
@Component
@MapperScan("com.isprint.jslx.lccfd.dao")
public class MybatisConfig {
    private static Logger logger = Logger.getLogger(MybatisConfig.class);


    @Autowired
    DataSource dataSource;

    @Bean
    public DataSourceTransactionManager txManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean()  {
        SqlSessionFactoryBean sqlSessionFactoryBean = null;
        try {
            sqlSessionFactoryBean = new SqlSessionFactoryBean();
            sqlSessionFactoryBean.setDataSource(dataSource);
            sqlSessionFactoryBean.setTypeAliasesPackage("com.isprint.jslx.lccfd.model");
            sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("/config/mybatis-config.xml"));
        } catch (Exception e) {
            logger.error("创建sqlSessionFactoryBean异常",e);
        }
        logger.info("innit sqlSessionFactoryBean");
        logger.info(sqlSessionFactoryBean==null);
        return sqlSessionFactoryBean;
    }
}
