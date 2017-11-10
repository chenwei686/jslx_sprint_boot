package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class BaseStudent implements Serializable {
    /**
     * 学生表
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 学籍号
     */
    private String studentCode;

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
     * 性别（0：女  1：男）
     */
    private Boolean sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 用户来源('android','ios','system')
     */
    private String source;

    /**
     * 注册验证码
     */
    private String checkCode;

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

    /**
     * 学级
     */
    private Integer yearId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 是否锁定（0：未锁定  1：锁定）
     */
    private Boolean isLock;

    /**
     * 是否已修改用户名
     */
    private Boolean isChange;

    /**
     * 是否激活（0：未激活  1：已激活）手机号验证码登录可跳过密码设置；其他方式首次登录必须设置密码
     */
    private Boolean isActivate;

    private Date updateTime;

    private Date createTime;

    /**
     * 密码输入错误次数
     */
    private Integer lockNumber;

    /**
     * 锁定时间
     */
    private Date lockTime;

    /**
     * 数学免费次数
     */
    private Integer mathNumber;

    /**
     * 化学免费次数
     */
    private Integer physicsNumber;

    /**
     * 化学免费次数
     */
    private Integer chemistryNumber;

    /**
     * 免费更新时间
     */
    private Date freeTime;

    /**
     * 学生类型
     */
    private String studentType;

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

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode == null ? null : studentCode.trim();
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode == null ? null : checkCode.trim();
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public Boolean getIsChange() {
        return isChange;
    }

    public void setIsChange(Boolean isChange) {
        this.isChange = isChange;
    }

    public Boolean getIsActivate() {
        return isActivate;
    }

    public void setIsActivate(Boolean isActivate) {
        this.isActivate = isActivate;
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

    public Integer getMathNumber() {
        return mathNumber;
    }

    public void setMathNumber(Integer mathNumber) {
        this.mathNumber = mathNumber;
    }

    public Integer getPhysicsNumber() {
        return physicsNumber;
    }

    public void setPhysicsNumber(Integer physicsNumber) {
        this.physicsNumber = physicsNumber;
    }

    public Integer getChemistryNumber() {
        return chemistryNumber;
    }

    public void setChemistryNumber(Integer chemistryNumber) {
        this.chemistryNumber = chemistryNumber;
    }

    public Date getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(Date freeTime) {
        this.freeTime = freeTime;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType == null ? null : studentType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", studentCode=").append(studentCode);
        sb.append(", password=").append(password);
        sb.append(", realName=").append(realName);
        sb.append(", headPic=").append(headPic);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", source=").append(source);
        sb.append(", checkCode=").append(checkCode);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", yearId=").append(yearId);
        sb.append(", mobile=").append(mobile);
        sb.append(", isLock=").append(isLock);
        sb.append(", isChange=").append(isChange);
        sb.append(", isActivate=").append(isActivate);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", lockNumber=").append(lockNumber);
        sb.append(", lockTime=").append(lockTime);
        sb.append(", mathNumber=").append(mathNumber);
        sb.append(", physicsNumber=").append(physicsNumber);
        sb.append(", chemistryNumber=").append(chemistryNumber);
        sb.append(", freeTime=").append(freeTime);
        sb.append(", studentType=").append(studentType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}