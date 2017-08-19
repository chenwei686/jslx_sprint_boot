package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdFeedbackType;
import com.isprint.jslx.lccfd.model.FdFeedbackTypeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdFeedbackTypeMapper {
    int countByExample(FdFeedbackTypeQuery example);

    int deleteByExample(FdFeedbackTypeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdFeedbackType record);

    int insertSelective(FdFeedbackType record);

    List<FdFeedbackType> selectByExample(FdFeedbackTypeQuery example);

    FdFeedbackType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdFeedbackType record, @Param("example") FdFeedbackTypeQuery example);

    int updateByExample(@Param("record") FdFeedbackType record, @Param("example") FdFeedbackTypeQuery example);

    int updateByPrimaryKeySelective(FdFeedbackType record);

    int updateByPrimaryKey(FdFeedbackType record);
}