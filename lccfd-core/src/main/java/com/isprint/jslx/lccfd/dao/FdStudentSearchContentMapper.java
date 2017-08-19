package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentSearchContent;
import com.isprint.jslx.lccfd.model.FdStudentSearchContentQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentSearchContentMapper {
    int countByExample(FdStudentSearchContentQuery example);

    int deleteByExample(FdStudentSearchContentQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentSearchContent record);

    int insertSelective(FdStudentSearchContent record);

    List<FdStudentSearchContent> selectByExample(FdStudentSearchContentQuery example);

    FdStudentSearchContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentSearchContent record, @Param("example") FdStudentSearchContentQuery example);

    int updateByExample(@Param("record") FdStudentSearchContent record, @Param("example") FdStudentSearchContentQuery example);

    int updateByPrimaryKeySelective(FdStudentSearchContent record);

    int updateByPrimaryKey(FdStudentSearchContent record);
}