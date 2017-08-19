package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class Timuknowledge implements Serializable {
    private Integer id;

    private String tmid;

    private Integer knowledgeid;

    private Boolean ismain;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTmid() {
        return tmid;
    }

    public void setTmid(String tmid) {
        this.tmid = tmid == null ? null : tmid.trim();
    }

    public Integer getKnowledgeid() {
        return knowledgeid;
    }

    public void setKnowledgeid(Integer knowledgeid) {
        this.knowledgeid = knowledgeid;
    }

    public Boolean getIsmain() {
        return ismain;
    }

    public void setIsmain(Boolean ismain) {
        this.ismain = ismain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tmid=").append(tmid);
        sb.append(", knowledgeid=").append(knowledgeid);
        sb.append(", ismain=").append(ismain);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}