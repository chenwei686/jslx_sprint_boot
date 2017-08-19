package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdBuildExampaperKnowledge;
import com.isprint.jslx.lccfd.model.FdBuildExampaperKnowledgeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdBuildExampaperKnowledgeMapper {
    int countByExample(FdBuildExampaperKnowledgeQuery example);

    int deleteByExample(FdBuildExampaperKnowledgeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdBuildExampaperKnowledge record);

    int insertSelective(FdBuildExampaperKnowledge record);

    List<FdBuildExampaperKnowledge> selectByExample(FdBuildExampaperKnowledgeQuery example);

    FdBuildExampaperKnowledge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdBuildExampaperKnowledge record, @Param("example") FdBuildExampaperKnowledgeQuery example);

    int updateByExample(@Param("record") FdBuildExampaperKnowledge record, @Param("example") FdBuildExampaperKnowledgeQuery example);

    int updateByPrimaryKeySelective(FdBuildExampaperKnowledge record);

    int updateByPrimaryKey(FdBuildExampaperKnowledge record);
}