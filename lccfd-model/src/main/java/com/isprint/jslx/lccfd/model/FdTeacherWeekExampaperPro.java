package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdTeacherWeekExampaperPro implements Serializable {
    /**
     * 每周平均得分率
     */
    private Integer id;

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

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date endDate;

    /**
     * 试卷平均得分率（提交试卷学生分数之和/提交学生人数）
     */
    private BigDecimal exampaperAvgPro;

    /**
     * 试卷总分
     */
    private BigDecimal exampaperScore;

    /**
     * 试卷提交数量
     */
    private Integer exampaperNum;

    private Date updateTime;

    private Date createTime;

    /**
     * 科目id
     */
    private Integer subjectId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public BigDecimal getExampaperAvgPro() {
        return exampaperAvgPro;
    }

    public void setExampaperAvgPro(BigDecimal exampaperAvgPro) {
        this.exampaperAvgPro = exampaperAvgPro;
    }

    public BigDecimal getExampaperScore() {
        return exampaperScore;
    }

    public void setExampaperScore(BigDecimal exampaperScore) {
        this.exampaperScore = exampaperScore;
    }

    public Integer getExampaperNum() {
        return exampaperNum;
    }

    public void setExampaperNum(Integer exampaperNum) {
        this.exampaperNum = exampaperNum;
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

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", exampaperAvgPro=").append(exampaperAvgPro);
        sb.append(", exampaperScore=").append(exampaperScore);
        sb.append(", exampaperNum=").append(exampaperNum);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}