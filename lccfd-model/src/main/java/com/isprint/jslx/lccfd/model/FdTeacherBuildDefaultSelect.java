package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdTeacherBuildDefaultSelect implements Serializable {
    private Integer id;

    private Integer teacherid;

    /**
     * 0:智能组卷  1:手工组卷
     */
    private Byte type;

    private Integer bookid;

    /**
     * -1表示全册别  其他为教材下册别.
     */
    private Integer volumeid;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getVolumeid() {
        return volumeid;
    }

    public void setVolumeid(Integer volumeid) {
        this.volumeid = volumeid;
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
        sb.append(", teacherid=").append(teacherid);
        sb.append(", type=").append(type);
        sb.append(", bookid=").append(bookid);
        sb.append(", volumeid=").append(volumeid);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}