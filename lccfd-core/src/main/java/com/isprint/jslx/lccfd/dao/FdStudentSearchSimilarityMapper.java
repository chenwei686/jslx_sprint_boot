package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentSearchSimilarity;
import com.isprint.jslx.lccfd.model.FdStudentSearchSimilarityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentSearchSimilarityMapper {
    int countByExample(FdStudentSearchSimilarityQuery example);

    int deleteByExample(FdStudentSearchSimilarityQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentSearchSimilarity record);

    int insertSelective(FdStudentSearchSimilarity record);

    List<FdStudentSearchSimilarity> selectByExample(FdStudentSearchSimilarityQuery example);

    FdStudentSearchSimilarity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentSearchSimilarity record, @Param("example") FdStudentSearchSimilarityQuery example);

    int updateByExample(@Param("record") FdStudentSearchSimilarity record, @Param("example") FdStudentSearchSimilarityQuery example);

    int updateByPrimaryKeySelective(FdStudentSearchSimilarity record);

    int updateByPrimaryKey(FdStudentSearchSimilarity record);
}