package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdPackage;
import com.isprint.jslx.lccfd.model.FdPackageQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdPackageMapper {
    int countByExample(FdPackageQuery example);

    int deleteByExample(FdPackageQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdPackage record);

    int insertSelective(FdPackage record);

    List<FdPackage> selectByExample(FdPackageQuery example);

    FdPackage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdPackage record, @Param("example") FdPackageQuery example);

    int updateByExample(@Param("record") FdPackage record, @Param("example") FdPackageQuery example);

    int updateByPrimaryKeySelective(FdPackage record);

    int updateByPrimaryKey(FdPackage record);
}