package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.SysVerifyCode;
import com.isprint.jslx.lccfd.model.SysVerifyCodeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysVerifyCodeMapper {
    int countByExample(SysVerifyCodeQuery example);

    int deleteByExample(SysVerifyCodeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysVerifyCode record);

    int insertSelective(SysVerifyCode record);

    List<SysVerifyCode> selectByExample(SysVerifyCodeQuery example);

    SysVerifyCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysVerifyCode record, @Param("example") SysVerifyCodeQuery example);

    int updateByExample(@Param("record") SysVerifyCode record, @Param("example") SysVerifyCodeQuery example);

    int updateByPrimaryKeySelective(SysVerifyCode record);

    int updateByPrimaryKey(SysVerifyCode record);
}