package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentUseDetail;
import com.isprint.jslx.lccfd.model.FdStudentUseDetailQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentUseDetailMapper {
    int countByExample(FdStudentUseDetailQuery example);

    int deleteByExample(FdStudentUseDetailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentUseDetail record);

    int insertSelective(FdStudentUseDetail record);

    List<FdStudentUseDetail> selectByExample(FdStudentUseDetailQuery example);

    FdStudentUseDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentUseDetail record, @Param("example") FdStudentUseDetailQuery example);

    int updateByExample(@Param("record") FdStudentUseDetail record, @Param("example") FdStudentUseDetailQuery example);

    int updateByPrimaryKeySelective(FdStudentUseDetail record);

    int updateByPrimaryKey(FdStudentUseDetail record);
}