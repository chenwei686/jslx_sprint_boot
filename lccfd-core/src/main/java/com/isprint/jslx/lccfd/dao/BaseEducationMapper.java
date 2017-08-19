package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseEducation;
import com.isprint.jslx.lccfd.model.BaseEducationQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseEducationMapper {
    int countByExample(BaseEducationQuery example);

    int deleteByExample(BaseEducationQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseEducation record);

    int insertSelective(BaseEducation record);

    List<BaseEducation> selectByExample(BaseEducationQuery example);

    BaseEducation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseEducation record, @Param("example") BaseEducationQuery example);

    int updateByExample(@Param("record") BaseEducation record, @Param("example") BaseEducationQuery example);

    int updateByPrimaryKeySelective(BaseEducation record);

    int updateByPrimaryKey(BaseEducation record);
}