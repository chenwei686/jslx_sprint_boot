package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuFormula1;
import com.isprint.jslx.lccfd.model.BaseTimuFormula1Query;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuFormula1Mapper {
    int countByExample(BaseTimuFormula1Query example);

    int deleteByExample(BaseTimuFormula1Query example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTimuFormula1 record);

    int insertSelective(BaseTimuFormula1 record);

    List<BaseTimuFormula1> selectByExample(BaseTimuFormula1Query example);

    BaseTimuFormula1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTimuFormula1 record, @Param("example") BaseTimuFormula1Query example);

    int updateByExample(@Param("record") BaseTimuFormula1 record, @Param("example") BaseTimuFormula1Query example);

    int updateByPrimaryKeySelective(BaseTimuFormula1 record);

    int updateByPrimaryKey(BaseTimuFormula1 record);
}