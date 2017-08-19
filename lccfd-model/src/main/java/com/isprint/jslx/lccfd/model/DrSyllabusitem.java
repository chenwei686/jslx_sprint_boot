package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class DrSyllabusitem implements Serializable {
    private Integer id;

    private Integer syllabusid;

    private String name;

    private Integer parentid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSyllabusid() {
        return syllabusid;
    }

    public void setSyllabusid(Integer syllabusid) {
        this.syllabusid = syllabusid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", syllabusid=").append(syllabusid);
        sb.append(", name=").append(name);
        sb.append(", parentid=").append(parentid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}