package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTimuUseNumber;
import com.isprint.jslx.lccfd.model.FdTimuUseNumberQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTimuUseNumberMapper {
    int countByExample(FdTimuUseNumberQuery example);

    int deleteByExample(FdTimuUseNumberQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTimuUseNumber record);

    int insertSelective(FdTimuUseNumber record);

    List<FdTimuUseNumber> selectByExample(FdTimuUseNumberQuery example);

    FdTimuUseNumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTimuUseNumber record, @Param("example") FdTimuUseNumberQuery example);

    int updateByExample(@Param("record") FdTimuUseNumber record, @Param("example") FdTimuUseNumberQuery example);

    int updateByPrimaryKeySelective(FdTimuUseNumber record);

    int updateByPrimaryKey(FdTimuUseNumber record);
}