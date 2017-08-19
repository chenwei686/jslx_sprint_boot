package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseLevel;
import com.isprint.jslx.lccfd.model.BaseLevelQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseLevelMapper {
    int countByExample(BaseLevelQuery example);

    int deleteByExample(BaseLevelQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseLevel record);

    int insertSelective(BaseLevel record);

    List<BaseLevel> selectByExample(BaseLevelQuery example);

    BaseLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseLevel record, @Param("example") BaseLevelQuery example);

    int updateByExample(@Param("record") BaseLevel record, @Param("example") BaseLevelQuery example);

    int updateByPrimaryKeySelective(BaseLevel record);

    int updateByPrimaryKey(BaseLevel record);
}