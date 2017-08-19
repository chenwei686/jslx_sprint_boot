package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseClasses;
import com.isprint.jslx.lccfd.model.BaseClassesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseClassesMapper {
    int countByExample(BaseClassesQuery example);

    int deleteByExample(BaseClassesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseClasses record);

    int insertSelective(BaseClasses record);

    List<BaseClasses> selectByExample(BaseClassesQuery example);

    BaseClasses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseClasses record, @Param("example") BaseClassesQuery example);

    int updateByExample(@Param("record") BaseClasses record, @Param("example") BaseClassesQuery example);

    int updateByPrimaryKeySelective(BaseClasses record);

    int updateByPrimaryKey(BaseClasses record);
}