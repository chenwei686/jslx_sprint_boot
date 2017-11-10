package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class TestStudent implements Serializable {
    private Integer id;

    private String province;

    private String city;

    private String area;

    /**
     * 学籍号
     */
    private String studentCode;

    /**
     * 真实姓名
     */
    private String realName;

    private String xingbie;

    /**
     * 性别（0：女  1：男）
     */
    private Boolean sex;

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
     * 班级id
     */
    private Integer classes;

    /**
     * 年级id
     */
    private String grade;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode == null ? null : studentCode.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie == null ? null : xingbie.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
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

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", studentCode=").append(studentCode);
        sb.append(", realName=").append(realName);
        sb.append(", xingbie=").append(xingbie);
        sb.append(", sex=").append(sex);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", classesId=").append(classesId);
        sb.append(", classes=").append(classes);
        sb.append(", grade=").append(grade);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}