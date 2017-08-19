package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentExampaper;
import com.isprint.jslx.lccfd.model.FdStudentExampaperQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentExampaperMapper {
    int countByExample(FdStudentExampaperQuery example);

    int deleteByExample(FdStudentExampaperQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentExampaper record);

    int insertSelective(FdStudentExampaper record);

    List<FdStudentExampaper> selectByExample(FdStudentExampaperQuery example);

    FdStudentExampaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentExampaper record, @Param("example") FdStudentExampaperQuery example);

    int updateByExample(@Param("record") FdStudentExampaper record, @Param("example") FdStudentExampaperQuery example);

    int updateByPrimaryKeySelective(FdStudentExampaper record);

    int updateByPrimaryKey(FdStudentExampaper record);
}