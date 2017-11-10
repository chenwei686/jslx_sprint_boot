package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdPackageHjy;
import com.isprint.jslx.lccfd.model.FdPackageHjyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdPackageHjyMapper {
    int countByExample(FdPackageHjyQuery example);

    int deleteByExample(FdPackageHjyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdPackageHjy record);

    int insertSelective(FdPackageHjy record);

    List<FdPackageHjy> selectByExample(FdPackageHjyQuery example);

    FdPackageHjy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdPackageHjy record, @Param("example") FdPackageHjyQuery example);

    int updateByExample(@Param("record") FdPackageHjy record, @Param("example") FdPackageHjyQuery example);

    int updateByPrimaryKeySelective(FdPackageHjy record);

    int updateByPrimaryKey(FdPackageHjy record);
}