package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdStudentUseDetail implements Serializable {
    /**
     * 学生使用情况详情
     */
    private Integer id;

    /**
     * 学生id
     */
    private Integer studentId;

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
     * 科目的id
     */
    private Integer subjectId;

    /**
     * 所教学科
     */
    private Integer parentSubjectId;

    /**
     * 日报的日期
     */
    private Date date;

    /**
     * 搜题数
     */
    private Integer searchNum;

    /**
     * 订正题目数
     */
    private Integer correctNum;

    /**
     * 订正率(订正率 = 订正题目数 / 拍题总数)
     */
    private BigDecimal correctPro;

    /**
     * 订正正确次数
     */
    private Integer correctRightNum;

    /**
     * 订正正确率(订正正确数 / 订正总数)
     */
    private BigDecimal correctRightPro;

    /**
     * 周练总数
     */
    private Integer practiceNum;

    /**
     * 周练完成数
     */
    private Integer practiceFinishNum;

    /**
     * 周练完成率
     */
    private BigDecimal practiceFinishPro;

    private Date updateTime;

    private Date createTime;

    /**
     * 拍提数班级排名
     */
    private Integer searchNumRanking;

    /**
     * 班级总人数
     */
    private Integer totalNumber;

    /**
     * 拍题占比
     */
    private BigDecimal searchNumPro;

    /**
     * 难度系数
     */
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

    private Integer diagnoseStudentId;

    /**
     * 内容
     */
    private String diagnoseStudentContent;

    /**
     * 难度占比指数对比基数H
     */
    private BigDecimal difficultyProH;

    /**
     * 订正正确次数
     */
    private Integer correctRightTotalNum;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(Integer searchNum) {
        this.searchNum = searchNum;
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

    public Integer getCorrectRightNum() {
        return correctRightNum;
    }

    public void setCorrectRightNum(Integer correctRightNum) {
        this.correctRightNum = correctRightNum;
    }

    public BigDecimal getCorrectRightPro() {
        return correctRightPro;
    }

    public void setCorrectRightPro(BigDecimal correctRightPro) {
        this.correctRightPro = correctRightPro;
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

    public BigDecimal getPracticeFinishPro() {
        return practiceFinishPro;
    }

    public void setPracticeFinishPro(BigDecimal practiceFinishPro) {
        this.practiceFinishPro = practiceFinishPro;
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

    public Integer getSearchNumRanking() {
        return searchNumRanking;
    }

    public void setSearchNumRanking(Integer searchNumRanking) {
        this.searchNumRanking = searchNumRanking;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public BigDecimal getSearchNumPro() {
        return searchNumPro;
    }

    public void setSearchNumPro(BigDecimal searchNumPro) {
        this.searchNumPro = searchNumPro;
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

    public Integer getDiagnoseStudentId() {
        return diagnoseStudentId;
    }

    public void setDiagnoseStudentId(Integer diagnoseStudentId) {
        this.diagnoseStudentId = diagnoseStudentId;
    }

    public String getDiagnoseStudentContent() {
        return diagnoseStudentContent;
    }

    public void setDiagnoseStudentContent(String diagnoseStudentContent) {
        this.diagnoseStudentContent = diagnoseStudentContent == null ? null : diagnoseStudentContent.trim();
    }

    public BigDecimal getDifficultyProH() {
        return difficultyProH;
    }

    public void setDifficultyProH(BigDecimal difficultyProH) {
        this.difficultyProH = difficultyProH;
    }

    public Integer getCorrectRightTotalNum() {
        return correctRightTotalNum;
    }

    public void setCorrectRightTotalNum(Integer correctRightTotalNum) {
        this.correctRightTotalNum = correctRightTotalNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", studentId=").append(studentId);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", parentSubjectId=").append(parentSubjectId);
        sb.append(", date=").append(date);
        sb.append(", searchNum=").append(searchNum);
        sb.append(", correctNum=").append(correctNum);
        sb.append(", correctPro=").append(correctPro);
        sb.append(", correctRightNum=").append(correctRightNum);
        sb.append(", correctRightPro=").append(correctRightPro);
        sb.append(", practiceNum=").append(practiceNum);
        sb.append(", practiceFinishNum=").append(practiceFinishNum);
        sb.append(", practiceFinishPro=").append(practiceFinishPro);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", searchNumRanking=").append(searchNumRanking);
        sb.append(", totalNumber=").append(totalNumber);
        sb.append(", searchNumPro=").append(searchNumPro);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", difficultyTotal=").append(difficultyTotal);
        sb.append(", difficultyNumerator=").append(difficultyNumerator);
        sb.append(", difficultyJson=").append(difficultyJson);
        sb.append(", diagnoseStudentId=").append(diagnoseStudentId);
        sb.append(", diagnoseStudentContent=").append(diagnoseStudentContent);
        sb.append(", difficultyProH=").append(difficultyProH);
        sb.append(", correctRightTotalNum=").append(correctRightTotalNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}