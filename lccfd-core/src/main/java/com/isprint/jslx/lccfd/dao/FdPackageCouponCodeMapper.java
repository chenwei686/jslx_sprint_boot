package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdPackageCouponCode;
import com.isprint.jslx.lccfd.model.FdPackageCouponCodeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdPackageCouponCodeMapper {
    int countByExample(FdPackageCouponCodeQuery example);

    int deleteByExample(FdPackageCouponCodeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdPackageCouponCode record);

    int insertSelective(FdPackageCouponCode record);

    List<FdPackageCouponCode> selectByExample(FdPackageCouponCodeQuery example);

    FdPackageCouponCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdPackageCouponCode record, @Param("example") FdPackageCouponCodeQuery example);

    int updateByExample(@Param("record") FdPackageCouponCode record, @Param("example") FdPackageCouponCodeQuery example);

    int updateByPrimaryKeySelective(FdPackageCouponCode record);

    int updateByPrimaryKey(FdPackageCouponCode record);
}