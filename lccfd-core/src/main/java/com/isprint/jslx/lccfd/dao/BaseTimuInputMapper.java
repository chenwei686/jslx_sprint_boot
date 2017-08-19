package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuInput;
import com.isprint.jslx.lccfd.model.BaseTimuInputQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuInputMapper {
    int countByExample(BaseTimuInputQuery example);

    int deleteByExample(BaseTimuInputQuery example);

    int deleteByPrimaryKey(String id);

    int insert(BaseTimuInput record);

    int insertSelective(BaseTimuInput record);

    List<BaseTimuInput> selectByExample(BaseTimuInputQuery example);

    BaseTimuInput selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseTimuInput record, @Param("example") BaseTimuInputQuery example);

    int updateByExample(@Param("record") BaseTimuInput record, @Param("example") BaseTimuInputQuery example);

    int updateByPrimaryKeySelective(BaseTimuInput record);

    int updateByPrimaryKey(BaseTimuInput record);
}