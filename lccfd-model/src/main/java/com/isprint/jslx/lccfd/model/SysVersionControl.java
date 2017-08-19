package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class SysVersionControl implements Serializable {
    private Integer id;

    /**
     * 系统
     */
    private String project;

    /**
     * android,ios,wechat(微信应用宝)
     */
    private String code;

    /**
     * 是否是当前版本 
     */
    private Boolean isCurrent;

    /**
     * 版本号
     */
    private String version;

    /**
     * 下载url
     */
    private String downUrl;

    /**
     * 更新内容
     */
    private String content;

    /**
     * 是否强制更新
     */
    private Boolean isForceUpdate;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Boolean getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDownUrl() {
        return downUrl;
    }

    public void setDownUrl(String downUrl) {
        this.downUrl = downUrl == null ? null : downUrl.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getIsForceUpdate() {
        return isForceUpdate;
    }

    public void setIsForceUpdate(Boolean isForceUpdate) {
        this.isForceUpdate = isForceUpdate;
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
        sb.append(", project=").append(project);
        sb.append(", code=").append(code);
        sb.append(", isCurrent=").append(isCurrent);
        sb.append(", version=").append(version);
        sb.append(", downUrl=").append(downUrl);
        sb.append(", content=").append(content);
        sb.append(", isForceUpdate=").append(isForceUpdate);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}