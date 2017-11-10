package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class BaseTimuTypeSort implements Serializable {
    private Integer id;

    private Integer timuTypeId;

    /**
     * 科目id
     */
    private String subjectId;

    /**
     * 排序
     */
    private Integer sort;

    private Integer parentSubjectId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTimuTypeId() {
        return timuTypeId;
    }

    public void setTimuTypeId(Integer timuTypeId) {
        this.timuTypeId = timuTypeId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getParentSubjectId() {
        return parentSubjectId;
    }

    public void setParentSubjectId(Integer parentSubjectId) {
        this.parentSubjectId = parentSubjectId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", timuTypeId=").append(timuTypeId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", sort=").append(sort);
        sb.append(", parentSubjectId=").append(parentSubjectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}