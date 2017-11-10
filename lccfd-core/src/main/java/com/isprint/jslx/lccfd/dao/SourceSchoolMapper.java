package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.SourceSchool;
import com.isprint.jslx.lccfd.model.SourceSchoolQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SourceSchoolMapper {
    int countByExample(SourceSchoolQuery example);

    int deleteByExample(SourceSchoolQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(SourceSchool record);

    int insertSelective(SourceSchool record);

    List<SourceSchool> selectByExample(SourceSchoolQuery example);

    SourceSchool selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SourceSchool record, @Param("example") SourceSchoolQuery example);

    int updateByExample(@Param("record") SourceSchool record, @Param("example") SourceSchoolQuery example);

    int updateByPrimaryKeySelective(SourceSchool record);

    int updateByPrimaryKey(SourceSchool record);
}