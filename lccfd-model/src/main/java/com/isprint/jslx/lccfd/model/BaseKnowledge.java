package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class BaseKnowledge implements Serializable {
    /**
     * 知识点表
     */
    private Integer id;

    /**
     * 知识点描述
     */
    private String name;

    /**
     * 科目id
     */
    private Integer subjectId;

    /**
     * 科目名称
     */
    private String subjectName;

    /**
     * 父知识点
     */
    private Integer parentId;

    /**
     * 学校级别id
     */
    private Integer schoolDegreeId;

    /**
     * 题目所属省份  *：不限 ；对应城市id
     */
    private String provinceIds;

    /**
     * 所属城市
     */
    private String cityIds;

    /**
     * 所属区域
     */
    private String areaIds;

    /**
     * 是否删除
     */
    private Boolean isDel;

    /**
     * 创建时间
     */
    private Date createtime;

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

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSchoolDegreeId() {
        return schoolDegreeId;
    }

    public void setSchoolDegreeId(Integer schoolDegreeId) {
        this.schoolDegreeId = schoolDegreeId;
    }

    public String getProvinceIds() {
        return provinceIds;
    }

    public void setProvinceIds(String provinceIds) {
        this.provinceIds = provinceIds == null ? null : provinceIds.trim();
    }

    public String getCityIds() {
        return cityIds;
    }

    public void setCityIds(String cityIds) {
        this.cityIds = cityIds == null ? null : cityIds.trim();
    }

    public String getAreaIds() {
        return areaIds;
    }

    public void setAreaIds(String areaIds) {
        this.areaIds = areaIds == null ? null : areaIds.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        sb.append(", subjectName=").append(subjectName);
        sb.append(", parentId=").append(parentId);
        sb.append(", schoolDegreeId=").append(schoolDegreeId);
        sb.append(", provinceIds=").append(provinceIds);
        sb.append(", cityIds=").append(cityIds);
        sb.append(", areaIds=").append(areaIds);
        sb.append(", isDel=").append(isDel);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}