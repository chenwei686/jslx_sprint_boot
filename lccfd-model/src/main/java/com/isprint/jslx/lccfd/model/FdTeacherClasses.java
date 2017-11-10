package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdTeacherClasses implements Serializable {
    /**
     * 教师年级表
     */
    private Integer id;

    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 角色id
     */
    private Integer teacherRoleId;

    /**
     * 学校id
     */
    private Integer schoolId;

    /**
     * 学校级别
     */
    private String schoolDegreeIds;

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

    /**
     * 所教学科
     */
    private Integer parentSubjectId;

    /**
     * 所教学科
     */
    private String parentSubjectName;

    /**
     * 是否删除
     */
    private Boolean isDel;

    /**
     * 邀请码
     */
    private String code;

    private Date updateTime;

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

    public Integer getTeacherRoleId() {
        return teacherRoleId;
    }

    public void setTeacherRoleId(Integer teacherRoleId) {
        this.teacherRoleId = teacherRoleId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolDegreeIds() {
        return schoolDegreeIds;
    }

    public void setSchoolDegreeIds(String schoolDegreeIds) {
        this.schoolDegreeIds = schoolDegreeIds == null ? null : schoolDegreeIds.trim();
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

    public Integer getParentSubjectId() {
        return parentSubjectId;
    }

    public void setParentSubjectId(Integer parentSubjectId) {
        this.parentSubjectId = parentSubjectId;
    }

    public String getParentSubjectName() {
        return parentSubjectName;
    }

    public void setParentSubjectName(String parentSubjectName) {
        this.parentSubjectName = parentSubjectName == null ? null : parentSubjectName.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teacherRoleId=").append(teacherRoleId);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", schoolDegreeIds=").append(schoolDegreeIds);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", parentSubjectId=").append(parentSubjectId);
        sb.append(", parentSubjectName=").append(parentSubjectName);
        sb.append(", isDel=").append(isDel);
        sb.append(", code=").append(code);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}