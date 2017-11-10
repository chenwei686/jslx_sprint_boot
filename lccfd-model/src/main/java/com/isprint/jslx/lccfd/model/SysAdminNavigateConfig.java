package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class SysAdminNavigateConfig implements Serializable {
    /**
     * 导航配置表
     */
    private Integer id;

    /**
     * 定位的Action
     */
    private String action;

    private String name;

    /**
     * 0=一级菜单（没入口）   1=有入口的（一级或二级菜单） 2=按钮
     */
    private Byte type;

    private Integer parentId;

    /**
     * 是否删除
     */
    private Boolean isDel;

    private String icon;

    private Date updateTime;

    private Date createTime;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", action=").append(action);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", parentId=").append(parentId);
        sb.append(", isDel=").append(isDel);
        sb.append(", icon=").append(icon);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}