package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class BaseTimuKnowledge implements Serializable {
    /**
     * 题目知识点表
     */
    private Integer id;

    /**
     * 题目id
     */
    private String timuId;

    /**
     * 知识点id
     */
    private Integer knowledgeId;

    private String knowledgeName;

    /**
     * 学校级别id
     */
    private Integer schoolDegreeId;

    /**
     * 是否是主知识点
     */
    private Boolean isMain;

    /**
     * 是否删除（0：未删除  1：已删除）
     */
    private Boolean isDel;

    private Date createTime;

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

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName == null ? null : knowledgeName.trim();
    }

    public Integer getSchoolDegreeId() {
        return schoolDegreeId;
    }

    public void setSchoolDegreeId(Integer schoolDegreeId) {
        this.schoolDegreeId = schoolDegreeId;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", timuId=").append(timuId);
        sb.append(", knowledgeId=").append(knowledgeId);
        sb.append(", knowledgeName=").append(knowledgeName);
        sb.append(", schoolDegreeId=").append(schoolDegreeId);
        sb.append(", isMain=").append(isMain);
        sb.append(", isDel=").append(isDel);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}