package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class BaseTeacher implements Serializable {
    /**
     * 教师表
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 头像
     */
    private String headPic;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 学校id
     */
    private Integer schoolId;

    /**
     * 学校级别
     */
    private String schoolDegreeIds;

    /**
     * 年级id
     */
    private Integer gradeId;

    /**
     * 班级id
     */
    private Integer classesId;

    /**
     * 所教学科
     */
    private Integer subjectId;

    /**
     * 入学年份
     */
    private Integer yearId;

    /**
     * 是否已修改用户名
     */
    private Boolean isChange;

    private Date createTime;

    /**
     * 是否锁定（0：未锁定  1：锁定）
     */
    private Boolean isLock;

    /**
     * 密码输入错误次数
     */
    private Integer lockNumber;

    /**
     * 锁定时间
     */
    private Date lockTime;

    private Date updateTime;

    /**
     * 学校级别
     */
    private Integer teacherDegreeId;

    /**
     * 教师角色
     */
    private String type;

    /**
     * 学校端是不是第一次进入教师端班级管理系统. 0:不是第一次进入  1:已经第一次进入了
     */
    private Boolean isFirst;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolDegreeIds() {
        return schoolDegreeIds;
    }

    public void setSchoolDegreeIds(String schoolDegreeIds) {
        this.schoolDegreeIds = schoolDegreeIds == null ? null : schoolDegreeIds.trim();
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

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public Boolean getIsChange() {
        return isChange;
    }

    public void setIsChange(Boolean isChange) {
        this.isChange = isChange;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public Integer getLockNumber() {
        return lockNumber;
    }

    public void setLockNumber(Integer lockNumber) {
        this.lockNumber = lockNumber;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getTeacherDegreeId() {
        return teacherDegreeId;
    }

    public void setTeacherDegreeId(Integer teacherDegreeId) {
        this.teacherDegreeId = teacherDegreeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Boolean getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(Boolean isFirst) {
        this.isFirst = isFirst;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", password=").append(password);
        sb.append(", realName=").append(realName);
        sb.append(", headPic=").append(headPic);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", schoolDegreeIds=").append(schoolDegreeIds);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", yearId=").append(yearId);
        sb.append(", isChange=").append(isChange);
        sb.append(", createTime=").append(createTime);
        sb.append(", isLock=").append(isLock);
        sb.append(", lockNumber=").append(lockNumber);
        sb.append(", lockTime=").append(lockTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", teacherDegreeId=").append(teacherDegreeId);
        sb.append(", type=").append(type);
        sb.append(", isFirst=").append(isFirst);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}