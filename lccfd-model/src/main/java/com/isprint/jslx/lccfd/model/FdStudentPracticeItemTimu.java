package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentPracticeItemTimu implements Serializable {
    private Integer id;

    /**
     * 试卷id
     */
    private Integer studentPracticeId;

    /**
     * 试卷大题id
     */
    private Integer studentPracticeItemId;

    /**
     * 题目id
     */
    private String timuId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 知识点id
     */
    private Integer mainKnowledgeId;

    /**
     * 难度
     */
    private Byte difficultLevel;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentPracticeId() {
        return studentPracticeId;
    }

    public void setStudentPracticeId(Integer studentPracticeId) {
        this.studentPracticeId = studentPracticeId;
    }

    public Integer getStudentPracticeItemId() {
        return studentPracticeItemId;
    }

    public void setStudentPracticeItemId(Integer studentPracticeItemId) {
        this.studentPracticeItemId = studentPracticeItemId;
    }

    public String getTimuId() {
        return timuId;
    }

    public void setTimuId(String timuId) {
        this.timuId = timuId == null ? null : timuId.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        sb.append(", studentPracticeId=").append(studentPracticeId);
        sb.append(", studentPracticeItemId=").append(studentPracticeItemId);
        sb.append(", timuId=").append(timuId);
        sb.append(", sort=").append(sort);
        sb.append(", mainKnowledgeId=").append(mainKnowledgeId);
        sb.append(", difficultLevel=").append(difficultLevel);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}