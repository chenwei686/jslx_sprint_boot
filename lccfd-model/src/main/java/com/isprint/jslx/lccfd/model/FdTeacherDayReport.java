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
     * 学校id
     */
    private Integer schoolId;

    /**
     * 班级id
     */
    private Integer classesId;

    /**
     * 科目的id
     */
    private Integer subjectId;

    /**
     * 日报的日期
     */
    private Date date;

    /**
     * 学生人数
     */
    private Integer studentNum;

    /**
     * 拍题平均数(学生拍题总数/学生人数）
     */
    private Integer paitiAvg;

    /**
     * 拍题平均数在本校排名
     */
    private Integer paitiRank;

    /**
     * 趋势（up/down）
     */
    private String patiCompare;

    /**
     * 拍题前10名学生的名字用逗号隔开
     */
    private String patiTop10;

    /**
     * 拍题后10名学生的名字,用逗号隔开
     */
    private String patiLast10;

    /**
     * 订正率(订正率 = 订正题目数 / 拍题总数)
     */
    private BigDecimal correctRate;

    /**
     * 趋势（up/donw）
     */
    private String correctCompare;

    /**
     * 订正率本校排名
     */
    private Integer correctReteRank;

    /**
     * 订正前10名同学的名字,用逗号隔开
     */
    private String correctTop10;

    /**
     * 拍题最后10名的名字用逗号隔开
     */
    private String correctLast10;

    /**
     * 班级拍题诊断
     */
    private String classDiacrisis;

    /**
     * 班级预警
     */
    private String classWarning;

    /**
     * 拍题数量最多的题目的次数
     */
    private Integer timuIdScore;

    /**
     * 拍题数最多的题目的id
     */
    private String timuId;

    /**
     * 教师试卷提交的人数
     */
    private Integer teacherExampaperCommitCount;

    /**
     * 教师试卷的平均得分
     */
    private Integer avgExampaperScore;

    /**
     * 试卷的总分
     */
    private Integer exampaperFullScore;

    /**
     * 试卷发卷对象的人数
     */
    private Integer teacherPaperObjectCount;

    /**
     * 试卷最高分学生的名字
     */
    private String top1StudentName;

    /**
     * 试卷最高分的分数
     */
    private Integer top1StudentScore;

    /**
     * 班级试卷的诊断
     */
    private String classPaperDiacrisis;

    /**
     * 周练推送的学生数量
     */
    private Integer studentPrictiseCount;

    /**
     * 周练完成的数量
     */
    private Integer studentPrictiseCommitCount;

    /**
     * 周练未完成的学生的名字,用逗号隔开
     */
    private String studentPractiseNotDoneNames;

    /**
     * 记录的创建时间
     */
    private Date createTime;

    private Integer classpaiticount;

    private Integer exampaperid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public Integer getPaitiAvg() {
        return paitiAvg;
    }

    public void setPaitiAvg(Integer paitiAvg) {
        this.paitiAvg = paitiAvg;
    }

    public Integer getPaitiRank() {
        return paitiRank;
    }

    public void setPaitiRank(Integer paitiRank) {
        this.paitiRank = paitiRank;
    }

    public String getPatiCompare() {
        return patiCompare;
    }

    public void setPatiCompare(String patiCompare) {
        this.patiCompare = patiCompare == null ? null : patiCompare.trim();
    }

    public String getPatiTop10() {
        return patiTop10;
    }

    public void setPatiTop10(String patiTop10) {
        this.patiTop10 = patiTop10 == null ? null : patiTop10.trim();
    }

    public String getPatiLast10() {
        return patiLast10;
    }

    public void setPatiLast10(String patiLast10) {
        this.patiLast10 = patiLast10 == null ? null : patiLast10.trim();
    }

    public BigDecimal getCorrectRate() {
        return correctRate;
    }

    public void setCorrectRate(BigDecimal correctRate) {
        this.correctRate = correctRate;
    }

    public String getCorrectCompare() {
        return correctCompare;
    }

    public void setCorrectCompare(String correctCompare) {
        this.correctCompare = correctCompare == null ? null : correctCompare.trim();
    }

    public Integer getCorrectReteRank() {
        return correctReteRank;
    }

    public void setCorrectReteRank(Integer correctReteRank) {
        this.correctReteRank = correctReteRank;
    }

    public String getCorrectTop10() {
        return correctTop10;
    }

    public void setCorrectTop10(String correctTop10) {
        this.correctTop10 = correctTop10 == null ? null : correctTop10.trim();
    }

    public String getCorrectLast10() {
        return correctLast10;
    }

    public void setCorrectLast10(String correctLast10) {
        this.correctLast10 = correctLast10 == null ? null : correctLast10.trim();
    }

    public String getClassDiacrisis() {
        return classDiacrisis;
    }

    public void setClassDiacrisis(String classDiacrisis) {
        this.classDiacrisis = classDiacrisis == null ? null : classDiacrisis.trim();
    }

    public String getClassWarning() {
        return classWarning;
    }

    public void setClassWarning(String classWarning) {
        this.classWarning = classWarning == null ? null : classWarning.trim();
    }

    public Integer getTimuIdScore() {
        return timuIdScore;
    }

    public void setTimuIdScore(Integer timuIdScore) {
        this.timuIdScore = timuIdScore;
    }

    public String getTimuId() {
        return timuId;
    }

    public void setTimuId(String timuId) {
        this.timuId = timuId == null ? null : timuId.trim();
    }

    public Integer getTeacherExampaperCommitCount() {
        return teacherExampaperCommitCount;
    }

    public void setTeacherExampaperCommitCount(Integer teacherExampaperCommitCount) {
        this.teacherExampaperCommitCount = teacherExampaperCommitCount;
    }

    public Integer getAvgExampaperScore() {
        return avgExampaperScore;
    }

    public void setAvgExampaperScore(Integer avgExampaperScore) {
        this.avgExampaperScore = avgExampaperScore;
    }

    public Integer getExampaperFullScore() {
        return exampaperFullScore;
    }

    public void setExampaperFullScore(Integer exampaperFullScore) {
        this.exampaperFullScore = exampaperFullScore;
    }

    public Integer getTeacherPaperObjectCount() {
        return teacherPaperObjectCount;
    }

    public void setTeacherPaperObjectCount(Integer teacherPaperObjectCount) {
        this.teacherPaperObjectCount = teacherPaperObjectCount;
    }

    public String getTop1StudentName() {
        return top1StudentName;
    }

    public void setTop1StudentName(String top1StudentName) {
        this.top1StudentName = top1StudentName == null ? null : top1StudentName.trim();
    }

    public Integer getTop1StudentScore() {
        return top1StudentScore;
    }

    public void setTop1StudentScore(Integer top1StudentScore) {
        this.top1StudentScore = top1StudentScore;
    }

    public String getClassPaperDiacrisis() {
        return classPaperDiacrisis;
    }

    public void setClassPaperDiacrisis(String classPaperDiacrisis) {
        this.classPaperDiacrisis = classPaperDiacrisis == null ? null : classPaperDiacrisis.trim();
    }

    public Integer getStudentPrictiseCount() {
        return studentPrictiseCount;
    }

    public void setStudentPrictiseCount(Integer studentPrictiseCount) {
        this.studentPrictiseCount = studentPrictiseCount;
    }

    public Integer getStudentPrictiseCommitCount() {
        return studentPrictiseCommitCount;
    }

    public void setStudentPrictiseCommitCount(Integer studentPrictiseCommitCount) {
        this.studentPrictiseCommitCount = studentPrictiseCommitCount;
    }

    public String getStudentPractiseNotDoneNames() {
        return studentPractiseNotDoneNames;
    }

    public void setStudentPractiseNotDoneNames(String studentPractiseNotDoneNames) {
        this.studentPractiseNotDoneNames = studentPractiseNotDoneNames == null ? null : studentPractiseNotDoneNames.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getClasspaiticount() {
        return classpaiticount;
    }

    public void setClasspaiticount(Integer classpaiticount) {
        this.classpaiticount = classpaiticount;
    }

    public Integer getExampaperid() {
        return exampaperid;
    }

    public void setExampaperid(Integer exampaperid) {
        this.exampaperid = exampaperid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", classesId=").append(classesId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", date=").append(date);
        sb.append(", studentNum=").append(studentNum);
        sb.append(", paitiAvg=").append(paitiAvg);
        sb.append(", paitiRank=").append(paitiRank);
        sb.append(", patiCompare=").append(patiCompare);
        sb.append(", patiTop10=").append(patiTop10);
        sb.append(", patiLast10=").append(patiLast10);
        sb.append(", correctRate=").append(correctRate);
        sb.append(", correctCompare=").append(correctCompare);
        sb.append(", correctReteRank=").append(correctReteRank);
        sb.append(", correctTop10=").append(correctTop10);
        sb.append(", correctLast10=").append(correctLast10);
        sb.append(", classDiacrisis=").append(classDiacrisis);
        sb.append(", classWarning=").append(classWarning);
        sb.append(", timuIdScore=").append(timuIdScore);
        sb.append(", timuId=").append(timuId);
        sb.append(", teacherExampaperCommitCount=").append(teacherExampaperCommitCount);
        sb.append(", avgExampaperScore=").append(avgExampaperScore);
        sb.append(", exampaperFullScore=").append(exampaperFullScore);
        sb.append(", teacherPaperObjectCount=").append(teacherPaperObjectCount);
        sb.append(", top1StudentName=").append(top1StudentName);
        sb.append(", top1StudentScore=").append(top1StudentScore);
        sb.append(", classPaperDiacrisis=").append(classPaperDiacrisis);
        sb.append(", studentPrictiseCount=").append(studentPrictiseCount);
        sb.append(", studentPrictiseCommitCount=").append(studentPrictiseCommitCount);
        sb.append(", studentPractiseNotDoneNames=").append(studentPractiseNotDoneNames);
        sb.append(", createTime=").append(createTime);
        sb.append(", classpaiticount=").append(classpaiticount);
        sb.append(", exampaperid=").append(exampaperid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}