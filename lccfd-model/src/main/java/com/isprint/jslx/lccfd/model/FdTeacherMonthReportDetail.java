package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdTeacherMonthReportDetail implements Serializable {
    /**
     * 教师月报知识点诊断
     */
    private Integer id;

    /**
     * 知识点id
     */
    private Integer knowledgeId;

    /**
     * 知识点名称
     */
    private String knowledgeName;

    /**
     * 科目id
     */
    private Integer subjectId;

    /**
     * 科目名称
     */
    private String subjectName;

    /**
     * 班级id
     */
    private Integer classesId;

    private BigDecimal difficulty;

    /**
     * 知识点题目数（分母）
     */
    private Integer difficultyTotal;

    /**
     * 难度系数（分子）
     */
    private Integer difficultyNumerator;

    private String difficultyJson;

    private BigDecimal losepoint;

    /**
     * 总题数
     */
    private Integer losepointTotal;

    /**
     * 错题数
     */
    private Integer losepointError;

    /**
     * 知识点类型（1：盲点  2：弱点  3：难点  4：基本功 5：优势  6：强项）
     */
    private Byte type;

    private Boolean isDel;

    /**
     * 月份
     */
    private String month;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date endDate;

    private Date updateTime;

    private Date createTime;

    /**
     * 所教学科
     */
    private Integer parentSubjectId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName == null ? null : knowledgeName.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    public BigDecimal getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BigDecimal difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getDifficultyTotal() {
        return difficultyTotal;
    }

    public void setDifficultyTotal(Integer difficultyTotal) {
        this.difficultyTotal = difficultyTotal;
    }

    public Integer getDifficultyNumerator() {
        return difficultyNumerator;
    }

    public void setDifficultyNumerator(Integer difficultyNumerator) {
        this.difficultyNumerator = difficultyNumerator;
    }

    public String getDifficultyJson() {
        return difficultyJson;
    }

    public void setDifficultyJson(String difficultyJson) {
        this.difficultyJson = difficultyJson == null ? null : difficultyJson.trim();
    }

    public BigDecimal getLosepoint() {
        return losepoint;
    }

    public void setLosepoint(BigDecimal losepoint) {
        this.losepoint = losepoint;
    }

    public Integer getLosepointTotal() {
        return losepointTotal;
    }

    public void setLosepointTotal(Integer losepointTotal) {
        this.losepointTotal = losepointTotal;
    }

    public Integer getLosepointError() {
        return losepointError;
    }

    public void setLosepointError(Integer losepointError) {
        this.losepointError = losepointError;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getParentSubjectId() {
        return parentSubjectId;
    }

    public void setParentSubjectId(Integer parentSubjectId) {
        this.parentSubjectId = parentSubjectId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", knowledgeId=").append(knowledgeId);
        sb.append(", knowledgeName=").append(knowledgeName);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", subjectName=").append(subjectName);
        sb.append(", classesId=").append(classesId);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", difficultyTotal=").append(difficultyTotal);
        sb.append(", difficultyNumerator=").append(difficultyNumerator);
        sb.append(", difficultyJson=").append(difficultyJson);
        sb.append(", losepoint=").append(losepoint);
        sb.append(", losepointTotal=").append(losepointTotal);
        sb.append(", losepointError=").append(losepointError);
        sb.append(", type=").append(type);
        sb.append(", isDel=").append(isDel);
        sb.append(", month=").append(month);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", parentSubjectId=").append(parentSubjectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}