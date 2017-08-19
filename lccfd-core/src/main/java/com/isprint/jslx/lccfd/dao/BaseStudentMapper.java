package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseStudent;
import com.isprint.jslx.lccfd.model.BaseStudentQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseStudentMapper {
    int countByExample(BaseStudentQuery example);

    int deleteByExample(BaseStudentQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseStudent record);

    int insertSelective(BaseStudent record);

    List<BaseStudent> selectByExample(BaseStudentQuery example);

    BaseStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseStudent record, @Param("example") BaseStudentQuery example);

    int updateByExample(@Param("record") BaseStudent record, @Param("example") BaseStudentQuery example);

    int updateByPrimaryKeySelective(BaseStudent record);

    int updateByPrimaryKey(BaseStudent record);
}