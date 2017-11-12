package com.isprint.jslx.lccfd.utils;

import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;

import java.io.IOException;
import java.util.Map;

/**
 * @author HYL
 * @create 2017-11-11 下午3:56
 **/
public class XContentUtils {

    public static XContentBuilder builderDocumentWithTimu(Map<String,Object> baseTimuSearch){
        Object timuId = baseTimuSearch.get("id");
        Object subjectId = baseTimuSearch.get("subject_id");
        Object timuTypeId = baseTimuSearch.get("timu_type_id");
        Object difficultLevel = baseTimuSearch.get("difficult_level");
        Object inputChoiceJson = baseTimuSearch.get("input_choice_json");
        Object mainKnowledgeId = baseTimuSearch.get("main_knowledge_id");
        XContentBuilder doc = null;
        String searchContent=baseTimuSearch.get("trunk").toString();
        if (inputChoiceJson != null) {
            searchContent=searchContent+inputChoiceJson.toString();
        }
        searchContent=getFilterHtmlAndImg(searchContent);
        try {
            doc = XContentFactory.jsonBuilder()
                    .startObject()
                    .field("timuId", timuId)
                    .field("subjectId", subjectId)
                    .field("timuTypeId", timuTypeId)
                    .field("difficultLevel", difficultLevel)
                    .field("trunk", searchContent)
                    .field("inputChoicesJson", inputChoiceJson)
                    .field("mainKnowledgeId", mainKnowledgeId)
                    .field("videoCode",baseTimuSearch.get("video_code"))
                    .endObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }


    /**
    *
    * @Author: HuangYiLi
    * @Description: 过滤一些图片信息,还有html代码
    * @Date: 上午10:57 2017/11/12
    * @URL:
    * @param
    */

    public static String getFilterHtmlAndImg(String target){
        String resultWithoutImg = target.replaceAll(Regex.IMG, "");
        String resultWithoutKbd = resultWithoutImg.replaceAll(Regex.KBD, "");
        String resultWithouNextLine = resultWithoutKbd.replaceAll(Regex.NEXT_LINE, "");
        String resultWithoutImgEnd = resultWithouNextLine.replaceAll(Regex.IMG_SECOND, "");
        String resultWithoutBr = resultWithoutImgEnd.replaceAll(Regex.BR, "");
        return resultWithoutBr;
    }
}
