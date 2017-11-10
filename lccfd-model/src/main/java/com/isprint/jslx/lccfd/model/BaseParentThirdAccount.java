package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class BaseParentThirdAccount implements Serializable {
    /**
     * 家长第三方账号表
     */
    private Integer id;

    /**
     * 家长id
     */
    private Integer parentId;

    /**
     * 来源('cmcc')
     */
    private String source;

    /**
     * 第三那方登录code
     */
    private String openId;

    /**
     * 第三方账号
     */
    private String account;

    /**
     * 是否删除
     */
    private Boolean isDel;

    private Date createTime;

    private Integer studentId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append(", parentId=").append(parentId);
        sb.append(", source=").append(source);
        sb.append(", openId=").append(openId);
        sb.append(", account=").append(account);
        sb.append(", isDel=").append(isDel);
        sb.append(", createTime=").append(createTime);
        sb.append(", studentId=").append(studentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}