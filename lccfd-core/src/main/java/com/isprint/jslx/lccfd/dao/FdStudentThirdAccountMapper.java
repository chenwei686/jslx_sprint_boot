package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentThirdAccount;
import com.isprint.jslx.lccfd.model.FdStudentThirdAccountQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentThirdAccountMapper {
    int countByExample(FdStudentThirdAccountQuery example);

    int deleteByExample(FdStudentThirdAccountQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentThirdAccount record);

    int insertSelective(FdStudentThirdAccount record);

    List<FdStudentThirdAccount> selectByExample(FdStudentThirdAccountQuery example);

    FdStudentThirdAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentThirdAccount record, @Param("example") FdStudentThirdAccountQuery example);

    int updateByExample(@Param("record") FdStudentThirdAccount record, @Param("example") FdStudentThirdAccountQuery example);

    int updateByPrimaryKeySelective(FdStudentThirdAccount record);

    int updateByPrimaryKey(FdStudentThirdAccount record);
}