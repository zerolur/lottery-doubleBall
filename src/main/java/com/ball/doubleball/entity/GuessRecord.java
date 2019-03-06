package com.ball.doubleball.entity;

import java.util.Date;

public class GuessRecord {
    private Integer id;

    private Integer lotteryNo;

    private String redBallList;

    private Integer blueBall;

    private Byte haveWin;

    private Byte winLevel;

    private Byte type;

    private Date ts;

    private Integer authorId;

    private String authorName;

    private Integer algorithmId;

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

    public String getRedBallList() {
        return redBallList;
    }

    public void setRedBallList(String redBallList) {
        this.redBallList = redBallList == null ? null : redBallList.trim();
    }

    public Integer getBlueBall() {
        return blueBall;
    }

    public void setBlueBall(Integer blueBall) {
        this.blueBall = blueBall;
    }

    public Byte getHaveWin() {
        return haveWin;
    }

    public void setHaveWin(Byte haveWin) {
        this.haveWin = haveWin;
    }

    public Byte getWinLevel() {
        return winLevel;
    }

    public void setWinLevel(Byte winLevel) {
        this.winLevel = winLevel;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public Integer getAlgorithmId() {
        return algorithmId;
    }

    public void setAlgorithmId(Integer algorithmId) {
        this.algorithmId = algorithmId;
    }
}