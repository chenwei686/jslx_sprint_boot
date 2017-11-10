package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.TempCheck;
import com.isprint.jslx.lccfd.model.TempCheckQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempCheckMapper {
    int countByExample(TempCheckQuery example);

    int deleteByExample(TempCheckQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(TempCheck record);

    int insertSelective(TempCheck record);

    List<TempCheck> selectByExample(TempCheckQuery example);

    TempCheck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TempCheck record, @Param("example") TempCheckQuery example);

    int updateByExample(@Param("record") TempCheck record, @Param("example") TempCheckQuery example);

    int updateByPrimaryKeySelective(TempCheck record);

    int updateByPrimaryKey(TempCheck record);
}