package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.CodeDifficult;
import com.isprint.jslx.lccfd.model.CodeDifficultQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeDifficultMapper {
    int countByExample(CodeDifficultQuery example);

    int deleteByExample(CodeDifficultQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(CodeDifficult record);

    int insertSelective(CodeDifficult record);

    List<CodeDifficult> selectByExample(CodeDifficultQuery example);

    CodeDifficult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CodeDifficult record, @Param("example") CodeDifficultQuery example);

    int updateByExample(@Param("record") CodeDifficult record, @Param("example") CodeDifficultQuery example);

    int updateByPrimaryKeySelective(CodeDifficult record);

    int updateByPrimaryKey(CodeDifficult record);
}