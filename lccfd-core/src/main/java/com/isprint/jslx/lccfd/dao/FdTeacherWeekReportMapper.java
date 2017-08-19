package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherWeekReport;
import com.isprint.jslx.lccfd.model.FdTeacherWeekReportQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherWeekReportMapper {
    int countByExample(FdTeacherWeekReportQuery example);

    int deleteByExample(FdTeacherWeekReportQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherWeekReport record);

    int insertSelective(FdTeacherWeekReport record);

    List<FdTeacherWeekReport> selectByExample(FdTeacherWeekReportQuery example);

    FdTeacherWeekReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherWeekReport record, @Param("example") FdTeacherWeekReportQuery example);

    int updateByExample(@Param("record") FdTeacherWeekReport record, @Param("example") FdTeacherWeekReportQuery example);

    int updateByPrimaryKeySelective(FdTeacherWeekReport record);

    int updateByPrimaryKey(FdTeacherWeekReport record);
}