package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class TempCheck implements Serializable {
    private Integer id;

    /**
     * 题目id
     */
    private String timuId;

    /**
     * 题目图片
     */
    private String timuPic;

    /**
     * 相似题目id
     */
    private String simId;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 科目id
     */
    private Integer subjectId;

    /**
     * 拍题时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimuId() {
        return timuId;
    }

    public void setTimuId(String timuId) {
        this.timuId = timuId == null ? null : timuId.trim();
    }

    public String getTimuPic() {
        return timuPic;
    }

    public void setTimuPic(String timuPic) {
        this.timuPic = timuPic == null ? null : timuPic.trim();
    }

    public String getSimId() {
        return simId;
    }

    public void setSimId(String simId) {
        this.simId = simId == null ? null : simId.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
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
        sb.append(", timuId=").append(timuId);
        sb.append(", timuPic=").append(timuPic);
        sb.append(", simId=").append(simId);
        sb.append(", studentId=").append(studentId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}