package com.isprint.jslx.lccfd.model;

import java.io.Serializable;

public class InputchoiceWithBLOBs extends Inputchoice implements Serializable {
    private String id;

    private String choicecontent;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChoicecontent() {
        return choicecontent;
    }

    public void setChoicecontent(String choicecontent) {
        this.choicecontent = choicecontent == null ? null : choicecontent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", choicecontent=").append(choicecontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}