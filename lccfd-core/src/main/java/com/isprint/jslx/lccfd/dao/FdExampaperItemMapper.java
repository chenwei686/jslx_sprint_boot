package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdExampaperItem;
import com.isprint.jslx.lccfd.model.FdExampaperItemQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdExampaperItemMapper {
    int countByExample(FdExampaperItemQuery example);

    int deleteByExample(FdExampaperItemQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdExampaperItem record);

    int insertSelective(FdExampaperItem record);

    List<FdExampaperItem> selectByExample(FdExampaperItemQuery example);

    FdExampaperItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdExampaperItem record, @Param("example") FdExampaperItemQuery example);

    int updateByExample(@Param("record") FdExampaperItem record, @Param("example") FdExampaperItemQuery example);

    int updateByPrimaryKeySelective(FdExampaperItem record);

    int updateByPrimaryKey(FdExampaperItem record);
}