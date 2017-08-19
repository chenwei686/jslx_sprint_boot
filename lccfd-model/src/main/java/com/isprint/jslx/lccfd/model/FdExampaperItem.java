package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdExampaperItem implements Serializable {
    /**
     * 试卷大题表
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 试卷id
     */
    private Integer exampaperId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 详情
     */
    private String description;

    /**
     * 题目数
     */
    private Integer timuNum;

    /**
     * 分数
     */
    private BigDecimal score;

    /**
     * 题目类型id
     */
    private Integer timuTypeId;

    private Date createTime;

    private Boolean isDel;

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

    public Integer getExampaperId() {
        return exampaperId;
    }

    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getTimuNum() {
        return timuNum;
    }

    public void setTimuNum(Integer timuNum) {
        this.timuNum = timuNum;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getTimuTypeId() {
        return timuTypeId;
    }

    public void setTimuTypeId(Integer timuTypeId) {
        this.timuTypeId = timuTypeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", exampaperId=").append(exampaperId);
        sb.append(", sort=").append(sort);
        sb.append(", description=").append(description);
        sb.append(", timuNum=").append(timuNum);
        sb.append(", score=").append(score);
        sb.append(", timuTypeId=").append(timuTypeId);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDel=").append(isDel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}