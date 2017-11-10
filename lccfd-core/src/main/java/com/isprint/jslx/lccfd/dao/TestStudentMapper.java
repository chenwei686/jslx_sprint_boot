package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.TestStudent;
import com.isprint.jslx.lccfd.model.TestStudentQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestStudentMapper {
    int countByExample(TestStudentQuery example);

    int deleteByExample(TestStudentQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestStudent record);

    int insertSelective(TestStudent record);

    List<TestStudent> selectByExample(TestStudentQuery example);

    TestStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestStudent record, @Param("example") TestStudentQuery example);

    int updateByExample(@Param("record") TestStudent record, @Param("example") TestStudentQuery example);

    int updateByPrimaryKeySelective(TestStudent record);

    int updateByPrimaryKey(TestStudent record);
}