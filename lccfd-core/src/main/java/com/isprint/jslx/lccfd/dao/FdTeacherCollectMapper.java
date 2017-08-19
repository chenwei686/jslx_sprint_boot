package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherCollect;
import com.isprint.jslx.lccfd.model.FdTeacherCollectQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherCollectMapper {
    int countByExample(FdTeacherCollectQuery example);

    int deleteByExample(FdTeacherCollectQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherCollect record);

    int insertSelective(FdTeacherCollect record);

    List<FdTeacherCollect> selectByExample(FdTeacherCollectQuery example);

    FdTeacherCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherCollect record, @Param("example") FdTeacherCollectQuery example);

    int updateByExample(@Param("record") FdTeacherCollect record, @Param("example") FdTeacherCollectQuery example);

    int updateByPrimaryKeySelective(FdTeacherCollect record);

    int updateByPrimaryKey(FdTeacherCollect record);
}