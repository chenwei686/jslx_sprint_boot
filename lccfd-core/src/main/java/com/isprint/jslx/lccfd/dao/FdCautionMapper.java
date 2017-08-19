package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdCaution;
import com.isprint.jslx.lccfd.model.FdCautionQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdCautionMapper {
    int countByExample(FdCautionQuery example);

    int deleteByExample(FdCautionQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdCaution record);

    int insertSelective(FdCaution record);

    List<FdCaution> selectByExample(FdCautionQuery example);

    FdCaution selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdCaution record, @Param("example") FdCautionQuery example);

    int updateByExample(@Param("record") FdCaution record, @Param("example") FdCautionQuery example);

    int updateByPrimaryKeySelective(FdCaution record);

    int updateByPrimaryKey(FdCaution record);
}