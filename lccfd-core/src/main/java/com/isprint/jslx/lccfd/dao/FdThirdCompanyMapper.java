package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdThirdCompany;
import com.isprint.jslx.lccfd.model.FdThirdCompanyQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdThirdCompanyMapper {
    int countByExample(FdThirdCompanyQuery example);

    int deleteByExample(FdThirdCompanyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdThirdCompany record);

    int insertSelective(FdThirdCompany record);

    List<FdThirdCompany> selectByExample(FdThirdCompanyQuery example);

    FdThirdCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdThirdCompany record, @Param("example") FdThirdCompanyQuery example);

    int updateByExample(@Param("record") FdThirdCompany record, @Param("example") FdThirdCompanyQuery example);

    int updateByPrimaryKeySelective(FdThirdCompany record);

    int updateByPrimaryKey(FdThirdCompany record);
}