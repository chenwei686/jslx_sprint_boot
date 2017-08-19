package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class BaseTimuFormula implements Serializable {
    private Integer id;

    private Integer subjectid;

    private String asciimath;

    private String latex;

    private Integer issuccess;

    private String errinfo;

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

    public String getAsciimath() {
        return asciimath;
    }

    public void setAsciimath(String asciimath) {
        this.asciimath = asciimath == null ? null : asciimath.trim();
    }

    public String getLatex() {
        return latex;
    }

    public void setLatex(String latex) {
        this.latex = latex == null ? null : latex.trim();
    }

    public Integer getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(Integer issuccess) {
        this.issuccess = issuccess;
    }

    public String getErrinfo() {
        return errinfo;
    }

    public void setErrinfo(String errinfo) {
        this.errinfo = errinfo == null ? null : errinfo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subjectid=").append(subjectid);
        sb.append(", asciimath=").append(asciimath);
        sb.append(", latex=").append(latex);
        sb.append(", issuccess=").append(issuccess);
        sb.append(", errinfo=").append(errinfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}