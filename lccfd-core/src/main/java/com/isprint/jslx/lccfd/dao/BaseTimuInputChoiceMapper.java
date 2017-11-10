package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuInputChoice;
import com.isprint.jslx.lccfd.model.BaseTimuInputChoiceQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTimuInputChoiceMapper {
    int countByExample(BaseTimuInputChoiceQuery example);

    int deleteByExample(BaseTimuInputChoiceQuery example);

    int deleteByPrimaryKey(String id);

    int insert(BaseTimuInputChoice record);

    int insertSelective(BaseTimuInputChoice record);

    List<BaseTimuInputChoice> selectByExampleWithBLOBs(BaseTimuInputChoiceQuery example);

    List<BaseTimuInputChoice> selectByExample(BaseTimuInputChoiceQuery example);

    BaseTimuInputChoice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseTimuInputChoice record, @Param("example") BaseTimuInputChoiceQuery example);

    int updateByExampleWithBLOBs(@Param("record") BaseTimuInputChoice record, @Param("example") BaseTimuInputChoiceQuery example);

    int updateByExample(@Param("record") BaseTimuInputChoice record, @Param("example") BaseTimuInputChoiceQuery example);

    int updateByPrimaryKeySelective(BaseTimuInputChoice record);

    int updateByPrimaryKeyWithBLOBs(BaseTimuInputChoice record);

    int updateByPrimaryKey(BaseTimuInputChoice record);
}