package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.SysAdminLoginLog;
import com.isprint.jslx.lccfd.model.SysAdminLoginLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminLoginLogMapper {
    int countByExample(SysAdminLoginLogQuery example);

    int deleteByExample(SysAdminLoginLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAdminLoginLog record);

    int insertSelective(SysAdminLoginLog record);

    List<SysAdminLoginLog> selectByExample(SysAdminLoginLogQuery example);

    SysAdminLoginLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAdminLoginLog record, @Param("example") SysAdminLoginLogQuery example);

    int updateByExample(@Param("record") SysAdminLoginLog record, @Param("example") SysAdminLoginLogQuery example);

    int updateByPrimaryKeySelective(SysAdminLoginLog record);

    int updateByPrimaryKey(SysAdminLoginLog record);
}