package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentSysOrder;
import com.isprint.jslx.lccfd.model.FdStudentSysOrderQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentSysOrderMapper {
    int countByExample(FdStudentSysOrderQuery example);

    int deleteByExample(FdStudentSysOrderQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentSysOrder record);

    int insertSelective(FdStudentSysOrder record);

    List<FdStudentSysOrder> selectByExample(FdStudentSysOrderQuery example);

    FdStudentSysOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentSysOrder record, @Param("example") FdStudentSysOrderQuery example);

    int updateByExample(@Param("record") FdStudentSysOrder record, @Param("example") FdStudentSysOrderQuery example);

    int updateByPrimaryKeySelective(FdStudentSysOrder record);

    int updateByPrimaryKey(FdStudentSysOrder record);
}