package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseDistrict;
import com.isprint.jslx.lccfd.model.BaseDistrictQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseDistrictMapper {
    int countByExample(BaseDistrictQuery example);

    int deleteByExample(BaseDistrictQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseDistrict record);

    int insertSelective(BaseDistrict record);

    List<BaseDistrict> selectByExample(BaseDistrictQuery example);

    BaseDistrict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseDistrict record, @Param("example") BaseDistrictQuery example);

    int updateByExample(@Param("record") BaseDistrict record, @Param("example") BaseDistrictQuery example);

    int updateByPrimaryKeySelective(BaseDistrict record);

    int updateByPrimaryKey(BaseDistrict record);
}