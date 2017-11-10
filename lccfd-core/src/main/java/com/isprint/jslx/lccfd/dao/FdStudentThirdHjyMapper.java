package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentThirdHjy;
import com.isprint.jslx.lccfd.model.FdStudentThirdHjyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentThirdHjyMapper {
    int countByExample(FdStudentThirdHjyQuery example);

    int deleteByExample(FdStudentThirdHjyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentThirdHjy record);

    int insertSelective(FdStudentThirdHjy record);

    List<FdStudentThirdHjy> selectByExample(FdStudentThirdHjyQuery example);

    FdStudentThirdHjy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentThirdHjy record, @Param("example") FdStudentThirdHjyQuery example);

    int updateByExample(@Param("record") FdStudentThirdHjy record, @Param("example") FdStudentThirdHjyQuery example);

    int updateByPrimaryKeySelective(FdStudentThirdHjy record);

    int updateByPrimaryKey(FdStudentThirdHjy record);
}