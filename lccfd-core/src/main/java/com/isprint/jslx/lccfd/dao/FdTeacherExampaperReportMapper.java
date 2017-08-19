package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherExampaperReport;
import com.isprint.jslx.lccfd.model.FdTeacherExampaperReportQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherExampaperReportMapper {
    int countByExample(FdTeacherExampaperReportQuery example);

    int deleteByExample(FdTeacherExampaperReportQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherExampaperReport record);

    int insertSelective(FdTeacherExampaperReport record);

    List<FdTeacherExampaperReport> selectByExample(FdTeacherExampaperReportQuery example);

    FdTeacherExampaperReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherExampaperReport record, @Param("example") FdTeacherExampaperReportQuery example);

    int updateByExample(@Param("record") FdTeacherExampaperReport record, @Param("example") FdTeacherExampaperReportQuery example);

    int updateByPrimaryKeySelective(FdTeacherExampaperReport record);

    int updateByPrimaryKey(FdTeacherExampaperReport record);
}