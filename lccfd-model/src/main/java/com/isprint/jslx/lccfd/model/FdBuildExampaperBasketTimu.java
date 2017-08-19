package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdBuildExampaperBasketTimu implements Serializable {
    /**
     * 组卷试题蓝
     */
    private Integer id;

    /**
     * 题目类型id
     */
    private Integer timuTypeId;

    private Integer timuId;

    /**
     * 难度
     */
    private Byte difficultLevel;

    /**
     * 知识点id
     */
    private Integer knowledgeId;

    /**
     * 是否移除
     */
    private Boolean isDel;

    /**
     * 试题篮id
     */
    private Integer buildExampaperBasketId;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTimuTypeId() {
        return timuTypeId;
    }

    public void setTimuTypeId(Integer timuTypeId) {
        this.timuTypeId = timuTypeId;
    }

    public Integer getTimuId() {
        return timuId;
    }

    public void setTimuId(Integer timuId) {
        this.timuId = timuId;
    }

    public Byte getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(Byte difficultLevel) {
        this.difficultLevel = difficultLevel;
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

    public Integer getBuildExampaperBasketId() {
        return buildExampaperBasketId;
    }

    public void setBuildExampaperBasketId(Integer buildExampaperBasketId) {
        this.buildExampaperBasketId = buildExampaperBasketId;
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
        sb.append(", timuTypeId=").append(timuTypeId);
        sb.append(", timuId=").append(timuId);
        sb.append(", difficultLevel=").append(difficultLevel);
        sb.append(", knowledgeId=").append(knowledgeId);
        sb.append(", isDel=").append(isDel);
        sb.append(", buildExampaperBasketId=").append(buildExampaperBasketId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}