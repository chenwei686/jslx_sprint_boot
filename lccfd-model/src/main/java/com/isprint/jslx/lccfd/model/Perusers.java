package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class Perusers implements Serializable {
    private String name;

    private String devicetype;

    private String loginname;

    private String deviceid;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype == null ? null : devicetype.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", devicetype=").append(devicetype);
        sb.append(", loginname=").append(loginname);
        sb.append(", deviceid=").append(deviceid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}