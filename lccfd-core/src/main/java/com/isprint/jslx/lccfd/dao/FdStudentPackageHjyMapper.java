package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentPackageHjy;
import com.isprint.jslx.lccfd.model.FdStudentPackageHjyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentPackageHjyMapper {
    int countByExample(FdStudentPackageHjyQuery example);

    int deleteByExample(FdStudentPackageHjyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentPackageHjy record);

    int insertSelective(FdStudentPackageHjy record);

    List<FdStudentPackageHjy> selectByExample(FdStudentPackageHjyQuery example);

    FdStudentPackageHjy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentPackageHjy record, @Param("example") FdStudentPackageHjyQuery example);

    int updateByExample(@Param("record") FdStudentPackageHjy record, @Param("example") FdStudentPackageHjyQuery example);

    int updateByPrimaryKeySelective(FdStudentPackageHjy record);

    int updateByPrimaryKey(FdStudentPackageHjy record);
}