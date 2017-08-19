package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.DrSyllabusgrade;
import com.isprint.jslx.lccfd.model.DrSyllabusgradeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrSyllabusgradeMapper {
    int countByExample(DrSyllabusgradeQuery example);

    int deleteByExample(DrSyllabusgradeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(DrSyllabusgrade record);

    int insertSelective(DrSyllabusgrade record);

    List<DrSyllabusgrade> selectByExample(DrSyllabusgradeQuery example);

    DrSyllabusgrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DrSyllabusgrade record, @Param("example") DrSyllabusgradeQuery example);

    int updateByExample(@Param("record") DrSyllabusgrade record, @Param("example") DrSyllabusgradeQuery example);

    int updateByPrimaryKeySelective(DrSyllabusgrade record);

    int updateByPrimaryKey(DrSyllabusgrade record);
}