package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseParentThirdAccount;
import com.isprint.jslx.lccfd.model.BaseParentThirdAccountQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseParentThirdAccountMapper {
    int countByExample(BaseParentThirdAccountQuery example);

    int deleteByExample(BaseParentThirdAccountQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseParentThirdAccount record);

    int insertSelective(BaseParentThirdAccount record);

    List<BaseParentThirdAccount> selectByExample(BaseParentThirdAccountQuery example);

    BaseParentThirdAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseParentThirdAccount record, @Param("example") BaseParentThirdAccountQuery example);

    int updateByExample(@Param("record") BaseParentThirdAccount record, @Param("example") BaseParentThirdAccountQuery example);

    int updateByPrimaryKeySelective(BaseParentThirdAccount record);

    int updateByPrimaryKey(BaseParentThirdAccount record);
}