package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.List;

public class TimuattributeextendQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public TimuattributeextendQuery() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLanguageidIsNull() {
            addCriterion("LanguageId is null");
            return (Criteria) this;
        }

        public Criteria andLanguageidIsNotNull() {
            addCriterion("LanguageId is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageidEqualTo(Integer value) {
            addCriterion("LanguageId =", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidNotEqualTo(Integer value) {
            addCriterion("LanguageId <>", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidGreaterThan(Integer value) {
            addCriterion("LanguageId >", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LanguageId >=", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidLessThan(Integer value) {
            addCriterion("LanguageId <", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidLessThanOrEqualTo(Integer value) {
            addCriterion("LanguageId <=", value, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidIn(List<Integer> values) {
            addCriterion("LanguageId in", values, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidNotIn(List<Integer> values) {
            addCriterion("LanguageId not in", values, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidBetween(Integer value1, Integer value2) {
            addCriterion("LanguageId between", value1, value2, "languageid");
            return (Criteria) this;
        }

        public Criteria andLanguageidNotBetween(Integer value1, Integer value2) {
            addCriterion("LanguageId not between", value1, value2, "languageid");
            return (Criteria) this;
        }

        public Criteria andLimittimeIsNull() {
            addCriterion("LimitTime is null");
            return (Criteria) this;
        }

        public Criteria andLimittimeIsNotNull() {
            addCriterion("LimitTime is not null");
            return (Criteria) this;
        }

        public Criteria andLimittimeEqualTo(String value) {
            addCriterion("LimitTime =", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeNotEqualTo(String value) {
            addCriterion("LimitTime <>", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeGreaterThan(String value) {
            addCriterion("LimitTime >", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeGreaterThanOrEqualTo(String value) {
            addCriterion("LimitTime >=", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeLessThan(String value) {
            addCriterion("LimitTime <", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeLessThanOrEqualTo(String value) {
            addCriterion("LimitTime <=", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeLike(String value) {
            addCriterion("LimitTime like", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeNotLike(String value) {
            addCriterion("LimitTime not like", value, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeIn(List<String> values) {
            addCriterion("LimitTime in", values, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeNotIn(List<String> values) {
            addCriterion("LimitTime not in", values, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeBetween(String value1, String value2) {
            addCriterion("LimitTime between", value1, value2, "limittime");
            return (Criteria) this;
        }

        public Criteria andLimittimeNotBetween(String value1, String value2) {
            addCriterion("LimitTime not between", value1, value2, "limittime");
            return (Criteria) this;
        }

        public Criteria andPublishidIsNull() {
            addCriterion("PublishId is null");
            return (Criteria) this;
        }

        public Criteria andPublishidIsNotNull() {
            addCriterion("PublishId is not null");
            return (Criteria) this;
        }

        public Criteria andPublishidEqualTo(Integer value) {
            addCriterion("PublishId =", value, "publishid");
            return (Criteria) this;
        }

        public Criteria andPublishidNotEqualTo(Integer value) {
            addCriterion("PublishId <>", value, "publishid");
            return (Criteria) this;
        }

        public Criteria andPublishidGreaterThan(Integer value) {
            addCriterion("PublishId >", value, "publishid");
            return (Criteria) this;
        }

        public Criteria andPublishidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PublishId >=", value, "publishid");
            return (Criteria) this;
        }

        public Criteria andPublishidLessThan(Integer value) {
            addCriterion("PublishId <", value, "publishid");
            return (Criteria) this;
        }

        public Criteria andPublishidLessThanOrEqualTo(Integer value) {
            addCriterion("PublishId <=", value, "publishid");
            return (Criteria) this;
        }

        public Criteria andPublishidIn(List<Integer> values) {
            addCriterion("PublishId in", values, "publishid");
            return (Criteria) this;
        }

        public Criteria andPublishidNotIn(List<Integer> values) {
            addCriterion("PublishId not in", values, "publishid");
            return (Criteria) this;
        }

        public Criteria andPublishidBetween(Integer value1, Integer value2) {
            addCriterion("PublishId between", value1, value2, "publishid");
            return (Criteria) this;
        }

        public Criteria andPublishidNotBetween(Integer value1, Integer value2) {
            addCriterion("PublishId not between", value1, value2, "publishid");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkIsNull() {
            addCriterion("MidTestMark is null");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkIsNotNull() {
            addCriterion("MidTestMark is not null");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkEqualTo(String value) {
            addCriterion("MidTestMark =", value, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkNotEqualTo(String value) {
            addCriterion("MidTestMark <>", value, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkGreaterThan(String value) {
            addCriterion("MidTestMark >", value, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkGreaterThanOrEqualTo(String value) {
            addCriterion("MidTestMark >=", value, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkLessThan(String value) {
            addCriterion("MidTestMark <", value, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkLessThanOrEqualTo(String value) {
            addCriterion("MidTestMark <=", value, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkLike(String value) {
            addCriterion("MidTestMark like", value, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkNotLike(String value) {
            addCriterion("MidTestMark not like", value, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkIn(List<String> values) {
            addCriterion("MidTestMark in", values, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkNotIn(List<String> values) {
            addCriterion("MidTestMark not in", values, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkBetween(String value1, String value2) {
            addCriterion("MidTestMark between", value1, value2, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andMidtestmarkNotBetween(String value1, String value2) {
            addCriterion("MidTestMark not between", value1, value2, "midtestmark");
            return (Criteria) this;
        }

        public Criteria andCombinecountIsNull() {
            addCriterion("CombineCount is null");
            return (Criteria) this;
        }

        public Criteria andCombinecountIsNotNull() {
            addCriterion("CombineCount is not null");
            return (Criteria) this;
        }

        public Criteria andCombinecountEqualTo(Integer value) {
            addCriterion("CombineCount =", value, "combinecount");
            return (Criteria) this;
        }

        public Criteria andCombinecountNotEqualTo(Integer value) {
            addCriterion("CombineCount <>", value, "combinecount");
            return (Criteria) this;
        }

        public Criteria andCombinecountGreaterThan(Integer value) {
            addCriterion("CombineCount >", value, "combinecount");
            return (Criteria) this;
        }

        public Criteria andCombinecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CombineCount >=", value, "combinecount");
            return (Criteria) this;
        }

        public Criteria andCombinecountLessThan(Integer value) {
            addCriterion("CombineCount <", value, "combinecount");
            return (Criteria) this;
        }

        public Criteria andCombinecountLessThanOrEqualTo(Integer value) {
            addCriterion("CombineCount <=", value, "combinecount");
            return (Criteria) this;
        }

        public Criteria andCombinecountIn(List<Integer> values) {
            addCriterion("CombineCount in", values, "combinecount");
            return (Criteria) this;
        }

        public Criteria andCombinecountNotIn(List<Integer> values) {
            addCriterion("CombineCount not in", values, "combinecount");
            return (Criteria) this;
        }

        public Criteria andCombinecountBetween(Integer value1, Integer value2) {
            addCriterion("CombineCount between", value1, value2, "combinecount");
            return (Criteria) this;
        }

        public Criteria andCombinecountNotBetween(Integer value1, Integer value2) {
            addCriterion("CombineCount not between", value1, value2, "combinecount");
            return (Criteria) this;
        }

        public Criteria andDocountIsNull() {
            addCriterion("DoCount is null");
            return (Criteria) this;
        }

        public Criteria andDocountIsNotNull() {
            addCriterion("DoCount is not null");
            return (Criteria) this;
        }

        public Criteria andDocountEqualTo(Integer value) {
            addCriterion("DoCount =", value, "docount");
            return (Criteria) this;
        }

        public Criteria andDocountNotEqualTo(Integer value) {
            addCriterion("DoCount <>", value, "docount");
            return (Criteria) this;
        }

        public Criteria andDocountGreaterThan(Integer value) {
            addCriterion("DoCount >", value, "docount");
            return (Criteria) this;
        }

        public Criteria andDocountGreaterThanOrEqualTo(Integer value) {
            addCriterion("DoCount >=", value, "docount");
            return (Criteria) this;
        }

        public Criteria andDocountLessThan(Integer value) {
            addCriterion("DoCount <", value, "docount");
            return (Criteria) this;
        }

        public Criteria andDocountLessThanOrEqualTo(Integer value) {
            addCriterion("DoCount <=", value, "docount");
            return (Criteria) this;
        }

        public Criteria andDocountIn(List<Integer> values) {
            addCriterion("DoCount in", values, "docount");
            return (Criteria) this;
        }

        public Criteria andDocountNotIn(List<Integer> values) {
            addCriterion("DoCount not in", values, "docount");
            return (Criteria) this;
        }

        public Criteria andDocountBetween(Integer value1, Integer value2) {
            addCriterion("DoCount between", value1, value2, "docount");
            return (Criteria) this;
        }

        public Criteria andDocountNotBetween(Integer value1, Integer value2) {
            addCriterion("DoCount not between", value1, value2, "docount");
            return (Criteria) this;
        }

        public Criteria andRealdiffIsNull() {
            addCriterion("RealDiff is null");
            return (Criteria) this;
        }

        public Criteria andRealdiffIsNotNull() {
            addCriterion("RealDiff is not null");
            return (Criteria) this;
        }

        public Criteria andRealdiffEqualTo(Integer value) {
            addCriterion("RealDiff =", value, "realdiff");
            return (Criteria) this;
        }

        public Criteria andRealdiffNotEqualTo(Integer value) {
            addCriterion("RealDiff <>", value, "realdiff");
            return (Criteria) this;
        }

        public Criteria andRealdiffGreaterThan(Integer value) {
            addCriterion("RealDiff >", value, "realdiff");
            return (Criteria) this;
        }

        public Criteria andRealdiffGreaterThanOrEqualTo(Integer value) {
            addCriterion("RealDiff >=", value, "realdiff");
            return (Criteria) this;
        }

        public Criteria andRealdiffLessThan(Integer value) {
            addCriterion("RealDiff <", value, "realdiff");
            return (Criteria) this;
        }

        public Criteria andRealdiffLessThanOrEqualTo(Integer value) {
            addCriterion("RealDiff <=", value, "realdiff");
            return (Criteria) this;
        }

        public Criteria andRealdiffIn(List<Integer> values) {
            addCriterion("RealDiff in", values, "realdiff");
            return (Criteria) this;
        }

        public Criteria andRealdiffNotIn(List<Integer> values) {
            addCriterion("RealDiff not in", values, "realdiff");
            return (Criteria) this;
        }

        public Criteria andRealdiffBetween(Integer value1, Integer value2) {
            addCriterion("RealDiff between", value1, value2, "realdiff");
            return (Criteria) this;
        }

        public Criteria andRealdiffNotBetween(Integer value1, Integer value2) {
            addCriterion("RealDiff not between", value1, value2, "realdiff");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateIsNull() {
            addCriterion("RealDiscriminate is null");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateIsNotNull() {
            addCriterion("RealDiscriminate is not null");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateEqualTo(Integer value) {
            addCriterion("RealDiscriminate =", value, "realdiscriminate");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateNotEqualTo(Integer value) {
            addCriterion("RealDiscriminate <>", value, "realdiscriminate");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateGreaterThan(Integer value) {
            addCriterion("RealDiscriminate >", value, "realdiscriminate");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateGreaterThanOrEqualTo(Integer value) {
            addCriterion("RealDiscriminate >=", value, "realdiscriminate");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateLessThan(Integer value) {
            addCriterion("RealDiscriminate <", value, "realdiscriminate");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateLessThanOrEqualTo(Integer value) {
            addCriterion("RealDiscriminate <=", value, "realdiscriminate");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateIn(List<Integer> values) {
            addCriterion("RealDiscriminate in", values, "realdiscriminate");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateNotIn(List<Integer> values) {
            addCriterion("RealDiscriminate not in", values, "realdiscriminate");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateBetween(Integer value1, Integer value2) {
            addCriterion("RealDiscriminate between", value1, value2, "realdiscriminate");
            return (Criteria) this;
        }

        public Criteria andRealdiscriminateNotBetween(Integer value1, Integer value2) {
            addCriterion("RealDiscriminate not between", value1, value2, "realdiscriminate");
            return (Criteria) this;
        }

        public Criteria andExaminatoridIsNull() {
            addCriterion("ExaminatorId is null");
            return (Criteria) this;
        }

        public Criteria andExaminatoridIsNotNull() {
            addCriterion("ExaminatorId is not null");
            return (Criteria) this;
        }

        public Criteria andExaminatoridEqualTo(Integer value) {
            addCriterion("ExaminatorId =", value, "examinatorid");
            return (Criteria) this;
        }

        public Criteria andExaminatoridNotEqualTo(Integer value) {
            addCriterion("ExaminatorId <>", value, "examinatorid");
            return (Criteria) this;
        }

        public Criteria andExaminatoridGreaterThan(Integer value) {
            addCriterion("ExaminatorId >", value, "examinatorid");
            return (Criteria) this;
        }

        public Criteria andExaminatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExaminatorId >=", value, "examinatorid");
            return (Criteria) this;
        }

        public Criteria andExaminatoridLessThan(Integer value) {
            addCriterion("ExaminatorId <", value, "examinatorid");
            return (Criteria) this;
        }

        public Criteria andExaminatoridLessThanOrEqualTo(Integer value) {
            addCriterion("ExaminatorId <=", value, "examinatorid");
            return (Criteria) this;
        }

        public Criteria andExaminatoridIn(List<Integer> values) {
            addCriterion("ExaminatorId in", values, "examinatorid");
            return (Criteria) this;
        }

        public Criteria andExaminatoridNotIn(List<Integer> values) {
            addCriterion("ExaminatorId not in", values, "examinatorid");
            return (Criteria) this;
        }

        public Criteria andExaminatoridBetween(Integer value1, Integer value2) {
            addCriterion("ExaminatorId between", value1, value2, "examinatorid");
            return (Criteria) this;
        }

        public Criteria andExaminatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("ExaminatorId not between", value1, value2, "examinatorid");
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