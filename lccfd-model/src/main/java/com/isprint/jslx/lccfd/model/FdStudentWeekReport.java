package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdStudentWeekReport implements Serializable {
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

    private String year;

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
     * 观看视频时长（秒）
     */
    private Integer videoTime;

    /**
     * 上次观看视频时长（秒）
     */
    private Integer videoTimeLast;

    /**
     * 趋势（-1：下降 0：不显示趋势 1：上升）
     */
    private Byte videoTimeTreed;

    /**
     * 观看视频时长排名
     */
    private Integer videoTimeRanking;

    /**
     * 观看视频时长排名
     */
    private Integer videoTimeRankingLast;

    /**
     * 趋势（-1：下降 0：不显示趋势 1：上升）
     */
    private Byte videoTimeRankingTreed;

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
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

    public Integer getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(Integer videoTime) {
        this.videoTime = videoTime;
    }

    public Integer getVideoTimeLast() {
        return videoTimeLast;
    }

    public void setVideoTimeLast(Integer videoTimeLast) {
        this.videoTimeLast = videoTimeLast;
    }

    public Byte getVideoTimeTreed() {
        return videoTimeTreed;
    }

    public void setVideoTimeTreed(Byte videoTimeTreed) {
        this.videoTimeTreed = videoTimeTreed;
    }

    public Integer getVideoTimeRanking() {
        return videoTimeRanking;
    }

    public void setVideoTimeRanking(Integer videoTimeRanking) {
        this.videoTimeRanking = videoTimeRanking;
    }

    public Integer getVideoTimeRankingLast() {
        return videoTimeRankingLast;
    }

    public void setVideoTimeRankingLast(Integer videoTimeRankingLast) {
        this.videoTimeRankingLast = videoTimeRankingLast;
    }

    public Byte getVideoTimeRankingTreed() {
        return videoTimeRankingTreed;
    }

    public void setVideoTimeRankingTreed(Byte videoTimeRankingTreed) {
        this.videoTimeRankingTreed = videoTimeRankingTreed;
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
        sb.append(", year=").append(year);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", month=").append(month);
        sb.append(", videoTime=").append(videoTime);
        sb.append(", videoTimeLast=").append(videoTimeLast);
        sb.append(", videoTimeTreed=").append(videoTimeTreed);
        sb.append(", videoTimeRanking=").append(videoTimeRanking);
        sb.append(", videoTimeRankingLast=").append(videoTimeRankingLast);
        sb.append(", videoTimeRankingTreed=").append(videoTimeRankingTreed);
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
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}