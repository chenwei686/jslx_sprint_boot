package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseParentStudent;
import com.isprint.jslx.lccfd.model.BaseParentStudentQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseParentStudentMapper {
    int countByExample(BaseParentStudentQuery example);

    int deleteByExample(BaseParentStudentQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseParentStudent record);

    int insertSelective(BaseParentStudent record);

    List<BaseParentStudent> selectByExample(BaseParentStudentQuery example);

    BaseParentStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseParentStudent record, @Param("example") BaseParentStudentQuery example);

    int updateByExample(@Param("record") BaseParentStudent record, @Param("example") BaseParentStudentQuery example);

    int updateByPrimaryKeySelective(BaseParentStudent record);

    int updateByPrimaryKey(BaseParentStudent record);
}