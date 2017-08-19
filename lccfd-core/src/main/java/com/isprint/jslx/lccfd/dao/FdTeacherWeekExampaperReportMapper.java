package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherWeekExampaperReport;
import com.isprint.jslx.lccfd.model.FdTeacherWeekExampaperReportQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherWeekExampaperReportMapper {
    int countByExample(FdTeacherWeekExampaperReportQuery example);

    int deleteByExample(FdTeacherWeekExampaperReportQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherWeekExampaperReport record);

    int insertSelective(FdTeacherWeekExampaperReport record);

    List<FdTeacherWeekExampaperReport> selectByExample(FdTeacherWeekExampaperReportQuery example);

    FdTeacherWeekExampaperReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherWeekExampaperReport record, @Param("example") FdTeacherWeekExampaperReportQuery example);

    int updateByExample(@Param("record") FdTeacherWeekExampaperReport record, @Param("example") FdTeacherWeekExampaperReportQuery example);

    int updateByPrimaryKeySelective(FdTeacherWeekExampaperReport record);

    int updateByPrimaryKey(FdTeacherWeekExampaperReport record);
}