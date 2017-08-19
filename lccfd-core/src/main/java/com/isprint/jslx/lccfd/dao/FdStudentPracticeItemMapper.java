package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentPracticeItem;
import com.isprint.jslx.lccfd.model.FdStudentPracticeItemQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentPracticeItemMapper {
    int countByExample(FdStudentPracticeItemQuery example);

    int deleteByExample(FdStudentPracticeItemQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentPracticeItem record);

    int insertSelective(FdStudentPracticeItem record);

    List<FdStudentPracticeItem> selectByExample(FdStudentPracticeItemQuery example);

    FdStudentPracticeItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentPracticeItem record, @Param("example") FdStudentPracticeItemQuery example);

    int updateByExample(@Param("record") FdStudentPracticeItem record, @Param("example") FdStudentPracticeItemQuery example);

    int updateByPrimaryKeySelective(FdStudentPracticeItem record);

    int updateByPrimaryKey(FdStudentPracticeItem record);
}