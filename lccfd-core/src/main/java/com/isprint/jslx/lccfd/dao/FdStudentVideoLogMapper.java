package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentVideoLog;
import com.isprint.jslx.lccfd.model.FdStudentVideoLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentVideoLogMapper {
    int countByExample(FdStudentVideoLogQuery example);

    int deleteByExample(FdStudentVideoLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentVideoLog record);

    int insertSelective(FdStudentVideoLog record);

    List<FdStudentVideoLog> selectByExample(FdStudentVideoLogQuery example);

    FdStudentVideoLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentVideoLog record, @Param("example") FdStudentVideoLogQuery example);

    int updateByExample(@Param("record") FdStudentVideoLog record, @Param("example") FdStudentVideoLogQuery example);

    int updateByPrimaryKeySelective(FdStudentVideoLog record);

    int updateByPrimaryKey(FdStudentVideoLog record);
}