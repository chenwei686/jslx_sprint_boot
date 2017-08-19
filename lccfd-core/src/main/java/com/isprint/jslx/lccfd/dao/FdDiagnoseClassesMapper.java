package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdDiagnoseClasses;
import com.isprint.jslx.lccfd.model.FdDiagnoseClassesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdDiagnoseClassesMapper {
    int countByExample(FdDiagnoseClassesQuery example);

    int deleteByExample(FdDiagnoseClassesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdDiagnoseClasses record);

    int insertSelective(FdDiagnoseClasses record);

    List<FdDiagnoseClasses> selectByExample(FdDiagnoseClassesQuery example);

    FdDiagnoseClasses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdDiagnoseClasses record, @Param("example") FdDiagnoseClassesQuery example);

    int updateByExample(@Param("record") FdDiagnoseClasses record, @Param("example") FdDiagnoseClassesQuery example);

    int updateByPrimaryKeySelective(FdDiagnoseClasses record);

    int updateByPrimaryKey(FdDiagnoseClasses record);
}