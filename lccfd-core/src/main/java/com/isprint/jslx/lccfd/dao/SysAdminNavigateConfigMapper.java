package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.SysAdminNavigateConfig;
import com.isprint.jslx.lccfd.model.SysAdminNavigateConfigQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminNavigateConfigMapper {
    int countByExample(SysAdminNavigateConfigQuery example);

    int deleteByExample(SysAdminNavigateConfigQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAdminNavigateConfig record);

    int insertSelective(SysAdminNavigateConfig record);

    List<SysAdminNavigateConfig> selectByExample(SysAdminNavigateConfigQuery example);

    SysAdminNavigateConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAdminNavigateConfig record, @Param("example") SysAdminNavigateConfigQuery example);

    int updateByExample(@Param("record") SysAdminNavigateConfig record, @Param("example") SysAdminNavigateConfigQuery example);

    int updateByPrimaryKeySelective(SysAdminNavigateConfig record);

    int updateByPrimaryKey(SysAdminNavigateConfig record);
}