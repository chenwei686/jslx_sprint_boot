package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdDiagnoseStudentExampaper;
import com.isprint.jslx.lccfd.model.FdDiagnoseStudentExampaperQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdDiagnoseStudentExampaperMapper {
    int countByExample(FdDiagnoseStudentExampaperQuery example);

    int deleteByExample(FdDiagnoseStudentExampaperQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdDiagnoseStudentExampaper record);

    int insertSelective(FdDiagnoseStudentExampaper record);

    List<FdDiagnoseStudentExampaper> selectByExample(FdDiagnoseStudentExampaperQuery example);

    FdDiagnoseStudentExampaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdDiagnoseStudentExampaper record, @Param("example") FdDiagnoseStudentExampaperQuery example);

    int updateByExample(@Param("record") FdDiagnoseStudentExampaper record, @Param("example") FdDiagnoseStudentExampaperQuery example);

    int updateByPrimaryKeySelective(FdDiagnoseStudentExampaper record);

    int updateByPrimaryKey(FdDiagnoseStudentExampaper record);
}