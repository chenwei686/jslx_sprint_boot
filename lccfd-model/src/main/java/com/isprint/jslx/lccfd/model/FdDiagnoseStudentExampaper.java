package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class FdDiagnoseStudentExampaper implements Serializable {
    /**
     * 个人试卷练习情况诊断
     */
    private Integer id;

    /**
     * 错题数
     */
    private BigDecimal errorNumMin;

    /**
     * 错题数
     */
    private BigDecimal errorNumMax;

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

    private BigDecimal studentLevelMin;

    private BigDecimal studentLevelMax;

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

    public BigDecimal getErrorNumMin() {
        return errorNumMin;
    }

    public void setErrorNumMin(BigDecimal errorNumMin) {
        this.errorNumMin = errorNumMin;
    }

    public BigDecimal getErrorNumMax() {
        return errorNumMax;
    }

    public void setErrorNumMax(BigDecimal errorNumMax) {
        this.errorNumMax = errorNumMax;
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

    public BigDecimal getStudentLevelMin() {
        return studentLevelMin;
    }

    public void setStudentLevelMin(BigDecimal studentLevelMin) {
        this.studentLevelMin = studentLevelMin;
    }

    public BigDecimal getStudentLevelMax() {
        return studentLevelMax;
    }

    public void setStudentLevelMax(BigDecimal studentLevelMax) {
        this.studentLevelMax = studentLevelMax;
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
        sb.append(", errorNumMin=").append(errorNumMin);
        sb.append(", errorNumMax=").append(errorNumMax);
        sb.append(", difficultyProMin=").append(difficultyProMin);
        sb.append(", difficultyProMax=").append(difficultyProMax);
        sb.append(", correctProMin=").append(correctProMin);
        sb.append(", correctProMax=").append(correctProMax);
        sb.append(", studentLevelMin=").append(studentLevelMin);
        sb.append(", studentLevelMax=").append(studentLevelMax);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}