package com.ball.doubleball.entity;

import java.util.Date;

public class LotteryResult {
    private Integer id;

    private String lotteryId;

    private String lotteryName;

    private Integer lotteryNo;

    private Date lotteryDate;

    private String lotterySaleAmount;

    private String lotteryPoolAmount;

    private Integer bfOneBall;

    private Integer bfTwoBall;

    private Integer bfThreeBall;

    private Integer bfFourBall;

    private Integer bfFiveBall;

    private Integer bfSixBall;

    private Integer bfSevenBall;

    private Integer bfEightBall;

    private Integer afOneBall;

    private Integer afTwoBall;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(String lotteryId) {
        this.lotteryId = lotteryId == null ? null : lotteryId.trim();
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName == null ? null : lotteryName.trim();
    }

    public Integer getLotteryNo() {
        return lotteryNo;
    }

    public void setLotteryNo(Integer lotteryNo) {
        this.lotteryNo = lotteryNo;
    }

    public Date getLotteryDate() {
        return lotteryDate;
    }

    public void setLotteryDate(Date lotteryDate) {
        this.lotteryDate = lotteryDate;
    }

    public String getLotterySaleAmount() {
        return lotterySaleAmount;
    }

    public void setLotterySaleAmount(String lotterySaleAmount) {
        this.lotterySaleAmount = lotterySaleAmount == null ? null : lotterySaleAmount.trim();
    }

    public String getLotteryPoolAmount() {
        return lotteryPoolAmount;
    }

    public void setLotteryPoolAmount(String lotteryPoolAmount) {
        this.lotteryPoolAmount = lotteryPoolAmount == null ? null : lotteryPoolAmount.trim();
    }

    public Integer getBfOneBall() {
        return bfOneBall;
    }

    public void setBfOneBall(Integer bfOneBall) {
        this.bfOneBall = bfOneBall;
    }

    public Integer getBfTwoBall() {
        return bfTwoBall;
    }

    public void setBfTwoBall(Integer bfTwoBall) {
        this.bfTwoBall = bfTwoBall;
    }

    public Integer getBfThreeBall() {
        return bfThreeBall;
    }

    public void setBfThreeBall(Integer bfThreeBall) {
        this.bfThreeBall = bfThreeBall;
    }

    public Integer getBfFourBall() {
        return bfFourBall;
    }

    public void setBfFourBall(Integer bfFourBall) {
        this.bfFourBall = bfFourBall;
    }

    public Integer getBfFiveBall() {
        return bfFiveBall;
    }

    public void setBfFiveBall(Integer bfFiveBall) {
        this.bfFiveBall = bfFiveBall;
    }

    public Integer getBfSixBall() {
        return bfSixBall;
    }

    public void setBfSixBall(Integer bfSixBall) {
        this.bfSixBall = bfSixBall;
    }

    public Integer getBfSevenBall() {
        return bfSevenBall;
    }

    public void setBfSevenBall(Integer bfSevenBall) {
        this.bfSevenBall = bfSevenBall;
    }

    public Integer getBfEightBall() {
        return bfEightBall;
    }

    public void setBfEightBall(Integer bfEightBall) {
        this.bfEightBall = bfEightBall;
    }

    public Integer getAfOneBall() {
        return afOneBall;
    }

    public void setAfOneBall(Integer afOneBall) {
        this.afOneBall = afOneBall;
    }

    public Integer getAfTwoBall() {
        return afTwoBall;
    }

    public void setAfTwoBall(Integer afTwoBall) {
        this.afTwoBall = afTwoBall;
    }
}