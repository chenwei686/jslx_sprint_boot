package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdTeacherCollect implements Serializable {
    private Integer id;

    private String timuId;

    /**
     * 科目id
     */
    private Integer subjectId;

    private Integer teacherId;

    /**
     * 收藏类型（0.收藏，1.试题袋）
     */
    private Byte type;

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

    /**
     * 题目类型id
     */
    private Integer timuTypeId;

    /**
     * 主知识点
     */
    private Integer mainKnowledgeId;

    /**
     * 难度
     */
    private Byte difficultLevel;

    /**
     * 是否取消收藏（0：否  1：是）
     */
    private Boolean isDel;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimuId() {
        return timuId;
    }

    public void setTimuId(String timuId) {
        this.timuId = timuId == null ? null : timuId.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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

    public Integer getTimuTypeId() {
        return timuTypeId;
    }

    public void setTimuTypeId(Integer timuTypeId) {
        this.timuTypeId = timuTypeId;
    }

    public Integer getMainKnowledgeId() {
        return mainKnowledgeId;
    }

    public void setMainKnowledgeId(Integer mainKnowledgeId) {
        this.mainKnowledgeId = mainKnowledgeId;
    }

    public Byte getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(Byte difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append(", timuId=").append(timuId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", type=").append(type);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", timuTypeId=").append(timuTypeId);
        sb.append(", mainKnowledgeId=").append(mainKnowledgeId);
        sb.append(", difficultLevel=").append(difficultLevel);
        sb.append(", isDel=").append(isDel);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}