package com.ball.doubleball.start;

import com.ball.doubleball.common.utils.LotteryCache;
import com.ball.doubleball.service.DoubleColorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Mr.chen
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/3/513:38
 */
@Component
@Order(1)
public class LotteryNoApplication implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(LotteryNoApplication.class);

    @Autowired
    DoubleColorService doubleColorService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("服务已启动,即将更新双色球期数");
        initLotteryNo();
    }
    // 初始化双色球期次号码
    private void initLotteryNo(){
        int lastLotteryNo = doubleColorService.getLastLotteryNo();
        logger.info("上一期历史期数为: "+lastLotteryNo);
        if (lastLotteryNo > 0){
            LotteryCache.setLastLotteryNo(lastLotteryNo);
            logger.info("本期需要查询开奖结果期数为: "+LotteryCache.getNewLotteryNo());
        }else{
            logger.warn("双色球期数更新错误,错误的历史期数: "+lastLotteryNo);
        }
    }
}
