package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentDayReportDetail;
import com.isprint.jslx.lccfd.model.FdStudentDayReportDetailQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentDayReportDetailMapper {
    int countByExample(FdStudentDayReportDetailQuery example);

    int deleteByExample(FdStudentDayReportDetailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentDayReportDetail record);

    int insertSelective(FdStudentDayReportDetail record);

    List<FdStudentDayReportDetail> selectByExample(FdStudentDayReportDetailQuery example);

    FdStudentDayReportDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentDayReportDetail record, @Param("example") FdStudentDayReportDetailQuery example);

    int updateByExample(@Param("record") FdStudentDayReportDetail record, @Param("example") FdStudentDayReportDetailQuery example);

    int updateByPrimaryKeySelective(FdStudentDayReportDetail record);

    int updateByPrimaryKey(FdStudentDayReportDetail record);
}