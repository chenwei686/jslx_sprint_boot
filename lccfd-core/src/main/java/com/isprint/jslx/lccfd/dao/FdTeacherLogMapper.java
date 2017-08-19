package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherLog;
import com.isprint.jslx.lccfd.model.FdTeacherLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherLogMapper {
    int countByExample(FdTeacherLogQuery example);

    int deleteByExample(FdTeacherLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherLog record);

    int insertSelective(FdTeacherLog record);

    List<FdTeacherLog> selectByExample(FdTeacherLogQuery example);

    FdTeacherLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherLog record, @Param("example") FdTeacherLogQuery example);

    int updateByExample(@Param("record") FdTeacherLog record, @Param("example") FdTeacherLogQuery example);

    int updateByPrimaryKeySelective(FdTeacherLog record);

    int updateByPrimaryKey(FdTeacherLog record);
}