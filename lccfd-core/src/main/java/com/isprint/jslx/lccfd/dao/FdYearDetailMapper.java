package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdYearDetail;
import com.isprint.jslx.lccfd.model.FdYearDetailQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdYearDetailMapper {
    int countByExample(FdYearDetailQuery example);

    int deleteByExample(FdYearDetailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdYearDetail record);

    int insertSelective(FdYearDetail record);

    List<FdYearDetail> selectByExample(FdYearDetailQuery example);

    FdYearDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdYearDetail record, @Param("example") FdYearDetailQuery example);

    int updateByExample(@Param("record") FdYearDetail record, @Param("example") FdYearDetailQuery example);

    int updateByPrimaryKeySelective(FdYearDetail record);

    int updateByPrimaryKey(FdYearDetail record);
}