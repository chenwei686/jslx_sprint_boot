package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.SysLoginLog;
import com.isprint.jslx.lccfd.model.SysLoginLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLoginLogMapper {
    int countByExample(SysLoginLogQuery example);

    int deleteByExample(SysLoginLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    List<SysLoginLog> selectByExample(SysLoginLogQuery example);

    SysLoginLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysLoginLog record, @Param("example") SysLoginLogQuery example);

    int updateByExample(@Param("record") SysLoginLog record, @Param("example") SysLoginLogQuery example);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
}