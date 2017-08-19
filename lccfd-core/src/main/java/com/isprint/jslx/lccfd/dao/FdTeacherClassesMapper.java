package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherClasses;
import com.isprint.jslx.lccfd.model.FdTeacherClassesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherClassesMapper {
    int countByExample(FdTeacherClassesQuery example);

    int deleteByExample(FdTeacherClassesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherClasses record);

    int insertSelective(FdTeacherClasses record);

    List<FdTeacherClasses> selectByExample(FdTeacherClassesQuery example);

    FdTeacherClasses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherClasses record, @Param("example") FdTeacherClassesQuery example);

    int updateByExample(@Param("record") FdTeacherClasses record, @Param("example") FdTeacherClassesQuery example);

    int updateByPrimaryKeySelective(FdTeacherClasses record);

    int updateByPrimaryKey(FdTeacherClasses record);
}