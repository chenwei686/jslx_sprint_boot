package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class Inputchoice implements Serializable {
    private String inputid;

    private Double score;

    private Integer order;

    private static final long serialVersionUID = 1L;

    public String getInputid() {
        return inputid;
    }

    public void setInputid(String inputid) {
        this.inputid = inputid == null ? null : inputid.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inputid=").append(inputid);
        sb.append(", score=").append(score);
        sb.append(", order=").append(order);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}