package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Timuattributeextend;
import com.isprint.jslx.lccfd.model.TimuattributeextendQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimuattributeextendMapper {
    int countByExample(TimuattributeextendQuery example);

    int deleteByExample(TimuattributeextendQuery example);

    int deleteByPrimaryKey(String id);

    int insert(Timuattributeextend record);

    int insertSelective(Timuattributeextend record);

    List<Timuattributeextend> selectByExampleWithBLOBs(TimuattributeextendQuery example);

    List<Timuattributeextend> selectByExample(TimuattributeextendQuery example);

    Timuattributeextend selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Timuattributeextend record, @Param("example") TimuattributeextendQuery example);

    int updateByExampleWithBLOBs(@Param("record") Timuattributeextend record, @Param("example") TimuattributeextendQuery example);

    int updateByExample(@Param("record") Timuattributeextend record, @Param("example") TimuattributeextendQuery example);

    int updateByPrimaryKeySelective(Timuattributeextend record);

    int updateByPrimaryKeyWithBLOBs(Timuattributeextend record);

    int updateByPrimaryKey(Timuattributeextend record);
}