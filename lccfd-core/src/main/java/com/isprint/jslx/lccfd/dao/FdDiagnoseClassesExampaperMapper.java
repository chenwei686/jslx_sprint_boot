package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdDiagnoseClassesExampaper;
import com.isprint.jslx.lccfd.model.FdDiagnoseClassesExampaperQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdDiagnoseClassesExampaperMapper {
    int countByExample(FdDiagnoseClassesExampaperQuery example);

    int deleteByExample(FdDiagnoseClassesExampaperQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdDiagnoseClassesExampaper record);

    int insertSelective(FdDiagnoseClassesExampaper record);

    List<FdDiagnoseClassesExampaper> selectByExample(FdDiagnoseClassesExampaperQuery example);

    FdDiagnoseClassesExampaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdDiagnoseClassesExampaper record, @Param("example") FdDiagnoseClassesExampaperQuery example);

    int updateByExample(@Param("record") FdDiagnoseClassesExampaper record, @Param("example") FdDiagnoseClassesExampaperQuery example);

    int updateByPrimaryKeySelective(FdDiagnoseClassesExampaper record);

    int updateByPrimaryKey(FdDiagnoseClassesExampaper record);
}