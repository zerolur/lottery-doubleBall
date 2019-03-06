package com.ball.doubleball.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.ball.doubleball.entity.GuessRecord;
import com.ball.doubleball.entity.LotteryResult;

import java.util.List;

/**
 * @author Mr.chen
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/3/115:05
 */
public class DoubleBallUtil {

    // 中奖结果匹配
    public static List<GuessRecord> winResultQuery(List<GuessRecord> guessRecordList, LotteryResult lotteryResult){
        for (int i=0;null != guessRecordList && guessRecordList.size() > 0 && i < guessRecordList.size();i++){
            GuessRecord guessRecord = guessRecordList.get(i);
            String guessRedBalls = guessRecord.getRedBallList();
            Integer guessBlue = guessRecord.getBlueBall();
            int redNum = 0;
            int blueNum = 0;
            if (guessRedBalls.indexOf(String.valueOf(lotteryResult.getBfOneBall())) != -1){
                redNum ++;
            }
            if (guessRedBalls.indexOf(String.valueOf(lotteryResult.getBfTwoBall())) != -1){
                redNum ++;
            }
            if (guessRedBalls.indexOf(String.valueOf(lotteryResult.getBfThreeBall())) != -1){
                redNum ++;
            }
            if (guessRedBalls.indexOf(String.valueOf(lotteryResult.getBfFourBall())) != -1){
                redNum ++;
            }
            if (guessRedBalls.indexOf(String.valueOf(lotteryResult.getBfFiveBall())) != -1){
                redNum ++;
            }
            if (guessRedBalls.indexOf(String.valueOf(lotteryResult.getBfSixBall())) != -1){
                redNum ++;
            }
            if (guessBlue == lotteryResult.getAfOneBall()){
                blueNum ++;
            }
            Byte winLevel = getWinLevel(redNum,blueNum);
            if (winLevel != 8){
                guessRecord.setHaveWin(Byte.valueOf("2"));
            }else {
                guessRecord.setHaveWin(Byte.valueOf("3"));
            }
            guessRecord.setWinLevel(winLevel);
        }

        return guessRecordList;
    }

    // 中奖等级匹配
    public static Byte getWinLevel(int redNum,int blueNum){
        Byte resultLevel = 8;
        if (redNum == 6 && blueNum == 1){
            resultLevel = 1;
        }
        if (redNum == 6 && blueNum == 0){
            resultLevel = 2;
        }
        if (redNum == 5 && blueNum == 1){
            resultLevel = 3;
        }
        if ((redNum == 5 && blueNum == 0) || (redNum == 4 && blueNum == 1)){
            resultLevel = 4;
        }
        if ((redNum == 4 && blueNum == 0) || (redNum == 3 && blueNum == 1)){
            resultLevel = 5;
        }
        if (redNum < 3 && blueNum == 1){
            resultLevel = 6;
        }
        return resultLevel;
    }

    // JSONObject 转 实体类
    public static LotteryResult jsobjCastEntity(JSONObject jsonObject){
        LotteryResult lotteryResult = new LotteryResult();
        lotteryResult.setBfOneBall(jsonObject.getInteger("bf_one_ball"));
        lotteryResult.setBfTwoBall(jsonObject.getInteger("bf_two_ball"));
        lotteryResult.setBfThreeBall(jsonObject.getInteger("bf_three_ball"));
        lotteryResult.setBfFourBall(jsonObject.getInteger("bf_four_ball"));
        lotteryResult.setBfFiveBall(jsonObject.getInteger("bf_five_ball"));
        lotteryResult.setBfSixBall(jsonObject.getInteger("bf_six_ball"));
        lotteryResult.setAfOneBall(jsonObject.getInteger("af_one_ball"));
        lotteryResult.setLotteryId(jsonObject.getString("lottery_id"));
        lotteryResult.setLotteryName(jsonObject.getString("lottery_name"));
        lotteryResult.setLotteryNo(jsonObject.getInteger("lottery_no"));
        lotteryResult.setLotteryDate(jsonObject.getDate("lottery_date"));
        lotteryResult.setLotterySaleAmount(jsonObject.getString("lottery_sale_amount"));
        lotteryResult.setLotteryPoolAmount(jsonObject.getString("lottery_pool_amount"));
        return lotteryResult;
    }

}
