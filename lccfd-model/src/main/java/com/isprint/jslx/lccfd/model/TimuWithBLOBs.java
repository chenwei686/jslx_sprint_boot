package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class TimuWithBLOBs extends Timu implements Serializable {
    private String trunk;

    private String analysis;

    private String answer;

    private String comment;

    private String inputid;

    private String parentid;

    private static final long serialVersionUID = 1L;

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk == null ? null : trunk.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getInputid() {
        return inputid;
    }

    public void setInputid(String inputid) {
        this.inputid = inputid == null ? null : inputid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trunk=").append(trunk);
        sb.append(", analysis=").append(analysis);
        sb.append(", answer=").append(answer);
        sb.append(", comment=").append(comment);
        sb.append(", inputid=").append(inputid);
        sb.append(", parentid=").append(parentid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}