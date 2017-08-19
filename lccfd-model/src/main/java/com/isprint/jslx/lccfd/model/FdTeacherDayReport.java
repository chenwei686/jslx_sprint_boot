package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FdTeacherDayReport implements Serializable {
    /**
     * 教师日报表
     */
    private Integer id;

    /**
     * 搜题数
     */
    private Integer searchNum;

    /**
     * 订正题目数
     */
    private Integer correctNum;

    /**
     * 上次的订正题目数
     */
    private Integer correctNumLast;

    /**
     * 趋势（-1：下降 0：不显示趋势 1：上升）
     */
    private Byte correctNumTreed;

    /**
     * 订正率(订正率 = 订正题目数 / 拍题总数)
     */
    private BigDecimal correctPro;

    /**
     * 上次的订正率(订正率 = 订正题目数 / 拍题总数)
     */
    private BigDecimal correctProLast;

    /**
     * 趋势（-1：下降 0：不显示趋势 1：上升）
     */
    private Byte correctProTreed;

    /**
     * 拍题较多的学生ids（显示10名学生）
     */
    private String searchMaxStudentIds;

    /**
     * 拍题较少的学生ids
     */
    private String searchMinStudentIds;

    /**
     * 新增盲点
     */
    private String blindKnowledge;

    /**
     * 新增弱点
     */
    private String weakKnowledge;

    /**
     * 新增难点
     */
    private String difficultyKnowledge;

    /**
     * 基本功知识点
     */
    private String baseKnowledge;

    /**
     * 优势知识点
     */
    private String meritKnowledge;

    /**
     * 强项知识点
     */
    private String strongKnowledge;

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

    private String year;

    private Date date;

    private Date updateTime;

    private Date createTime;

    /**
     * 拍题最多的题目
     */
    private Integer searchMaxTimuId;

    /**
     * 最多拍题的次数
     */
    private Integer searchMaxTimuNum;

    /**
     * 订正率最高的学生
     */
    private String correctMaxStudentIds;

    private String correctMinStudentIds;

    private Integer exampaperId;

    /**
     * 试卷学生练习总数
     */
    private Integer exampaperTotalNum;

    /**
     * 试卷学生练习总分
     */
    private BigDecimal exampaperTotalScore;

    /**
     * 试卷学生提交总数
     */
    private Integer exampaperCommitNum;

    /**
     * 试卷最高分学生
     */
    private Integer exampaperStudentId;

    /**
     * 分数
     */
    private BigDecimal exampaperMaxScore;

    /**
     * 试卷总分
     */
    private BigDecimal exampaperScore;

    /**
     * 试卷平局分
     */
    private BigDecimal exampaperAverageScore;

    /**
     * 拍题评语id
     */
    private Integer searchCommentId;

    private String searchComment;

    /**
     * 订正评语
     */
    private Integer correctCommentId;

    private String correctComment;

    /**
     * 使用情况评语
     */
    private Integer useCommentId;

    private String useComment;

    /**
     * 试卷练习评语
     */
    private Integer exampaperCommentId;

    private String exampaperComment;

    /**
     * 每周一练学生数
     */
    private Integer practiceStudentNum;

    /**
     * 完成每周一练学生ids
     */
    private String practiceFinishStudentIds;

    /**
     * 未完成学生数
     */
    private Integer practiceFinishStudentNum;

    /**
     * 未完成每周一练学生ids
     */
    private String practiceUnfinishStudentIds;

    /**
     * 未完成每周一练学生数
     */
    private Integer practiceUnfinishStudentNum;

    private Integer teacherId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(Integer searchNum) {
        this.searchNum = searchNum;
    }

    public Integer getCorrectNum() {
        return correctNum;
    }

    public void setCorrectNum(Integer correctNum) {
        this.correctNum = correctNum;
    }

    public Integer getCorrectNumLast() {
        return correctNumLast;
    }

    public void setCorrectNumLast(Integer correctNumLast) {
        this.correctNumLast = correctNumLast;
    }

    public Byte getCorrectNumTreed() {
        return correctNumTreed;
    }

    public void setCorrectNumTreed(Byte correctNumTreed) {
        this.correctNumTreed = correctNumTreed;
    }

    public BigDecimal getCorrectPro() {
        return correctPro;
    }

    public void setCorrectPro(BigDecimal correctPro) {
        this.correctPro = correctPro;
    }

    public BigDecimal getCorrectProLast() {
        return correctProLast;
    }

    public void setCorrectProLast(BigDecimal correctProLast) {
        this.correctProLast = correctProLast;
    }

    public Byte getCorrectProTreed() {
        return correctProTreed;
    }

    public void setCorrectProTreed(Byte correctProTreed) {
        this.correctProTreed = correctProTreed;
    }

    public String getSearchMaxStudentIds() {
        return searchMaxStudentIds;
    }

    public void setSearchMaxStudentIds(String searchMaxStudentIds) {
        this.searchMaxStudentIds = searchMaxStudentIds == null ? null : searchMaxStudentIds.trim();
    }

    public String getSearchMinStudentIds() {
        return searchMinStudentIds;
    }

    public void setSearchMinStudentIds(String searchMinStudentIds) {
        this.searchMinStudentIds = searchMinStudentIds == null ? null : searchMinStudentIds.trim();
    }

    public String getBlindKnowledge() {
        return blindKnowledge;
    }

    public void setBlindKnowledge(String blindKnowledge) {
        this.blindKnowledge = blindKnowledge == null ? null : blindKnowledge.trim();
    }

    public String getWeakKnowledge() {
        return weakKnowledge;
    }

    public void setWeakKnowledge(String weakKnowledge) {
        this.weakKnowledge = weakKnowledge == null ? null : weakKnowledge.trim();
    }

    public String getDifficultyKnowledge() {
        return difficultyKnowledge;
    }

    public void setDifficultyKnowledge(String difficultyKnowledge) {
        this.difficultyKnowledge = difficultyKnowledge == null ? null : difficultyKnowledge.trim();
    }

    public String getBaseKnowledge() {
        return baseKnowledge;
    }

    public void setBaseKnowledge(String baseKnowledge) {
        this.baseKnowledge = baseKnowledge == null ? null : baseKnowledge.trim();
    }

    public String getMeritKnowledge() {
        return meritKnowledge;
    }

    public void setMeritKnowledge(String meritKnowledge) {
        this.meritKnowledge = meritKnowledge == null ? null : meritKnowledge.trim();
    }

    public String getStrongKnowledge() {
        return strongKnowledge;
    }

    public void setStrongKnowledge(String strongKnowledge) {
        this.strongKnowledge = strongKnowledge == null ? null : strongKnowledge.trim();
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Integer getSearchMaxTimuId() {
        return searchMaxTimuId;
    }

    public void setSearchMaxTimuId(Integer searchMaxTimuId) {
        this.searchMaxTimuId = searchMaxTimuId;
    }

    public Integer getSearchMaxTimuNum() {
        return searchMaxTimuNum;
    }

    public void setSearchMaxTimuNum(Integer searchMaxTimuNum) {
        this.searchMaxTimuNum = searchMaxTimuNum;
    }

    public String getCorrectMaxStudentIds() {
        return correctMaxStudentIds;
    }

    public void setCorrectMaxStudentIds(String correctMaxStudentIds) {
        this.correctMaxStudentIds = correctMaxStudentIds == null ? null : correctMaxStudentIds.trim();
    }

    public String getCorrectMinStudentIds() {
        return correctMinStudentIds;
    }

    public void setCorrectMinStudentIds(String correctMinStudentIds) {
        this.correctMinStudentIds = correctMinStudentIds == null ? null : correctMinStudentIds.trim();
    }

    public Integer getExampaperId() {
        return exampaperId;
    }

    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }

    public Integer getExampaperTotalNum() {
        return exampaperTotalNum;
    }

    public void setExampaperTotalNum(Integer exampaperTotalNum) {
        this.exampaperTotalNum = exampaperTotalNum;
    }

    public BigDecimal getExampaperTotalScore() {
        return exampaperTotalScore;
    }

    public void setExampaperTotalScore(BigDecimal exampaperTotalScore) {
        this.exampaperTotalScore = exampaperTotalScore;
    }

    public Integer getExampaperCommitNum() {
        return exampaperCommitNum;
    }

    public void setExampaperCommitNum(Integer exampaperCommitNum) {
        this.exampaperCommitNum = exampaperCommitNum;
    }

    public Integer getExampaperStudentId() {
        return exampaperStudentId;
    }

    public void setExampaperStudentId(Integer exampaperStudentId) {
        this.exampaperStudentId = exampaperStudentId;
    }

    public BigDecimal getExampaperMaxScore() {
        return exampaperMaxScore;
    }

    public void setExampaperMaxScore(BigDecimal exampaperMaxScore) {
        this.exampaperMaxScore = exampaperMaxScore;
    }

    public BigDecimal getExampaperScore() {
        return exampaperScore;
    }

    public void setExampaperScore(BigDecimal exampaperScore) {
        this.exampaperScore = exampaperScore;
    }

    public BigDecimal getExampaperAverageScore() {
        return exampaperAverageScore;
    }

    public void setExampaperAverageScore(BigDecimal exampaperAverageScore) {
        this.exampaperAverageScore = exampaperAverageScore;
    }

    public Integer getSearchCommentId() {
        return searchCommentId;
    }

    public void setSearchCommentId(Integer searchCommentId) {
        this.searchCommentId = searchCommentId;
    }

    public String getSearchComment() {
        return searchComment;
    }

    public void setSearchComment(String searchComment) {
        this.searchComment = searchComment == null ? null : searchComment.trim();
    }

    public Integer getCorrectCommentId() {
        return correctCommentId;
    }

    public void setCorrectCommentId(Integer correctCommentId) {
        this.correctCommentId = correctCommentId;
    }

    public String getCorrectComment() {
        return correctComment;
    }

    public void setCorrectComment(String correctComment) {
        this.correctComment = correctComment == null ? null : correctComment.trim();
    }

    public Integer getUseCommentId() {
        return useCommentId;
    }

    public void setUseCommentId(Integer useCommentId) {
        this.useCommentId = useCommentId;
    }

    public String getUseComment() {
        return useComment;
    }

    public void setUseComment(String useComment) {
        this.useComment = useComment == null ? null : useComment.trim();
    }

    public Integer getExampaperCommentId() {
        return exampaperCommentId;
    }

    public void setExampaperCommentId(Integer exampaperCommentId) {
        this.exampaperCommentId = exampaperCommentId;
    }

    public String getExampaperComment() {
        return exampaperComment;
    }

    public void setExampaperComment(String exampaperComment) {
        this.exampaperComment = exampaperComment == null ? null : exampaperComment.trim();
    }

    public Integer getPracticeStudentNum() {
        return practiceStudentNum;
    }

    public void setPracticeStudentNum(Integer practiceStudentNum) {
        this.practiceStudentNum = practiceStudentNum;
    }

    public String getPracticeFinishStudentIds() {
        return practiceFinishStudentIds;
    }

    public void setPracticeFinishStudentIds(String practiceFinishStudentIds) {
        this.practiceFinishStudentIds = practiceFinishStudentIds == null ? null : practiceFinishStudentIds.trim();
    }

    public Integer getPracticeFinishStudentNum() {
        return practiceFinishStudentNum;
    }

    public void setPracticeFinishStudentNum(Integer practiceFinishStudentNum) {
        this.practiceFinishStudentNum = practiceFinishStudentNum;
    }

    public String getPracticeUnfinishStudentIds() {
        return practiceUnfinishStudentIds;
    }

    public void setPracticeUnfinishStudentIds(String practiceUnfinishStudentIds) {
        this.practiceUnfinishStudentIds = practiceUnfinishStudentIds == null ? null : practiceUnfinishStudentIds.trim();
    }

    public Integer getPracticeUnfinishStudentNum() {
        return practiceUnfinishStudentNum;
    }

    public void setPracticeUnfinishStudentNum(Integer practiceUnfinishStudentNum) {
        this.practiceUnfinishStudentNum = practiceUnfinishStudentNum;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", searchNum=").append(searchNum);
        sb.append(", correctNum=").append(correctNum);
        sb.append(", correctNumLast=").append(correctNumLast);
        sb.append(", correctNumTreed=").append(correctNumTreed);
        sb.append(", correctPro=").append(correctPro);
        sb.append(", correctProLast=").append(correctProLast);
        sb.append(", correctProTreed=").append(correctProTreed);
        sb.append(", searchMaxStudentIds=").append(searchMaxStudentIds);
        sb.append(", searchMinStudentIds=").append(searchMinStudentIds);
        sb.append(", blindKnowledge=").append(blindKnowledge);
        sb.append(", weakKnowledge=").append(weakKnowledge);
        sb.append(", difficultyKnowledge=").append(difficultyKnowledge);
        sb.append(", baseKnowledge=").append(baseKnowledge);
        sb.append(", meritKnowledge=").append(meritKnowledge);
        sb.append(", strongKnowledge=").append(strongKnowledge);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", year=").append(year);
        sb.append(", date=").append(date);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", searchMaxTimuId=").append(searchMaxTimuId);
        sb.append(", searchMaxTimuNum=").append(searchMaxTimuNum);
        sb.append(", correctMaxStudentIds=").append(correctMaxStudentIds);
        sb.append(", correctMinStudentIds=").append(correctMinStudentIds);
        sb.append(", exampaperId=").append(exampaperId);
        sb.append(", exampaperTotalNum=").append(exampaperTotalNum);
        sb.append(", exampaperTotalScore=").append(exampaperTotalScore);
        sb.append(", exampaperCommitNum=").append(exampaperCommitNum);
        sb.append(", exampaperStudentId=").append(exampaperStudentId);
        sb.append(", exampaperMaxScore=").append(exampaperMaxScore);
        sb.append(", exampaperScore=").append(exampaperScore);
        sb.append(", exampaperAverageScore=").append(exampaperAverageScore);
        sb.append(", searchCommentId=").append(searchCommentId);
        sb.append(", searchComment=").append(searchComment);
        sb.append(", correctCommentId=").append(correctCommentId);
        sb.append(", correctComment=").append(correctComment);
        sb.append(", useCommentId=").append(useCommentId);
        sb.append(", useComment=").append(useComment);
        sb.append(", exampaperCommentId=").append(exampaperCommentId);
        sb.append(", exampaperComment=").append(exampaperComment);
        sb.append(", practiceStudentNum=").append(practiceStudentNum);
        sb.append(", practiceFinishStudentIds=").append(practiceFinishStudentIds);
        sb.append(", practiceFinishStudentNum=").append(practiceFinishStudentNum);
        sb.append(", practiceUnfinishStudentIds=").append(practiceUnfinishStudentIds);
        sb.append(", practiceUnfinishStudentNum=").append(practiceUnfinishStudentNum);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}