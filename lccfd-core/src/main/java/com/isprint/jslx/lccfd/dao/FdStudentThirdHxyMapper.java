package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentThirdHxy;
import com.isprint.jslx.lccfd.model.FdStudentThirdHxyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentThirdHxyMapper {
    int countByExample(FdStudentThirdHxyQuery example);

    int deleteByExample(FdStudentThirdHxyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentThirdHxy record);

    int insertSelective(FdStudentThirdHxy record);

    List<FdStudentThirdHxy> selectByExample(FdStudentThirdHxyQuery example);

    FdStudentThirdHxy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentThirdHxy record, @Param("example") FdStudentThirdHxyQuery example);

    int updateByExample(@Param("record") FdStudentThirdHxy record, @Param("example") FdStudentThirdHxyQuery example);

    int updateByPrimaryKeySelective(FdStudentThirdHxy record);

    int updateByPrimaryKey(FdStudentThirdHxy record);
}