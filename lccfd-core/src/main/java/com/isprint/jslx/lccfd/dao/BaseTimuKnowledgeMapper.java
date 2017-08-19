package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuKnowledge;
import com.isprint.jslx.lccfd.model.BaseTimuKnowledgeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuKnowledgeMapper {
    int countByExample(BaseTimuKnowledgeQuery example);

    int deleteByExample(BaseTimuKnowledgeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTimuKnowledge record);

    int insertSelective(BaseTimuKnowledge record);

    List<BaseTimuKnowledge> selectByExample(BaseTimuKnowledgeQuery example);

    BaseTimuKnowledge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTimuKnowledge record, @Param("example") BaseTimuKnowledgeQuery example);

    int updateByExample(@Param("record") BaseTimuKnowledge record, @Param("example") BaseTimuKnowledgeQuery example);

    int updateByPrimaryKeySelective(BaseTimuKnowledge record);

    int updateByPrimaryKey(BaseTimuKnowledge record);
}