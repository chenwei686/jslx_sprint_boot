package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentFeedback;
import com.isprint.jslx.lccfd.model.FdStudentFeedbackQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentFeedbackMapper {
    int countByExample(FdStudentFeedbackQuery example);

    int deleteByExample(FdStudentFeedbackQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentFeedback record);

    int insertSelective(FdStudentFeedback record);

    List<FdStudentFeedback> selectByExample(FdStudentFeedbackQuery example);

    FdStudentFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentFeedback record, @Param("example") FdStudentFeedbackQuery example);

    int updateByExample(@Param("record") FdStudentFeedback record, @Param("example") FdStudentFeedbackQuery example);

    int updateByPrimaryKeySelective(FdStudentFeedback record);

    int updateByPrimaryKey(FdStudentFeedback record);
}