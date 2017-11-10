package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdStudentExampaper implements Serializable {
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
     * 试卷状态（0.未开始，1.未完成，2.完成）
     */
    private Byte status;

    /**
     * 总得分
     */
    private BigDecimal score;

    /**
     * 来源（0：试卷推送 1：扫码识卷）
     */
    private Byte source;

    /**
     * 开始答题时间
     */
    private Date startTime;

    /**
     * 结束答题时间
     */
    private Date endTime;

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
     * 分层（0：未分层  1：简单层  2：基础层  3：提升层  4：拔高层）
     */
    private Byte levelId;

    /**
     * 科目id
     */
    private Integer subjectId;

    /**
     * 完成时间
     */
    private Date finishTime;

    private Date createTime;

    /**
     * 发卷对象id
     */
    private Integer exampaperObjectId;

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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public Byte getLevelId() {
        return levelId;
    }

    public void setLevelId(Byte levelId) {
        this.levelId = levelId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getExampaperObjectId() {
        return exampaperObjectId;
    }

    public void setExampaperObjectId(Integer exampaperObjectId) {
        this.exampaperObjectId = exampaperObjectId;
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
        sb.append(", status=").append(status);
        sb.append(", score=").append(score);
        sb.append(", source=").append(source);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", levelId=").append(levelId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", exampaperObjectId=").append(exampaperObjectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}