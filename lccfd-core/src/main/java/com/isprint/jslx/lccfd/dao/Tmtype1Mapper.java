package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Tmtype1;
import com.isprint.jslx.lccfd.model.Tmtype1Query;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tmtype1Mapper {
    int countByExample(Tmtype1Query example);

    int deleteByExample(Tmtype1Query example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tmtype1 record);

    int insertSelective(Tmtype1 record);

    List<Tmtype1> selectByExample(Tmtype1Query example);

    Tmtype1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tmtype1 record, @Param("example") Tmtype1Query example);

    int updateByExample(@Param("record") Tmtype1 record, @Param("example") Tmtype1Query example);

    int updateByPrimaryKeySelective(Tmtype1 record);

    int updateByPrimaryKey(Tmtype1 record);
}