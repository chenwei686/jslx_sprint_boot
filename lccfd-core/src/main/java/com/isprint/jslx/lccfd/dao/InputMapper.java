package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Input;
import com.isprint.jslx.lccfd.model.InputQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InputMapper {
    int countByExample(InputQuery example);

    int deleteByExample(InputQuery example);

    int deleteByPrimaryKey(String id);

    int insert(Input record);

    int insertSelective(Input record);

    List<Input> selectByExampleWithBLOBs(InputQuery example);

    List<Input> selectByExample(InputQuery example);

    Input selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Input record, @Param("example") InputQuery example);

    int updateByExampleWithBLOBs(@Param("record") Input record, @Param("example") InputQuery example);

    int updateByExample(@Param("record") Input record, @Param("example") InputQuery example);

    int updateByPrimaryKeySelective(Input record);

    int updateByPrimaryKeyWithBLOBs(Input record);

    int updateByPrimaryKey(Input record);
}