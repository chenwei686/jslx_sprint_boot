package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdBuildExampaperBasketItem;
import com.isprint.jslx.lccfd.model.FdBuildExampaperBasketItemQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdBuildExampaperBasketItemMapper {
    int countByExample(FdBuildExampaperBasketItemQuery example);

    int deleteByExample(FdBuildExampaperBasketItemQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdBuildExampaperBasketItem record);

    int insertSelective(FdBuildExampaperBasketItem record);

    List<FdBuildExampaperBasketItem> selectByExample(FdBuildExampaperBasketItemQuery example);

    FdBuildExampaperBasketItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdBuildExampaperBasketItem record, @Param("example") FdBuildExampaperBasketItemQuery example);

    int updateByExample(@Param("record") FdBuildExampaperBasketItem record, @Param("example") FdBuildExampaperBasketItemQuery example);

    int updateByPrimaryKeySelective(FdBuildExampaperBasketItem record);

    int updateByPrimaryKey(FdBuildExampaperBasketItem record);
}