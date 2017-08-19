package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class Timuattributeextend implements Serializable {
    private String id;

    private Integer languageid;

    private String limittime;

    private Integer publishid;

    private String midtestmark;

    private Integer combinecount;

    private Integer docount;

    private Integer realdiff;

    private Integer realdiscriminate;

    private Integer examinatorid;

    private String searkeyword;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getLanguageid() {
        return languageid;
    }

    public void setLanguageid(Integer languageid) {
        this.languageid = languageid;
    }

    public String getLimittime() {
        return limittime;
    }

    public void setLimittime(String limittime) {
        this.limittime = limittime == null ? null : limittime.trim();
    }

    public Integer getPublishid() {
        return publishid;
    }

    public void setPublishid(Integer publishid) {
        this.publishid = publishid;
    }

    public String getMidtestmark() {
        return midtestmark;
    }

    public void setMidtestmark(String midtestmark) {
        this.midtestmark = midtestmark == null ? null : midtestmark.trim();
    }

    public Integer getCombinecount() {
        return combinecount;
    }

    public void setCombinecount(Integer combinecount) {
        this.combinecount = combinecount;
    }

    public Integer getDocount() {
        return docount;
    }

    public void setDocount(Integer docount) {
        this.docount = docount;
    }

    public Integer getRealdiff() {
        return realdiff;
    }

    public void setRealdiff(Integer realdiff) {
        this.realdiff = realdiff;
    }

    public Integer getRealdiscriminate() {
        return realdiscriminate;
    }

    public void setRealdiscriminate(Integer realdiscriminate) {
        this.realdiscriminate = realdiscriminate;
    }

    public Integer getExaminatorid() {
        return examinatorid;
    }

    public void setExaminatorid(Integer examinatorid) {
        this.examinatorid = examinatorid;
    }

    public String getSearkeyword() {
        return searkeyword;
    }

    public void setSearkeyword(String searkeyword) {
        this.searkeyword = searkeyword == null ? null : searkeyword.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", languageid=").append(languageid);
        sb.append(", limittime=").append(limittime);
        sb.append(", publishid=").append(publishid);
        sb.append(", midtestmark=").append(midtestmark);
        sb.append(", combinecount=").append(combinecount);
        sb.append(", docount=").append(docount);
        sb.append(", realdiff=").append(realdiff);
        sb.append(", realdiscriminate=").append(realdiscriminate);
        sb.append(", examinatorid=").append(examinatorid);
        sb.append(", searkeyword=").append(searkeyword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}