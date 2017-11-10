package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class BaseTimuDetailWithBLOBs extends BaseTimuDetail implements Serializable {
    /**
     * 题干
     */
    private String trunk;

    /**
     * 解析
     */
    private String analysis;

    /**
     * 解答
     */
    private String answer;

    /**
     * 点评
     */
    private String comment;

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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}