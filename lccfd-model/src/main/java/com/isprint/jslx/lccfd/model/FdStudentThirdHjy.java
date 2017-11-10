package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentThirdHjy implements Serializable {
    /**
     * 和教育账号详情表
     */
    private Integer id;

    private Integer studentThirdAccountId;

    private Integer studentId;

    private String thirdSchoolId;

    private String thirdSchoolName;

    private String thirdGradeId;

    private String thirdGradeName;

    private String thirdClassesId;

    private String thirdClassesName;

    /**
     * 用户类型( 0互联网 1 老师 2 学生 3 家长5 多角色)
     */
    private Integer thirdRoleType;

    /**
     * 省份ID
     */
    private Integer thirdProvinceId;

    private String thirdProvinceName;

    private String thirdUserId;

    /**
     * 是否是校讯通用户 0：校讯通用户 1：互联网用户
     */
    private Integer xxtState;

    /**
     * 20*20大小的头像访问地址url
     */
    private String head20;

    /**
     * 70*70大小的头像访问地址url
     */
    private String head70;

    /**
     * 100*100大小的头像访问地址url
     */
    private String head100;

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

    public Integer getStudentThirdAccountId() {
        return studentThirdAccountId;
    }

    public void setStudentThirdAccountId(Integer studentThirdAccountId) {
        this.studentThirdAccountId = studentThirdAccountId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getThirdSchoolId() {
        return thirdSchoolId;
    }

    public void setThirdSchoolId(String thirdSchoolId) {
        this.thirdSchoolId = thirdSchoolId == null ? null : thirdSchoolId.trim();
    }

    public String getThirdSchoolName() {
        return thirdSchoolName;
    }

    public void setThirdSchoolName(String thirdSchoolName) {
        this.thirdSchoolName = thirdSchoolName == null ? null : thirdSchoolName.trim();
    }

    public String getThirdGradeId() {
        return thirdGradeId;
    }

    public void setThirdGradeId(String thirdGradeId) {
        this.thirdGradeId = thirdGradeId == null ? null : thirdGradeId.trim();
    }

    public String getThirdGradeName() {
        return thirdGradeName;
    }

    public void setThirdGradeName(String thirdGradeName) {
        this.thirdGradeName = thirdGradeName == null ? null : thirdGradeName.trim();
    }

    public String getThirdClassesId() {
        return thirdClassesId;
    }

    public void setThirdClassesId(String thirdClassesId) {
        this.thirdClassesId = thirdClassesId == null ? null : thirdClassesId.trim();
    }

    public String getThirdClassesName() {
        return thirdClassesName;
    }

    public void setThirdClassesName(String thirdClassesName) {
        this.thirdClassesName = thirdClassesName == null ? null : thirdClassesName.trim();
    }

    public Integer getThirdRoleType() {
        return thirdRoleType;
    }

    public void setThirdRoleType(Integer thirdRoleType) {
        this.thirdRoleType = thirdRoleType;
    }

    public Integer getThirdProvinceId() {
        return thirdProvinceId;
    }

    public void setThirdProvinceId(Integer thirdProvinceId) {
        this.thirdProvinceId = thirdProvinceId;
    }

    public String getThirdProvinceName() {
        return thirdProvinceName;
    }

    public void setThirdProvinceName(String thirdProvinceName) {
        this.thirdProvinceName = thirdProvinceName == null ? null : thirdProvinceName.trim();
    }

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId == null ? null : thirdUserId.trim();
    }

    public Integer getXxtState() {
        return xxtState;
    }

    public void setXxtState(Integer xxtState) {
        this.xxtState = xxtState;
    }

    public String getHead20() {
        return head20;
    }

    public void setHead20(String head20) {
        this.head20 = head20 == null ? null : head20.trim();
    }

    public String getHead70() {
        return head70;
    }

    public void setHead70(String head70) {
        this.head70 = head70 == null ? null : head70.trim();
    }

    public String getHead100() {
        return head100;
    }

    public void setHead100(String head100) {
        this.head100 = head100 == null ? null : head100.trim();
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
        sb.append(", studentThirdAccountId=").append(studentThirdAccountId);
        sb.append(", studentId=").append(studentId);
        sb.append(", thirdSchoolId=").append(thirdSchoolId);
        sb.append(", thirdSchoolName=").append(thirdSchoolName);
        sb.append(", thirdGradeId=").append(thirdGradeId);
        sb.append(", thirdGradeName=").append(thirdGradeName);
        sb.append(", thirdClassesId=").append(thirdClassesId);
        sb.append(", thirdClassesName=").append(thirdClassesName);
        sb.append(", thirdRoleType=").append(thirdRoleType);
        sb.append(", thirdProvinceId=").append(thirdProvinceId);
        sb.append(", thirdProvinceName=").append(thirdProvinceName);
        sb.append(", thirdUserId=").append(thirdUserId);
        sb.append(", xxtState=").append(xxtState);
        sb.append(", head20=").append(head20);
        sb.append(", head70=").append(head70);
        sb.append(", head100=").append(head100);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}