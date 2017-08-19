package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdTeacherExampaperQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdTeacherExampaperQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelIsNull() {
            addCriterion("difficult_level is null");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelIsNotNull() {
            addCriterion("difficult_level is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelEqualTo(Byte value) {
            addCriterion("difficult_level =", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelNotEqualTo(Byte value) {
            addCriterion("difficult_level <>", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelGreaterThan(Byte value) {
            addCriterion("difficult_level >", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("difficult_level >=", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelLessThan(Byte value) {
            addCriterion("difficult_level <", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelLessThanOrEqualTo(Byte value) {
            addCriterion("difficult_level <=", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelIn(List<Byte> values) {
            addCriterion("difficult_level in", values, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelNotIn(List<Byte> values) {
            addCriterion("difficult_level not in", values, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelBetween(Byte value1, Byte value2) {
            addCriterion("difficult_level between", value1, value2, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("difficult_level not between", value1, value2, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andExampaperIdIsNull() {
            addCriterion("exampaper_id is null");
            return (Criteria) this;
        }

        public Criteria andExampaperIdIsNotNull() {
            addCriterion("exampaper_id is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperIdEqualTo(Integer value) {
            addCriterion("exampaper_id =", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdNotEqualTo(Integer value) {
            addCriterion("exampaper_id <>", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdGreaterThan(Integer value) {
            addCriterion("exampaper_id >", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampaper_id >=", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdLessThan(Integer value) {
            addCriterion("exampaper_id <", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("exampaper_id <=", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdIn(List<Integer> values) {
            addCriterion("exampaper_id in", values, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdNotIn(List<Integer> values) {
            addCriterion("exampaper_id not in", values, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_id between", value1, value2, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_id not between", value1, value2, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperNameIsNull() {
            addCriterion("exampaper_name is null");
            return (Criteria) this;
        }

        public Criteria andExampaperNameIsNotNull() {
            addCriterion("exampaper_name is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperNameEqualTo(String value) {
            addCriterion("exampaper_name =", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotEqualTo(String value) {
            addCriterion("exampaper_name <>", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameGreaterThan(String value) {
            addCriterion("exampaper_name >", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("exampaper_name >=", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameLessThan(String value) {
            addCriterion("exampaper_name <", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameLessThanOrEqualTo(String value) {
            addCriterion("exampaper_name <=", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameLike(String value) {
            addCriterion("exampaper_name like", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotLike(String value) {
            addCriterion("exampaper_name not like", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameIn(List<String> values) {
            addCriterion("exampaper_name in", values, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotIn(List<String> values) {
            addCriterion("exampaper_name not in", values, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameBetween(String value1, String value2) {
            addCriterion("exampaper_name between", value1, value2, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotBetween(String value1, String value2) {
            addCriterion("exampaper_name not between", value1, value2, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Byte value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Byte value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Byte value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Byte value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Byte value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Byte> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Byte> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Byte value1, Byte value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andProvideTimeIsNull() {
            addCriterion("provide_time is null");
            return (Criteria) this;
        }

        public Criteria andProvideTimeIsNotNull() {
            addCriterion("provide_time is not null");
            return (Criteria) this;
        }

        public Criteria andProvideTimeEqualTo(Date value) {
            addCriterion("provide_time =", value, "provideTime");
            return (Criteria) this;
        }

        public Criteria andProvideTimeNotEqualTo(Date value) {
            addCriterion("provide_time <>", value, "provideTime");
            return (Criteria) this;
        }

        public Criteria andProvideTimeGreaterThan(Date value) {
            addCriterion("provide_time >", value, "provideTime");
            return (Criteria) this;
        }

        public Criteria andProvideTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("provide_time >=", value, "provideTime");
            return (Criteria) this;
        }

        public Criteria andProvideTimeLessThan(Date value) {
            addCriterion("provide_time <", value, "provideTime");
            return (Criteria) this;
        }

        public Criteria andProvideTimeLessThanOrEqualTo(Date value) {
            addCriterion("provide_time <=", value, "provideTime");
            return (Criteria) this;
        }

        public Criteria andProvideTimeIn(List<Date> values) {
            addCriterion("provide_time in", values, "provideTime");
            return (Criteria) this;
        }

        public Criteria andProvideTimeNotIn(List<Date> values) {
            addCriterion("provide_time not in", values, "provideTime");
            return (Criteria) this;
        }

        public Criteria andProvideTimeBetween(Date value1, Date value2) {
            addCriterion("provide_time between", value1, value2, "provideTime");
            return (Criteria) this;
        }

        public Criteria andProvideTimeNotBetween(Date value1, Date value2) {
            addCriterion("provide_time not between", value1, value2, "provideTime");
            return (Criteria) this;
        }

        public Criteria andRiseTimeIsNull() {
            addCriterion("rise_time is null");
            return (Criteria) this;
        }

        public Criteria andRiseTimeIsNotNull() {
            addCriterion("rise_time is not null");
            return (Criteria) this;
        }

        public Criteria andRiseTimeEqualTo(Date value) {
            addCriterion("rise_time =", value, "riseTime");
            return (Criteria) this;
        }

        public Criteria andRiseTimeNotEqualTo(Date value) {
            addCriterion("rise_time <>", value, "riseTime");
            return (Criteria) this;
        }

        public Criteria andRiseTimeGreaterThan(Date value) {
            addCriterion("rise_time >", value, "riseTime");
            return (Criteria) this;
        }

        public Criteria andRiseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rise_time >=", value, "riseTime");
            return (Criteria) this;
        }

        public Criteria andRiseTimeLessThan(Date value) {
            addCriterion("rise_time <", value, "riseTime");
            return (Criteria) this;
        }

        public Criteria andRiseTimeLessThanOrEqualTo(Date value) {
            addCriterion("rise_time <=", value, "riseTime");
            return (Criteria) this;
        }

        public Criteria andRiseTimeIn(List<Date> values) {
            addCriterion("rise_time in", values, "riseTime");
            return (Criteria) this;
        }

        public Criteria andRiseTimeNotIn(List<Date> values) {
            addCriterion("rise_time not in", values, "riseTime");
            return (Criteria) this;
        }

        public Criteria andRiseTimeBetween(Date value1, Date value2) {
            addCriterion("rise_time between", value1, value2, "riseTime");
            return (Criteria) this;
        }

        public Criteria andRiseTimeNotBetween(Date value1, Date value2) {
            addCriterion("rise_time not between", value1, value2, "riseTime");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}