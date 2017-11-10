package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherWeekReportDetail;
import com.isprint.jslx.lccfd.model.FdTeacherWeekReportDetailQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherWeekReportDetailMapper {
    int countByExample(FdTeacherWeekReportDetailQuery example);

    int deleteByExample(FdTeacherWeekReportDetailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherWeekReportDetail record);

    int insertSelective(FdTeacherWeekReportDetail record);

    List<FdTeacherWeekReportDetail> selectByExample(FdTeacherWeekReportDetailQuery example);

    FdTeacherWeekReportDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherWeekReportDetail record, @Param("example") FdTeacherWeekReportDetailQuery example);

    int updateByExample(@Param("record") FdTeacherWeekReportDetail record, @Param("example") FdTeacherWeekReportDetailQuery example);

    int updateByPrimaryKeySelective(FdTeacherWeekReportDetail record);

    int updateByPrimaryKey(FdTeacherWeekReportDetail record);
}