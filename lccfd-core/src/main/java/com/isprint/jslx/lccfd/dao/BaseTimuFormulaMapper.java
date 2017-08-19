package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuFormula;
import com.isprint.jslx.lccfd.model.BaseTimuFormulaQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuFormulaMapper {
    int countByExample(BaseTimuFormulaQuery example);

    int deleteByExample(BaseTimuFormulaQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTimuFormula record);

    int insertSelective(BaseTimuFormula record);

    List<BaseTimuFormula> selectByExample(BaseTimuFormulaQuery example);

    BaseTimuFormula selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTimuFormula record, @Param("example") BaseTimuFormulaQuery example);

    int updateByExample(@Param("record") BaseTimuFormula record, @Param("example") BaseTimuFormulaQuery example);

    int updateByPrimaryKeySelective(BaseTimuFormula record);

    int updateByPrimaryKey(BaseTimuFormula record);
}