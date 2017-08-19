package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class FdDiagnoseStudent implements Serializable {
    /**
     * 个人使用情况诊断
     */
    private Integer id;

    /**
     * 难度占比指数
     */
    private BigDecimal difficultyProMin;

    /**
     * 难度占比指数
     */
    private BigDecimal difficultyProMax;

    /**
     * 订正率
     */
    private BigDecimal correctProMin;

    /**
     * 订正率
     */
    private BigDecimal correctProMax;

    /**
     * 拍题占比
     */
    private BigDecimal searchProMin;

    /**
     * 拍题占比
     */
    private BigDecimal searchProMax;

    /**
     * 内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getDifficultyProMin() {
        return difficultyProMin;
    }

    public void setDifficultyProMin(BigDecimal difficultyProMin) {
        this.difficultyProMin = difficultyProMin;
    }

    public BigDecimal getDifficultyProMax() {
        return difficultyProMax;
    }

    public void setDifficultyProMax(BigDecimal difficultyProMax) {
        this.difficultyProMax = difficultyProMax;
    }

    public BigDecimal getCorrectProMin() {
        return correctProMin;
    }

    public void setCorrectProMin(BigDecimal correctProMin) {
        this.correctProMin = correctProMin;
    }

    public BigDecimal getCorrectProMax() {
        return correctProMax;
    }

    public void setCorrectProMax(BigDecimal correctProMax) {
        this.correctProMax = correctProMax;
    }

    public BigDecimal getSearchProMin() {
        return searchProMin;
    }

    public void setSearchProMin(BigDecimal searchProMin) {
        this.searchProMin = searchProMin;
    }

    public BigDecimal getSearchProMax() {
        return searchProMax;
    }

    public void setSearchProMax(BigDecimal searchProMax) {
        this.searchProMax = searchProMax;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", difficultyProMin=").append(difficultyProMin);
        sb.append(", difficultyProMax=").append(difficultyProMax);
        sb.append(", correctProMin=").append(correctProMin);
        sb.append(", correctProMax=").append(correctProMax);
        sb.append(", searchProMin=").append(searchProMin);
        sb.append(", searchProMax=").append(searchProMax);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}