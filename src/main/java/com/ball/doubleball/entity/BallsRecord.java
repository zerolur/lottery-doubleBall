package com.ball.doubleball.entity;

import java.util.Date;

public class BallsRecord {
    private Integer id;

    private Integer parentId;

    private Byte ballType;

    private Byte forecastType;

    private Integer ballCount;

    private Integer ballNumber;

    private Integer hisRate;

    private Byte adopt;

    private Date ts;

    private Integer authorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getBallType() {
        return ballType;
    }

    public void setBallType(Byte ballType) {
        this.ballType = ballType;
    }

    public Byte getForecastType() {
        return forecastType;
    }

    public void setForecastType(Byte forecastType) {
        this.forecastType = forecastType;
    }

    public Integer getBallCount() {
        return ballCount;
    }

    public void setBallCount(Integer ballCount) {
        this.ballCount = ballCount;
    }

    public Integer getBallNumber() {
        return ballNumber;
    }

    public void setBallNumber(Integer ballNumber) {
        this.ballNumber = ballNumber;
    }

    public Integer getHisRate() {
        return hisRate;
    }

    public void setHisRate(Integer hisRate) {
        this.hisRate = hisRate;
    }

    public Byte getAdopt() {
        return adopt;
    }

    public void setAdopt(Byte adopt) {
        this.adopt = adopt;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}