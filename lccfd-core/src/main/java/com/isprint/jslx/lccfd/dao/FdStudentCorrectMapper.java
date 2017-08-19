package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentCorrect;
import com.isprint.jslx.lccfd.model.FdStudentCorrectQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentCorrectMapper {
    int countByExample(FdStudentCorrectQuery example);

    int deleteByExample(FdStudentCorrectQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentCorrect record);

    int insertSelective(FdStudentCorrect record);

    List<FdStudentCorrect> selectByExample(FdStudentCorrectQuery example);

    FdStudentCorrect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentCorrect record, @Param("example") FdStudentCorrectQuery example);

    int updateByExample(@Param("record") FdStudentCorrect record, @Param("example") FdStudentCorrectQuery example);

    int updateByPrimaryKeySelective(FdStudentCorrect record);

    int updateByPrimaryKey(FdStudentCorrect record);
}