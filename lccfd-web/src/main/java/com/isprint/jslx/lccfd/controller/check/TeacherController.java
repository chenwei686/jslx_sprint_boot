package com.isprint.jslx.lccfd.controller.check;

import com.alibaba.fastjson.JSONObject;
import com.isprint.jslx.lccfd.dao.TempCheckMapper;
import com.isprint.jslx.lccfd.model.TempCheck;
import com.isprint.jslx.lccfd.model.TempCheckQuery;
import com.isprint.jslx.lccfd.service.inter.templecheck.TempleCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 教师检查
 *
 * @author HYL
 * @create 2017-11-09 下午4:08
 **/
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    private Map<Integer, String> map;

    public TeacherController() {
        map = new HashMap<>();
        map.put(1, "全部");
        map.put(2, "黄冈100分闯关");
        map.put(3, "黄冈100分闯关试卷-第二章，第四章，第五章，第六章，期末试卷");
        map.put(4, "课堂点睛");
        map.put(5, "探究在线高校课堂物理八年级上册");
        map.put(6, "全部");
        map.put(7, "原创新课堂");
        map.put(8, "原创新课堂十三章检测卷，期中检测卷，期末检测卷");
        map.put(9, "原创新课堂十五章检测卷");
    }

    @Autowired
    private TempCheckMapper tempCheckMapper;
    @Autowired
    private TempleCheck templeCheck;

    @RequestMapping("/home")
    public String home() {
        return "correct/backcontent";
    }

    public String getResult(@RequestParam(name = "subjectId", defaultValue = "2") Integer subjectId,
                            @RequestParam(name = "index", defaultValue = "1") Integer index,
                            @RequestParam(name = "studentId", defaultValue = "1") Integer studentId,
                            ModelMap modelMap) {
        if (index <= 0) {
            index = 1;
        }
        TempCheckQuery tempCheckQuery = new TempCheckQuery();
        tempCheckQuery.setPageNo(index);
        tempCheckQuery.setPageSize(5);
        TempCheckQuery.Criteria queryCriteria = tempCheckQuery.createCriteria();
        queryCriteria.andSubjectIdEqualTo(subjectId);
        if (studentId != 1 && subjectId == 4) {
            queryCriteria.andStudentIdEqualTo(studentId);
        }
        tempCheckQuery.setOrderByClause("create_time asc");
        List<TempCheck> checkList = tempCheckMapper.selectByExample(tempCheckQuery);
        TempCheckQuery querCount = new TempCheckQuery();
        TempCheckQuery.Criteria criteria = querCount.createCriteria();
        criteria.andSubjectIdEqualTo(subjectId);
        if (studentId != 1 && subjectId == 4) {
            criteria.andStudentIdEqualTo(studentId);
        }
        int totalRow = tempCheckMapper.countByExample(querCount);
        int totalPage = totalRow / 5;
        if (totalRow % 5 > 0) {
            totalPage += 1;
        }
        TempCheckQuery hasCorrectQuery = new TempCheckQuery();
        TempCheckQuery.Criteria hasCorrectQueryCriteria = hasCorrectQuery.createCriteria();
        hasCorrectQueryCriteria
                .andSubjectIdEqualTo(subjectId)
                .andSimIdEqualTo("noCorrect");
        if (studentId != 1 && subjectId == 4) {
            hasCorrectQueryCriteria.andStudentIdEqualTo(studentId);
        }
        int hasCorrect = tempCheckMapper.countByExample(hasCorrectQuery);
        modelMap.put("index", index);
        modelMap.put("total", totalPage);
        modelMap.put("timus", checkList);
        modelMap.put("pageSize", 5);
        modelMap.put("subjectId", subjectId);
        modelMap.put("studentId", studentId == null ? 1 : studentId);
        modelMap.put("totalRow", totalRow);
        modelMap.put("corrects", totalRow - hasCorrect);

        return "correct/tm_content";
    }

    @RequestMapping("/getCorrect")
    public String getOther(@RequestParam(name = "subjectId", defaultValue = "2") Integer subjectId,
                           @RequestParam(name = "index", defaultValue = "1") Integer index,
                           @RequestParam(name = "studentId", defaultValue = "1") Integer studentId,
                           ModelMap modelMap) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "全部");
        map.put(2, "黄冈100分闯关");
        map.put(3, "黄冈100分闯关试卷-第二章，第四章，第五章，第六章，期末试卷");
        map.put(4, "课堂点睛");
        map.put(5, "探究在线高校课堂物理八年级上册");
        map.put(6, "全部");
        map.put(7, "原创新课堂");
        map.put(8, "原创新课堂十三章检测卷，期中检测卷，期末检测卷");
        map.put(9, "原创新课堂十五章检测卷");
        String remark = map.get(studentId);
        JSONObject date = templeCheck.getDate(subjectId, index, remark);
        modelMap.put("index", index);
        modelMap.put("total", date.get("totalPage"));
        modelMap.put("timus", date.get("timus"));
        modelMap.put("pageSize", 5);
        modelMap.put("subjectId", subjectId);
        modelMap.put("studentId", studentId);
        modelMap.put("totalRow", date.get("totalRow"));
        modelMap.put("corrects", date.get("corrects"));
        return "correct/tm_content";
    }
}
