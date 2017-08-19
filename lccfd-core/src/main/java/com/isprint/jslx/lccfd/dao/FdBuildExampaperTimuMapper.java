package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdBuildExampaperTimu;
import com.isprint.jslx.lccfd.model.FdBuildExampaperTimuQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdBuildExampaperTimuMapper {
    int countByExample(FdBuildExampaperTimuQuery example);

    int deleteByExample(FdBuildExampaperTimuQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdBuildExampaperTimu record);

    int insertSelective(FdBuildExampaperTimu record);

    List<FdBuildExampaperTimu> selectByExample(FdBuildExampaperTimuQuery example);

    FdBuildExampaperTimu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdBuildExampaperTimu record, @Param("example") FdBuildExampaperTimuQuery example);

    int updateByExample(@Param("record") FdBuildExampaperTimu record, @Param("example") FdBuildExampaperTimuQuery example);

    int updateByPrimaryKeySelective(FdBuildExampaperTimu record);

    int updateByPrimaryKey(FdBuildExampaperTimu record);
}