package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseKnowledge;
import com.isprint.jslx.lccfd.model.BaseKnowledgeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseKnowledgeMapper {
    int countByExample(BaseKnowledgeQuery example);

    int deleteByExample(BaseKnowledgeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseKnowledge record);

    int insertSelective(BaseKnowledge record);

    List<BaseKnowledge> selectByExample(BaseKnowledgeQuery example);

    BaseKnowledge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseKnowledge record, @Param("example") BaseKnowledgeQuery example);

    int updateByExample(@Param("record") BaseKnowledge record, @Param("example") BaseKnowledgeQuery example);

    int updateByPrimaryKeySelective(BaseKnowledge record);

    int updateByPrimaryKey(BaseKnowledge record);
}