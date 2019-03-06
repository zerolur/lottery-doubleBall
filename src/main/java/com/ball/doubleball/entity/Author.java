package com.ball.doubleball.entity;

import java.util.Date;

public class Author {
    private Integer id;

    private String name;

    private Integer sourceId;

    private String sourceName;

    private Date ts;

    private Byte pullBlack;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Byte getPullBlack() {
        return pullBlack;
    }

    public void setPullBlack(Byte pullBlack) {
        this.pullBlack = pullBlack;
    }
}