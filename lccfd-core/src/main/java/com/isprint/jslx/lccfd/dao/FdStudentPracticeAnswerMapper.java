package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentPracticeAnswer;
import com.isprint.jslx.lccfd.model.FdStudentPracticeAnswerQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentPracticeAnswerMapper {
    int countByExample(FdStudentPracticeAnswerQuery example);

    int deleteByExample(FdStudentPracticeAnswerQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentPracticeAnswer record);

    int insertSelective(FdStudentPracticeAnswer record);

    List<FdStudentPracticeAnswer> selectByExample(FdStudentPracticeAnswerQuery example);

    FdStudentPracticeAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentPracticeAnswer record, @Param("example") FdStudentPracticeAnswerQuery example);

    int updateByExample(@Param("record") FdStudentPracticeAnswer record, @Param("example") FdStudentPracticeAnswerQuery example);

    int updateByPrimaryKeySelective(FdStudentPracticeAnswer record);

    int updateByPrimaryKey(FdStudentPracticeAnswer record);
}