package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentWeekReport;
import com.isprint.jslx.lccfd.model.FdStudentWeekReportQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentWeekReportMapper {
    int countByExample(FdStudentWeekReportQuery example);

    int deleteByExample(FdStudentWeekReportQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentWeekReport record);

    int insertSelective(FdStudentWeekReport record);

    List<FdStudentWeekReport> selectByExample(FdStudentWeekReportQuery example);

    FdStudentWeekReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentWeekReport record, @Param("example") FdStudentWeekReportQuery example);

    int updateByExample(@Param("record") FdStudentWeekReport record, @Param("example") FdStudentWeekReportQuery example);

    int updateByPrimaryKeySelective(FdStudentWeekReport record);

    int updateByPrimaryKey(FdStudentWeekReport record);
}