package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherDayReport;
import com.isprint.jslx.lccfd.model.FdTeacherDayReportQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherDayReportMapper {
    int countByExample(FdTeacherDayReportQuery example);

    int deleteByExample(FdTeacherDayReportQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherDayReport record);

    int insertSelective(FdTeacherDayReport record);

    List<FdTeacherDayReport> selectByExample(FdTeacherDayReportQuery example);

    FdTeacherDayReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherDayReport record, @Param("example") FdTeacherDayReportQuery example);

    int updateByExample(@Param("record") FdTeacherDayReport record, @Param("example") FdTeacherDayReportQuery example);

    int updateByPrimaryKeySelective(FdTeacherDayReport record);

    int updateByPrimaryKey(FdTeacherDayReport record);
}