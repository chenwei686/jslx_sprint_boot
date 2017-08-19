package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdExampaper;
import com.isprint.jslx.lccfd.model.FdExampaperQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdExampaperMapper {
    int countByExample(FdExampaperQuery example);

    int deleteByExample(FdExampaperQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdExampaper record);

    int insertSelective(FdExampaper record);

    List<FdExampaper> selectByExample(FdExampaperQuery example);

    FdExampaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdExampaper record, @Param("example") FdExampaperQuery example);

    int updateByExample(@Param("record") FdExampaper record, @Param("example") FdExampaperQuery example);

    int updateByPrimaryKeySelective(FdExampaper record);

    int updateByPrimaryKey(FdExampaper record);
}