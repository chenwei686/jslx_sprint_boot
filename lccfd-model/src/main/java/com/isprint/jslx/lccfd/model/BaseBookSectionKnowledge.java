package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class BaseBookSectionKnowledge implements Serializable {
    /**
     * 章节知识点表
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

    private Boolean isDel;

    private String knowledgeName;

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

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName == null ? null : knowledgeName.trim();
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
        sb.append(", isDel=").append(isDel);
        sb.append(", knowledgeName=").append(knowledgeName);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}