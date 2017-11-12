package com.isprint.jslx.lccfd.config;

import com.isprint.jslx.springboot.condition.LinuxCondition;
import com.isprint.jslx.springboot.condition.WindowsOrMacConditon;
import org.apache.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author HYL
 * @create 2017-08-19 下午5:57
 **/
@Configuration
@ConfigurationProperties(prefix = "redis" )
@PropertySource(value = "classpath:config/redis-config.properties",encoding = "UTF-8")
public class RedisConfig {
    private static Logger logger = Logger.getLogger(RedisConfig.class);

    private String hostName;
    private String hostNamePro;

    private int port;

    private String password;

    private int timeout;

    // 连接池最大连接数
    private int maxActive;

    //最大空闲连接
    private int maxIdle;

    //最小空闲连接
    private int minIdle;

    @Bean
    public JedisPoolConfig getRedisConfig() {
        JedisPoolConfig config = new JedisPoolConfig();
        return config;
    }

    @Bean
    @Conditional(WindowsOrMacConditon.class)
    public JedisPool getJedisPool() {
        JedisPoolConfig config = getJedisPoolConfig();
        JedisPool pool = new JedisPool(config, hostName, port, timeout, password);
        logger.info("init JredisPool ...");
        return pool;
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public JedisPool getJedisPoolForLinux() {
        JedisPoolConfig config = getJedisPoolConfig();
        JedisPool pool = new JedisPool(config, hostNamePro, port, timeout, password);
        logger.info("init JredisPool ...");
        return pool;
    }
    /**
    *
    * @Author: HuangYiLi
    * @Description: 连接池的配置
    * @Date: 下午1:26 2017/11/7
    * @URL:
    * @param
    */
    private JedisPoolConfig getJedisPoolConfig() {
        JedisPoolConfig config = getRedisConfig();
        config.setMaxTotal(maxActive);
        config.setMaxIdle(maxIdle);
        config.setMinIdle(minIdle);
        return config;
    }


    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }
}
