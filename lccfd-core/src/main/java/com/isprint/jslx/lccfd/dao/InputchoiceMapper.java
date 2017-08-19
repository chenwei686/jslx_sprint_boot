package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Inputchoice;
import com.isprint.jslx.lccfd.model.InputchoiceQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InputchoiceMapper {
    int countByExample(InputchoiceQuery example);

    int deleteByExample(InputchoiceQuery example);

    int deleteByPrimaryKey(String id);

    int insert(Inputchoice record);

    int insertSelective(Inputchoice record);

    List<Inputchoice> selectByExampleWithBLOBs(InputchoiceQuery example);

    List<Inputchoice> selectByExample(InputchoiceQuery example);

    Inputchoice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Inputchoice record, @Param("example") InputchoiceQuery example);

    int updateByExampleWithBLOBs(@Param("record") Inputchoice record, @Param("example") InputchoiceQuery example);

    int updateByExample(@Param("record") Inputchoice record, @Param("example") InputchoiceQuery example);

    int updateByPrimaryKeySelective(Inputchoice record);

    int updateByPrimaryKeyWithBLOBs(Inputchoice record);

    int updateByPrimaryKey(Inputchoice record);
}