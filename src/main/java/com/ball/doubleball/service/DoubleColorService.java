package com.ball.doubleball.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ball.doubleball.common.utils.DoubleBallUtil;
import com.ball.doubleball.entity.LotteryResult;
import com.ball.doubleball.entity.LotteryResultExample;
import com.ball.doubleball.mapper.common.LotteryResultDefMapper;
import com.ball.doubleball.mapper.common.LotteryResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mr.chen
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/2/2018:01
 */
@Service
public class DoubleColorService {

    @Autowired
    LotteryResultMapper lotteryResultMapper;
    @Autowired
    LotteryResultDefMapper lotteryResultDefMapper;
    // 新增双色球开奖数据
    public int insertDoubleColor(JSONArray doubleBallArray) {
        int resultCount = 0;
        for (int i=0;null != doubleBallArray && doubleBallArray.size() > 0 && i <doubleBallArray.size();i++){
            JSONObject doubleColorMap =  doubleBallArray.getJSONObject(i);
            if (checkLotteryNo(doubleColorMap.getInteger("lottery_no"))){
                LotteryResult lotteryResult = DoubleBallUtil.jsobjCastEntity(doubleColorMap);
                int count = lotteryResultMapper.insertSelective(lotteryResult);
                System.out.println("新增成功本次新增期数为: "+doubleColorMap.getInteger("lottery_no"));
                resultCount += count;
            }else{
                System.out.println("新增失败,已保存的期数: "+doubleColorMap.getInteger("lottery_no"));
            }
        }
        return resultCount;
    }
    // 作者预测结果添加
    public Map<String, Object> authorForecast(JSONObject params) {
        Map<String, Object> result = new HashMap<String, Object>();


        return result;
    }

    // 根据期数校验是否已保存
    public boolean checkLotteryNo(Integer lottery_no){
        LotteryResultExample example = new LotteryResultExample();
        example.createCriteria().andLotteryNoEqualTo(lottery_no);
        int count = lotteryResultMapper.countByExample(example);
        if (count == 0){
            return true;
        }
        return false;
    }

    // 每日定时更新最新一期号码球
    public void jsoupNewLottery(){
        Date date = new Date();
//        date.g
    }
    // 获取上期开奖号码
    public int getLastLotteryNo(){
        return lotteryResultDefMapper.getLastLotteryNo();
    }


}
