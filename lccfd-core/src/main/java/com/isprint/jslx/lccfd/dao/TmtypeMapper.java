package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Tmtype;
import com.isprint.jslx.lccfd.model.TmtypeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmtypeMapper {
    int countByExample(TmtypeQuery example);

    int deleteByExample(TmtypeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tmtype record);

    int insertSelective(Tmtype record);

    List<Tmtype> selectByExample(TmtypeQuery example);

    Tmtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tmtype record, @Param("example") TmtypeQuery example);

    int updateByExample(@Param("record") Tmtype record, @Param("example") TmtypeQuery example);

    int updateByPrimaryKeySelective(Tmtype record);

    int updateByPrimaryKey(Tmtype record);
}