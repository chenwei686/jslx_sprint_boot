package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentOrderHjy;
import com.isprint.jslx.lccfd.model.FdStudentOrderHjyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentOrderHjyMapper {
    int countByExample(FdStudentOrderHjyQuery example);

    int deleteByExample(FdStudentOrderHjyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentOrderHjy record);

    int insertSelective(FdStudentOrderHjy record);

    List<FdStudentOrderHjy> selectByExample(FdStudentOrderHjyQuery example);

    FdStudentOrderHjy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentOrderHjy record, @Param("example") FdStudentOrderHjyQuery example);

    int updateByExample(@Param("record") FdStudentOrderHjy record, @Param("example") FdStudentOrderHjyQuery example);

    int updateByPrimaryKeySelective(FdStudentOrderHjy record);

    int updateByPrimaryKey(FdStudentOrderHjy record);
}