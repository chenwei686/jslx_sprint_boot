package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentDaySearch implements Serializable {
    /**
     * 学生每日拍题情况
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

    private Integer timuId;

    /**
     * 拍题人数
     */
    private Integer searchNum;

    /**
     * 观看视频人数
     */
    private Integer studentVideoNum;

    /**
     * 播放视频数
     */
    private Integer playVideoNum;

    private String studentIds;

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

    public Integer getTimuId() {
        return timuId;
    }

    public void setTimuId(Integer timuId) {
        this.timuId = timuId;
    }

    public Integer getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(Integer searchNum) {
        this.searchNum = searchNum;
    }

    public Integer getStudentVideoNum() {
        return studentVideoNum;
    }

    public void setStudentVideoNum(Integer studentVideoNum) {
        this.studentVideoNum = studentVideoNum;
    }

    public Integer getPlayVideoNum() {
        return playVideoNum;
    }

    public void setPlayVideoNum(Integer playVideoNum) {
        this.playVideoNum = playVideoNum;
    }

    public String getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(String studentIds) {
        this.studentIds = studentIds == null ? null : studentIds.trim();
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
        sb.append(", timuId=").append(timuId);
        sb.append(", searchNum=").append(searchNum);
        sb.append(", studentVideoNum=").append(studentVideoNum);
        sb.append(", playVideoNum=").append(playVideoNum);
        sb.append(", studentIds=").append(studentIds);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}