package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseParent;
import com.isprint.jslx.lccfd.model.BaseParentQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseParentMapper {
    int countByExample(BaseParentQuery example);

    int deleteByExample(BaseParentQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseParent record);

    int insertSelective(BaseParent record);

    List<BaseParent> selectByExample(BaseParentQuery example);

    BaseParent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseParent record, @Param("example") BaseParentQuery example);

    int updateByExample(@Param("record") BaseParent record, @Param("example") BaseParentQuery example);

    int updateByPrimaryKeySelective(BaseParent record);

    int updateByPrimaryKey(BaseParent record);
}