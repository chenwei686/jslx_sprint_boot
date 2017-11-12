package estest;

import com.isprint.jslx.lccfd.Application;
import com.isprint.jslx.lccfd.add.EsAddDocument;
import com.isprint.jslx.lccfd.controller.esearch.EsController;
import com.isprint.jslx.lccfd.dao.BaseTimuSearchMapper;
import com.isprint.jslx.lccfd.index.EsIndexService;
import com.isprint.jslx.lccfd.mapping.EsMappingService;
import com.isprint.jslx.lccfd.utils.XContentUtils;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.Map;

//import com.isprint.jslx.lccfd.index.EsIndexService;
//import com.isprint.jslx.lccfd.mapping.EsMappingService;

/**
 * @author HYL
 * @create 2017-11-11 下午5:26
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class Test {
    @Autowired
    BaseTimuSearchMapper baseTimuSearchMapper;
//
    @Autowired
EsIndexService indexService;

    @Autowired
    EsMappingService esMappingService;

    @Autowired
    EsAddDocument esAddDocument;

    @Autowired
    EsController esController;

    @org.junit.Test
    public void testMapperAndAddDocument() {
        List<Map<String, Object>> baseTimuSearchList = baseTimuSearchMapper.getBaseTimuSearchList(1, 10);
        Map<String, Object> stringObjectMap = baseTimuSearchList.get(0);
        XContentBuilder xContentBuilder = XContentUtils.builderDocumentWithTimu(stringObjectMap);
        Integer integer = esAddDocument.addDocument("lesprint_test", "timu", xContentBuilder, stringObjectMap.get("id").toString());
        System.out.println(integer);
    }

    @org.junit.Test
    public void createIndex() {
        boolean lesprint_test = indexService.createIndex("lesprint_test");
        System.out.println(lesprint_test);
    }
    @org.junit.Test
    public void createMapping(){
        boolean mapping = esMappingService.createMapping("lesprint_test", "timu");
        System.out.println(mapping);

    }

    @org.junit.Test
    public void testAddDocuments(){
        List<Map<String, Object>> baseTimuSearchList = baseTimuSearchMapper.getBaseTimuSearchList(1, 10);
        boolean b = esAddDocument.addTimus2Search("lesprint_test", "timu", baseTimuSearchList);
        System.out.println(b);
    }

    @org.junit.Test
    public void testAll(){
        String s = esController.buildSearchIndex();
        System.out.println(s);
    }
}
