package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdTeacherWeekExampaperReport implements Serializable {
    private Integer id;

    /**
     * 试卷id
     */
    private Integer exampaperId;

    /**
     * 教师周报id
     */
    private Integer teacherWeekReportId;

    /**
     * 试卷总分
     */
    private BigDecimal exampaperScore;

    /**
     * 试卷平局分
     */
    private BigDecimal exampaperAverageScore;

    /**
     * 最高学生json
     */
    private String exampaperMaxStudent;

    /**
     * 最低学生json
     */
    private String exampaperMinStudent;

    /**
     * 未提交学生json
     */
    private String exampaperUncommitStudent;

    /**
     * 评语
     */
    private String exampaperComment;

    private Integer exampaperCommentId;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExampaperId() {
        return exampaperId;
    }

    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }

    public Integer getTeacherWeekReportId() {
        return teacherWeekReportId;
    }

    public void setTeacherWeekReportId(Integer teacherWeekReportId) {
        this.teacherWeekReportId = teacherWeekReportId;
    }

    public BigDecimal getExampaperScore() {
        return exampaperScore;
    }

    public void setExampaperScore(BigDecimal exampaperScore) {
        this.exampaperScore = exampaperScore;
    }

    public BigDecimal getExampaperAverageScore() {
        return exampaperAverageScore;
    }

    public void setExampaperAverageScore(BigDecimal exampaperAverageScore) {
        this.exampaperAverageScore = exampaperAverageScore;
    }

    public String getExampaperMaxStudent() {
        return exampaperMaxStudent;
    }

    public void setExampaperMaxStudent(String exampaperMaxStudent) {
        this.exampaperMaxStudent = exampaperMaxStudent == null ? null : exampaperMaxStudent.trim();
    }

    public String getExampaperMinStudent() {
        return exampaperMinStudent;
    }

    public void setExampaperMinStudent(String exampaperMinStudent) {
        this.exampaperMinStudent = exampaperMinStudent == null ? null : exampaperMinStudent.trim();
    }

    public String getExampaperUncommitStudent() {
        return exampaperUncommitStudent;
    }

    public void setExampaperUncommitStudent(String exampaperUncommitStudent) {
        this.exampaperUncommitStudent = exampaperUncommitStudent == null ? null : exampaperUncommitStudent.trim();
    }

    public String getExampaperComment() {
        return exampaperComment;
    }

    public void setExampaperComment(String exampaperComment) {
        this.exampaperComment = exampaperComment == null ? null : exampaperComment.trim();
    }

    public Integer getExampaperCommentId() {
        return exampaperCommentId;
    }

    public void setExampaperCommentId(Integer exampaperCommentId) {
        this.exampaperCommentId = exampaperCommentId;
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
        sb.append(", exampaperId=").append(exampaperId);
        sb.append(", teacherWeekReportId=").append(teacherWeekReportId);
        sb.append(", exampaperScore=").append(exampaperScore);
        sb.append(", exampaperAverageScore=").append(exampaperAverageScore);
        sb.append(", exampaperMaxStudent=").append(exampaperMaxStudent);
        sb.append(", exampaperMinStudent=").append(exampaperMinStudent);
        sb.append(", exampaperUncommitStudent=").append(exampaperUncommitStudent);
        sb.append(", exampaperComment=").append(exampaperComment);
        sb.append(", exampaperCommentId=").append(exampaperCommentId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}