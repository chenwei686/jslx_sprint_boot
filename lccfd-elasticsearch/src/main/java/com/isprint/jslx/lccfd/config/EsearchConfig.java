package com.isprint.jslx.lccfd.config;

import org.apache.log4j.Logger;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author HYL
 * @create 2017-11-11 下午3:32
 **/
@Configuration
@ConfigurationProperties(prefix = "eseach.host")
@PropertySource(value = "classpath:config/esearch/esearch.properties", encoding = "UTF-8")
public class EsearchConfig {

    private static Logger logger = Logger.getLogger(EsearchConfig.class);
    private String first;
    private String second;
    private String third;
    private String first_prod;
    private String second_prod;
    private String third_prod;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFirst_prod() {
        return first_prod;
    }

    public void setFirst_prod(String first_prod) {
        this.first_prod = first_prod;
    }

    public String getSecond_prod() {
        return second_prod;
    }

    public void setSecond_prod(String second_prod) {
        this.second_prod = second_prod;
    }

    public String getThird_prod() {
        return third_prod;
    }

    public void setThird_prod(String third_prod) {
        this.third_prod = third_prod;
    }


    @Bean
//    @Conditional(WindowsOrMacConditon.class)
    public TransportClient getClient() {
        TransportClient client=null;
        Settings settings = Settings.builder()
                .put("cluster.name", "lcc")
                .put("client.transport.sniff", true).build();
        try {
             client = new PreBuiltTransportClient(settings)
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(first), 9300))
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(second), 9300))
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(third), 9300));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        logger.info("init EsClient ...");
        return client;
    }

//    @Bean
//    @Conditional(LinuxCondition.class)
//    public TransportClient getJedisPoolForLinux() {
//        Settings settings = Settings.builder()
//                .put("cluster.name", "lcc")
//                .put("client.transport.sniff", true).build();
//        try {
//            TransportClient client = new PreBuiltTransportClient(settings)
//                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(first_prod), 9300))
//                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(second_prod), 9300))
//                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(third_prod), 9300));
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
//        logger.info("init EsClient ...");
//        return null;
//    }
}
