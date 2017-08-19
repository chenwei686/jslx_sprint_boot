package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentSysCollect;
import com.isprint.jslx.lccfd.model.FdStudentSysCollectQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentSysCollectMapper {
    int countByExample(FdStudentSysCollectQuery example);

    int deleteByExample(FdStudentSysCollectQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentSysCollect record);

    int insertSelective(FdStudentSysCollect record);

    List<FdStudentSysCollect> selectByExample(FdStudentSysCollectQuery example);

    FdStudentSysCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentSysCollect record, @Param("example") FdStudentSysCollectQuery example);

    int updateByExample(@Param("record") FdStudentSysCollect record, @Param("example") FdStudentSysCollectQuery example);

    int updateByPrimaryKeySelective(FdStudentSysCollect record);

    int updateByPrimaryKey(FdStudentSysCollect record);
}