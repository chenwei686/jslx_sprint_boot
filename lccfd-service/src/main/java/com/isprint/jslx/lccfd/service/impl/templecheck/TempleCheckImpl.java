package com.isprint.jslx.lccfd.service.impl.templecheck;

import com.alibaba.fastjson.JSONObject;
import com.isprint.jslx.lccfd.dao.TempCheck2Mapper;
import com.isprint.jslx.lccfd.model.TempCheck2;
import com.isprint.jslx.lccfd.model.TempCheck2Query;
import com.isprint.jslx.lccfd.service.inter.templecheck.TempleCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HYL
 * @create 2017-11-10 上午11:36
 **/
@Service
public class TempleCheckImpl implements TempleCheck {

    @Autowired
    private TempCheck2Mapper tempCheck2Mapper;

    @Override
    public JSONObject getDate(Integer subjectId, Integer index, String remark) {
        JSONObject jsonObject = new JSONObject();
        TempCheck2Query tempCheck2Query = new TempCheck2Query();//查询全部记录数
        TempCheck2Query.Criteria criteria = tempCheck2Query.createCriteria();
        TempCheck2Query pagequery = new TempCheck2Query();//分页查询记录
        TempCheck2Query.Criteria pageCriteria = pagequery.createCriteria();
        TempCheck2Query noCorrectQuery = new TempCheck2Query();//查询没有订正的记录数
        TempCheck2Query.Criteria noCorrectQueryCriteria = noCorrectQuery.createCriteria();
        pagequery.setPageSize(5);
        pagequery.setPageNo(index);
        pagequery.setOrderByClause("create_time asc");
        if (remark.equals("全部")) {
            criteria.andSubjectIdEqualTo(subjectId);
            pageCriteria.andSubjectIdEqualTo(subjectId);
            noCorrectQueryCriteria.andSubjectIdEqualTo(subjectId).andSimIdEqualTo("noCorrect");
        }else {
            criteria.andSubjectIdEqualTo(subjectId).andRemarkEqualTo(remark);
            pageCriteria.andSubjectIdEqualTo(subjectId).andRemarkEqualTo(remark);
            noCorrectQueryCriteria.andSubjectIdEqualTo(subjectId).andSimIdEqualTo("noCorrect").andRemarkEqualTo(remark);
        }
        List<TempCheck2> check2List = tempCheck2Mapper.selectByExample(pagequery);
        int totalRow = tempCheck2Mapper.countByExample(tempCheck2Query);
        int noCorrectCount = tempCheck2Mapper.countByExample(noCorrectQuery);
        int totalPage = totalRow / 5;
        if (totalRow % 5 > 0) {
            totalPage += 1;
        }
        Integer corrects=totalRow-noCorrectCount;
        jsonObject.put("totalPage",totalPage);
        jsonObject.put("timus",check2List);
        jsonObject.put("totalRow",totalRow);
        jsonObject.put("corrects",corrects);
        return jsonObject;
    }
}
