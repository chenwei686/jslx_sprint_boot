package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentAddSchool;
import com.isprint.jslx.lccfd.model.FdStudentAddSchoolQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentAddSchoolMapper {
    int countByExample(FdStudentAddSchoolQuery example);

    int deleteByExample(FdStudentAddSchoolQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentAddSchool record);

    int insertSelective(FdStudentAddSchool record);

    List<FdStudentAddSchool> selectByExample(FdStudentAddSchoolQuery example);

    FdStudentAddSchool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentAddSchool record, @Param("example") FdStudentAddSchoolQuery example);

    int updateByExample(@Param("record") FdStudentAddSchool record, @Param("example") FdStudentAddSchoolQuery example);

    int updateByPrimaryKeySelective(FdStudentAddSchool record);

    int updateByPrimaryKey(FdStudentAddSchool record);
}