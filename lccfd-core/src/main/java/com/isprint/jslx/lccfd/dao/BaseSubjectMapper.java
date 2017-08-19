package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseSubject;
import com.isprint.jslx.lccfd.model.BaseSubjectQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseSubjectMapper {
    int countByExample(BaseSubjectQuery example);

    int deleteByExample(BaseSubjectQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseSubject record);

    int insertSelective(BaseSubject record);

    List<BaseSubject> selectByExample(BaseSubjectQuery example);

    BaseSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseSubject record, @Param("example") BaseSubjectQuery example);

    int updateByExample(@Param("record") BaseSubject record, @Param("example") BaseSubjectQuery example);

    int updateByPrimaryKeySelective(BaseSubject record);

    int updateByPrimaryKey(BaseSubject record);
}