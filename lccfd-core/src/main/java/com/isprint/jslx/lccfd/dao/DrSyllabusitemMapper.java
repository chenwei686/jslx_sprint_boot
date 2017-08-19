package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.DrSyllabusitem;
import com.isprint.jslx.lccfd.model.DrSyllabusitemQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrSyllabusitemMapper {
    int countByExample(DrSyllabusitemQuery example);

    int deleteByExample(DrSyllabusitemQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(DrSyllabusitem record);

    int insertSelective(DrSyllabusitem record);

    List<DrSyllabusitem> selectByExample(DrSyllabusitemQuery example);

    DrSyllabusitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DrSyllabusitem record, @Param("example") DrSyllabusitemQuery example);

    int updateByExample(@Param("record") DrSyllabusitem record, @Param("example") DrSyllabusitemQuery example);

    int updateByPrimaryKeySelective(DrSyllabusitem record);

    int updateByPrimaryKey(DrSyllabusitem record);
}