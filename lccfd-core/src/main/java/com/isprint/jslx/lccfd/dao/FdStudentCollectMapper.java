package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentCollect;
import com.isprint.jslx.lccfd.model.FdStudentCollectQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentCollectMapper {
    int countByExample(FdStudentCollectQuery example);

    int deleteByExample(FdStudentCollectQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentCollect record);

    int insertSelective(FdStudentCollect record);

    List<FdStudentCollect> selectByExample(FdStudentCollectQuery example);

    FdStudentCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentCollect record, @Param("example") FdStudentCollectQuery example);

    int updateByExample(@Param("record") FdStudentCollect record, @Param("example") FdStudentCollectQuery example);

    int updateByPrimaryKeySelective(FdStudentCollect record);

    int updateByPrimaryKey(FdStudentCollect record);
}