package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentMonthReport;
import com.isprint.jslx.lccfd.model.FdStudentMonthReportQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentMonthReportMapper {
    int countByExample(FdStudentMonthReportQuery example);

    int deleteByExample(FdStudentMonthReportQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentMonthReport record);

    int insertSelective(FdStudentMonthReport record);

    List<FdStudentMonthReport> selectByExample(FdStudentMonthReportQuery example);

    FdStudentMonthReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentMonthReport record, @Param("example") FdStudentMonthReportQuery example);

    int updateByExample(@Param("record") FdStudentMonthReport record, @Param("example") FdStudentMonthReportQuery example);

    int updateByPrimaryKeySelective(FdStudentMonthReport record);

    int updateByPrimaryKey(FdStudentMonthReport record);
}