package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdEducationSchool;
import com.isprint.jslx.lccfd.model.FdEducationSchoolQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdEducationSchoolMapper {
    int countByExample(FdEducationSchoolQuery example);

    int deleteByExample(FdEducationSchoolQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdEducationSchool record);

    int insertSelective(FdEducationSchool record);

    List<FdEducationSchool> selectByExample(FdEducationSchoolQuery example);

    FdEducationSchool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdEducationSchool record, @Param("example") FdEducationSchoolQuery example);

    int updateByExample(@Param("record") FdEducationSchool record, @Param("example") FdEducationSchoolQuery example);

    int updateByPrimaryKeySelective(FdEducationSchool record);

    int updateByPrimaryKey(FdEducationSchool record);
}