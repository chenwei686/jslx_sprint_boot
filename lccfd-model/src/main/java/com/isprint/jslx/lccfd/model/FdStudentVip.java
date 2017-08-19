package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentVip implements Serializable {
    private Integer id;

    private Integer studentId;

    /**
     * 学生总共拍题次数
     */
    private Integer searchNum;

    /**
     * 数学套餐有效时间
     */
    private Date mathStartTime;

    private Date mathEndTime;

    /**
     * 物理套餐有效时间
     */
    private Date physicsStartTime;

    /**
     * 物理套餐有效时间
     */
    private Date physicsEndTime;

    private Date chemieStartTime;

    private Date chemieEndTime;

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

    public Integer getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(Integer searchNum) {
        this.searchNum = searchNum;
    }

    public Date getMathStartTime() {
        return mathStartTime;
    }

    public void setMathStartTime(Date mathStartTime) {
        this.mathStartTime = mathStartTime;
    }

    public Date getMathEndTime() {
        return mathEndTime;
    }

    public void setMathEndTime(Date mathEndTime) {
        this.mathEndTime = mathEndTime;
    }

    public Date getPhysicsStartTime() {
        return physicsStartTime;
    }

    public void setPhysicsStartTime(Date physicsStartTime) {
        this.physicsStartTime = physicsStartTime;
    }

    public Date getPhysicsEndTime() {
        return physicsEndTime;
    }

    public void setPhysicsEndTime(Date physicsEndTime) {
        this.physicsEndTime = physicsEndTime;
    }

    public Date getChemieStartTime() {
        return chemieStartTime;
    }

    public void setChemieStartTime(Date chemieStartTime) {
        this.chemieStartTime = chemieStartTime;
    }

    public Date getChemieEndTime() {
        return chemieEndTime;
    }

    public void setChemieEndTime(Date chemieEndTime) {
        this.chemieEndTime = chemieEndTime;
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
        sb.append(", searchNum=").append(searchNum);
        sb.append(", mathStartTime=").append(mathStartTime);
        sb.append(", mathEndTime=").append(mathEndTime);
        sb.append(", physicsStartTime=").append(physicsStartTime);
        sb.append(", physicsEndTime=").append(physicsEndTime);
        sb.append(", chemieStartTime=").append(chemieStartTime);
        sb.append(", chemieEndTime=").append(chemieEndTime);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", year=").append(year);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}