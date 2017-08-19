package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentMonthReportDetail;
import com.isprint.jslx.lccfd.model.FdStudentMonthReportDetailQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentMonthReportDetailMapper {
    int countByExample(FdStudentMonthReportDetailQuery example);

    int deleteByExample(FdStudentMonthReportDetailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentMonthReportDetail record);

    int insertSelective(FdStudentMonthReportDetail record);

    List<FdStudentMonthReportDetail> selectByExample(FdStudentMonthReportDetailQuery example);

    FdStudentMonthReportDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentMonthReportDetail record, @Param("example") FdStudentMonthReportDetailQuery example);

    int updateByExample(@Param("record") FdStudentMonthReportDetail record, @Param("example") FdStudentMonthReportDetailQuery example);

    int updateByPrimaryKeySelective(FdStudentMonthReportDetail record);

    int updateByPrimaryKey(FdStudentMonthReportDetail record);
}