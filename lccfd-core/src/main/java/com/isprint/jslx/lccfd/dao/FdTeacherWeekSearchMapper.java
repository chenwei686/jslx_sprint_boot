package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherWeekSearch;
import com.isprint.jslx.lccfd.model.FdTeacherWeekSearchQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherWeekSearchMapper {
    int countByExample(FdTeacherWeekSearchQuery example);

    int deleteByExample(FdTeacherWeekSearchQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherWeekSearch record);

    int insertSelective(FdTeacherWeekSearch record);

    List<FdTeacherWeekSearch> selectByExample(FdTeacherWeekSearchQuery example);

    FdTeacherWeekSearch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherWeekSearch record, @Param("example") FdTeacherWeekSearchQuery example);

    int updateByExample(@Param("record") FdTeacherWeekSearch record, @Param("example") FdTeacherWeekSearchQuery example);

    int updateByPrimaryKeySelective(FdTeacherWeekSearch record);

    int updateByPrimaryKey(FdTeacherWeekSearch record);
}