package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdStudentCorrect implements Serializable {
    /**
     * 学生订正表
     */
    private Integer id;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 题目id
     */
    private String timuId;

    /**
     * 科目id
     */
    private Integer subjectId;

    /**
     * 拍题id
     */
    private Integer studentSearchId;

    /**
     * 是否正确（0：错误  1：正确）
     */
    private Boolean isRight;

    /**
     * 答案
     */
    private String answer;

    /**
     * 学校id
     */
    private Integer schoolId;

    /**
     * 年级id
     */
    private Integer gradeId;

    /**
     * 班级id
     */
    private Integer classesId;

    private Integer yearId;

    /**
     * 是否收藏
     */
    private Boolean isCollect;

    /**
     * 收藏id
     */
    private Integer collectId;

    /**
     * 知识点id
     */
    private Integer mainKnowledgeId;

    /**
     * 难度
     */
    private Byte difficultLevel;

    private Date createTime;

    /**
     * 来源（0：拍题  1：订正  2：每周一练,  3:知识点 4:教师试卷 5：收藏  6：时间轴）
     */
    private Byte source;

    /**
     * 来源对应的数据id
     */
    private Integer sourceId;

    /**
     * 关联的题目id
     */
    private String correctTimuId;

    private String studentSearchTimuId;

    private Integer schoolDegreeId;

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

    public String getTimuId() {
        return timuId;
    }

    public void setTimuId(String timuId) {
        this.timuId = timuId == null ? null : timuId.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getStudentSearchId() {
        return studentSearchId;
    }

    public void setStudentSearchId(Integer studentSearchId) {
        this.studentSearchId = studentSearchId;
    }

    public Boolean getIsRight() {
        return isRight;
    }

    public void setIsRight(Boolean isRight) {
        this.isRight = isRight;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public Boolean getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Boolean isCollect) {
        this.isCollect = isCollect;
    }

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getCorrectTimuId() {
        return correctTimuId;
    }

    public void setCorrectTimuId(String correctTimuId) {
        this.correctTimuId = correctTimuId == null ? null : correctTimuId.trim();
    }

    public String getStudentSearchTimuId() {
        return studentSearchTimuId;
    }

    public void setStudentSearchTimuId(String studentSearchTimuId) {
        this.studentSearchTimuId = studentSearchTimuId == null ? null : studentSearchTimuId.trim();
    }

    public Integer getSchoolDegreeId() {
        return schoolDegreeId;
    }

    public void setSchoolDegreeId(Integer schoolDegreeId) {
        this.schoolDegreeId = schoolDegreeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", studentId=").append(studentId);
        sb.append(", timuId=").append(timuId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", studentSearchId=").append(studentSearchId);
        sb.append(", isRight=").append(isRight);
        sb.append(", answer=").append(answer);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", isCollect=").append(isCollect);
        sb.append(", collectId=").append(collectId);
        sb.append(", mainKnowledgeId=").append(mainKnowledgeId);
        sb.append(", difficultLevel=").append(difficultLevel);
        sb.append(", createTime=").append(createTime);
        sb.append(", source=").append(source);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", correctTimuId=").append(correctTimuId);
        sb.append(", studentSearchTimuId=").append(studentSearchTimuId);
        sb.append(", schoolDegreeId=").append(schoolDegreeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}