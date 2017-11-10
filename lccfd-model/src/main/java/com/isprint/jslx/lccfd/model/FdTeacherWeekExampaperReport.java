package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdTeacherWeekExampaperReport implements Serializable {
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
     * 科目id
     */
    private Integer subjectId;

    /**
     * 所教学科
     */
    private Integer parentSubjectId;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date endDate;

    /**
     * 试卷id
     */
    private Integer exampaperId;

    /**
     * 试卷名称
     */
    private String exampaperName;

    /**
     * 试卷学生总分
     */
    private BigDecimal exampaperTotalScore;

    /**
     * 试卷提交数量
     */
    private Integer studentExampaperNum;

    /**
     * 试卷总分
     */
    private BigDecimal studentExampaperTotalScore;

    /**
     * 试卷平均分
     */
    private Integer studentExampaperScoreAvg;

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

    /**
     * 错题数
     */
    private BigDecimal errorNum;

    /**
     * 错题数对比基数R
     */
    private BigDecimal errorNumR;

    /**
     * 难度占比指数对比基数H
     */
    private BigDecimal difficultyProH;

    /**
     * 难度占比指数a
     */
    private BigDecimal difficultyProA;

    private Date updateTime;

    private Date createTime;

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

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getParentSubjectId() {
        return parentSubjectId;
    }

    public void setParentSubjectId(Integer parentSubjectId) {
        this.parentSubjectId = parentSubjectId;
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

    public BigDecimal getExampaperTotalScore() {
        return exampaperTotalScore;
    }

    public void setExampaperTotalScore(BigDecimal exampaperTotalScore) {
        this.exampaperTotalScore = exampaperTotalScore;
    }

    public Integer getStudentExampaperNum() {
        return studentExampaperNum;
    }

    public void setStudentExampaperNum(Integer studentExampaperNum) {
        this.studentExampaperNum = studentExampaperNum;
    }

    public BigDecimal getStudentExampaperTotalScore() {
        return studentExampaperTotalScore;
    }

    public void setStudentExampaperTotalScore(BigDecimal studentExampaperTotalScore) {
        this.studentExampaperTotalScore = studentExampaperTotalScore;
    }

    public Integer getStudentExampaperScoreAvg() {
        return studentExampaperScoreAvg;
    }

    public void setStudentExampaperScoreAvg(Integer studentExampaperScoreAvg) {
        this.studentExampaperScoreAvg = studentExampaperScoreAvg;
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

    public BigDecimal getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(BigDecimal errorNum) {
        this.errorNum = errorNum;
    }

    public BigDecimal getErrorNumR() {
        return errorNumR;
    }

    public void setErrorNumR(BigDecimal errorNumR) {
        this.errorNumR = errorNumR;
    }

    public BigDecimal getDifficultyProH() {
        return difficultyProH;
    }

    public void setDifficultyProH(BigDecimal difficultyProH) {
        this.difficultyProH = difficultyProH;
    }

    public BigDecimal getDifficultyProA() {
        return difficultyProA;
    }

    public void setDifficultyProA(BigDecimal difficultyProA) {
        this.difficultyProA = difficultyProA;
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
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", parentSubjectId=").append(parentSubjectId);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", exampaperId=").append(exampaperId);
        sb.append(", exampaperName=").append(exampaperName);
        sb.append(", exampaperTotalScore=").append(exampaperTotalScore);
        sb.append(", studentExampaperNum=").append(studentExampaperNum);
        sb.append(", studentExampaperTotalScore=").append(studentExampaperTotalScore);
        sb.append(", studentExampaperScoreAvg=").append(studentExampaperScoreAvg);
        sb.append(", exampaperMaxStudent=").append(exampaperMaxStudent);
        sb.append(", exampaperMinStudent=").append(exampaperMinStudent);
        sb.append(", exampaperUncommitStudent=").append(exampaperUncommitStudent);
        sb.append(", exampaperComment=").append(exampaperComment);
        sb.append(", exampaperCommentId=").append(exampaperCommentId);
        sb.append(", errorNum=").append(errorNum);
        sb.append(", errorNumR=").append(errorNumR);
        sb.append(", difficultyProH=").append(difficultyProH);
        sb.append(", difficultyProA=").append(difficultyProA);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}