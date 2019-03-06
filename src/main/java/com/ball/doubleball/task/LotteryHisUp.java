package com.ball.doubleball.task;

import com.ball.doubleball.common.utils.LotteryCache;
import com.ball.doubleball.entity.LotteryResult;
import com.ball.doubleball.mapper.common.LotteryResultMapper;
import com.ball.doubleball.service.DoubleColorService;
import com.ball.doubleball.service.ReptilesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Mr.chen
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/3/514:26
 */
@Component
public class LotteryHisUp {
    private static final Logger logger = LoggerFactory.getLogger(LotteryHisUp.class);
    @Autowired
    ReptilesService reptilesService;
    @Autowired
    DoubleColorService doubleColorService;
    @Autowired
    LotteryResultMapper lotteryResultMapper;

    //    @Scheduled(cron = "* 15 21 ? * 2,4,7")      // 每周二、四 、日晚上21:15分执行
    @Scheduled(cron = "0 */1 * * * ?")      // 测试用每一分钟执行一次
    public void upNewLotteryNo() {
        String newLotteryNo = LotteryCache.getNewLotteryNo();
        logger.info("定时任务已开启,即将抓取 " + newLotteryNo + " 期次开奖结果...");
        for (; ; ) {
            if (jsoupNewLottery()) {
                break;
            }
        }
    }

    private boolean jsoupNewLottery() {
        String newLotteryNo = LotteryCache.getNewLotteryNo();
        if (null != newLotteryNo) {
            try {
                int lotteryNo = Integer.valueOf(newLotteryNo);
                LotteryResult lotteryResult = reptilesService.reptiles500Website(lotteryNo);
                if (null != lotteryResult && doubleColorService.checkLotteryNo(lotteryNo)) {
                    if (null != lotteryResult.getBfOneBall() && lotteryResult.getBfOneBall() > 0) {
                        int count = lotteryResultMapper.insertSelective(lotteryResult);
                        if (count > 0) {
                            logger.info(newLotteryNo + "期开奖结果已收录...");
                            LotteryCache.setLastLotteryNo(lotteryNo);
                        } else {
                            logger.warn(newLotteryNo + "期开奖结果收录失败...");
                        }
                    } else {
                        logger.info("开奖结果未公布,将在半分钟后继续执行...");
                        Thread.sleep(30 * 1000);
                    }
                } else {
                    return true;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
