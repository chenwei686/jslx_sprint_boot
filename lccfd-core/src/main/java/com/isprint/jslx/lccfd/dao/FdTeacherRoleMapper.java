package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherRole;
import com.isprint.jslx.lccfd.model.FdTeacherRoleQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherRoleMapper {
    int countByExample(FdTeacherRoleQuery example);

    int deleteByExample(FdTeacherRoleQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherRole record);

    int insertSelective(FdTeacherRole record);

    List<FdTeacherRole> selectByExample(FdTeacherRoleQuery example);

    FdTeacherRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherRole record, @Param("example") FdTeacherRoleQuery example);

    int updateByExample(@Param("record") FdTeacherRole record, @Param("example") FdTeacherRoleQuery example);

    int updateByPrimaryKeySelective(FdTeacherRole record);

    int updateByPrimaryKey(FdTeacherRole record);
}