package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdExampaperTimu;
import com.isprint.jslx.lccfd.model.FdExampaperTimuQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdExampaperTimuMapper {
    int countByExample(FdExampaperTimuQuery example);

    int deleteByExample(FdExampaperTimuQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdExampaperTimu record);

    int insertSelective(FdExampaperTimu record);

    List<FdExampaperTimu> selectByExample(FdExampaperTimuQuery example);

    FdExampaperTimu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdExampaperTimu record, @Param("example") FdExampaperTimuQuery example);

    int updateByExample(@Param("record") FdExampaperTimu record, @Param("example") FdExampaperTimuQuery example);

    int updateByPrimaryKeySelective(FdExampaperTimu record);

    int updateByPrimaryKey(FdExampaperTimu record);
}