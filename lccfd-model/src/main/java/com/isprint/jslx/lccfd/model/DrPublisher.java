package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class DrPublisher implements Serializable {
    private Integer id;

    private String identifier;

    private String name;

    private String area;

    private String managercompany;

    private String hostcompany;

    private String type;

    private Byte active;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getManagercompany() {
        return managercompany;
    }

    public void setManagercompany(String managercompany) {
        this.managercompany = managercompany == null ? null : managercompany.trim();
    }

    public String getHostcompany() {
        return hostcompany;
    }

    public void setHostcompany(String hostcompany) {
        this.hostcompany = hostcompany == null ? null : hostcompany.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", identifier=").append(identifier);
        sb.append(", name=").append(name);
        sb.append(", area=").append(area);
        sb.append(", managercompany=").append(managercompany);
        sb.append(", hostcompany=").append(hostcompany);
        sb.append(", type=").append(type);
        sb.append(", active=").append(active);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}