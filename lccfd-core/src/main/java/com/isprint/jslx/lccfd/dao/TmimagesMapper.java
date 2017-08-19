package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Tmimages;
import com.isprint.jslx.lccfd.model.TmimagesQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmimagesMapper {
    int countByExample(TmimagesQuery example);

    int deleteByExample(TmimagesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tmimages record);

    int insertSelective(Tmimages record);

    List<Tmimages> selectByExampleWithBLOBs(TmimagesQuery example);

    List<Tmimages> selectByExample(TmimagesQuery example);

    Tmimages selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tmimages record, @Param("example") TmimagesQuery example);

    int updateByExampleWithBLOBs(@Param("record") Tmimages record, @Param("example") TmimagesQuery example);

    int updateByExample(@Param("record") Tmimages record, @Param("example") TmimagesQuery example);

    int updateByPrimaryKeySelective(Tmimages record);

    int updateByPrimaryKeyWithBLOBs(Tmimages record);

    int updateByPrimaryKey(Tmimages record);
}