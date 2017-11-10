package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentFreeConfig implements Serializable {
    /**
     * 学生免费次数配置表
     */
    private Integer id;

    /**
     * 数学免费次数
     */
    private Integer freeMathNumber;

    /**
     * 化学免费次数
     */
    private Integer freePhysicsNumber;

    /**
     * 化学免费次数
     */
    private Integer freeChemistryNumber;

    private Date updateTime;

    private Date createTime;

    private Boolean isDel;

    private Integer studentId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFreeMathNumber() {
        return freeMathNumber;
    }

    public void setFreeMathNumber(Integer freeMathNumber) {
        this.freeMathNumber = freeMathNumber;
    }

    public Integer getFreePhysicsNumber() {
        return freePhysicsNumber;
    }

    public void setFreePhysicsNumber(Integer freePhysicsNumber) {
        this.freePhysicsNumber = freePhysicsNumber;
    }

    public Integer getFreeChemistryNumber() {
        return freeChemistryNumber;
    }

    public void setFreeChemistryNumber(Integer freeChemistryNumber) {
        this.freeChemistryNumber = freeChemistryNumber;
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

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", freeMathNumber=").append(freeMathNumber);
        sb.append(", freePhysicsNumber=").append(freePhysicsNumber);
        sb.append(", freeChemistryNumber=").append(freeChemistryNumber);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDel=").append(isDel);
        sb.append(", studentId=").append(studentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}