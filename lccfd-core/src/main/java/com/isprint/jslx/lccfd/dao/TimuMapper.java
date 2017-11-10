package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Timu;
import com.isprint.jslx.lccfd.model.TimuQuery;
import com.isprint.jslx.lccfd.model.TimuWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimuMapper {
    int countByExample(TimuQuery example);

    int deleteByExample(TimuQuery example);

    int insert(TimuWithBLOBs record);

    int insertSelective(TimuWithBLOBs record);

    List<TimuWithBLOBs> selectByExampleWithBLOBs(TimuQuery example);

    List<Timu> selectByExample(TimuQuery example);

    int updateByExampleSelective(@Param("record") TimuWithBLOBs record, @Param("example") TimuQuery example);

    int updateByExampleWithBLOBs(@Param("record") TimuWithBLOBs record, @Param("example") TimuQuery example);

    int updateByExample(@Param("record") Timu record, @Param("example") TimuQuery example);
}