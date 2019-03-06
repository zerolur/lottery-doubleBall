package com.ball.doubleball.mapper.common;

import com.ball.doubleball.entity.GuessRecord;
import com.ball.doubleball.entity.GuessRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuessRecordMapper {
    int countByExample(GuessRecordExample example);

    int deleteByExample(GuessRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GuessRecord record);

    int insertSelective(GuessRecord record);

    List<GuessRecord> selectByExample(GuessRecordExample example);

    GuessRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GuessRecord record, @Param("example") GuessRecordExample example);

    int updateByExample(@Param("record") GuessRecord record, @Param("example") GuessRecordExample example);

    int updateByPrimaryKeySelective(GuessRecord record);

    int updateByPrimaryKey(GuessRecord record);
}