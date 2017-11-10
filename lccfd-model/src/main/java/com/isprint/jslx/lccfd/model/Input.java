package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class Input implements Serializable {
    private String id;

    private String tmid;

    private String inputcode;

    private String basetype;

    private String inputtype;

    private String inputanswer;

    private Double score;

    private Integer order;

    private String inputscore;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTmid() {
        return tmid;
    }

    public void setTmid(String tmid) {
        this.tmid = tmid == null ? null : tmid.trim();
    }

    public String getInputcode() {
        return inputcode;
    }

    public void setInputcode(String inputcode) {
        this.inputcode = inputcode == null ? null : inputcode.trim();
    }

    public String getBasetype() {
        return basetype;
    }

    public void setBasetype(String basetype) {
        this.basetype = basetype == null ? null : basetype.trim();
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype == null ? null : inputtype.trim();
    }

    public String getInputanswer() {
        return inputanswer;
    }

    public void setInputanswer(String inputanswer) {
        this.inputanswer = inputanswer == null ? null : inputanswer.trim();
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

    public String getInputscore() {
        return inputscore;
    }

    public void setInputscore(String inputscore) {
        this.inputscore = inputscore == null ? null : inputscore.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tmid=").append(tmid);
        sb.append(", inputcode=").append(inputcode);
        sb.append(", basetype=").append(basetype);
        sb.append(", inputtype=").append(inputtype);
        sb.append(", inputanswer=").append(inputanswer);
        sb.append(", score=").append(score);
        sb.append(", order=").append(order);
        sb.append(", inputscore=").append(inputscore);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}