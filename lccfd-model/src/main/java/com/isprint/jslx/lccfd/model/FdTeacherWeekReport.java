package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdTeacherWeekReport implements Serializable {
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

    private Date startTime;

    private Date endTime;

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
     * 诊断id
     */
    private Integer diagnoseClassesId;

    /**
     * 诊断内容
     */
    private String diagnoseClassesContent;

    /**
     * 拍题数预警
     */
    private Integer searchCautionId;

    /**
     * 拍题预警内容
     */
    private String searchCautionContent;

    /**
     * 订正情况预警
     */
    private Integer correctCautionId;

    /**
     * 订正情况内容
     */
    private String correctCautionContent;

    /**
     * 拍题最多题目id
     */
    private String searchMaxTimuId;

    /**
     * 拍题最多拍了次数
     */
    private Integer searchMaxTimuNum;

    /**
     * 拍题前十的学生id （[{"studentId":1,"name":"zhangsan"},{"studentId":2,"name":"lisi"}]）
     */
    private String searchMaxStudent;

    /**
     * 拍题最少的十个学生id（[{"studentId":1,"name":"zhangsan"},{"studentId":2,"name":"lisi"}]）
     */
    private String searchMinStudent;

    /**
     * 订正率前十的学生ids
     */
    private String correctMaxStudent;

    /**
     * 订正率最后的十个学生id
     */
    private String correctMinStudent;

    /**
     * 所教学科
     */
    private Integer parentSubjectId;

    /**
     * 平均拍题数对比基数P
     */
    private BigDecimal searchAvgP;

    /**
     * 难度占比指数对比基数H
     */
    private BigDecimal difficultyProH;

    /**
     * 难度占比指数a
     */
    private BigDecimal difficultyProA;

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

    public Integer getDiagnoseClassesId() {
        return diagnoseClassesId;
    }

    public void setDiagnoseClassesId(Integer diagnoseClassesId) {
        this.diagnoseClassesId = diagnoseClassesId;
    }

    public String getDiagnoseClassesContent() {
        return diagnoseClassesContent;
    }

    public void setDiagnoseClassesContent(String diagnoseClassesContent) {
        this.diagnoseClassesContent = diagnoseClassesContent == null ? null : diagnoseClassesContent.trim();
    }

    public Integer getSearchCautionId() {
        return searchCautionId;
    }

    public void setSearchCautionId(Integer searchCautionId) {
        this.searchCautionId = searchCautionId;
    }

    public String getSearchCautionContent() {
        return searchCautionContent;
    }

    public void setSearchCautionContent(String searchCautionContent) {
        this.searchCautionContent = searchCautionContent == null ? null : searchCautionContent.trim();
    }

    public Integer getCorrectCautionId() {
        return correctCautionId;
    }

    public void setCorrectCautionId(Integer correctCautionId) {
        this.correctCautionId = correctCautionId;
    }

    public String getCorrectCautionContent() {
        return correctCautionContent;
    }

    public void setCorrectCautionContent(String correctCautionContent) {
        this.correctCautionContent = correctCautionContent == null ? null : correctCautionContent.trim();
    }

    public String getSearchMaxTimuId() {
        return searchMaxTimuId;
    }

    public void setSearchMaxTimuId(String searchMaxTimuId) {
        this.searchMaxTimuId = searchMaxTimuId == null ? null : searchMaxTimuId.trim();
    }

    public Integer getSearchMaxTimuNum() {
        return searchMaxTimuNum;
    }

    public void setSearchMaxTimuNum(Integer searchMaxTimuNum) {
        this.searchMaxTimuNum = searchMaxTimuNum;
    }

    public String getSearchMaxStudent() {
        return searchMaxStudent;
    }

    public void setSearchMaxStudent(String searchMaxStudent) {
        this.searchMaxStudent = searchMaxStudent == null ? null : searchMaxStudent.trim();
    }

    public String getSearchMinStudent() {
        return searchMinStudent;
    }

    public void setSearchMinStudent(String searchMinStudent) {
        this.searchMinStudent = searchMinStudent == null ? null : searchMinStudent.trim();
    }

    public String getCorrectMaxStudent() {
        return correctMaxStudent;
    }

    public void setCorrectMaxStudent(String correctMaxStudent) {
        this.correctMaxStudent = correctMaxStudent == null ? null : correctMaxStudent.trim();
    }

    public String getCorrectMinStudent() {
        return correctMinStudent;
    }

    public void setCorrectMinStudent(String correctMinStudent) {
        this.correctMinStudent = correctMinStudent == null ? null : correctMinStudent.trim();
    }

    public Integer getParentSubjectId() {
        return parentSubjectId;
    }

    public void setParentSubjectId(Integer parentSubjectId) {
        this.parentSubjectId = parentSubjectId;
    }

    public BigDecimal getSearchAvgP() {
        return searchAvgP;
    }

    public void setSearchAvgP(BigDecimal searchAvgP) {
        this.searchAvgP = searchAvgP;
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
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
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
        sb.append(", diagnoseClassesId=").append(diagnoseClassesId);
        sb.append(", diagnoseClassesContent=").append(diagnoseClassesContent);
        sb.append(", searchCautionId=").append(searchCautionId);
        sb.append(", searchCautionContent=").append(searchCautionContent);
        sb.append(", correctCautionId=").append(correctCautionId);
        sb.append(", correctCautionContent=").append(correctCautionContent);
        sb.append(", searchMaxTimuId=").append(searchMaxTimuId);
        sb.append(", searchMaxTimuNum=").append(searchMaxTimuNum);
        sb.append(", searchMaxStudent=").append(searchMaxStudent);
        sb.append(", searchMinStudent=").append(searchMinStudent);
        sb.append(", correctMaxStudent=").append(correctMaxStudent);
        sb.append(", correctMinStudent=").append(correctMinStudent);
        sb.append(", parentSubjectId=").append(parentSubjectId);
        sb.append(", searchAvgP=").append(searchAvgP);
        sb.append(", difficultyProH=").append(difficultyProH);
        sb.append(", difficultyProA=").append(difficultyProA);
        sb.append(", exampaperAvgPro=").append(exampaperAvgPro);
        sb.append(", exampaperScore=").append(exampaperScore);
        sb.append(", exampaperTotalScore=").append(exampaperTotalScore);
        sb.append(", exampaperNum=").append(exampaperNum);
        sb.append(", practiceNum=").append(practiceNum);
        sb.append(", practiceFinishNum=").append(practiceFinishNum);
        sb.append(", practiceUnfinishedNum=").append(practiceUnfinishedNum);
        sb.append(", practicePro=").append(practicePro);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}