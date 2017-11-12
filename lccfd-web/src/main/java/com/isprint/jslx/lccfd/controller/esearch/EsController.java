package com.isprint.jslx.lccfd.controller.esearch;

import com.isprint.jslx.lccfd.add.EsAddDocument;
import com.isprint.jslx.lccfd.service.inter.timu.TimuService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author HYL
 * @create 2017-11-12 上午11:31
 **/
@Controller
@RequestMapping("/search")
public class EsController {

    private Logger logger=Logger.getLogger(EsController.class);

    @Autowired
    private TimuService timuService;

    @Autowired
    private EsAddDocument esAddDocument;

    @RequestMapping("/buildIndex")
    public @ResponseBody String buildSearchIndex(){
        String indexName="lesprint_test";
        String type="timu";
        Integer index=1;
        Integer skip=0;
        Integer pageSize=1000;
        Integer end=1000;
        List<Map<String, Object>> baseTimusByPage=timuService.getBaseTimusByPage(skip, end);
        while (baseTimusByPage.size()>0) {
            try {
                esAddDocument.addTimus2Search(indexName, type, baseTimusByPage);
                index++;
                skip=(index-1)*10;
                end=skip+pageSize;
                baseTimusByPage=timuService.getBaseTimusByPage(skip, end);
//                break;
            } catch (Exception e) {
                logger.error("逻辑异常",e);
            }
        }
        return "生成索引结束";
    }
}
