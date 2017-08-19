package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentVip;
import com.isprint.jslx.lccfd.model.FdStudentVipQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentVipMapper {
    int countByExample(FdStudentVipQuery example);

    int deleteByExample(FdStudentVipQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentVip record);

    int insertSelective(FdStudentVip record);

    List<FdStudentVip> selectByExample(FdStudentVipQuery example);

    FdStudentVip selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentVip record, @Param("example") FdStudentVipQuery example);

    int updateByExample(@Param("record") FdStudentVip record, @Param("example") FdStudentVipQuery example);

    int updateByPrimaryKeySelective(FdStudentVip record);

    int updateByPrimaryKey(FdStudentVip record);
}