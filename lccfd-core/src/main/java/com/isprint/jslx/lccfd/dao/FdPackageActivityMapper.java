package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdPackageActivity;
import com.isprint.jslx.lccfd.model.FdPackageActivityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdPackageActivityMapper {
    int countByExample(FdPackageActivityQuery example);

    int deleteByExample(FdPackageActivityQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdPackageActivity record);

    int insertSelective(FdPackageActivity record);

    List<FdPackageActivity> selectByExample(FdPackageActivityQuery example);

    FdPackageActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdPackageActivity record, @Param("example") FdPackageActivityQuery example);

    int updateByExample(@Param("record") FdPackageActivity record, @Param("example") FdPackageActivityQuery example);

    int updateByPrimaryKeySelective(FdPackageActivity record);

    int updateByPrimaryKey(FdPackageActivity record);
}