package com.ball.doubleball.mapper.common;

import com.ball.doubleball.entity.BallsRecord;
import com.ball.doubleball.entity.BallsRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BallsRecordMapper {
    int countByExample(BallsRecordExample example);

    int deleteByExample(BallsRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BallsRecord record);

    int insertSelective(BallsRecord record);

    List<BallsRecord> selectByExample(BallsRecordExample example);

    BallsRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BallsRecord record, @Param("example") BallsRecordExample example);

    int updateByExample(@Param("record") BallsRecord record, @Param("example") BallsRecordExample example);

    int updateByPrimaryKeySelective(BallsRecord record);

    int updateByPrimaryKey(BallsRecord record);
}