package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentSysOrder implements Serializable {
    private Integer id;

    /**
     * 数学免费次数
     */
    private Integer mathNumber;

    /**
     * 化学免费次数
     */
    private Integer physicsNumber;

    /**
     * 化学免费次数
     */
    private Integer chemistryNumber;

    /**
     * 数学免费次数
     */
    private Integer lastMathNumber;

    /**
     * 化学免费次数
     */
    private Integer lastPhysicsNumber;

    /**
     * 化学免费次数
     */
    private Integer lastChemistryNumber;

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

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMathNumber() {
        return mathNumber;
    }

    public void setMathNumber(Integer mathNumber) {
        this.mathNumber = mathNumber;
    }

    public Integer getPhysicsNumber() {
        return physicsNumber;
    }

    public void setPhysicsNumber(Integer physicsNumber) {
        this.physicsNumber = physicsNumber;
    }

    public Integer getChemistryNumber() {
        return chemistryNumber;
    }

    public void setChemistryNumber(Integer chemistryNumber) {
        this.chemistryNumber = chemistryNumber;
    }

    public Integer getLastMathNumber() {
        return lastMathNumber;
    }

    public void setLastMathNumber(Integer lastMathNumber) {
        this.lastMathNumber = lastMathNumber;
    }

    public Integer getLastPhysicsNumber() {
        return lastPhysicsNumber;
    }

    public void setLastPhysicsNumber(Integer lastPhysicsNumber) {
        this.lastPhysicsNumber = lastPhysicsNumber;
    }

    public Integer getLastChemistryNumber() {
        return lastChemistryNumber;
    }

    public void setLastChemistryNumber(Integer lastChemistryNumber) {
        this.lastChemistryNumber = lastChemistryNumber;
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
        sb.append(", mathNumber=").append(mathNumber);
        sb.append(", physicsNumber=").append(physicsNumber);
        sb.append(", chemistryNumber=").append(chemistryNumber);
        sb.append(", lastMathNumber=").append(lastMathNumber);
        sb.append(", lastPhysicsNumber=").append(lastPhysicsNumber);
        sb.append(", lastChemistryNumber=").append(lastChemistryNumber);
        sb.append(", studentId=").append(studentId);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}