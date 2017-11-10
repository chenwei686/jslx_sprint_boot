package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdBuildExampaperBasketTimu implements Serializable {
    /**
     * 组卷试题蓝
     */
    private Integer id;

    /**
     * 试题篮id
     */
    private Integer buildExampaperBasketId;

    private Integer buildExampaperBasketItemId;

    /**
     * 题目类型id
     */
    private Integer timuTypeId;

    private String timuId;

    /**
     * 分数
     */
    private BigDecimal score;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 主知识点
     */
    private Integer mainKnowledgeId;

    /**
     * 难度
     */
    private Byte difficultLevel;

    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 是否移除
     */
    private Boolean isDel;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuildExampaperBasketId() {
        return buildExampaperBasketId;
    }

    public void setBuildExampaperBasketId(Integer buildExampaperBasketId) {
        this.buildExampaperBasketId = buildExampaperBasketId;
    }

    public Integer getBuildExampaperBasketItemId() {
        return buildExampaperBasketItemId;
    }

    public void setBuildExampaperBasketItemId(Integer buildExampaperBasketItemId) {
        this.buildExampaperBasketItemId = buildExampaperBasketItemId;
    }

    public Integer getTimuTypeId() {
        return timuTypeId;
    }

    public void setTimuTypeId(Integer timuTypeId) {
        this.timuTypeId = timuTypeId;
    }

    public String getTimuId() {
        return timuId;
    }

    public void setTimuId(String timuId) {
        this.timuId = timuId == null ? null : timuId.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
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

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
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
        sb.append(", buildExampaperBasketId=").append(buildExampaperBasketId);
        sb.append(", buildExampaperBasketItemId=").append(buildExampaperBasketItemId);
        sb.append(", timuTypeId=").append(timuTypeId);
        sb.append(", timuId=").append(timuId);
        sb.append(", score=").append(score);
        sb.append(", sort=").append(sort);
        sb.append(", mainKnowledgeId=").append(mainKnowledgeId);
        sb.append(", difficultLevel=").append(difficultLevel);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", isDel=").append(isDel);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}