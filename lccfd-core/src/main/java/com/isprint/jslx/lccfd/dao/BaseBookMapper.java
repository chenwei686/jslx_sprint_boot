package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseBook;
import com.isprint.jslx.lccfd.model.BaseBookQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseBookMapper {
    int countByExample(BaseBookQuery example);

    int deleteByExample(BaseBookQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseBook record);

    int insertSelective(BaseBook record);

    List<BaseBook> selectByExample(BaseBookQuery example);

    BaseBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseBook record, @Param("example") BaseBookQuery example);

    int updateByExample(@Param("record") BaseBook record, @Param("example") BaseBookQuery example);

    int updateByPrimaryKeySelective(BaseBook record);

    int updateByPrimaryKey(BaseBook record);
}