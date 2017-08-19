package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class Tmtype implements Serializable {
    private Integer id;

    private Integer subjectid;

    private String systemname;

    private String name;

    private Integer ordering;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname == null ? null : systemname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subjectid=").append(subjectid);
        sb.append(", systemname=").append(systemname);
        sb.append(", name=").append(name);
        sb.append(", ordering=").append(ordering);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}