package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentPracticeItemTimu;
import com.isprint.jslx.lccfd.model.FdStudentPracticeItemTimuQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentPracticeItemTimuMapper {
    int countByExample(FdStudentPracticeItemTimuQuery example);

    int deleteByExample(FdStudentPracticeItemTimuQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentPracticeItemTimu record);

    int insertSelective(FdStudentPracticeItemTimu record);

    List<FdStudentPracticeItemTimu> selectByExample(FdStudentPracticeItemTimuQuery example);

    FdStudentPracticeItemTimu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentPracticeItemTimu record, @Param("example") FdStudentPracticeItemTimuQuery example);

    int updateByExample(@Param("record") FdStudentPracticeItemTimu record, @Param("example") FdStudentPracticeItemTimuQuery example);

    int updateByPrimaryKeySelective(FdStudentPracticeItemTimu record);

    int updateByPrimaryKey(FdStudentPracticeItemTimu record);
}