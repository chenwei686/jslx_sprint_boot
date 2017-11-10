package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTeacherDegree;
import com.isprint.jslx.lccfd.model.BaseTeacherDegreeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTeacherDegreeMapper {
    int countByExample(BaseTeacherDegreeQuery example);

    int deleteByExample(BaseTeacherDegreeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTeacherDegree record);

    int insertSelective(BaseTeacherDegree record);

    List<BaseTeacherDegree> selectByExample(BaseTeacherDegreeQuery example);

    BaseTeacherDegree selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTeacherDegree record, @Param("example") BaseTeacherDegreeQuery example);

    int updateByExample(@Param("record") BaseTeacherDegree record, @Param("example") BaseTeacherDegreeQuery example);

    int updateByPrimaryKeySelective(BaseTeacherDegree record);

    int updateByPrimaryKey(BaseTeacherDegree record);
}