package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentWeekReportDetail;
import com.isprint.jslx.lccfd.model.FdStudentWeekReportDetailQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentWeekReportDetailMapper {
    int countByExample(FdStudentWeekReportDetailQuery example);

    int deleteByExample(FdStudentWeekReportDetailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentWeekReportDetail record);

    int insertSelective(FdStudentWeekReportDetail record);

    List<FdStudentWeekReportDetail> selectByExample(FdStudentWeekReportDetailQuery example);

    FdStudentWeekReportDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentWeekReportDetail record, @Param("example") FdStudentWeekReportDetailQuery example);

    int updateByExample(@Param("record") FdStudentWeekReportDetail record, @Param("example") FdStudentWeekReportDetailQuery example);

    int updateByPrimaryKeySelective(FdStudentWeekReportDetail record);

    int updateByPrimaryKey(FdStudentWeekReportDetail record);
}