package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdBuildExampaperBasketTimu;
import com.isprint.jslx.lccfd.model.FdBuildExampaperBasketTimuQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdBuildExampaperBasketTimuMapper {
    int countByExample(FdBuildExampaperBasketTimuQuery example);

    int deleteByExample(FdBuildExampaperBasketTimuQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdBuildExampaperBasketTimu record);

    int insertSelective(FdBuildExampaperBasketTimu record);

    List<FdBuildExampaperBasketTimu> selectByExample(FdBuildExampaperBasketTimuQuery example);

    FdBuildExampaperBasketTimu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdBuildExampaperBasketTimu record, @Param("example") FdBuildExampaperBasketTimuQuery example);

    int updateByExample(@Param("record") FdBuildExampaperBasketTimu record, @Param("example") FdBuildExampaperBasketTimuQuery example);

    int updateByPrimaryKeySelective(FdBuildExampaperBasketTimu record);

    int updateByPrimaryKey(FdBuildExampaperBasketTimu record);
}