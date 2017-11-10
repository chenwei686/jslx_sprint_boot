package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuDetail;
import com.isprint.jslx.lccfd.model.BaseTimuDetailQuery;
import com.isprint.jslx.lccfd.model.BaseTimuDetailWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuDetailMapper {
    int countByExample(BaseTimuDetailQuery example);

    int deleteByExample(BaseTimuDetailQuery example);

    int deleteByPrimaryKey(String timuId);

    int insert(BaseTimuDetailWithBLOBs record);

    int insertSelective(BaseTimuDetailWithBLOBs record);

    List<BaseTimuDetailWithBLOBs> selectByExampleWithBLOBs(BaseTimuDetailQuery example);

    List<BaseTimuDetail> selectByExample(BaseTimuDetailQuery example);

    BaseTimuDetailWithBLOBs selectByPrimaryKey(String timuId);

    int updateByExampleSelective(@Param("record") BaseTimuDetailWithBLOBs record, @Param("example") BaseTimuDetailQuery example);

    int updateByExampleWithBLOBs(@Param("record") BaseTimuDetailWithBLOBs record, @Param("example") BaseTimuDetailQuery example);

    int updateByExample(@Param("record") BaseTimuDetail record, @Param("example") BaseTimuDetailQuery example);

    int updateByPrimaryKeySelective(BaseTimuDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BaseTimuDetailWithBLOBs record);

    int updateByPrimaryKey(BaseTimuDetail record);
}