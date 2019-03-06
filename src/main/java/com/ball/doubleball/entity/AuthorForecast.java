package com.ball.doubleball.entity;

import java.util.Date;

public class AuthorForecast {
    private Integer id;

    private Integer lotteryNo;

    private Integer bilerId;

    private String bilerName;

    private Byte bileType;

    private Integer bileNum;

    private Integer bileHisRate;

    private Date ts;

    private Byte adopt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLotteryNo() {
        return lotteryNo;
    }

    public void setLotteryNo(Integer lotteryNo) {
        this.lotteryNo = lotteryNo;
    }

    public Integer getBilerId() {
        return bilerId;
    }

    public void setBilerId(Integer bilerId) {
        this.bilerId = bilerId;
    }

    public String getBilerName() {
        return bilerName;
    }

    public void setBilerName(String bilerName) {
        this.bilerName = bilerName == null ? null : bilerName.trim();
    }

    public Byte getBileType() {
        return bileType;
    }

    public void setBileType(Byte bileType) {
        this.bileType = bileType;
    }

    public Integer getBileNum() {
        return bileNum;
    }

    public void setBileNum(Integer bileNum) {
        this.bileNum = bileNum;
    }

    public Integer getBileHisRate() {
        return bileHisRate;
    }

    public void setBileHisRate(Integer bileHisRate) {
        this.bileHisRate = bileHisRate;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Byte getAdopt() {
        return adopt;
    }

    public void setAdopt(Byte adopt) {
        this.adopt = adopt;
    }
}