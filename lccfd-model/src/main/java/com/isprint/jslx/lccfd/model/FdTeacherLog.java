package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdTeacherLog implements Serializable {
    private Integer id;

    private Integer teacherId;

    /**
     * 学校id
     */
    private Integer schoolId;

    /**
     * 学校级别id
     */
    private Integer schoolDegreeId;

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
     * 所教学科
     */
    private Integer subjectId;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getSchoolDegreeId() {
        return schoolDegreeId;
    }

    public void setSchoolDegreeId(Integer schoolDegreeId) {
        this.schoolDegreeId = schoolDegreeId;
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
        sb.append(", teacherId=").append(teacherId);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", schoolDegreeId=").append(schoolDegreeId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}