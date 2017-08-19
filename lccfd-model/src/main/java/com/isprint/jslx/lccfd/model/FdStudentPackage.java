package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentPackage implements Serializable {
    /**
     * 学生套餐表
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

    /**
     * 入学年份
     */
    private String year;

    /**
     * 学生订单id
     */
    private Long studentOrderId;

    /**
     * 套餐名称
     */
    private String name;

    /**
     * 套餐类型
     */
    private Integer packageTypeId;

    /**
     * 套餐id
     */
    private Integer packegeId;

    /**
     * 时间类型
     */
    private String timeType;

    /**
     * 时间（几天、几个月、几年）
     */
    private Integer time;

    /**
     * 系统
     */
    private String system;

    private String subjectIds;

    private String subjectNames;

    private Date startTime;

    private Date endTime;

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

    public Long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(Long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPackageTypeId() {
        return packageTypeId;
    }

    public void setPackageTypeId(Integer packageTypeId) {
        this.packageTypeId = packageTypeId;
    }

    public Integer getPackegeId() {
        return packegeId;
    }

    public void setPackegeId(Integer packegeId) {
        this.packegeId = packegeId;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType == null ? null : timeType.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getSubjectIds() {
        return subjectIds;
    }

    public void setSubjectIds(String subjectIds) {
        this.subjectIds = subjectIds == null ? null : subjectIds.trim();
    }

    public String getSubjectNames() {
        return subjectNames;
    }

    public void setSubjectNames(String subjectNames) {
        this.subjectNames = subjectNames == null ? null : subjectNames.trim();
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
        sb.append(", studentOrderId=").append(studentOrderId);
        sb.append(", name=").append(name);
        sb.append(", packageTypeId=").append(packageTypeId);
        sb.append(", packegeId=").append(packegeId);
        sb.append(", timeType=").append(timeType);
        sb.append(", time=").append(time);
        sb.append(", system=").append(system);
        sb.append(", subjectIds=").append(subjectIds);
        sb.append(", subjectNames=").append(subjectNames);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}