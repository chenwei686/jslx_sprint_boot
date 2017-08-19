package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseBookSection;
import com.isprint.jslx.lccfd.model.BaseBookSectionQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseBookSectionMapper {
    int countByExample(BaseBookSectionQuery example);

    int deleteByExample(BaseBookSectionQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseBookSection record);

    int insertSelective(BaseBookSection record);

    List<BaseBookSection> selectByExample(BaseBookSectionQuery example);

    BaseBookSection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseBookSection record, @Param("example") BaseBookSectionQuery example);

    int updateByExample(@Param("record") BaseBookSection record, @Param("example") BaseBookSectionQuery example);

    int updateByPrimaryKeySelective(BaseBookSection record);

    int updateByPrimaryKey(BaseBookSection record);
}