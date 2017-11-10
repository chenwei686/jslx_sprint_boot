package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.Perusers;
import com.isprint.jslx.lccfd.model.PerusersQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerusersMapper {
    int countByExample(PerusersQuery example);

    int deleteByExample(PerusersQuery example);

    int insert(Perusers record);

    int insertSelective(Perusers record);

    List<Perusers> selectByExample(PerusersQuery example);

    int updateByExampleSelective(@Param("record") Perusers record, @Param("example") PerusersQuery example);

    int updateByExample(@Param("record") Perusers record, @Param("example") PerusersQuery example);
}