package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentExampaperAnswer;
import com.isprint.jslx.lccfd.model.FdStudentExampaperAnswerQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentExampaperAnswerMapper {
    int countByExample(FdStudentExampaperAnswerQuery example);

    int deleteByExample(FdStudentExampaperAnswerQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentExampaperAnswer record);

    int insertSelective(FdStudentExampaperAnswer record);

    List<FdStudentExampaperAnswer> selectByExample(FdStudentExampaperAnswerQuery example);

    FdStudentExampaperAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentExampaperAnswer record, @Param("example") FdStudentExampaperAnswerQuery example);

    int updateByExample(@Param("record") FdStudentExampaperAnswer record, @Param("example") FdStudentExampaperAnswerQuery example);

    int updateByPrimaryKeySelective(FdStudentExampaperAnswer record);

    int updateByPrimaryKey(FdStudentExampaperAnswer record);
}