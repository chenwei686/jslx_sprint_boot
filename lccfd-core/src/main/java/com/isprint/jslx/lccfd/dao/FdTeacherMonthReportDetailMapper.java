package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherMonthReportDetail;
import com.isprint.jslx.lccfd.model.FdTeacherMonthReportDetailQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherMonthReportDetailMapper {
    int countByExample(FdTeacherMonthReportDetailQuery example);

    int deleteByExample(FdTeacherMonthReportDetailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherMonthReportDetail record);

    int insertSelective(FdTeacherMonthReportDetail record);

    List<FdTeacherMonthReportDetail> selectByExample(FdTeacherMonthReportDetailQuery example);

    FdTeacherMonthReportDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherMonthReportDetail record, @Param("example") FdTeacherMonthReportDetailQuery example);

    int updateByExample(@Param("record") FdTeacherMonthReportDetail record, @Param("example") FdTeacherMonthReportDetailQuery example);

    int updateByPrimaryKeySelective(FdTeacherMonthReportDetail record);

    int updateByPrimaryKey(FdTeacherMonthReportDetail record);
}