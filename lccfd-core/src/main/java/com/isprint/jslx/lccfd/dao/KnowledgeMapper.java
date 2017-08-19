package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Knowledge;
import com.isprint.jslx.lccfd.model.KnowledgeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowledgeMapper {
    int countByExample(KnowledgeQuery example);

    int deleteByExample(KnowledgeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Knowledge record);

    int insertSelective(Knowledge record);

    List<Knowledge> selectByExample(KnowledgeQuery example);

    Knowledge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Knowledge record, @Param("example") KnowledgeQuery example);

    int updateByExample(@Param("record") Knowledge record, @Param("example") KnowledgeQuery example);

    int updateByPrimaryKeySelective(Knowledge record);

    int updateByPrimaryKey(Knowledge record);
}