package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BaseTimuSearch implements Serializable {
    private String trunk;
    private String input_json;

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public String getInput_json() {
        return input_json;
    }

    public void setInput_json(String input_json) {
        this.input_json = input_json;
    }

    /**
     * 题目表
     */
    private String id;

    /**
     * 科目id
     */
    private Integer subjectId;

    /**
     * 题目类型id
     */
    private Integer timuTypeId;

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
     * 标准时间(分)
     */
    private Integer time;

    /**
     * 标准分
     */
    private BigDecimal scroe;

    /**
     * 年级id
     */
    private Integer gradeId;

    /**
     * 题目年份
     */
    private Integer yearId;

    /**
     * 父题id
     */
    private String parentId;

    /**
     * 视频code
     */
    private String videoCode;

    /**
     * 题目来源(0.原题库，1.辅导录题 2：第三方题库)
     */
    private Byte source;

    /**
     * 是否扩展练习推送（0：否   1；是）
     */
    private Boolean isExpandPractice;

    /**
     * 是否有子题
     */
    private Boolean isHaveChild;

    /**
     * 题目图片  [{"images":"https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=4251309574,288626851&fm=173&s=26A1C1A0605231DA5AE7CB9E0300C08D&w=218&h=146&img.JPEG","update_time": 2017-05-11 23:00:00},{"images":"https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=2842217365,1654693395&fm=173&s=32A2E8A44D9822490867869F0300C086&w=218&h=146&img.JPEG","update_time": 2017-05-11 23:00:00}]
     */
    private String pictureJson;

    /**
     * 难度
     */
    private Byte difficultLevel;

    private String inputJson;

    private String inputChoiceJson;

    private Integer mainKnowledgeId;

    private Integer sort;

    private Date createTime;

    /**
     * 学校级别id
     */
    private Integer schoolDegreeId;

    private Date updateTime;

    /**
     * 题目是否已插入缓存
     */
    private Boolean isExecute;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getTimuTypeId() {
        return timuTypeId;
    }

    public void setTimuTypeId(Integer timuTypeId) {
        this.timuTypeId = timuTypeId;
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

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public BigDecimal getScroe() {
        return scroe;
    }

    public void setScroe(BigDecimal scroe) {
        this.scroe = scroe;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getVideoCode() {
        return videoCode;
    }

    public void setVideoCode(String videoCode) {
        this.videoCode = videoCode == null ? null : videoCode.trim();
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Boolean getIsExpandPractice() {
        return isExpandPractice;
    }

    public void setIsExpandPractice(Boolean isExpandPractice) {
        this.isExpandPractice = isExpandPractice;
    }

    public Boolean getIsHaveChild() {
        return isHaveChild;
    }

    public void setIsHaveChild(Boolean isHaveChild) {
        this.isHaveChild = isHaveChild;
    }

    public String getPictureJson() {
        return pictureJson;
    }

    public void setPictureJson(String pictureJson) {
        this.pictureJson = pictureJson == null ? null : pictureJson.trim();
    }

    public Byte getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(Byte difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public String getInputJson() {
        return inputJson;
    }

    public void setInputJson(String inputJson) {
        this.inputJson = inputJson == null ? null : inputJson.trim();
    }

    public String getInputChoiceJson() {
        return inputChoiceJson;
    }

    public void setInputChoiceJson(String inputChoiceJson) {
        this.inputChoiceJson = inputChoiceJson == null ? null : inputChoiceJson.trim();
    }

    public Integer getMainKnowledgeId() {
        return mainKnowledgeId;
    }

    public void setMainKnowledgeId(Integer mainKnowledgeId) {
        this.mainKnowledgeId = mainKnowledgeId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSchoolDegreeId() {
        return schoolDegreeId;
    }

    public void setSchoolDegreeId(Integer schoolDegreeId) {
        this.schoolDegreeId = schoolDegreeId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsExecute() {
        return isExecute;
    }

    public void setIsExecute(Boolean isExecute) {
        this.isExecute = isExecute;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", timuTypeId=").append(timuTypeId);
        sb.append(", provinceIds=").append(provinceIds);
        sb.append(", cityIds=").append(cityIds);
        sb.append(", areaIds=").append(areaIds);
        sb.append(", time=").append(time);
        sb.append(", scroe=").append(scroe);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", yearId=").append(yearId);
        sb.append(", parentId=").append(parentId);
        sb.append(", videoCode=").append(videoCode);
        sb.append(", source=").append(source);
        sb.append(", isExpandPractice=").append(isExpandPractice);
        sb.append(", isHaveChild=").append(isHaveChild);
        sb.append(", pictureJson=").append(pictureJson);
        sb.append(", difficultLevel=").append(difficultLevel);
        sb.append(", inputJson=").append(inputJson);
        sb.append(", inputChoiceJson=").append(inputChoiceJson);
        sb.append(", mainKnowledgeId=").append(mainKnowledgeId);
        sb.append(", sort=").append(sort);
        sb.append(", createTime=").append(createTime);
        sb.append(", schoolDegreeId=").append(schoolDegreeId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isExecute=").append(isExecute);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}