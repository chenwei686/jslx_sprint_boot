package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentPractice;
import com.isprint.jslx.lccfd.model.FdStudentPracticeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentPracticeMapper {
    int countByExample(FdStudentPracticeQuery example);

    int deleteByExample(FdStudentPracticeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentPractice record);

    int insertSelective(FdStudentPractice record);

    List<FdStudentPractice> selectByExample(FdStudentPracticeQuery example);

    FdStudentPractice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentPractice record, @Param("example") FdStudentPracticeQuery example);

    int updateByExample(@Param("record") FdStudentPractice record, @Param("example") FdStudentPracticeQuery example);

    int updateByPrimaryKeySelective(FdStudentPractice record);

    int updateByPrimaryKey(FdStudentPractice record);
}