package com.isprint.jslx.lccfd.mapping;

import org.elasticsearch.action.admin.indices.mapping.put.PutMappingRequest;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingResponse;
import org.elasticsearch.client.Requests;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author HYL
 * @create 2017-11-11 下午3:54
 **/
@Service
public class EsMappingService {

    @Autowired
    private TransportClient client;

    /**
     * @param
     * @Author: HuangYiLi
     * @Description: 创建映射
     * @Date: 下午4:19 2017/11/11
     * @URL:
     */
    public boolean createMapping(String indexName, String typeName) {

        XContentBuilder mapping = getXContentBuilderByJsonObject();
        PutMappingRequest mappingRequest = Requests.putMappingRequest(indexName).type(typeName).source(mapping);
        PutMappingResponse mappingResponse = client.admin().indices().putMapping(mappingRequest).actionGet();
        boolean acknowledged = mappingResponse.isAcknowledged();
        return acknowledged;
    }

    /**
     * @param
     * @Author: HuangYiLi
     * @Description: 构造映射条件
     * @Date: 下午4:19 2017/11/11
     * @URL:
     */
    public XContentBuilder getXContentBuilderByJsonObject() {
        XContentBuilder mapper = null;
        try {
            mapper = XContentFactory.jsonBuilder()
                    .startObject()
                    .startObject("properties")
                    .startObject("timuId")
                    .field("type", "string")
                    .field("store", "yes")
                    .field("index", "not_analyzed")
                    .endObject()
                    .startObject("trunk")
                    .field("type", "string")
                    .field("index_options", "docs")
                    .field("norms", "true")
                    .field("analyzer", "ik_max_word")
                    .field("search_analyzer", "ik_max_word")
                    .endObject()
                    .startObject("timuTypeId")
                    .field("type", "integer")
                    .endObject()
                    .startObject("difficultLevel")
                    .field("type", "integer")
                    .endObject()
                    .startObject("inputChoiceJson")
                    .field("type", "text")
                    .field("index", "not_analyzed")
                    .endObject()
                    .startObject("mainKnowledgeId")
                    .field("type", "integer")
                    .field("index", "not_analyzed")
                    .endObject()
                    .startObject("videoCode")
                    .field("type", "text")
                    .field("index", "not_analyzed")
                    .endObject()
                    .startObject("subjectId")
                    .field("type", "integer")
                    .endObject()
                    .endObject()
                    .endObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapper;
    }
}
