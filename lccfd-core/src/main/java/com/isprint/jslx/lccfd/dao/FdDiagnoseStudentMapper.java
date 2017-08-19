package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdDiagnoseStudent;
import com.isprint.jslx.lccfd.model.FdDiagnoseStudentQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdDiagnoseStudentMapper {
    int countByExample(FdDiagnoseStudentQuery example);

    int deleteByExample(FdDiagnoseStudentQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdDiagnoseStudent record);

    int insertSelective(FdDiagnoseStudent record);

    List<FdDiagnoseStudent> selectByExample(FdDiagnoseStudentQuery example);

    FdDiagnoseStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdDiagnoseStudent record, @Param("example") FdDiagnoseStudentQuery example);

    int updateByExample(@Param("record") FdDiagnoseStudent record, @Param("example") FdDiagnoseStudentQuery example);

    int updateByPrimaryKeySelective(FdDiagnoseStudent record);

    int updateByPrimaryKey(FdDiagnoseStudent record);
}