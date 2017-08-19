package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdExampaperItemTimu;
import com.isprint.jslx.lccfd.model.FdExampaperItemTimuQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdExampaperItemTimuMapper {
    int countByExample(FdExampaperItemTimuQuery example);

    int deleteByExample(FdExampaperItemTimuQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdExampaperItemTimu record);

    int insertSelective(FdExampaperItemTimu record);

    List<FdExampaperItemTimu> selectByExample(FdExampaperItemTimuQuery example);

    FdExampaperItemTimu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdExampaperItemTimu record, @Param("example") FdExampaperItemTimuQuery example);

    int updateByExample(@Param("record") FdExampaperItemTimu record, @Param("example") FdExampaperItemTimuQuery example);

    int updateByPrimaryKeySelective(FdExampaperItemTimu record);

    int updateByPrimaryKey(FdExampaperItemTimu record);
}