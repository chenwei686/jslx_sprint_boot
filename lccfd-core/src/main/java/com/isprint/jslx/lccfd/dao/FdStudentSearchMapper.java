package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentSearch;
import com.isprint.jslx.lccfd.model.FdStudentSearchQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentSearchMapper {
    int countByExample(FdStudentSearchQuery example);

    int deleteByExample(FdStudentSearchQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentSearch record);

    int insertSelective(FdStudentSearch record);

    List<FdStudentSearch> selectByExample(FdStudentSearchQuery example);

    FdStudentSearch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentSearch record, @Param("example") FdStudentSearchQuery example);

    int updateByExample(@Param("record") FdStudentSearch record, @Param("example") FdStudentSearchQuery example);

    int updateByPrimaryKeySelective(FdStudentSearch record);

    int updateByPrimaryKey(FdStudentSearch record);
}