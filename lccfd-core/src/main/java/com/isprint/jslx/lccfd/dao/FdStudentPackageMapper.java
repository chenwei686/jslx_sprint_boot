package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentPackage;
import com.isprint.jslx.lccfd.model.FdStudentPackageQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentPackageMapper {
    int countByExample(FdStudentPackageQuery example);

    int deleteByExample(FdStudentPackageQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentPackage record);

    int insertSelective(FdStudentPackage record);

    List<FdStudentPackage> selectByExample(FdStudentPackageQuery example);

    FdStudentPackage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentPackage record, @Param("example") FdStudentPackageQuery example);

    int updateByExample(@Param("record") FdStudentPackage record, @Param("example") FdStudentPackageQuery example);

    int updateByPrimaryKeySelective(FdStudentPackage record);

    int updateByPrimaryKey(FdStudentPackage record);
}