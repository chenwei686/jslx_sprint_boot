package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuDetail;
import com.isprint.jslx.lccfd.model.BaseTimuDetailQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuDetailMapper {
    int countByExample(BaseTimuDetailQuery example);

    int deleteByExample(BaseTimuDetailQuery example);

    int deleteByPrimaryKey(String timuId);

    int insert(BaseTimuDetail record);

    int insertSelective(BaseTimuDetail record);

    List<BaseTimuDetail> selectByExample(BaseTimuDetailQuery example);

    BaseTimuDetail selectByPrimaryKey(String timuId);

    int updateByExampleSelective(@Param("record") BaseTimuDetail record, @Param("example") BaseTimuDetailQuery example);

    int updateByExample(@Param("record") BaseTimuDetail record, @Param("example") BaseTimuDetailQuery example);

    int updateByPrimaryKeySelective(BaseTimuDetail record);

    int updateByPrimaryKey(BaseTimuDetail record);
}