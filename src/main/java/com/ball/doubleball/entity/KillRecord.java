package com.ball.doubleball.entity;

import java.util.Date;

public class KillRecord {
    private Integer id;

    private Integer lotteryNo;

    private Integer killerId;

    private String killerName;

    private Byte killType;

    private Integer killNum;

    private Integer killHisRate;

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

    public Integer getKillerId() {
        return killerId;
    }

    public void setKillerId(Integer killerId) {
        this.killerId = killerId;
    }

    public String getKillerName() {
        return killerName;
    }

    public void setKillerName(String killerName) {
        this.killerName = killerName == null ? null : killerName.trim();
    }

    public Byte getKillType() {
        return killType;
    }

    public void setKillType(Byte killType) {
        this.killType = killType;
    }

    public Integer getKillNum() {
        return killNum;
    }

    public void setKillNum(Integer killNum) {
        this.killNum = killNum;
    }

    public Integer getKillHisRate() {
        return killHisRate;
    }

    public void setKillHisRate(Integer killHisRate) {
        this.killHisRate = killHisRate;
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