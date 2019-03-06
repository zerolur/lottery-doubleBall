package com.ball.doubleball.service;

import com.ball.doubleball.entity.LotteryResult;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @author Mr.chen
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/3/510:39
 */
@Service
public class ReptilesService {
    //    @Value("${jsoup.url = http://kaijiang.500.com/shtml/ssq/?.shtml}")
//    String jsoupUrl;
    private static final Logger logger = LoggerFactory.getLogger(ReptilesService.class);

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd日");

    static String jsoupUrl = "http://kaijiang.500.com/shtml/ssq/?.shtml";
//    static String jsoupUrl = "http://kaijiang.500.com/ssq.shtml";

    public LotteryResult reptiles500Website(int lotteryNo) {
        LotteryResult lotteryResult = new LotteryResult();
        // 基本信息
        lotteryResult.setLotteryId("ssq");
        lotteryResult.setLotteryName("双色球");
        lotteryResult.setLotteryNo(lotteryNo);
        String reqUrl = jsoupUrl.replace("?", lotteryNo + "");
        try {
            // gb2312
            Document doc = Jsoup.connect(reqUrl)
                    .header("Content-Type", "text/html")
                    .header("Connection", "close")//如果是这种方式，这里务必带上
                    .timeout(8000)//超时时间
                    .get();
            // 开奖日期
            Elements span_right = doc.getElementsByClass("span_right");
            String str = span_right.get(0).text();
            String dateStr = str.substring(str.indexOf("：") + 1, str.indexOf("兑奖截止日期"));
            lotteryResult.setLotteryDate(sdf.parse(dateStr));
            // 开奖时间大于当前时间
            if (lotteryResult.getLotteryDate().getTime() > System.currentTimeMillis()){
                return null;
            }
            // 红色号码球
            Elements redBalls = doc.getElementsByClass("ball_red");
            lotteryResult.setBfOneBall(Integer.valueOf(redBalls.get(0).text()));
            lotteryResult.setBfTwoBall(Integer.valueOf(redBalls.get(1).text()));
            lotteryResult.setBfThreeBall(Integer.valueOf(redBalls.get(2).text()));
            lotteryResult.setBfFourBall(Integer.valueOf(redBalls.get(3).text()));
            lotteryResult.setBfFiveBall(Integer.valueOf(redBalls.get(4).text()));
            lotteryResult.setBfSixBall(Integer.valueOf(redBalls.get(5).text()));
            // 蓝色号码球
            Elements blueBalls = doc.getElementsByClass("ball_blue");
            lotteryResult.setAfOneBall(Integer.valueOf(blueBalls.get(0).text()));
            // 销售金额 cfont1
            Elements saleAmounts = doc.getElementsByClass("cfont1");
            lotteryResult.setLotterySaleAmount(saleAmounts.get(0).text().replace("元", ""));
            // 奖池金额
            lotteryResult.setLotteryPoolAmount(saleAmounts.get(1).text().replace("元", ""));

        } catch (IOException e) {
            logger.warn("期号: " + lotteryNo + " IOException...");
//            e.printStackTrace();
        } catch (ParseException e) {
            logger.warn("期号: " + lotteryNo + " ParseException...");
//            e.printStackTrace();
        } catch (NumberFormatException e){
            logger.warn("期号: " + lotteryNo + " NumberFormatException...");
//            e.printStackTrace();
        }
        return lotteryResult;
    }

//    public static void main(String[] args) {
//        reptiles500Website(19025);
//    }
}
