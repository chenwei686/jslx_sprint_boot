package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.SysVersionControl;
import com.isprint.jslx.lccfd.model.SysVersionControlQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysVersionControlMapper {
    int countByExample(SysVersionControlQuery example);

    int deleteByExample(SysVersionControlQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysVersionControl record);

    int insertSelective(SysVersionControl record);

    List<SysVersionControl> selectByExample(SysVersionControlQuery example);

    SysVersionControl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysVersionControl record, @Param("example") SysVersionControlQuery example);

    int updateByExample(@Param("record") SysVersionControl record, @Param("example") SysVersionControlQuery example);

    int updateByPrimaryKeySelective(SysVersionControl record);

    int updateByPrimaryKey(SysVersionControl record);
}