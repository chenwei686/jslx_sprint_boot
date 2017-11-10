package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherWeekExampaperPro;
import com.isprint.jslx.lccfd.model.FdTeacherWeekExampaperProQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherWeekExampaperProMapper {
    int countByExample(FdTeacherWeekExampaperProQuery example);

    int deleteByExample(FdTeacherWeekExampaperProQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherWeekExampaperPro record);

    int insertSelective(FdTeacherWeekExampaperPro record);

    List<FdTeacherWeekExampaperPro> selectByExample(FdTeacherWeekExampaperProQuery example);

    FdTeacherWeekExampaperPro selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherWeekExampaperPro record, @Param("example") FdTeacherWeekExampaperProQuery example);

    int updateByExample(@Param("record") FdTeacherWeekExampaperPro record, @Param("example") FdTeacherWeekExampaperProQuery example);

    int updateByPrimaryKeySelective(FdTeacherWeekExampaperPro record);

    int updateByPrimaryKey(FdTeacherWeekExampaperPro record);
}