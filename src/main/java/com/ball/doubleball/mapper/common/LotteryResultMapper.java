package com.ball.doubleball.mapper.common;

import com.ball.doubleball.entity.LotteryResult;
import com.ball.doubleball.entity.LotteryResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LotteryResultMapper {
    int countByExample(LotteryResultExample example);

    int deleteByExample(LotteryResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LotteryResult record);

    int insertSelective(LotteryResult record);

    List<LotteryResult> selectByExample(LotteryResultExample example);

    LotteryResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LotteryResult record, @Param("example") LotteryResultExample example);

    int updateByExample(@Param("record") LotteryResult record, @Param("example") LotteryResultExample example);

    int updateByPrimaryKeySelective(LotteryResult record);

    int updateByPrimaryKey(LotteryResult record);
}
