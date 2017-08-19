package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdBuildExampaperBasket;
import com.isprint.jslx.lccfd.model.FdBuildExampaperBasketQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdBuildExampaperBasketMapper {
    int countByExample(FdBuildExampaperBasketQuery example);

    int deleteByExample(FdBuildExampaperBasketQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdBuildExampaperBasket record);

    int insertSelective(FdBuildExampaperBasket record);

    List<FdBuildExampaperBasket> selectByExample(FdBuildExampaperBasketQuery example);

    FdBuildExampaperBasket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdBuildExampaperBasket record, @Param("example") FdBuildExampaperBasketQuery example);

    int updateByExample(@Param("record") FdBuildExampaperBasket record, @Param("example") FdBuildExampaperBasketQuery example);

    int updateByPrimaryKeySelective(FdBuildExampaperBasket record);

    int updateByPrimaryKey(FdBuildExampaperBasket record);
}