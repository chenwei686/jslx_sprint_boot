package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentOrder;
import com.isprint.jslx.lccfd.model.FdStudentOrderQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentOrderMapper {
    int countByExample(FdStudentOrderQuery example);

    int deleteByExample(FdStudentOrderQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(FdStudentOrder record);

    int insertSelective(FdStudentOrder record);

    List<FdStudentOrder> selectByExample(FdStudentOrderQuery example);

    FdStudentOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FdStudentOrder record, @Param("example") FdStudentOrderQuery example);

    int updateByExample(@Param("record") FdStudentOrder record, @Param("example") FdStudentOrderQuery example);

    int updateByPrimaryKeySelective(FdStudentOrder record);

    int updateByPrimaryKey(FdStudentOrder record);
}