package com.isprint.jslx.lccfd.query;

import com.alibaba.fastjson.JSONObject;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.elasticsearch.index.query.QueryBuilders.boolQuery;

/**
 * @author HYL
 * @create 2017-11-12 下午12:04
 **/
@Service
public class EsQuery {


    @Autowired
    private TransportClient client;


    public List<Hit_> getResult(String keyWords){
        List<Hit_> hit_s = searchWithParse(keyWords);
        if (hit_s!=null&&hit_s.size()>0) {
            Integer subjectId = hit_s.get(0).getSource().getSubjectId();//获得第一个搜索结果的科目的id
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(subjectId);
            List<Hit_> result = seachBySubject(keyWords, integers);
            return result;
        }else {
            return null;
        }
    }

    /**
    *
    * @Author: HuangYiLi
    * @Description: 不区分科目,包括短句搜索
    * @Date: 下午12:09 2017/11/12
    * @URL:
    * @param
    */
    public   List<Hit_> searchWithParse(String keyWords){
        SearchResponse searchResponse = client.prepareSearch("lesprint")
                .setTypes("timu")
                .setQuery(
                        boolQuery()
                                .must(QueryBuilders.matchQuery("trunk", keyWords))
                                .should(QueryBuilders.matchPhraseQuery("trunk", keyWords)))
                .setFrom(0)
                .setSize(5)
                .setExplain(false)
                .get();
        List<Hit_> hit_s = getHit_s(searchResponse);
        return hit_s;
    }

    /**
     * @param
     * @Author: HuangYiLi
     * @Description: 根据科目的类型进行过滤查询
     * @Date: 下午9:02 2017/9/12
     * @URL:
     */
    public List<Hit_> seachBySubject(String keyWords, List<Integer> subjectIds) {
        SearchResponse searchResponse = client.prepareSearch("lesprint")
                .setTypes("timu")
                .setQuery(
                        boolQuery()
                                .must(QueryBuilders.matchQuery("trunk", keyWords))
                                .should(QueryBuilders.matchPhraseQuery("trunk", keyWords))
                                .must(QueryBuilders.termsQuery("subjectId", subjectIds))
                )
                .setFrom(0)
                .setSize(5)
                .setExplain(false)
                .get();
        List<Hit_> hit_s = getHit_s(searchResponse);
        return hit_s;
    }


    /**
    *
    * @Author: HuangYiLi
    * @Description: 解析搜索结果
    * @Date: 下午12:08 2017/11/12
    * @URL:
    * @param
    */
    public  List<Hit_> getHit_s(SearchResponse searchResponse) {
        SearchHits hits = searchResponse.getHits();
        float maxScore = hits.getMaxScore();
        System.out.println(maxScore);
        long totalHits = hits.getTotalHits();
        System.out.println(totalHits);
        SearchHit[] hits1 = hits.getHits();
        ArrayList<Hit_> hit_s = new ArrayList<>();
        if (hits1.length>0) {
            for (SearchHit searchHitFields : hits1) {
                if (hit_s.size()<=4) {

                    Hit_ hit_ = new Hit_();
                    String index = searchHitFields.getIndex();
                    String type = searchHitFields.getType();
                    float score = searchHitFields.getScore();
                    Map<String, Object> source = searchHitFields.getSource();
                    String s = JSONObject.toJSONString(source);
                    TimuInESearch timuInESearch = JSONObject.parseObject(s, TimuInESearch.class);
                    hit_.setIndex(index);
                    hit_.setType(type);
                    hit_.setScore(score);
                    hit_.setSource(timuInESearch);
                    hit_s.add(hit_);
                }
            }
        }
        return hit_s;
    }
}
