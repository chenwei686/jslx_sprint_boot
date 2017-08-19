package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseSchoolDegree;
import com.isprint.jslx.lccfd.model.BaseSchoolDegreeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseSchoolDegreeMapper {
    int countByExample(BaseSchoolDegreeQuery example);

    int deleteByExample(BaseSchoolDegreeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseSchoolDegree record);

    int insertSelective(BaseSchoolDegree record);

    List<BaseSchoolDegree> selectByExample(BaseSchoolDegreeQuery example);

    BaseSchoolDegree selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseSchoolDegree record, @Param("example") BaseSchoolDegreeQuery example);

    int updateByExample(@Param("record") BaseSchoolDegree record, @Param("example") BaseSchoolDegreeQuery example);

    int updateByPrimaryKeySelective(BaseSchoolDegree record);

    int updateByPrimaryKey(BaseSchoolDegree record);
}