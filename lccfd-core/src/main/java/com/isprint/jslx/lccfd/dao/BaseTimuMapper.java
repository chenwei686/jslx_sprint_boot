package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimu;
import com.isprint.jslx.lccfd.model.BaseTimuQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuMapper {
    int countByExample(BaseTimuQuery example);

    int deleteByExample(BaseTimuQuery example);

    int deleteByPrimaryKey(String id);

    int insert(BaseTimu record);

    int insertSelective(BaseTimu record);

    List<BaseTimu> selectByExample(BaseTimuQuery example);

    BaseTimu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseTimu record, @Param("example") BaseTimuQuery example);

    int updateByExample(@Param("record") BaseTimu record, @Param("example") BaseTimuQuery example);

    int updateByPrimaryKeySelective(BaseTimu record);

    int updateByPrimaryKey(BaseTimu record);
}