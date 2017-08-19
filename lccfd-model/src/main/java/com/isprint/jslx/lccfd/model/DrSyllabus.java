package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class DrSyllabus implements Serializable {
    private Integer id;

    private Integer subjectid;

    private Integer degreeid;

    private Integer syllabusgradeid;

    private Integer publisherid;

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

    public Integer getDegreeid() {
        return degreeid;
    }

    public void setDegreeid(Integer degreeid) {
        this.degreeid = degreeid;
    }

    public Integer getSyllabusgradeid() {
        return syllabusgradeid;
    }

    public void setSyllabusgradeid(Integer syllabusgradeid) {
        this.syllabusgradeid = syllabusgradeid;
    }

    public Integer getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(Integer publisherid) {
        this.publisherid = publisherid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subjectid=").append(subjectid);
        sb.append(", degreeid=").append(degreeid);
        sb.append(", syllabusgradeid=").append(syllabusgradeid);
        sb.append(", publisherid=").append(publisherid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}