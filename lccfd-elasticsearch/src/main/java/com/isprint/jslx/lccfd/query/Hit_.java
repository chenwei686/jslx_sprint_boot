package com.isprint.jslx.lccfd.query;

/**
 * @author HYL
 * @create 2017-08-15 下午12:36
 **/
public class Hit_ {
    private String index;
    private String type;
    private Float score;
    private TimuInESearch source;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public TimuInESearch getSource() {
        return source;
    }

    public void setSource(TimuInESearch source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Hit_{" +
                "index='" + index + '\'' +
                ", type='" + type + '\'' +
                ", score=" + score +
                ", source=" + source +
                '}';
    }
}
