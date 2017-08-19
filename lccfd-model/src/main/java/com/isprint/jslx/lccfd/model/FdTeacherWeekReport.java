package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdTeacherWeekReport implements Serializable {
    private Integer id;

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
     * 拍题较多的学生ids（显示10名学生）
     */
    private String searchMaxStudentIds;

    /**
     * 拍题较少的学生ids
     */
    private String searchMinStudentIds;

    /**
     * 使用情况评语
     */
    private Integer useCommentId;

    private String useComment;

    /**
     * 新增盲点
     */
    private String blindKnowledge;

    /**
     * 新增弱点
     */
    private String weakKnowledge;

    /**
     * 新增难点
     */
    private String difficultyKnowledge;

    /**
     * 基本功知识点
     */
    private String baseKnowledge;

    /**
     * 优势知识点
     */
    private String meritKnowledge;

    /**
     * 强项知识点
     */
    private String strongKnowledge;

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

    private Date startTime;

    private Date endTime;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSearchMaxStudentIds() {
        return searchMaxStudentIds;
    }

    public void setSearchMaxStudentIds(String searchMaxStudentIds) {
        this.searchMaxStudentIds = searchMaxStudentIds == null ? null : searchMaxStudentIds.trim();
    }

    public String getSearchMinStudentIds() {
        return searchMinStudentIds;
    }

    public void setSearchMinStudentIds(String searchMinStudentIds) {
        this.searchMinStudentIds = searchMinStudentIds == null ? null : searchMinStudentIds.trim();
    }

    public Integer getUseCommentId() {
        return useCommentId;
    }

    public void setUseCommentId(Integer useCommentId) {
        this.useCommentId = useCommentId;
    }

    public String getUseComment() {
        return useComment;
    }

    public void setUseComment(String useComment) {
        this.useComment = useComment == null ? null : useComment.trim();
    }

    public String getBlindKnowledge() {
        return blindKnowledge;
    }

    public void setBlindKnowledge(String blindKnowledge) {
        this.blindKnowledge = blindKnowledge == null ? null : blindKnowledge.trim();
    }

    public String getWeakKnowledge() {
        return weakKnowledge;
    }

    public void setWeakKnowledge(String weakKnowledge) {
        this.weakKnowledge = weakKnowledge == null ? null : weakKnowledge.trim();
    }

    public String getDifficultyKnowledge() {
        return difficultyKnowledge;
    }

    public void setDifficultyKnowledge(String difficultyKnowledge) {
        this.difficultyKnowledge = difficultyKnowledge == null ? null : difficultyKnowledge.trim();
    }

    public String getBaseKnowledge() {
        return baseKnowledge;
    }

    public void setBaseKnowledge(String baseKnowledge) {
        this.baseKnowledge = baseKnowledge == null ? null : baseKnowledge.trim();
    }

    public String getMeritKnowledge() {
        return meritKnowledge;
    }

    public void setMeritKnowledge(String meritKnowledge) {
        this.meritKnowledge = meritKnowledge == null ? null : meritKnowledge.trim();
    }

    public String getStrongKnowledge() {
        return strongKnowledge;
    }

    public void setStrongKnowledge(String strongKnowledge) {
        this.strongKnowledge = strongKnowledge == null ? null : strongKnowledge.trim();
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
        sb.append(", searchNum=").append(searchNum);
        sb.append(", correctNum=").append(correctNum);
        sb.append(", correctNumLast=").append(correctNumLast);
        sb.append(", correctNumTreed=").append(correctNumTreed);
        sb.append(", correctPro=").append(correctPro);
        sb.append(", correctProLast=").append(correctProLast);
        sb.append(", correctProTreed=").append(correctProTreed);
        sb.append(", searchMaxStudentIds=").append(searchMaxStudentIds);
        sb.append(", searchMinStudentIds=").append(searchMinStudentIds);
        sb.append(", useCommentId=").append(useCommentId);
        sb.append(", useComment=").append(useComment);
        sb.append(", blindKnowledge=").append(blindKnowledge);
        sb.append(", weakKnowledge=").append(weakKnowledge);
        sb.append(", difficultyKnowledge=").append(difficultyKnowledge);
        sb.append(", baseKnowledge=").append(baseKnowledge);
        sb.append(", meritKnowledge=").append(meritKnowledge);
        sb.append(", strongKnowledge=").append(strongKnowledge);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", year=").append(year);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}