package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentMobileLog;
import com.isprint.jslx.lccfd.model.FdStudentMobileLogQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentMobileLogMapper {
    int countByExample(FdStudentMobileLogQuery example);

    int deleteByExample(FdStudentMobileLogQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentMobileLog record);

    int insertSelective(FdStudentMobileLog record);

    List<FdStudentMobileLog> selectByExample(FdStudentMobileLogQuery example);

    FdStudentMobileLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentMobileLog record, @Param("example") FdStudentMobileLogQuery example);

    int updateByExample(@Param("record") FdStudentMobileLog record, @Param("example") FdStudentMobileLogQuery example);

    int updateByPrimaryKeySelective(FdStudentMobileLog record);

    int updateByPrimaryKey(FdStudentMobileLog record);
}