package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.DrSyllabusitemknowledge;
import com.isprint.jslx.lccfd.model.DrSyllabusitemknowledgeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrSyllabusitemknowledgeMapper {
    int countByExample(DrSyllabusitemknowledgeQuery example);

    int deleteByExample(DrSyllabusitemknowledgeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(DrSyllabusitemknowledge record);

    int insertSelective(DrSyllabusitemknowledge record);

    List<DrSyllabusitemknowledge> selectByExample(DrSyllabusitemknowledgeQuery example);

    DrSyllabusitemknowledge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DrSyllabusitemknowledge record, @Param("example") DrSyllabusitemknowledgeQuery example);

    int updateByExample(@Param("record") DrSyllabusitemknowledge record, @Param("example") DrSyllabusitemknowledgeQuery example);

    int updateByPrimaryKeySelective(DrSyllabusitemknowledge record);

    int updateByPrimaryKey(DrSyllabusitemknowledge record);
}