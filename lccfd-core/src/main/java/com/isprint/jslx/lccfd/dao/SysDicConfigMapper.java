package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.SysDicConfig;
import com.isprint.jslx.lccfd.model.SysDicConfigQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDicConfigMapper {
    int countByExample(SysDicConfigQuery example);

    int deleteByExample(SysDicConfigQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysDicConfig record);

    int insertSelective(SysDicConfig record);

    List<SysDicConfig> selectByExample(SysDicConfigQuery example);

    SysDicConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysDicConfig record, @Param("example") SysDicConfigQuery example);

    int updateByExample(@Param("record") SysDicConfig record, @Param("example") SysDicConfigQuery example);

    int updateByPrimaryKeySelective(SysDicConfig record);

    int updateByPrimaryKey(SysDicConfig record);
}