package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentLevel;
import com.isprint.jslx.lccfd.model.FdStudentLevelQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentLevelMapper {
    int countByExample(FdStudentLevelQuery example);

    int deleteByExample(FdStudentLevelQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentLevel record);

    int insertSelective(FdStudentLevel record);

    List<FdStudentLevel> selectByExample(FdStudentLevelQuery example);

    FdStudentLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentLevel record, @Param("example") FdStudentLevelQuery example);

    int updateByExample(@Param("record") FdStudentLevel record, @Param("example") FdStudentLevelQuery example);

    int updateByPrimaryKeySelective(FdStudentLevel record);

    int updateByPrimaryKey(FdStudentLevel record);
}