package com.ball.doubleball.mapper.common;

import com.ball.doubleball.entity.BileRecord;
import com.ball.doubleball.entity.BileRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BileRecordMapper {
    int countByExample(BileRecordExample example);

    int deleteByExample(BileRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BileRecord record);

    int insertSelective(BileRecord record);

    List<BileRecord> selectByExample(BileRecordExample example);

    BileRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BileRecord record, @Param("example") BileRecordExample example);

    int updateByExample(@Param("record") BileRecord record, @Param("example") BileRecordExample example);

    int updateByPrimaryKeySelective(BileRecord record);

    int updateByPrimaryKey(BileRecord record);
}