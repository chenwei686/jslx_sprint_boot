package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuType;
import com.isprint.jslx.lccfd.model.BaseTimuTypeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuTypeMapper {
    int countByExample(BaseTimuTypeQuery example);

    int deleteByExample(BaseTimuTypeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTimuType record);

    int insertSelective(BaseTimuType record);

    List<BaseTimuType> selectByExample(BaseTimuTypeQuery example);

    BaseTimuType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTimuType record, @Param("example") BaseTimuTypeQuery example);

    int updateByExample(@Param("record") BaseTimuType record, @Param("example") BaseTimuTypeQuery example);

    int updateByPrimaryKeySelective(BaseTimuType record);

    int updateByPrimaryKey(BaseTimuType record);
}