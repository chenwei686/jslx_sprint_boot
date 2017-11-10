package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class Timuknowledge implements Serializable {
    private Integer id;

    private Integer knowledgeid;

    private Byte ismain;

    private String tmid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKnowledgeid() {
        return knowledgeid;
    }

    public void setKnowledgeid(Integer knowledgeid) {
        this.knowledgeid = knowledgeid;
    }

    public Byte getIsmain() {
        return ismain;
    }

    public void setIsmain(Byte ismain) {
        this.ismain = ismain;
    }

    public String getTmid() {
        return tmid;
    }

    public void setTmid(String tmid) {
        this.tmid = tmid == null ? null : tmid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", knowledgeid=").append(knowledgeid);
        sb.append(", ismain=").append(ismain);
        sb.append(", tmid=").append(tmid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}