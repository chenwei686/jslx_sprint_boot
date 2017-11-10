package com.isprint.jslx.lccfd.model;

import java.io.Serializable;
import java.util.Date;

public class FdAdmin implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private String nickName;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 是否删除
     */
    private Boolean isDel;

    /**
     * 权限
     */
    private String power;

    private String mobile;

    /**
     * 是否已修改密码
     */
    private Byte isChangePasswd;

    /**
     * 头像
     */
    private String headPic;

    /**
     * 省份id（省份id,以逗号隔开，* 代表全国）
     */
    private String provinceIds;

    /**
     * 城市id（城市id,以逗号隔开，* 代表全国）
     */
    private String cityIds;

    /**
     * 区域id（区域id,以逗号隔开，* 代表全国）
     */
    private String areaIds;

    /**
     * 省份（省份,以逗号隔开，* 代表全国）
     */
    private String provinces;

    /**
     * 城市（城市,以逗号隔开，* 代表全国）
     */
    private String citys;

    /**
     * 区域（区域,以逗号隔开，* 代表全国）
     */
    private String areas;

    private Date updateTime;

    private Date createTime;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getIsChangePasswd() {
        return isChangePasswd;
    }

    public void setIsChangePasswd(Byte isChangePasswd) {
        this.isChangePasswd = isChangePasswd;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
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

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces == null ? null : provinces.trim();
    }

    public String getCitys() {
        return citys;
    }

    public void setCitys(String citys) {
        this.citys = citys == null ? null : citys.trim();
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas == null ? null : areas.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", nickName=").append(nickName);
        sb.append(", realName=").append(realName);
        sb.append(", isDel=").append(isDel);
        sb.append(", power=").append(power);
        sb.append(", mobile=").append(mobile);
        sb.append(", isChangePasswd=").append(isChangePasswd);
        sb.append(", headPic=").append(headPic);
        sb.append(", provinceIds=").append(provinceIds);
        sb.append(", cityIds=").append(cityIds);
        sb.append(", areaIds=").append(areaIds);
        sb.append(", provinces=").append(provinces);
        sb.append(", citys=").append(citys);
        sb.append(", areas=").append(areas);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}