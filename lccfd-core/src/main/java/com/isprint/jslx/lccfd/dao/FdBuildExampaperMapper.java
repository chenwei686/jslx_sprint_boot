package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdBuildExampaper;
import com.isprint.jslx.lccfd.model.FdBuildExampaperQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdBuildExampaperMapper {
    int countByExample(FdBuildExampaperQuery example);

    int deleteByExample(FdBuildExampaperQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdBuildExampaper record);

    int insertSelective(FdBuildExampaper record);

    List<FdBuildExampaper> selectByExample(FdBuildExampaperQuery example);

    FdBuildExampaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdBuildExampaper record, @Param("example") FdBuildExampaperQuery example);

    int updateByExample(@Param("record") FdBuildExampaper record, @Param("example") FdBuildExampaperQuery example);

    int updateByPrimaryKeySelective(FdBuildExampaper record);

    int updateByPrimaryKey(FdBuildExampaper record);
}