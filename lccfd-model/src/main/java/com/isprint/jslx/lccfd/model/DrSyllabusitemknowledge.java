package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class DrSyllabusitemknowledge implements Serializable {
    private Integer id;

    private Integer syllabusitemId;

    private Integer knowledgeId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSyllabusitemId() {
        return syllabusitemId;
    }

    public void setSyllabusitemId(Integer syllabusitemId) {
        this.syllabusitemId = syllabusitemId;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", syllabusitemId=").append(syllabusitemId);
        sb.append(", knowledgeId=").append(knowledgeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}