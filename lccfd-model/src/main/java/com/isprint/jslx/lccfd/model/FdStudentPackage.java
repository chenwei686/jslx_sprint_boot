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
    private Integer yearId;

    /**
     * 学生订单id
     */
    private Long studentOrderId;

    /**
     * 套餐名称
     */
    private String name;

    /**
     * 套餐id
     */
    private Integer packegeId;

    /**
     * 套餐类型
     */
    private Integer packageTypeId;

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

    private Integer subjectId;

    private String subjectName;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    /**
     * system：系统套餐不在客户端显示  online：在客户端显示
     */
    private String packageType;

    private Date updateTime;

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

    public Integer getPackegeId() {
        return packegeId;
    }

    public void setPackegeId(Integer packegeId) {
        this.packegeId = packegeId;
    }

    public Integer getPackageTypeId() {
        return packageTypeId;
    }

    public void setPackageTypeId(Integer packageTypeId) {
        this.packageTypeId = packageTypeId;
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

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
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

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType == null ? null : packageType.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        sb.append(", studentOrderId=").append(studentOrderId);
        sb.append(", name=").append(name);
        sb.append(", packegeId=").append(packegeId);
        sb.append(", packageTypeId=").append(packageTypeId);
        sb.append(", timeType=").append(timeType);
        sb.append(", time=").append(time);
        sb.append(", system=").append(system);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", subjectName=").append(subjectName);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", packageType=").append(packageType);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}