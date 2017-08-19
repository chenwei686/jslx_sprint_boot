package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.DrPublisher;
import com.isprint.jslx.lccfd.model.DrPublisherQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrPublisherMapper {
    int countByExample(DrPublisherQuery example);

    int deleteByExample(DrPublisherQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(DrPublisher record);

    int insertSelective(DrPublisher record);

    List<DrPublisher> selectByExample(DrPublisherQuery example);

    DrPublisher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DrPublisher record, @Param("example") DrPublisherQuery example);

    int updateByExample(@Param("record") DrPublisher record, @Param("example") DrPublisherQuery example);

    int updateByPrimaryKeySelective(DrPublisher record);

    int updateByPrimaryKey(DrPublisher record);
}