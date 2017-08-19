package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentPracticeItem implements Serializable {
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 每周一练id
     */
    private Integer studentPracticeId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 描述
     */
    private String description;

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

    public Integer getStudentPracticeId() {
        return studentPracticeId;
    }

    public void setStudentPracticeId(Integer studentPracticeId) {
        this.studentPracticeId = studentPracticeId;
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
        sb.append(", studentPracticeId=").append(studentPracticeId);
        sb.append(", sort=").append(sort);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}