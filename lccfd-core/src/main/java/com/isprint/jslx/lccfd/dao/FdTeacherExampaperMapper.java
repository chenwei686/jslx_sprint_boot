package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherExampaper;
import com.isprint.jslx.lccfd.model.FdTeacherExampaperQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherExampaperMapper {
    int countByExample(FdTeacherExampaperQuery example);

    int deleteByExample(FdTeacherExampaperQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherExampaper record);

    int insertSelective(FdTeacherExampaper record);

    List<FdTeacherExampaper> selectByExample(FdTeacherExampaperQuery example);

    FdTeacherExampaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherExampaper record, @Param("example") FdTeacherExampaperQuery example);

    int updateByExample(@Param("record") FdTeacherExampaper record, @Param("example") FdTeacherExampaperQuery example);

    int updateByPrimaryKeySelective(FdTeacherExampaper record);

    int updateByPrimaryKey(FdTeacherExampaper record);
}