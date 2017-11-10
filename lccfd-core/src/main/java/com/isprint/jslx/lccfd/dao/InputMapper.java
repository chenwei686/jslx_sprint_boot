package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Input;
import com.isprint.jslx.lccfd.model.InputQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InputMapper {
    int countByExample(InputQuery example);

    int deleteByExample(InputQuery example);

    int insert(Input record);

    int insertSelective(Input record);

    List<Input> selectByExample(InputQuery example);

    int updateByExampleSelective(@Param("record") Input record, @Param("example") InputQuery example);

    int updateByExample(@Param("record") Input record, @Param("example") InputQuery example);
}