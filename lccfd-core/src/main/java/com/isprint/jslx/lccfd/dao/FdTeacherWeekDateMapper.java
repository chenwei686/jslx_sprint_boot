package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherWeekDate;
import com.isprint.jslx.lccfd.model.FdTeacherWeekDateQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherWeekDateMapper {
    int countByExample(FdTeacherWeekDateQuery example);

    int deleteByExample(FdTeacherWeekDateQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherWeekDate record);

    int insertSelective(FdTeacherWeekDate record);

    List<FdTeacherWeekDate> selectByExample(FdTeacherWeekDateQuery example);

    FdTeacherWeekDate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherWeekDate record, @Param("example") FdTeacherWeekDateQuery example);

    int updateByExample(@Param("record") FdTeacherWeekDate record, @Param("example") FdTeacherWeekDateQuery example);

    int updateByPrimaryKeySelective(FdTeacherWeekDate record);

    int updateByPrimaryKey(FdTeacherWeekDate record);
}