package com.isprint.jslx.lccfd.index;

import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 索引的创建
 *
 * @author HYL
 * @create 2017-11-11 下午3:48
 **/
@Service
public class EsIndexService {

    @Autowired
    private TransportClient client;

    /**
    *
    * @Author: HuangYiLi
    * @Description: 传入一个索引的名字创建一个索引
    * @Date: 下午3:53 2017/11/11
    * @URL:
    * @param
    */
    public boolean createIndex(String indexName){
//        org.elasticsearch.plugins.NetworkPlugin;
        CreateIndexResponse createIndexResponse = client.admin().indices().prepareCreate(indexName).execute().actionGet();
        boolean acknowledged = createIndexResponse.isAcknowledged();
        return acknowledged;

    }
}
