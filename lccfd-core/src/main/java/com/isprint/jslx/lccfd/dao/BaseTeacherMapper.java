package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTeacher;
import com.isprint.jslx.lccfd.model.BaseTeacherQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTeacherMapper {
    int countByExample(BaseTeacherQuery example);

    int deleteByExample(BaseTeacherQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTeacher record);

    int insertSelective(BaseTeacher record);

    List<BaseTeacher> selectByExample(BaseTeacherQuery example);

    BaseTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTeacher record, @Param("example") BaseTeacherQuery example);

    int updateByExample(@Param("record") BaseTeacher record, @Param("example") BaseTeacherQuery example);

    int updateByPrimaryKeySelective(BaseTeacher record);

    int updateByPrimaryKey(BaseTeacher record);
}