package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Timuknowledge;
import com.isprint.jslx.lccfd.model.TimuknowledgeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimuknowledgeMapper {
    int countByExample(TimuknowledgeQuery example);

    int deleteByExample(TimuknowledgeQuery example);

    int insert(Timuknowledge record);

    int insertSelective(Timuknowledge record);

    List<Timuknowledge> selectByExampleWithBLOBs(TimuknowledgeQuery example);

    List<Timuknowledge> selectByExample(TimuknowledgeQuery example);

    int updateByExampleSelective(@Param("record") Timuknowledge record, @Param("example") TimuknowledgeQuery example);

    int updateByExampleWithBLOBs(@Param("record") Timuknowledge record, @Param("example") TimuknowledgeQuery example);

    int updateByExample(@Param("record") Timuknowledge record, @Param("example") TimuknowledgeQuery example);
}