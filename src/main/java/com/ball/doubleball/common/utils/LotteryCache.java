package com.ball.doubleball.common.utils;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @author Mr.chen
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/3/513:40
 */
public class LotteryCache {
    static final Cache<String, String> cache = CacheBuilder.newBuilder().build();

    // 获取需要获取数据的最新的期次号码
    public static String getNewLotteryNo(){
                try {
            String value = cache.get("newLotteryNo", new Callable<String>() {
                @Override
                public synchronized String call() throws Exception {
                    return makeNewLottryNo();
                }
            });
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return cache.getIfPresent("newLotteryNo");
    }

    private static String makeNewLottryNo(){
        String lastStr = cache.getIfPresent("lastLotteryNo");
        SimpleDateFormat sdf = new SimpleDateFormat("yy");
        String nowYear = sdf.format(new Date());
        if (lastStr.startsWith(nowYear)){
            return String.valueOf(Integer.valueOf(lastStr)+1);
        }else{
            return nowYear+"001";
        }
    }

    public static void main(String[] args) {
        System.out.println(getNewLotteryNo());
    }
    // 更新上一期号码球
    public static void setLastLotteryNo(int lastLotteryNo){
        cache.put("lastLotteryNo",lastLotteryNo+"");
        cache.put("newLotteryNo",makeNewLottryNo());
    }

}
