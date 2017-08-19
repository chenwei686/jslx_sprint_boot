package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdPackageCoupon;
import com.isprint.jslx.lccfd.model.FdPackageCouponQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdPackageCouponMapper {
    int countByExample(FdPackageCouponQuery example);

    int deleteByExample(FdPackageCouponQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdPackageCoupon record);

    int insertSelective(FdPackageCoupon record);

    List<FdPackageCoupon> selectByExample(FdPackageCouponQuery example);

    FdPackageCoupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdPackageCoupon record, @Param("example") FdPackageCouponQuery example);

    int updateByExample(@Param("record") FdPackageCoupon record, @Param("example") FdPackageCouponQuery example);

    int updateByPrimaryKeySelective(FdPackageCoupon record);

    int updateByPrimaryKey(FdPackageCoupon record);
}