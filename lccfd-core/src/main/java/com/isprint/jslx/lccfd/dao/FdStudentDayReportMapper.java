package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentDayReport;
import com.isprint.jslx.lccfd.model.FdStudentDayReportQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentDayReportMapper {
    int countByExample(FdStudentDayReportQuery example);

    int deleteByExample(FdStudentDayReportQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentDayReport record);

    int insertSelective(FdStudentDayReport record);

    List<FdStudentDayReport> selectByExample(FdStudentDayReportQuery example);

    FdStudentDayReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentDayReport record, @Param("example") FdStudentDayReportQuery example);

    int updateByExample(@Param("record") FdStudentDayReport record, @Param("example") FdStudentDayReportQuery example);

    int updateByPrimaryKeySelective(FdStudentDayReport record);

    int updateByPrimaryKey(FdStudentDayReport record);
}