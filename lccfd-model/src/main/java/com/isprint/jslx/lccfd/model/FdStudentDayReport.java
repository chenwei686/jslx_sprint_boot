package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdStudentDayReport implements Serializable {
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
     * 搜题数
     */
    private Integer searchNum;

    /**
     * 订正题目数
     */
    private Integer correctNum;

    /**
     * 上次的订正题目数
     */
    private Integer correctNumLast;

    /**
     * 趋势（-1：下降 0：不显示趋势 1：上升）
     */
    private Byte correctNumTreed;

    /**
     * 订正率(订正率 = 订正题目数 / 拍题总数)
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

    /**
     * 上次的击败人数比例
     */
    private BigDecimal beatProLast;

    /**
     * 趋势（-1：下降 0：不显示趋势 1：上升）
     */
    private Byte beatProTreed;

    /**
     * 日报日期
     */
    private Date date;

    /**
     * 周几
     */
    private Byte week;

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

    public Integer getCorrectNumLast() {
        return correctNumLast;
    }

    public void setCorrectNumLast(Integer correctNumLast) {
        this.correctNumLast = correctNumLast;
    }

    public Byte getCorrectNumTreed() {
        return correctNumTreed;
    }

    public void setCorrectNumTreed(Byte correctNumTreed) {
        this.correctNumTreed = correctNumTreed;
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

    public BigDecimal getBeatProLast() {
        return beatProLast;
    }

    public void setBeatProLast(BigDecimal beatProLast) {
        this.beatProLast = beatProLast;
    }

    public Byte getBeatProTreed() {
        return beatProTreed;
    }

    public void setBeatProTreed(Byte beatProTreed) {
        this.beatProTreed = beatProTreed;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Byte getWeek() {
        return week;
    }

    public void setWeek(Byte week) {
        this.week = week;
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
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", searchNum=").append(searchNum);
        sb.append(", correctNum=").append(correctNum);
        sb.append(", correctNumLast=").append(correctNumLast);
        sb.append(", correctNumTreed=").append(correctNumTreed);
        sb.append(", correctPro=").append(correctPro);
        sb.append(", correctProLast=").append(correctProLast);
        sb.append(", correctProTreed=").append(correctProTreed);
        sb.append(", exceedNum=").append(exceedNum);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", beatPro=").append(beatPro);
        sb.append(", beatProLast=").append(beatProLast);
        sb.append(", beatProTreed=").append(beatProTreed);
        sb.append(", date=").append(date);
        sb.append(", week=").append(week);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}