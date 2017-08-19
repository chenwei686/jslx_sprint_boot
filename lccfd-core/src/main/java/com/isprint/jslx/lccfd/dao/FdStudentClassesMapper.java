package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentClasses;
import com.isprint.jslx.lccfd.model.FdStudentClassesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentClassesMapper {
    int countByExample(FdStudentClassesQuery example);

    int deleteByExample(FdStudentClassesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentClasses record);

    int insertSelective(FdStudentClasses record);

    List<FdStudentClasses> selectByExample(FdStudentClassesQuery example);

    FdStudentClasses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentClasses record, @Param("example") FdStudentClassesQuery example);

    int updateByExample(@Param("record") FdStudentClasses record, @Param("example") FdStudentClassesQuery example);

    int updateByPrimaryKeySelective(FdStudentClasses record);

    int updateByPrimaryKey(FdStudentClasses record);
}