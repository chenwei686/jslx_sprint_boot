package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseYear;
import com.isprint.jslx.lccfd.model.BaseYearQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseYearMapper {
    int countByExample(BaseYearQuery example);

    int deleteByExample(BaseYearQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseYear record);

    int insertSelective(BaseYear record);

    List<BaseYear> selectByExample(BaseYearQuery example);

    BaseYear selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseYear record, @Param("example") BaseYearQuery example);

    int updateByExample(@Param("record") BaseYear record, @Param("example") BaseYearQuery example);

    int updateByPrimaryKeySelective(BaseYear record);

    int updateByPrimaryKey(BaseYear record);
}