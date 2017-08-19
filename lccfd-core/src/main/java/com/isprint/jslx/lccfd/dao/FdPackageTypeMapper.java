package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdPackageType;
import com.isprint.jslx.lccfd.model.FdPackageTypeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdPackageTypeMapper {
    int countByExample(FdPackageTypeQuery example);

    int deleteByExample(FdPackageTypeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdPackageType record);

    int insertSelective(FdPackageType record);

    List<FdPackageType> selectByExample(FdPackageTypeQuery example);

    FdPackageType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdPackageType record, @Param("example") FdPackageTypeQuery example);

    int updateByExample(@Param("record") FdPackageType record, @Param("example") FdPackageTypeQuery example);

    int updateByPrimaryKeySelective(FdPackageType record);

    int updateByPrimaryKey(FdPackageType record);
}