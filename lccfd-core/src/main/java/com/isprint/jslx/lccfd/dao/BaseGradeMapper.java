package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseGrade;
import com.isprint.jslx.lccfd.model.BaseGradeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseGradeMapper {
    int countByExample(BaseGradeQuery example);

    int deleteByExample(BaseGradeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseGrade record);

    int insertSelective(BaseGrade record);

    List<BaseGrade> selectByExample(BaseGradeQuery example);

    BaseGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseGrade record, @Param("example") BaseGradeQuery example);

    int updateByExample(@Param("record") BaseGrade record, @Param("example") BaseGradeQuery example);

    int updateByPrimaryKeySelective(BaseGrade record);

    int updateByPrimaryKey(BaseGrade record);
}