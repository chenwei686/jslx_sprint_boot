package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Timu implements Serializable {
    private String id;

    private Integer subjectid;

    private Integer timutypeid;

    private Integer difficult;

    private Integer discriminate;

    private Integer standardtime;

    private BigDecimal standerdscroe;

    private Integer cognizeid;

    private Integer abilityid;

    private Integer gradeid;

    private Integer areaid;

    private Integer year;

    private String soure;

    private Integer qualityid;

    private BigDecimal price;

    private String inputid;

    private String parentid;

    private String videocode;

    private Integer sourcetype;

    private Boolean isexpandpractice;

    private Boolean havechildtimu;

    private Date updatetime;

    private String number;

    private Integer order;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public Integer getTimutypeid() {
        return timutypeid;
    }

    public void setTimutypeid(Integer timutypeid) {
        this.timutypeid = timutypeid;
    }

    public Integer getDifficult() {
        return difficult;
    }

    public void setDifficult(Integer difficult) {
        this.difficult = difficult;
    }

    public Integer getDiscriminate() {
        return discriminate;
    }

    public void setDiscriminate(Integer discriminate) {
        this.discriminate = discriminate;
    }

    public Integer getStandardtime() {
        return standardtime;
    }

    public void setStandardtime(Integer standardtime) {
        this.standardtime = standardtime;
    }

    public BigDecimal getStanderdscroe() {
        return standerdscroe;
    }

    public void setStanderdscroe(BigDecimal standerdscroe) {
        this.standerdscroe = standerdscroe;
    }

    public Integer getCognizeid() {
        return cognizeid;
    }

    public void setCognizeid(Integer cognizeid) {
        this.cognizeid = cognizeid;
    }

    public Integer getAbilityid() {
        return abilityid;
    }

    public void setAbilityid(Integer abilityid) {
        this.abilityid = abilityid;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSoure() {
        return soure;
    }

    public void setSoure(String soure) {
        this.soure = soure == null ? null : soure.trim();
    }

    public Integer getQualityid() {
        return qualityid;
    }

    public void setQualityid(Integer qualityid) {
        this.qualityid = qualityid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getInputid() {
        return inputid;
    }

    public void setInputid(String inputid) {
        this.inputid = inputid == null ? null : inputid.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getVideocode() {
        return videocode;
    }

    public void setVideocode(String videocode) {
        this.videocode = videocode == null ? null : videocode.trim();
    }

    public Integer getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(Integer sourcetype) {
        this.sourcetype = sourcetype;
    }

    public Boolean getIsexpandpractice() {
        return isexpandpractice;
    }

    public void setIsexpandpractice(Boolean isexpandpractice) {
        this.isexpandpractice = isexpandpractice;
    }

    public Boolean getHavechildtimu() {
        return havechildtimu;
    }

    public void setHavechildtimu(Boolean havechildtimu) {
        this.havechildtimu = havechildtimu;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subjectid=").append(subjectid);
        sb.append(", timutypeid=").append(timutypeid);
        sb.append(", difficult=").append(difficult);
        sb.append(", discriminate=").append(discriminate);
        sb.append(", standardtime=").append(standardtime);
        sb.append(", standerdscroe=").append(standerdscroe);
        sb.append(", cognizeid=").append(cognizeid);
        sb.append(", abilityid=").append(abilityid);
        sb.append(", gradeid=").append(gradeid);
        sb.append(", areaid=").append(areaid);
        sb.append(", year=").append(year);
        sb.append(", soure=").append(soure);
        sb.append(", qualityid=").append(qualityid);
        sb.append(", price=").append(price);
        sb.append(", inputid=").append(inputid);
        sb.append(", parentid=").append(parentid);
        sb.append(", videocode=").append(videocode);
        sb.append(", sourcetype=").append(sourcetype);
        sb.append(", isexpandpractice=").append(isexpandpractice);
        sb.append(", havechildtimu=").append(havechildtimu);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", number=").append(number);
        sb.append(", order=").append(order);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}