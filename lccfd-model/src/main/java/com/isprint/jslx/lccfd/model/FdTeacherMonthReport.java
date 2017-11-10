package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdTeacherMonthReport implements Serializable {
    private Integer id;

    /**
     * 年级id
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
     * 所教学科
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
     * 月份
     */
    private String month;

    /**
     * 拍题总数
     */
    private Integer searchNum;

    /**
     * 学生人数
     */
    private Integer studentNum;

    /**
     * 拍题平均数(学生拍题总数/学生人数）
     */
    private Integer searchAvg;

    /**
     * 本校排名
     */
    private Integer searchAvgRanking;

    /**
     * 上次平均拍提数
     */
    private Integer searchAvgLast;

    /**
     * 趋势（-1：下降 0：不显示趋势 1：上升）
     */
    private Byte searchAvgTreed;

    /**
     * 拍题订正题目总数
     */
    private Integer correctNum;

    /**
     * 订正率(订正率 = 学生拍题订正题目总数 / 学生拍题总数)
     */
    private BigDecimal correctPro;

    /**
     * 上次的订正率(订正率 = 订正题目数 / 拍题总数)
     */
    private BigDecimal correctProLast;

    /**
     * 趋势（-1：下降 0：不显示趋势 1：上升）
     */
    private Byte correctProTreed;

    /**
     * 订正率本校排名
     */
    private Integer correctProRanking;

    /**
     * 试卷平均得分率（提交试卷学生分数之和/提交学生人数）
     */
    private BigDecimal exampaperAvgPro;

    /**
     * 试卷总得分
     */
    private BigDecimal exampaperScore;

    /**
     * 试卷总分
     */
    private BigDecimal exampaperTotalScore;

    /**
     * 试卷提交数量
     */
    private Integer exampaperNum;

    /**
     * 上次每周一练平均完成率
     */
    private BigDecimal exampaperAvgProLast;

    private Integer exampaperAvgProRanking;

    /**
     * 趋势（-1：下降 0：不显示趋势 1：上升）
     */
    private Byte exampaperAvgProTreed;

    /**
     * 每周一练推送 总人数
     */
    private Integer practiceNum;

    /**
     * 每周一练完成人数
     */
    private Integer practiceFinishNum;

    /**
     * 每周一练完成人数
     */
    private Integer practiceUnfinishedNum;

    /**
     * 每周一练平均完成率
     */
    private BigDecimal practicePro;

    /**
     * 上次每周一练平均完成率
     */
    private BigDecimal practiceProLast;

    /**
     * 趋势（-1：下降 0：不显示趋势 1：上升）
     */
    private Byte practiceProTreed;

    /**
     * 每周一练平均完成率排名
     */
    private Integer practiceProRenking;

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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public Integer getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(Integer searchNum) {
        this.searchNum = searchNum;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public Integer getSearchAvg() {
        return searchAvg;
    }

    public void setSearchAvg(Integer searchAvg) {
        this.searchAvg = searchAvg;
    }

    public Integer getSearchAvgRanking() {
        return searchAvgRanking;
    }

    public void setSearchAvgRanking(Integer searchAvgRanking) {
        this.searchAvgRanking = searchAvgRanking;
    }

    public Integer getSearchAvgLast() {
        return searchAvgLast;
    }

    public void setSearchAvgLast(Integer searchAvgLast) {
        this.searchAvgLast = searchAvgLast;
    }

    public Byte getSearchAvgTreed() {
        return searchAvgTreed;
    }

    public void setSearchAvgTreed(Byte searchAvgTreed) {
        this.searchAvgTreed = searchAvgTreed;
    }

    public Integer getCorrectNum() {
        return correctNum;
    }

    public void setCorrectNum(Integer correctNum) {
        this.correctNum = correctNum;
    }

    public BigDecimal getCorrectPro() {
        return correctPro;
    }

    public void setCorrectPro(BigDecimal correctPro) {
        this.correctPro = correctPro;
    }

    public BigDecimal getCorrectProLast() {
        return correctProLast;
    }

    public void setCorrectProLast(BigDecimal correctProLast) {
        this.correctProLast = correctProLast;
    }

    public Byte getCorrectProTreed() {
        return correctProTreed;
    }

    public void setCorrectProTreed(Byte correctProTreed) {
        this.correctProTreed = correctProTreed;
    }

    public Integer getCorrectProRanking() {
        return correctProRanking;
    }

    public void setCorrectProRanking(Integer correctProRanking) {
        this.correctProRanking = correctProRanking;
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

    public BigDecimal getExampaperTotalScore() {
        return exampaperTotalScore;
    }

    public void setExampaperTotalScore(BigDecimal exampaperTotalScore) {
        this.exampaperTotalScore = exampaperTotalScore;
    }

    public Integer getExampaperNum() {
        return exampaperNum;
    }

    public void setExampaperNum(Integer exampaperNum) {
        this.exampaperNum = exampaperNum;
    }

    public BigDecimal getExampaperAvgProLast() {
        return exampaperAvgProLast;
    }

    public void setExampaperAvgProLast(BigDecimal exampaperAvgProLast) {
        this.exampaperAvgProLast = exampaperAvgProLast;
    }

    public Integer getExampaperAvgProRanking() {
        return exampaperAvgProRanking;
    }

    public void setExampaperAvgProRanking(Integer exampaperAvgProRanking) {
        this.exampaperAvgProRanking = exampaperAvgProRanking;
    }

    public Byte getExampaperAvgProTreed() {
        return exampaperAvgProTreed;
    }

    public void setExampaperAvgProTreed(Byte exampaperAvgProTreed) {
        this.exampaperAvgProTreed = exampaperAvgProTreed;
    }

    public Integer getPracticeNum() {
        return practiceNum;
    }

    public void setPracticeNum(Integer practiceNum) {
        this.practiceNum = practiceNum;
    }

    public Integer getPracticeFinishNum() {
        return practiceFinishNum;
    }

    public void setPracticeFinishNum(Integer practiceFinishNum) {
        this.practiceFinishNum = practiceFinishNum;
    }

    public Integer getPracticeUnfinishedNum() {
        return practiceUnfinishedNum;
    }

    public void setPracticeUnfinishedNum(Integer practiceUnfinishedNum) {
        this.practiceUnfinishedNum = practiceUnfinishedNum;
    }

    public BigDecimal getPracticePro() {
        return practicePro;
    }

    public void setPracticePro(BigDecimal practicePro) {
        this.practicePro = practicePro;
    }

    public BigDecimal getPracticeProLast() {
        return practiceProLast;
    }

    public void setPracticeProLast(BigDecimal practiceProLast) {
        this.practiceProLast = practiceProLast;
    }

    public Byte getPracticeProTreed() {
        return practiceProTreed;
    }

    public void setPracticeProTreed(Byte practiceProTreed) {
        this.practiceProTreed = practiceProTreed;
    }

    public Integer getPracticeProRenking() {
        return practiceProRenking;
    }

    public void setPracticeProRenking(Integer practiceProRenking) {
        this.practiceProRenking = practiceProRenking;
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
        sb.append(", month=").append(month);
        sb.append(", searchNum=").append(searchNum);
        sb.append(", studentNum=").append(studentNum);
        sb.append(", searchAvg=").append(searchAvg);
        sb.append(", searchAvgRanking=").append(searchAvgRanking);
        sb.append(", searchAvgLast=").append(searchAvgLast);
        sb.append(", searchAvgTreed=").append(searchAvgTreed);
        sb.append(", correctNum=").append(correctNum);
        sb.append(", correctPro=").append(correctPro);
        sb.append(", correctProLast=").append(correctProLast);
        sb.append(", correctProTreed=").append(correctProTreed);
        sb.append(", correctProRanking=").append(correctProRanking);
        sb.append(", exampaperAvgPro=").append(exampaperAvgPro);
        sb.append(", exampaperScore=").append(exampaperScore);
        sb.append(", exampaperTotalScore=").append(exampaperTotalScore);
        sb.append(", exampaperNum=").append(exampaperNum);
        sb.append(", exampaperAvgProLast=").append(exampaperAvgProLast);
        sb.append(", exampaperAvgProRanking=").append(exampaperAvgProRanking);
        sb.append(", exampaperAvgProTreed=").append(exampaperAvgProTreed);
        sb.append(", practiceNum=").append(practiceNum);
        sb.append(", practiceFinishNum=").append(practiceFinishNum);
        sb.append(", practiceUnfinishedNum=").append(practiceUnfinishedNum);
        sb.append(", practicePro=").append(practicePro);
        sb.append(", practiceProLast=").append(practiceProLast);
        sb.append(", practiceProTreed=").append(practiceProTreed);
        sb.append(", practiceProRenking=").append(practiceProRenking);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}