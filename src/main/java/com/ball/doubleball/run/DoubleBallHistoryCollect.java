package com.ball.doubleball.run;

import com.ball.doubleball.common.utils.RestTemplateUtil;

import java.util.Map;

/**
 * @author Mr.chen
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/2/2011:05
 */
public class DoubleBallHistoryCollect {
    static String key = "5a5b7f4e51a3dee3fb9adf2eb0a2f872";
    static String hisUrl = "http://apis.juhe.cn/lottery/history?key=dc8297f45a816acaa99d95d3a8104e05&lottery_id=ssq&page_size=50&page=1";
    public static void main(String[] args) {
        Map result = RestTemplateUtil.getForEntity(hisUrl,Map.class);
        System.out.println(result.toString());
    }
}
