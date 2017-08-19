package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdStudentDayCondition implements Serializable {
    /**
     * 学生使用情况
     */
    private Integer id;

    /**
     * 学科id
     */
    private Integer subjectId;

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

    private String year;

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
     * 订正正确率
     */
    private BigDecimal correctRightPro;

    private Integer studentCommentId;

    /**
     * 使用情况诊断
     */
    private String studentComment;

    /**
     * 周练总数
     */
    private Integer practiceTotalNum;

    /**
     * 周练完成数
     */
    private Integer practiceFinishNum;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
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

    public BigDecimal getCorrectRightPro() {
        return correctRightPro;
    }

    public void setCorrectRightPro(BigDecimal correctRightPro) {
        this.correctRightPro = correctRightPro;
    }

    public Integer getStudentCommentId() {
        return studentCommentId;
    }

    public void setStudentCommentId(Integer studentCommentId) {
        this.studentCommentId = studentCommentId;
    }

    public String getStudentComment() {
        return studentComment;
    }

    public void setStudentComment(String studentComment) {
        this.studentComment = studentComment == null ? null : studentComment.trim();
    }

    public Integer getPracticeTotalNum() {
        return practiceTotalNum;
    }

    public void setPracticeTotalNum(Integer practiceTotalNum) {
        this.practiceTotalNum = practiceTotalNum;
    }

    public Integer getPracticeFinishNum() {
        return practiceFinishNum;
    }

    public void setPracticeFinishNum(Integer practiceFinishNum) {
        this.practiceFinishNum = practiceFinishNum;
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
        sb.append(", subjectId=").append(subjectId);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", year=").append(year);
        sb.append(", date=").append(date);
        sb.append(", searchNum=").append(searchNum);
        sb.append(", correctNum=").append(correctNum);
        sb.append(", correctPro=").append(correctPro);
        sb.append(", correctRightPro=").append(correctRightPro);
        sb.append(", studentCommentId=").append(studentCommentId);
        sb.append(", studentComment=").append(studentComment);
        sb.append(", practiceTotalNum=").append(practiceTotalNum);
        sb.append(", practiceFinishNum=").append(practiceFinishNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}