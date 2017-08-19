package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseSchool;
import com.isprint.jslx.lccfd.model.BaseSchoolQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseSchoolMapper {
    int countByExample(BaseSchoolQuery example);

    int deleteByExample(BaseSchoolQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseSchool record);

    int insertSelective(BaseSchool record);

    List<BaseSchool> selectByExample(BaseSchoolQuery example);

    BaseSchool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseSchool record, @Param("example") BaseSchoolQuery example);

    int updateByExample(@Param("record") BaseSchool record, @Param("example") BaseSchoolQuery example);

    int updateByPrimaryKeySelective(BaseSchool record);

    int updateByPrimaryKey(BaseSchool record);
}