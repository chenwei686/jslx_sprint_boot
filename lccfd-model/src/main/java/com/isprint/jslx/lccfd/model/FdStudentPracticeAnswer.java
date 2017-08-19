package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdStudentPracticeAnswer implements Serializable {
    private Integer id;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 学生每周一练id
     */
    private Integer studentPracticeId;

    /**
     * 得分
     */
    private BigDecimal score;

    /**
     * 用户答案
     */
    private String answer;

    /**
     * 题目id
     */
    private String timuId;

    /**
     * 正确率(ps:没有用到的保留字段)
     */
    private BigDecimal percent;

    /**
     * 开始答题时间
     */
    private Date startTime;

    /**
     * 结束答题时间
     */
    private Date endTime;

    /**
     * 做题时间（不需要维护的保留字段）
     */
    private Integer time;

    /**
     * 是否正确（0：错误  1：正确）
     */
    private Boolean isRight;

    /**
     * 知识点id
     */
    private Integer mainKnowledgeId;

    /**
     * 难度
     */
    private Byte difficultLevel;

    /**
     * 来源（0：拍题  1：订正  2：每周一练,  3:知识点 4:教师试卷）
     */
    private Byte source;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentPracticeId() {
        return studentPracticeId;
    }

    public void setStudentPracticeId(Integer studentPracticeId) {
        this.studentPracticeId = studentPracticeId;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getTimuId() {
        return timuId;
    }

    public void setTimuId(String timuId) {
        this.timuId = timuId == null ? null : timuId.trim();
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
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

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Boolean getIsRight() {
        return isRight;
    }

    public void setIsRight(Boolean isRight) {
        this.isRight = isRight;
    }

    public Integer getMainKnowledgeId() {
        return mainKnowledgeId;
    }

    public void setMainKnowledgeId(Integer mainKnowledgeId) {
        this.mainKnowledgeId = mainKnowledgeId;
    }

    public Byte getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(Byte difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
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
        sb.append(", studentId=").append(studentId);
        sb.append(", studentPracticeId=").append(studentPracticeId);
        sb.append(", score=").append(score);
        sb.append(", answer=").append(answer);
        sb.append(", timuId=").append(timuId);
        sb.append(", percent=").append(percent);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", time=").append(time);
        sb.append(", isRight=").append(isRight);
        sb.append(", mainKnowledgeId=").append(mainKnowledgeId);
        sb.append(", difficultLevel=").append(difficultLevel);
        sb.append(", source=").append(source);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}