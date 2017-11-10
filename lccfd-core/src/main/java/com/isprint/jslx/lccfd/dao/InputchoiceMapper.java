package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Inputchoice;
import com.isprint.jslx.lccfd.model.InputchoiceQuery;
import com.isprint.jslx.lccfd.model.InputchoiceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InputchoiceMapper {
    int countByExample(InputchoiceQuery example);

    int deleteByExample(InputchoiceQuery example);

    int insert(InputchoiceWithBLOBs record);

    int insertSelective(InputchoiceWithBLOBs record);

    List<InputchoiceWithBLOBs> selectByExampleWithBLOBs(InputchoiceQuery example);

    List<Inputchoice> selectByExample(InputchoiceQuery example);

    int updateByExampleSelective(@Param("record") InputchoiceWithBLOBs record, @Param("example") InputchoiceQuery example);

    int updateByExampleWithBLOBs(@Param("record") InputchoiceWithBLOBs record, @Param("example") InputchoiceQuery example);

    int updateByExample(@Param("record") Inputchoice record, @Param("example") InputchoiceQuery example);
}