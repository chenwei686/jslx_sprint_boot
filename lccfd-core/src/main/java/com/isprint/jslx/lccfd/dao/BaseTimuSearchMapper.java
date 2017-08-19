package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuSearch;
import com.isprint.jslx.lccfd.model.BaseTimuSearchQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseTimuSearchMapper {
    int countByExample(BaseTimuSearchQuery example);

    int deleteByExample(BaseTimuSearchQuery example);

    int deleteByPrimaryKey(String id);

    int insert(BaseTimuSearch record);

    int insertSelective(BaseTimuSearch record);

    List<BaseTimuSearch> selectByExample(BaseTimuSearchQuery example);

    BaseTimuSearch selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseTimuSearch record, @Param("example") BaseTimuSearchQuery example);

    int updateByExample(@Param("record") BaseTimuSearch record, @Param("example") BaseTimuSearchQuery example);

    int updateByPrimaryKeySelective(BaseTimuSearch record);

    int updateByPrimaryKey(BaseTimuSearch record);
}