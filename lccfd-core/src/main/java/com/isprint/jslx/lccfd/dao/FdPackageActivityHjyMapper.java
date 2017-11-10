package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdPackageActivityHjy;
import com.isprint.jslx.lccfd.model.FdPackageActivityHjyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdPackageActivityHjyMapper {
    int countByExample(FdPackageActivityHjyQuery example);

    int deleteByExample(FdPackageActivityHjyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdPackageActivityHjy record);

    int insertSelective(FdPackageActivityHjy record);

    List<FdPackageActivityHjy> selectByExample(FdPackageActivityHjyQuery example);

    FdPackageActivityHjy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdPackageActivityHjy record, @Param("example") FdPackageActivityHjyQuery example);

    int updateByExample(@Param("record") FdPackageActivityHjy record, @Param("example") FdPackageActivityHjyQuery example);

    int updateByPrimaryKeySelective(FdPackageActivityHjy record);

    int updateByPrimaryKey(FdPackageActivityHjy record);
}