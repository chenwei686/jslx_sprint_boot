package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentDayCondition;
import com.isprint.jslx.lccfd.model.FdStudentDayConditionQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentDayConditionMapper {
    int countByExample(FdStudentDayConditionQuery example);

    int deleteByExample(FdStudentDayConditionQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentDayCondition record);

    int insertSelective(FdStudentDayCondition record);

    List<FdStudentDayCondition> selectByExample(FdStudentDayConditionQuery example);

    FdStudentDayCondition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentDayCondition record, @Param("example") FdStudentDayConditionQuery example);

    int updateByExample(@Param("record") FdStudentDayCondition record, @Param("example") FdStudentDayConditionQuery example);

    int updateByPrimaryKeySelective(FdStudentDayCondition record);

    int updateByPrimaryKey(FdStudentDayCondition record);
}