package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuTypeSort;
import com.isprint.jslx.lccfd.model.BaseTimuTypeSortQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuTypeSortMapper {
    int countByExample(BaseTimuTypeSortQuery example);

    int deleteByExample(BaseTimuTypeSortQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTimuTypeSort record);

    int insertSelective(BaseTimuTypeSort record);

    List<BaseTimuTypeSort> selectByExample(BaseTimuTypeSortQuery example);

    BaseTimuTypeSort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTimuTypeSort record, @Param("example") BaseTimuTypeSortQuery example);

    int updateByExample(@Param("record") BaseTimuTypeSort record, @Param("example") BaseTimuTypeSortQuery example);

    int updateByPrimaryKeySelective(BaseTimuTypeSort record);

    int updateByPrimaryKey(BaseTimuTypeSort record);
}