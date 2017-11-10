package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdStudentExampaperReport implements Serializable {
    private Integer id;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 试卷id
     */
    private Integer exampaperId;

    /**
     * 试卷名称
     */
    private String exampaperName;

    /**
     * 得分
     */
    private BigDecimal score;

    /**
     * 报告结论
     */
    private String report;

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
     * 平均分
     */
    private BigDecimal averageScore;

    /**
     * 超过的人数
     */
    private Integer exceedNum;

    /**
     * 总人数
     */
    private Integer totalNum;

    /**
     * 击败人数比例
     */
    private BigDecimal beatPro;

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

    public Integer getExampaperId() {
        return exampaperId;
    }

    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }

    public String getExampaperName() {
        return exampaperName;
    }

    public void setExampaperName(String exampaperName) {
        this.exampaperName = exampaperName == null ? null : exampaperName.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report == null ? null : report.trim();
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

    public BigDecimal getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(BigDecimal averageScore) {
        this.averageScore = averageScore;
    }

    public Integer getExceedNum() {
        return exceedNum;
    }

    public void setExceedNum(Integer exceedNum) {
        this.exceedNum = exceedNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public BigDecimal getBeatPro() {
        return beatPro;
    }

    public void setBeatPro(BigDecimal beatPro) {
        this.beatPro = beatPro;
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
        sb.append(", exampaperId=").append(exampaperId);
        sb.append(", exampaperName=").append(exampaperName);
        sb.append(", score=").append(score);
        sb.append(", report=").append(report);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", averageScore=").append(averageScore);
        sb.append(", exceedNum=").append(exceedNum);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", beatPro=").append(beatPro);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}