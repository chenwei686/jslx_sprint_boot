package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentFreeConfig;
import com.isprint.jslx.lccfd.model.FdStudentFreeConfigQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentFreeConfigMapper {
    int countByExample(FdStudentFreeConfigQuery example);

    int deleteByExample(FdStudentFreeConfigQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentFreeConfig record);

    int insertSelective(FdStudentFreeConfig record);

    List<FdStudentFreeConfig> selectByExample(FdStudentFreeConfigQuery example);

    FdStudentFreeConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentFreeConfig record, @Param("example") FdStudentFreeConfigQuery example);

    int updateByExample(@Param("record") FdStudentFreeConfig record, @Param("example") FdStudentFreeConfigQuery example);

    int updateByPrimaryKeySelective(FdStudentFreeConfig record);

    int updateByPrimaryKey(FdStudentFreeConfig record);
}