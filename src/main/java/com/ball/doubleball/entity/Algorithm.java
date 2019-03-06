package com.ball.doubleball.entity;

import java.util.Date;

public class Algorithm {
    private Integer id;

    private String algorithmName;

    private String algorithmDes;

    private Integer algorithmAuthorId;

    private String algorithmAuthorName;

    private Date ts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName == null ? null : algorithmName.trim();
    }

    public String getAlgorithmDes() {
        return algorithmDes;
    }

    public void setAlgorithmDes(String algorithmDes) {
        this.algorithmDes = algorithmDes == null ? null : algorithmDes.trim();
    }

    public Integer getAlgorithmAuthorId() {
        return algorithmAuthorId;
    }

    public void setAlgorithmAuthorId(Integer algorithmAuthorId) {
        this.algorithmAuthorId = algorithmAuthorId;
    }

    public String getAlgorithmAuthorName() {
        return algorithmAuthorName;
    }

    public void setAlgorithmAuthorName(String algorithmAuthorName) {
        this.algorithmAuthorName = algorithmAuthorName == null ? null : algorithmAuthorName.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }
}