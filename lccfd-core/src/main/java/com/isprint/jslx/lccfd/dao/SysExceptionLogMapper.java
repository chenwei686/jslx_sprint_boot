package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.SysExceptionLog;
import com.isprint.jslx.lccfd.model.SysExceptionLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysExceptionLogMapper {
    int countByExample(SysExceptionLogQuery example);

    int deleteByExample(SysExceptionLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysExceptionLog record);

    int insertSelective(SysExceptionLog record);

    List<SysExceptionLog> selectByExampleWithBLOBs(SysExceptionLogQuery example);

    List<SysExceptionLog> selectByExample(SysExceptionLogQuery example);

    SysExceptionLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysExceptionLog record, @Param("example") SysExceptionLogQuery example);

    int updateByExampleWithBLOBs(@Param("record") SysExceptionLog record, @Param("example") SysExceptionLogQuery example);

    int updateByExample(@Param("record") SysExceptionLog record, @Param("example") SysExceptionLogQuery example);

    int updateByPrimaryKeySelective(SysExceptionLog record);

    int updateByPrimaryKeyWithBLOBs(SysExceptionLog record);

    int updateByPrimaryKey(SysExceptionLog record);
}