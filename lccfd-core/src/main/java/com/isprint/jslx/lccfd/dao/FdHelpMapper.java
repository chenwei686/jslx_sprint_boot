package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdHelp;
import com.isprint.jslx.lccfd.model.FdHelpQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdHelpMapper {
    int countByExample(FdHelpQuery example);

    int deleteByExample(FdHelpQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdHelp record);

    int insertSelective(FdHelp record);

    List<FdHelp> selectByExample(FdHelpQuery example);

    FdHelp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdHelp record, @Param("example") FdHelpQuery example);

    int updateByExample(@Param("record") FdHelp record, @Param("example") FdHelpQuery example);

    int updateByPrimaryKeySelective(FdHelp record);

    int updateByPrimaryKey(FdHelp record);
}