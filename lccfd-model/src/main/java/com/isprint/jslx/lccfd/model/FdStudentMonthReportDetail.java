package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdStudentMonthReportDetail implements Serializable {
    private Integer id;

    private Integer studentId;

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
     * 学校id
     */
    private Integer schoolId;

    /**
     * 年级id
     */
    private Integer gradeId;

    /**
     * 班级id
     */
    private Integer classesId;

    private Integer yearId;

    private BigDecimal difficulty;

    private String difficultyJson;

    /**
     * 知识点题目数（分母）
     */
    private Integer difficultyTotal;

    /**
     * 难度系数（分子）
     */
    private Integer difficultyNumerator;

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

    private Integer studentMonthReportId;

    private Boolean isDel;

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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public BigDecimal getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(BigDecimal difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficultyJson() {
        return difficultyJson;
    }

    public void setDifficultyJson(String difficultyJson) {
        this.difficultyJson = difficultyJson == null ? null : difficultyJson.trim();
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

    public Integer getStudentMonthReportId() {
        return studentMonthReportId;
    }

    public void setStudentMonthReportId(Integer studentMonthReportId) {
        this.studentMonthReportId = studentMonthReportId;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", studentId=").append(studentId);
        sb.append(", knowledgeId=").append(knowledgeId);
        sb.append(", knowledgeName=").append(knowledgeName);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", subjectName=").append(subjectName);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", difficultyJson=").append(difficultyJson);
        sb.append(", difficultyTotal=").append(difficultyTotal);
        sb.append(", difficultyNumerator=").append(difficultyNumerator);
        sb.append(", losepoint=").append(losepoint);
        sb.append(", losepointTotal=").append(losepointTotal);
        sb.append(", losepointError=").append(losepointError);
        sb.append(", type=").append(type);
        sb.append(", studentMonthReportId=").append(studentMonthReportId);
        sb.append(", isDel=").append(isDel);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}