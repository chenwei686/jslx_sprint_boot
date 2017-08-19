package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherMonthReport;
import com.isprint.jslx.lccfd.model.FdTeacherMonthReportQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherMonthReportMapper {
    int countByExample(FdTeacherMonthReportQuery example);

    int deleteByExample(FdTeacherMonthReportQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherMonthReport record);

    int insertSelective(FdTeacherMonthReport record);

    List<FdTeacherMonthReport> selectByExample(FdTeacherMonthReportQuery example);

    FdTeacherMonthReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherMonthReport record, @Param("example") FdTeacherMonthReportQuery example);

    int updateByExample(@Param("record") FdTeacherMonthReport record, @Param("example") FdTeacherMonthReportQuery example);

    int updateByPrimaryKeySelective(FdTeacherMonthReport record);

    int updateByPrimaryKey(FdTeacherMonthReport record);
}