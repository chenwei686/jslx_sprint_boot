package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentLog;
import com.isprint.jslx.lccfd.model.FdStudentLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentLogMapper {
    int countByExample(FdStudentLogQuery example);

    int deleteByExample(FdStudentLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentLog record);

    int insertSelective(FdStudentLog record);

    List<FdStudentLog> selectByExample(FdStudentLogQuery example);

    FdStudentLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentLog record, @Param("example") FdStudentLogQuery example);

    int updateByExample(@Param("record") FdStudentLog record, @Param("example") FdStudentLogQuery example);

    int updateByPrimaryKeySelective(FdStudentLog record);

    int updateByPrimaryKey(FdStudentLog record);
}