package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdBuildExampaperTimu implements Serializable {
    /**
     * 智能组卷题目表
     */
    private Integer id;

    /**
     * 题目类型id
     */
    private Integer timuTypeId;

    /**
     * 题目数量
     */
    private Integer timuNum;

    /**
     * 题目题库总数
     */
    private Integer timuTotalNum;

    /**
     * 题目类型名称
     */
    private String timuTypeName;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTimuTypeId() {
        return timuTypeId;
    }

    public void setTimuTypeId(Integer timuTypeId) {
        this.timuTypeId = timuTypeId;
    }

    public Integer getTimuNum() {
        return timuNum;
    }

    public void setTimuNum(Integer timuNum) {
        this.timuNum = timuNum;
    }

    public Integer getTimuTotalNum() {
        return timuTotalNum;
    }

    public void setTimuTotalNum(Integer timuTotalNum) {
        this.timuTotalNum = timuTotalNum;
    }

    public String getTimuTypeName() {
        return timuTypeName;
    }

    public void setTimuTypeName(String timuTypeName) {
        this.timuTypeName = timuTypeName == null ? null : timuTypeName.trim();
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
        sb.append(", timuTypeId=").append(timuTypeId);
        sb.append(", timuNum=").append(timuNum);
        sb.append(", timuTotalNum=").append(timuTotalNum);
        sb.append(", timuTypeName=").append(timuTypeName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}