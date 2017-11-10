package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdBuildExampaperBasket implements Serializable {
    /**
     * 试题篮
     */
    private Integer id;

    /**
     * 试卷名称
     */
    private String name;

    /**
     * 科目id
     */
    private Integer subjectId;

    /**
     * 年份
     */
    private Integer yearId;

    /**
     * 组卷类型 0：智能组卷  1：手动组卷
     */
    private Byte type;

    /**
     * 总分
     */
    private BigDecimal totalScore;

    /**
     * 花费总时间（分）
     */
    private Integer totalTime;

    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 生成对应的试卷id
     */
    private Integer exampaperId;

    /**
     * 0：生成试卷  1：确认组卷  2：已发卷              智能组卷 默认为 1（删除状态），点击确认组卷改为0；手动组卷默认0；发卷后改为 1
     */
    private Byte status;

    /**
     * 复用的试卷id
     */
    private Integer parentExampaperId;

    /**
     * 试卷说明
     */
    private String notes;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getExampaperId() {
        return exampaperId;
    }

    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getParentExampaperId() {
        return parentExampaperId;
    }

    public void setParentExampaperId(Integer parentExampaperId) {
        this.parentExampaperId = parentExampaperId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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
        sb.append(", name=").append(name);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", yearId=").append(yearId);
        sb.append(", type=").append(type);
        sb.append(", totalScore=").append(totalScore);
        sb.append(", totalTime=").append(totalTime);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", exampaperId=").append(exampaperId);
        sb.append(", status=").append(status);
        sb.append(", parentExampaperId=").append(parentExampaperId);
        sb.append(", notes=").append(notes);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}