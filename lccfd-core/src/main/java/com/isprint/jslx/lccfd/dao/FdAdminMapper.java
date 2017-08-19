package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdAdmin;
import com.isprint.jslx.lccfd.model.FdAdminQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdAdminMapper {
    int countByExample(FdAdminQuery example);

    int deleteByExample(FdAdminQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdAdmin record);

    int insertSelective(FdAdmin record);

    List<FdAdmin> selectByExample(FdAdminQuery example);

    FdAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdAdmin record, @Param("example") FdAdminQuery example);

    int updateByExample(@Param("record") FdAdmin record, @Param("example") FdAdminQuery example);

    int updateByPrimaryKeySelective(FdAdmin record);

    int updateByPrimaryKey(FdAdmin record);
}