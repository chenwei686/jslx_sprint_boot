package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdBuildExampaperKnowledge implements Serializable {
    /**
     * 组卷知识点表
     */
    private Integer id;

    /**
     * 章节id
     */
    private Integer bookSectionId;

    /**
     * 知识点id
     */
    private Integer knowledgeId;

    /**
     * 组卷id
     */
    private Integer buildExampaperId;

    /**
     * 教材id
     */
    private Integer bookId;

    /**
     * 册别id
     */
    private Integer bookVolumeId;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookSectionId() {
        return bookSectionId;
    }

    public void setBookSectionId(Integer bookSectionId) {
        this.bookSectionId = bookSectionId;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public Integer getBuildExampaperId() {
        return buildExampaperId;
    }

    public void setBuildExampaperId(Integer buildExampaperId) {
        this.buildExampaperId = buildExampaperId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookVolumeId() {
        return bookVolumeId;
    }

    public void setBookVolumeId(Integer bookVolumeId) {
        this.bookVolumeId = bookVolumeId;
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
        sb.append(", bookSectionId=").append(bookSectionId);
        sb.append(", knowledgeId=").append(knowledgeId);
        sb.append(", buildExampaperId=").append(buildExampaperId);
        sb.append(", bookId=").append(bookId);
        sb.append(", bookVolumeId=").append(bookVolumeId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}