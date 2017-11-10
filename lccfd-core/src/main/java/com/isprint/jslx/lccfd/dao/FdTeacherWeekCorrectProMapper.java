package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherWeekCorrectPro;
import com.isprint.jslx.lccfd.model.FdTeacherWeekCorrectProQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherWeekCorrectProMapper {
    int countByExample(FdTeacherWeekCorrectProQuery example);

    int deleteByExample(FdTeacherWeekCorrectProQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherWeekCorrectPro record);

    int insertSelective(FdTeacherWeekCorrectPro record);

    List<FdTeacherWeekCorrectPro> selectByExample(FdTeacherWeekCorrectProQuery example);

    FdTeacherWeekCorrectPro selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherWeekCorrectPro record, @Param("example") FdTeacherWeekCorrectProQuery example);

    int updateByExample(@Param("record") FdTeacherWeekCorrectPro record, @Param("example") FdTeacherWeekCorrectProQuery example);

    int updateByPrimaryKeySelective(FdTeacherWeekCorrectPro record);

    int updateByPrimaryKey(FdTeacherWeekCorrectPro record);
}