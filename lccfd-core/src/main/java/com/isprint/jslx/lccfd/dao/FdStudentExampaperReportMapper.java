package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentExampaperReport;
import com.isprint.jslx.lccfd.model.FdStudentExampaperReportQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentExampaperReportMapper {
    int countByExample(FdStudentExampaperReportQuery example);

    int deleteByExample(FdStudentExampaperReportQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentExampaperReport record);

    int insertSelective(FdStudentExampaperReport record);

    List<FdStudentExampaperReport> selectByExample(FdStudentExampaperReportQuery example);

    FdStudentExampaperReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentExampaperReport record, @Param("example") FdStudentExampaperReportQuery example);

    int updateByExample(@Param("record") FdStudentExampaperReport record, @Param("example") FdStudentExampaperReportQuery example);

    int updateByPrimaryKeySelective(FdStudentExampaperReport record);

    int updateByPrimaryKey(FdStudentExampaperReport record);
}