package com.isprint.jslx.lccfd.query;

/**
 * @author HYL
 * @create 2017-08-14 下午5:15
 **/
public class TimuInESearch {
    private Integer timuTypeId;
    private String timuId;
    private String inputChoiceJson;
    private Integer mainKnowledgeId;
    private String trunk;
    private Integer subjectId;
    private Integer difficultLevel;
    private String videoCode;
    private boolean isCollected=false;

    public boolean isCollected() {
        return isCollected;
    }

    public void setCollected(boolean collected) {
        isCollected = collected;
    }

    public Integer getTimuTypeId() {
        return timuTypeId;
    }

    public void setTimuTypeId(Integer timuTypeId) {
        this.timuTypeId = timuTypeId;
    }

    public String getTimuId() {
        return timuId;
    }

    public void setTimuId(String timuId) {
        this.timuId = timuId;
    }

    public String getInputChoiceJson() {
        return inputChoiceJson;
    }

    public void setInputChoiceJson(String inputChoiceJson) {
        this.inputChoiceJson = inputChoiceJson;
    }

    public Integer getMainKnowledgeId() {
        return mainKnowledgeId;
    }

    public void setMainKnowledgeId(Integer mainKnowledgeId) {
        this.mainKnowledgeId = mainKnowledgeId;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(Integer difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public String getVideoCode() {
        return videoCode;
    }

    public void setVideoCode(String videoCode) {
        this.videoCode = videoCode;
    }

    @Override
    public String toString() {
        return "TimuInESearch{" +
                "timuTypeId=" + timuTypeId +
                ", timuId='" + timuId + '\'' +
                ", inputChoiceJson='" + inputChoiceJson + '\'' +
                ", mainKnowledgeId=" + mainKnowledgeId +
                ", trunk='" + trunk + '\'' +
                ", subjectId=" + subjectId +
                ", difficultLevel=" + difficultLevel +
                ", videoCode='" + videoCode + '\'' +
                ", isCollected=" + isCollected +
                '}';
    }
}
