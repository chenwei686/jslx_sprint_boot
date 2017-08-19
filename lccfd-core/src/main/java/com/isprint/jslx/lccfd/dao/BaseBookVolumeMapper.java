package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseBookVolume;
import com.isprint.jslx.lccfd.model.BaseBookVolumeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseBookVolumeMapper {
    int countByExample(BaseBookVolumeQuery example);

    int deleteByExample(BaseBookVolumeQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseBookVolume record);

    int insertSelective(BaseBookVolume record);

    List<BaseBookVolume> selectByExample(BaseBookVolumeQuery example);

    BaseBookVolume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseBookVolume record, @Param("example") BaseBookVolumeQuery example);

    int updateByExample(@Param("record") BaseBookVolume record, @Param("example") BaseBookVolumeQuery example);

    int updateByPrimaryKeySelective(BaseBookVolume record);

    int updateByPrimaryKey(BaseBookVolume record);
}