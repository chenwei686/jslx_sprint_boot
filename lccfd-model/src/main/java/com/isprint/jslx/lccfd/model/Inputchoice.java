package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Inputchoice implements Serializable {
    private String id;

    private String inputid;

    private BigDecimal score;

    private Integer order;

    private String choicecontent;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInputid() {
        return inputid;
    }

    public void setInputid(String inputid) {
        this.inputid = inputid == null ? null : inputid.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getChoicecontent() {
        return choicecontent;
    }

    public void setChoicecontent(String choicecontent) {
        this.choicecontent = choicecontent == null ? null : choicecontent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", inputid=").append(inputid);
        sb.append(", score=").append(score);
        sb.append(", order=").append(order);
        sb.append(", choicecontent=").append(choicecontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}