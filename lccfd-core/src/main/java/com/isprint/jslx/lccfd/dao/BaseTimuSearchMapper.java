package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuSearch;
import com.isprint.jslx.lccfd.model.BaseTimuSearchQuery;
import com.isprint.jslx.lccfd.model.BaseTimuSearchWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuSearchMapper {
    int countByExample(BaseTimuSearchQuery example);

    int deleteByExample(BaseTimuSearchQuery example);

    int deleteByPrimaryKey(String id);

    int insert(BaseTimuSearchWithBLOBs record);

    int insertSelective(BaseTimuSearchWithBLOBs record);

    List<BaseTimuSearchWithBLOBs> selectByExampleWithBLOBs(BaseTimuSearchQuery example);

    List<BaseTimuSearch> selectByExample(BaseTimuSearchQuery example);

    BaseTimuSearchWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseTimuSearchWithBLOBs record, @Param("example") BaseTimuSearchQuery example);

    int updateByExampleWithBLOBs(@Param("record") BaseTimuSearchWithBLOBs record, @Param("example") BaseTimuSearchQuery example);

    int updateByExample(@Param("record") BaseTimuSearch record, @Param("example") BaseTimuSearchQuery example);

    int updateByPrimaryKeySelective(BaseTimuSearchWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BaseTimuSearchWithBLOBs record);

    int updateByPrimaryKey(BaseTimuSearch record);
}