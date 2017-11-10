package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdExampaperObject implements Serializable {
    /**
     * 试卷针对发卷对象表
     */
    private Integer id;

    /**
     * 试卷id
     */
    private Integer exampaperId;

    /**
     * 分层（*：全部学生  0：未分层  1：简单层  2：基础层  3：提升层  4：拔高层）
     */
    private String levelIds;

    private Integer teacherId;

    /**
     * 科目id
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

    /**
     * 年份
     */
    private Integer yearId;

    /**
     * 组卷：'build'    扫码：'qrcode'
     */
    private String source;

    /**
     * 班级名称
     */
    private String classesName;

    /**
     * 年级名称
     */
    private String gradeName;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExampaperId() {
        return exampaperId;
    }

    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }

    public String getLevelIds() {
        return levelIds;
    }

    public void setLevelIds(String levelIds) {
        this.levelIds = levelIds == null ? null : levelIds.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName == null ? null : classesName.trim();
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
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
        sb.append(", exampaperId=").append(exampaperId);
        sb.append(", levelIds=").append(levelIds);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", source=").append(source);
        sb.append(", classesName=").append(classesName);
        sb.append(", gradeName=").append(gradeName);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}