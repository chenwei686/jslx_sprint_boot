package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.DrSyllabus;
import com.isprint.jslx.lccfd.model.DrSyllabusQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrSyllabusMapper {
    int countByExample(DrSyllabusQuery example);

    int deleteByExample(DrSyllabusQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(DrSyllabus record);

    int insertSelective(DrSyllabus record);

    List<DrSyllabus> selectByExample(DrSyllabusQuery example);

    DrSyllabus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DrSyllabus record, @Param("example") DrSyllabusQuery example);

    int updateByExample(@Param("record") DrSyllabus record, @Param("example") DrSyllabusQuery example);

    int updateByPrimaryKeySelective(DrSyllabus record);

    int updateByPrimaryKey(DrSyllabus record);
}