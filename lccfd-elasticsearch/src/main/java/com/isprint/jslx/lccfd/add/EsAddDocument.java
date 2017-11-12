package com.isprint.jslx.lccfd.add;

import com.isprint.jslx.lccfd.utils.XContentUtils;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author HYL
 * @create 2017-11-11 下午5:07
 **/
@Service
public class EsAddDocument {

    @Autowired
    private TransportClient client;

    /**
     * @param
     * @Author: HuangYiLi
     * @Description: 单个文件的导入
     * @Date: 下午5:08 2017/11/11
     * @URL:
     */

    public Integer addDocument(String indexName, String typeName, XContentBuilder doc, String id) {
        IndexResponse response = null;
        Integer status1 = null;
        if (id != null) {
            response = client.prepareIndex(indexName, typeName, id).setSource(doc).execute().actionGet();
        } else {
            response = client.prepareIndex(indexName, typeName).setSource(doc).execute().actionGet();
        }
        if (response == null) {
            return null;
        } else {
            int status2 = response.status().getStatus();
//            boolean status = (boolean) status2;
            return status2;
        }
    }

    /**
     *
     * @Author: HuangYiLi
     * @Description: 批量导入
     * @Date: 下午5:12 2017/11/11
     * @URL:
     * @param
     */
    /**
     * 批量题目的导入
     */
    public  boolean addTimus2Search(String indexName,String typeName,List<Map<String ,Object>> timuSearchList) {
        BulkRequestBuilder bulkRequest = client.prepareBulk();
        for (Map<String,Object> baseTimuSearch : timuSearchList) {
            XContentBuilder document = XContentUtils.builderDocumentWithTimu(baseTimuSearch) ;
            IndexRequestBuilder source = client.prepareIndex(indexName, typeName).setSource(document);
            bulkRequest.add(source);
        }
        BulkResponse bulkResponse = bulkRequest.execute().actionGet();
        return bulkResponse.hasFailures();
    }

}
