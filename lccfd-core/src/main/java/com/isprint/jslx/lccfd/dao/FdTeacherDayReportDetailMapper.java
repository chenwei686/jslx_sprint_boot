package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdTeacherDayReportDetail;
import com.isprint.jslx.lccfd.model.FdTeacherDayReportDetailQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdTeacherDayReportDetailMapper {
    int countByExample(FdTeacherDayReportDetailQuery example);

    int deleteByExample(FdTeacherDayReportDetailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdTeacherDayReportDetail record);

    int insertSelective(FdTeacherDayReportDetail record);

    List<FdTeacherDayReportDetail> selectByExample(FdTeacherDayReportDetailQuery example);

    FdTeacherDayReportDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdTeacherDayReportDetail record, @Param("example") FdTeacherDayReportDetailQuery example);

    int updateByExample(@Param("record") FdTeacherDayReportDetail record, @Param("example") FdTeacherDayReportDetailQuery example);

    int updateByPrimaryKeySelective(FdTeacherDayReportDetail record);

    int updateByPrimaryKey(FdTeacherDayReportDetail record);
}