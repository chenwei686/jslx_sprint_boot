package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdExampaperObject;
import com.isprint.jslx.lccfd.model.FdExampaperObjectQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdExampaperObjectMapper {
    int countByExample(FdExampaperObjectQuery example);

    int deleteByExample(FdExampaperObjectQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdExampaperObject record);

    int insertSelective(FdExampaperObject record);

    List<FdExampaperObject> selectByExample(FdExampaperObjectQuery example);

    FdExampaperObject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdExampaperObject record, @Param("example") FdExampaperObjectQuery example);

    int updateByExample(@Param("record") FdExampaperObject record, @Param("example") FdExampaperObjectQuery example);

    int updateByPrimaryKeySelective(FdExampaperObject record);

    int updateByPrimaryKey(FdExampaperObject record);
}