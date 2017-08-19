package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.School;
import com.isprint.jslx.lccfd.model.SchoolQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolMapper {
    int countByExample(SchoolQuery example);

    int deleteByExample(SchoolQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExampleWithBLOBs(SchoolQuery example);

    List<School> selectByExample(SchoolQuery example);

    School selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolQuery example);

    int updateByExampleWithBLOBs(@Param("record") School record, @Param("example") SchoolQuery example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolQuery example);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKeyWithBLOBs(School record);

    int updateByPrimaryKey(School record);
}