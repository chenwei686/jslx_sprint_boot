package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdTeacherExampaper implements Serializable {
    /**
     * 教师试卷表
     */
    private Integer id;

    private Integer teacherId;

    /**
     * 难度
     */
    private Byte difficultLevel;

    /**
     * 试卷id
     */
    private Integer exampaperId;

    /**
     * 试卷名称
     */
    private String exampaperName;

    /**
     * 来源（0：组卷 1：扫码识卷）
     */
    private Byte source;

    /**
     * 发卷时间
     */
    private Date provideTime;

    /**
     * 试卷创建时间
     */
    private Date riseTime;

    /**
     * 备注
     */
    private String notes;

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

    public Byte getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(Byte difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public Integer getExampaperId() {
        return exampaperId;
    }

    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }

    public String getExampaperName() {
        return exampaperName;
    }

    public void setExampaperName(String exampaperName) {
        this.exampaperName = exampaperName == null ? null : exampaperName.trim();
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Date getProvideTime() {
        return provideTime;
    }

    public void setProvideTime(Date provideTime) {
        this.provideTime = provideTime;
    }

    public Date getRiseTime() {
        return riseTime;
    }

    public void setRiseTime(Date riseTime) {
        this.riseTime = riseTime;
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
        sb.append(", teacherId=").append(teacherId);
        sb.append(", difficultLevel=").append(difficultLevel);
        sb.append(", exampaperId=").append(exampaperId);
        sb.append(", exampaperName=").append(exampaperName);
        sb.append(", source=").append(source);
        sb.append(", provideTime=").append(provideTime);
        sb.append(", riseTime=").append(riseTime);
        sb.append(", notes=").append(notes);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}