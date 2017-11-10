package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.TempCheck2;
import com.isprint.jslx.lccfd.model.TempCheck2Query;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempCheck2Mapper {
    int countByExample(TempCheck2Query example);

    int deleteByExample(TempCheck2Query example);

    int deleteByPrimaryKey(Integer id);

    int insert(TempCheck2 record);

    int insertSelective(TempCheck2 record);

    List<TempCheck2> selectByExample(TempCheck2Query example);

    TempCheck2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TempCheck2 record, @Param("example") TempCheck2Query example);

    int updateByExample(@Param("record") TempCheck2 record, @Param("example") TempCheck2Query example);

    int updateByPrimaryKeySelective(TempCheck2 record);

    int updateByPrimaryKey(TempCheck2 record);
}