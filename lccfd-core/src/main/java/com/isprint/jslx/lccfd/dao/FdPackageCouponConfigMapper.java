package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdPackageCouponConfig;
import com.isprint.jslx.lccfd.model.FdPackageCouponConfigQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdPackageCouponConfigMapper {
    int countByExample(FdPackageCouponConfigQuery example);

    int deleteByExample(FdPackageCouponConfigQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdPackageCouponConfig record);

    int insertSelective(FdPackageCouponConfig record);

    List<FdPackageCouponConfig> selectByExample(FdPackageCouponConfigQuery example);

    FdPackageCouponConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdPackageCouponConfig record, @Param("example") FdPackageCouponConfigQuery example);

    int updateByExample(@Param("record") FdPackageCouponConfig record, @Param("example") FdPackageCouponConfigQuery example);

    int updateByPrimaryKeySelective(FdPackageCouponConfig record);

    int updateByPrimaryKey(FdPackageCouponConfig record);
}