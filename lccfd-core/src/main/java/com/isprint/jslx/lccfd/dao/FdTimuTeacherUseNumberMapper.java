package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTimuTeacherUseNumber;
import com.isprint.jslx.lccfd.model.FdTimuTeacherUseNumberQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTimuTeacherUseNumberMapper {
    int countByExample(FdTimuTeacherUseNumberQuery example);

    int deleteByExample(FdTimuTeacherUseNumberQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTimuTeacherUseNumber record);

    int insertSelective(FdTimuTeacherUseNumber record);

    List<FdTimuTeacherUseNumber> selectByExample(FdTimuTeacherUseNumberQuery example);

    FdTimuTeacherUseNumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTimuTeacherUseNumber record, @Param("example") FdTimuTeacherUseNumberQuery example);

    int updateByExample(@Param("record") FdTimuTeacherUseNumber record, @Param("example") FdTimuTeacherUseNumberQuery example);

    int updateByPrimaryKeySelective(FdTimuTeacherUseNumber record);

    int updateByPrimaryKey(FdTimuTeacherUseNumber record);
}