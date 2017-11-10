package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class SysExceptionLog implements Serializable {
    private Integer id;

    /**
     * 请求uri
     */
    private String requestUri;

    /**
     * 来源（api,admin）
     */
    private String source;

    /**
     * 包名
     */
    private String packageName;

    /**
     * 异常请求参数
     */
    private String requestPara;

    private Date createTime;

    private String resource;

    /**
     * 异常信息
     */
    private String exception;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri == null ? null : requestUri.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getRequestPara() {
        return requestPara;
    }

    public void setRequestPara(String requestPara) {
        this.requestPara = requestPara == null ? null : requestPara.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", requestUri=").append(requestUri);
        sb.append(", source=").append(source);
        sb.append(", packageName=").append(packageName);
        sb.append(", requestPara=").append(requestPara);
        sb.append(", createTime=").append(createTime);
        sb.append(", resource=").append(resource);
        sb.append(", exception=").append(exception);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}