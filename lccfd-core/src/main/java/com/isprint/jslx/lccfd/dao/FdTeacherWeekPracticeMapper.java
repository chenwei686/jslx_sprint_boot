package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherWeekPractice;
import com.isprint.jslx.lccfd.model.FdTeacherWeekPracticeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherWeekPracticeMapper {
    int countByExample(FdTeacherWeekPracticeQuery example);

    int deleteByExample(FdTeacherWeekPracticeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherWeekPractice record);

    int insertSelective(FdTeacherWeekPractice record);

    List<FdTeacherWeekPractice> selectByExample(FdTeacherWeekPracticeQuery example);

    FdTeacherWeekPractice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherWeekPractice record, @Param("example") FdTeacherWeekPracticeQuery example);

    int updateByExample(@Param("record") FdTeacherWeekPractice record, @Param("example") FdTeacherWeekPracticeQuery example);

    int updateByPrimaryKeySelective(FdTeacherWeekPractice record);

    int updateByPrimaryKey(FdTeacherWeekPractice record);
}