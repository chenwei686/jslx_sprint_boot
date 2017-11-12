package com.isprint.jslx.lccfd.dao;

import com.isprint.jslx.lccfd.model.BaseTimuSearch;
import com.isprint.jslx.lccfd.model.BaseTimuSearchQuery;
import com.isprint.jslx.lccfd.model.BaseTimuSearchWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BaseTimuSearchMapper {
    int countByExample(BaseTimuSearchQuery example);

    int deleteByExample(BaseTimuSearchQuery example);

    int deleteByPrimaryKey(String id);

    int insert(BaseTimuSearchWithBLOBs record);

    int insertSelective(BaseTimuSearchWithBLOBs record);

    List<BaseTimuSearchWithBLOBs> selectByExampleWithBLOBs(BaseTimuSearchQuery example);

    List<BaseTimuSearch> selectByExample(BaseTimuSearchQuery example);

    BaseTimuSearchWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseTimuSearchWithBLOBs record, @Param("example") BaseTimuSearchQuery example);

    int updateByExampleWithBLOBs(@Param("record") BaseTimuSearchWithBLOBs record, @Param("example") BaseTimuSearchQuery example);

    int updateByExample(@Param("record") BaseTimuSearch record, @Param("example") BaseTimuSearchQuery example);

    int updateByPrimaryKeySelective(BaseTimuSearchWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BaseTimuSearchWithBLOBs record);

    int updateByPrimaryKey(BaseTimuSearch record);

    @Select("SELECT id,subject_id,timu_type_id,difficult_level,input_choice_json,main_knowledge_id,trunk,video_code FROM lesprint.base_timu_search limit #{start} ,#{end}")
    List<Map<String,Object>> getBaseTimuSearchList(@Param("start") Integer start,@Param("end") Integer end);

}