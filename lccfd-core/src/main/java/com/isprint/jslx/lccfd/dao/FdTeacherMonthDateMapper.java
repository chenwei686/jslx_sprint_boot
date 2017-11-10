package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherMonthDate;
import com.isprint.jslx.lccfd.model.FdTeacherMonthDateQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherMonthDateMapper {
    int countByExample(FdTeacherMonthDateQuery example);

    int deleteByExample(FdTeacherMonthDateQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherMonthDate record);

    int insertSelective(FdTeacherMonthDate record);

    List<FdTeacherMonthDate> selectByExample(FdTeacherMonthDateQuery example);

    FdTeacherMonthDate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherMonthDate record, @Param("example") FdTeacherMonthDateQuery example);

    int updateByExample(@Param("record") FdTeacherMonthDate record, @Param("example") FdTeacherMonthDateQuery example);

    int updateByPrimaryKeySelective(FdTeacherMonthDate record);

    int updateByPrimaryKey(FdTeacherMonthDate record);
}