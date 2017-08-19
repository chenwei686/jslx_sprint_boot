package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseBookSectionKnowledge;
import com.isprint.jslx.lccfd.model.BaseBookSectionKnowledgeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseBookSectionKnowledgeMapper {
    int countByExample(BaseBookSectionKnowledgeQuery example);

    int deleteByExample(BaseBookSectionKnowledgeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseBookSectionKnowledge record);

    int insertSelective(BaseBookSectionKnowledge record);

    List<BaseBookSectionKnowledge> selectByExample(BaseBookSectionKnowledgeQuery example);

    BaseBookSectionKnowledge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseBookSectionKnowledge record, @Param("example") BaseBookSectionKnowledgeQuery example);

    int updateByExample(@Param("record") BaseBookSectionKnowledge record, @Param("example") BaseBookSectionKnowledgeQuery example);

    int updateByPrimaryKeySelective(BaseBookSectionKnowledge record);

    int updateByPrimaryKey(BaseBookSectionKnowledge record);
}