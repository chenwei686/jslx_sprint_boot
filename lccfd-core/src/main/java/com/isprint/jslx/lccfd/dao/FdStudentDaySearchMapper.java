package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentDaySearch;
import com.isprint.jslx.lccfd.model.FdStudentDaySearchQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentDaySearchMapper {
    int countByExample(FdStudentDaySearchQuery example);

    int deleteByExample(FdStudentDaySearchQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentDaySearch record);

    int insertSelective(FdStudentDaySearch record);

    List<FdStudentDaySearch> selectByExample(FdStudentDaySearchQuery example);

    FdStudentDaySearch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentDaySearch record, @Param("example") FdStudentDaySearchQuery example);

    int updateByExample(@Param("record") FdStudentDaySearch record, @Param("example") FdStudentDaySearchQuery example);

    int updateByPrimaryKeySelective(FdStudentDaySearch record);

    int updateByPrimaryKey(FdStudentDaySearch record);
}