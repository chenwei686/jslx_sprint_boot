package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdTimuTeacherUseNumber implements Serializable {
    /**
     * 题目试卷使用次数
     */
    private Integer id;

    private Integer teacherId;

    /**
     * 题目id
     */
    private String timuId;

    /**
     * 知识点id
     */
    private Integer mainKnowledgeId;

    private String knowledgeName;

    /**
     * 学校级别id
     */
    private Integer schoolDegreeId;

    private Integer number;

    /**
     * 是否是主知识点
     */
    private Boolean isMain;

    private Date createTime;

    /**
     * 难度系数
     */
    private Byte difficultLevel;

    /**
     * 题目类型
     */
    private Integer timuTypeId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTimuId() {
        return timuId;
    }

    public void setTimuId(String timuId) {
        this.timuId = timuId == null ? null : timuId.trim();
    }

    public Integer getMainKnowledgeId() {
        return mainKnowledgeId;
    }

    public void setMainKnowledgeId(Integer mainKnowledgeId) {
        this.mainKnowledgeId = mainKnowledgeId;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName == null ? null : knowledgeName.trim();
    }

    public Integer getSchoolDegreeId() {
        return schoolDegreeId;
    }

    public void setSchoolDegreeId(Integer schoolDegreeId) {
        this.schoolDegreeId = schoolDegreeId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(Byte difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public Integer getTimuTypeId() {
        return timuTypeId;
    }

    public void setTimuTypeId(Integer timuTypeId) {
        this.timuTypeId = timuTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", timuId=").append(timuId);
        sb.append(", mainKnowledgeId=").append(mainKnowledgeId);
        sb.append(", knowledgeName=").append(knowledgeName);
        sb.append(", schoolDegreeId=").append(schoolDegreeId);
        sb.append(", number=").append(number);
        sb.append(", isMain=").append(isMain);
        sb.append(", createTime=").append(createTime);
        sb.append(", difficultLevel=").append(difficultLevel);
        sb.append(", timuTypeId=").append(timuTypeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}