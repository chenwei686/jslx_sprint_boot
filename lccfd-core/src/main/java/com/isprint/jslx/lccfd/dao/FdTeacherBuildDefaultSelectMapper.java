package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherBuildDefaultSelect;
import com.isprint.jslx.lccfd.model.FdTeacherBuildDefaultSelectQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherBuildDefaultSelectMapper {
    int countByExample(FdTeacherBuildDefaultSelectQuery example);

    int deleteByExample(FdTeacherBuildDefaultSelectQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherBuildDefaultSelect record);

    int insertSelective(FdTeacherBuildDefaultSelect record);

    List<FdTeacherBuildDefaultSelect> selectByExample(FdTeacherBuildDefaultSelectQuery example);

    FdTeacherBuildDefaultSelect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherBuildDefaultSelect record, @Param("example") FdTeacherBuildDefaultSelectQuery example);

    int updateByExample(@Param("record") FdTeacherBuildDefaultSelect record, @Param("example") FdTeacherBuildDefaultSelectQuery example);

    int updateByPrimaryKeySelective(FdTeacherBuildDefaultSelect record);

    int updateByPrimaryKey(FdTeacherBuildDefaultSelect record);
}