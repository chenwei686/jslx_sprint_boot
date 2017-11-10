package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BaseTimuInputChoice implements Serializable {
    /**
     * 题目选项表
     */
    private String id;

    /**
     * 答案id
     */
    private String timuInputId;

    /**
     * 选项分值
     */
    private BigDecimal score;

    /**
     * 排序
     */
    private Integer sort;

    private Date createTime;

    /**
     * 选项内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTimuInputId() {
        return timuInputId;
    }

    public void setTimuInputId(String timuInputId) {
        this.timuInputId = timuInputId == null ? null : timuInputId.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", timuInputId=").append(timuInputId);
        sb.append(", score=").append(score);
        sb.append(", sort=").append(sort);
        sb.append(", createTime=").append(createTime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}