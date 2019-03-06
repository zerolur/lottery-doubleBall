package com.ball.doubleball.mapper.common;

import com.ball.doubleball.entity.KillRecord;
import com.ball.doubleball.entity.KillRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KillRecordMapper {
    int countByExample(KillRecordExample example);

    int deleteByExample(KillRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KillRecord record);

    int insertSelective(KillRecord record);

    List<KillRecord> selectByExample(KillRecordExample example);

    KillRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KillRecord record, @Param("example") KillRecordExample example);

    int updateByExample(@Param("record") KillRecord record, @Param("example") KillRecordExample example);

    int updateByPrimaryKeySelective(KillRecord record);

    int updateByPrimaryKey(KillRecord record);
}