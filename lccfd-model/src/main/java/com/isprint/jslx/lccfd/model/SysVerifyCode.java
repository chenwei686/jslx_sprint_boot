package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class SysVerifyCode implements Serializable {
    private Integer id;

    private String mobile;

    private String code;

    /**
     * 是否验证通过
     */
    private Boolean isChecked;

    /**
     * 验证码类型（0：注册登录验证码  1：更换手机号验证码  2：找回密码验证码）
     */
    private Byte codeType;

    /**
     * 来源
     */
    private String source;

    private Integer status;

    private String result;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    public Byte getCodeType() {
        return codeType;
    }

    public void setCodeType(Byte codeType) {
        this.codeType = codeType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
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
        sb.append(", mobile=").append(mobile);
        sb.append(", code=").append(code);
        sb.append(", isChecked=").append(isChecked);
        sb.append(", codeType=").append(codeType);
        sb.append(", source=").append(source);
        sb.append(", status=").append(status);
        sb.append(", result=").append(result);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}