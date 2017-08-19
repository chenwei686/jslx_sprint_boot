package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdExampaper implements Serializable {
    /**
     * 试卷表
     */
    private Integer id;

    /**
     * 试卷名称
     */
    private String name;

    /**
     * 科目id
     */
    private Integer subjectId;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 试卷类型（0：模拟卷  1：真题卷  2：扩展练习 3：教师组卷 4：考点训练）
     */
    private Byte type;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 试卷难度
     */
    private Byte difficultLevel;

    /**
     * 总分
     */
    private BigDecimal totalScore;

    /**
     * 花费总时间（分）
     */
    private Integer totalTime;

    /**
     * 试卷下载次数
     */
    private Integer downNum;

    /**
     * 学校级别id
     */
    private Integer schoolDegreeId;

    /**
     * 试卷来源('system','teacher')
     */
    private String source;

    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 二维码
     */
    private String qrCode;

    /**
     * 是否删除
     */
    private Boolean isDel;

    /**
     * 试卷说明
     */
    private String notes;

    /**
     * 复用的试卷id
     */
    private Integer parentId;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(Byte difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public Integer getDownNum() {
        return downNum;
    }

    public void setDownNum(Integer downNum) {
        this.downNum = downNum;
    }

    public Integer getSchoolDegreeId() {
        return schoolDegreeId;
    }

    public void setSchoolDegreeId(Integer schoolDegreeId) {
        this.schoolDegreeId = schoolDegreeId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
        sb.append(", name=").append(name);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", year=").append(year);
        sb.append(", type=").append(type);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", difficultLevel=").append(difficultLevel);
        sb.append(", totalScore=").append(totalScore);
        sb.append(", totalTime=").append(totalTime);
        sb.append(", downNum=").append(downNum);
        sb.append(", schoolDegreeId=").append(schoolDegreeId);
        sb.append(", source=").append(source);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", qrCode=").append(qrCode);
        sb.append(", isDel=").append(isDel);
        sb.append(", notes=").append(notes);
        sb.append(", parentId=").append(parentId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}