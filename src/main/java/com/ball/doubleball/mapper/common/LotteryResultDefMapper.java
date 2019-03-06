package com.ball.doubleball.mapper.common;

import com.ball.doubleball.entity.LotteryResult;
import com.ball.doubleball.entity.LotteryResultExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LotteryResultDefMapper {

    int getLastLotteryNo();
}
