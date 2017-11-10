package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentThirdHxy implements Serializable {
    private Integer id;

    private Integer studentId;

    private Integer studentThirdAccountId;

    /**
     * 和校园（1老师，2学生，3家长）
     */
    private Integer thirdRoleType;

    private Integer thirdUserId;

    /**
     * 地区代码
     */
    private String thirdCityId;

    private String thirdEmail;

    private Integer thirdSchoolId;

    /**
     * IC卡号
     */
    private String icNo;

    private String sex;

    /**
     * 年级编号
     */
    private String thirdGradeId;

    /**
     * 账号编号
     */
    private Integer thirdAccountId;

    /**
     * 和教育第三方账号详情表
     */
    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentThirdAccountId() {
        return studentThirdAccountId;
    }

    public void setStudentThirdAccountId(Integer studentThirdAccountId) {
        this.studentThirdAccountId = studentThirdAccountId;
    }

    public Integer getThirdRoleType() {
        return thirdRoleType;
    }

    public void setThirdRoleType(Integer thirdRoleType) {
        this.thirdRoleType = thirdRoleType;
    }

    public Integer getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(Integer thirdUserId) {
        this.thirdUserId = thirdUserId;
    }

    public String getThirdCityId() {
        return thirdCityId;
    }

    public void setThirdCityId(String thirdCityId) {
        this.thirdCityId = thirdCityId == null ? null : thirdCityId.trim();
    }

    public String getThirdEmail() {
        return thirdEmail;
    }

    public void setThirdEmail(String thirdEmail) {
        this.thirdEmail = thirdEmail == null ? null : thirdEmail.trim();
    }

    public Integer getThirdSchoolId() {
        return thirdSchoolId;
    }

    public void setThirdSchoolId(Integer thirdSchoolId) {
        this.thirdSchoolId = thirdSchoolId;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo == null ? null : icNo.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getThirdGradeId() {
        return thirdGradeId;
    }

    public void setThirdGradeId(String thirdGradeId) {
        this.thirdGradeId = thirdGradeId == null ? null : thirdGradeId.trim();
    }

    public Integer getThirdAccountId() {
        return thirdAccountId;
    }

    public void setThirdAccountId(Integer thirdAccountId) {
        this.thirdAccountId = thirdAccountId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        sb.append(", studentId=").append(studentId);
        sb.append(", studentThirdAccountId=").append(studentThirdAccountId);
        sb.append(", thirdRoleType=").append(thirdRoleType);
        sb.append(", thirdUserId=").append(thirdUserId);
        sb.append(", thirdCityId=").append(thirdCityId);
        sb.append(", thirdEmail=").append(thirdEmail);
        sb.append(", thirdSchoolId=").append(thirdSchoolId);
        sb.append(", icNo=").append(icNo);
        sb.append(", sex=").append(sex);
        sb.append(", thirdGradeId=").append(thirdGradeId);
        sb.append(", thirdAccountId=").append(thirdAccountId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}