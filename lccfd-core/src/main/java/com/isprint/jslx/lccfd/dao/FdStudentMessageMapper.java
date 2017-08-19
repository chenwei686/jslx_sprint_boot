package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.FdStudentMessage;
import com.isprint.jslx.lccfd.model.FdStudentMessageQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FdStudentMessageMapper {
    int countByExample(FdStudentMessageQuery example);

    int deleteByExample(FdStudentMessageQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(FdStudentMessage record);

    int insertSelective(FdStudentMessage record);

    List<FdStudentMessage> selectByExample(FdStudentMessageQuery example);

    FdStudentMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FdStudentMessage record, @Param("example") FdStudentMessageQuery example);

    int updateByExample(@Param("record") FdStudentMessage record, @Param("example") FdStudentMessageQuery example);

    int updateByPrimaryKeySelective(FdStudentMessage record);

    int updateByPrimaryKey(FdStudentMessage record);
}