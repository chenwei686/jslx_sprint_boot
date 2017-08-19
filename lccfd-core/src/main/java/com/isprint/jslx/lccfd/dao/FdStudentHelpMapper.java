package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentHelp;
import com.isprint.jslx.lccfd.model.FdStudentHelpQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentHelpMapper {
    int countByExample(FdStudentHelpQuery example);

    int deleteByExample(FdStudentHelpQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentHelp record);

    int insertSelective(FdStudentHelp record);

    List<FdStudentHelp> selectByExample(FdStudentHelpQuery example);

    FdStudentHelp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentHelp record, @Param("example") FdStudentHelpQuery example);

    int updateByExample(@Param("record") FdStudentHelp record, @Param("example") FdStudentHelpQuery example);

    int updateByPrimaryKeySelective(FdStudentHelp record);

    int updateByPrimaryKey(FdStudentHelp record);
}