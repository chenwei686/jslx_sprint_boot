package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdBuildExampaperBasketItem implements Serializable {
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 试题蓝id
     */
    private Integer buildExampaperBasketId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 题目类型id
     */
    private Integer timuTypeId;

    /**
     * 题目类型名称
     */
    private String timuTypeName;

    /**
     * 题目数量
     */
    private Integer timuNum;

    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 分数
     */
    private BigDecimal score;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBuildExampaperBasketId() {
        return buildExampaperBasketId;
    }

    public void setBuildExampaperBasketId(Integer buildExampaperBasketId) {
        this.buildExampaperBasketId = buildExampaperBasketId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getTimuTypeId() {
        return timuTypeId;
    }

    public void setTimuTypeId(Integer timuTypeId) {
        this.timuTypeId = timuTypeId;
    }

    public String getTimuTypeName() {
        return timuTypeName;
    }

    public void setTimuTypeName(String timuTypeName) {
        this.timuTypeName = timuTypeName == null ? null : timuTypeName.trim();
    }

    public Integer getTimuNum() {
        return timuNum;
    }

    public void setTimuNum(Integer timuNum) {
        this.timuNum = timuNum;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
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
        sb.append(", name=").append(name);
        sb.append(", buildExampaperBasketId=").append(buildExampaperBasketId);
        sb.append(", sort=").append(sort);
        sb.append(", timuTypeId=").append(timuTypeId);
        sb.append(", timuTypeName=").append(timuTypeName);
        sb.append(", timuNum=").append(timuNum);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", score=").append(score);
        sb.append(", isDel=").append(isDel);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}