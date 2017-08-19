package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class BaseBookSection implements Serializable {
    /**
     * 章节表
     */
    private Integer id;

    /**
     * 教材id
     */
    private Integer bookId;

    /**
     * 册别id
     */
    private Integer bookVolumeId;

    /**
     * 章节名称
     */
    private String name;

    /**
     * 父章节id
     */
    private Integer parentId;

    /**
     * 排序
     */
    private Integer sort;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookId=").append(bookId);
        sb.append(", bookVolumeId=").append(bookVolumeId);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", sort=").append(sort);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}