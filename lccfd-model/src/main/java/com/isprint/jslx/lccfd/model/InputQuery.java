package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InputQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public InputQuery() {
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

        public Criteria andTmidIsNull() {
            addCriterion("TmId is null");
            return (Criteria) this;
        }

        public Criteria andTmidIsNotNull() {
            addCriterion("TmId is not null");
            return (Criteria) this;
        }

        public Criteria andTmidEqualTo(String value) {
            addCriterion("TmId =", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotEqualTo(String value) {
            addCriterion("TmId <>", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidGreaterThan(String value) {
            addCriterion("TmId >", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidGreaterThanOrEqualTo(String value) {
            addCriterion("TmId >=", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLessThan(String value) {
            addCriterion("TmId <", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLessThanOrEqualTo(String value) {
            addCriterion("TmId <=", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLike(String value) {
            addCriterion("TmId like", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotLike(String value) {
            addCriterion("TmId not like", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidIn(List<String> values) {
            addCriterion("TmId in", values, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotIn(List<String> values) {
            addCriterion("TmId not in", values, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidBetween(String value1, String value2) {
            addCriterion("TmId between", value1, value2, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotBetween(String value1, String value2) {
            addCriterion("TmId not between", value1, value2, "tmid");
            return (Criteria) this;
        }

        public Criteria andInputcodeIsNull() {
            addCriterion("InputCode is null");
            return (Criteria) this;
        }

        public Criteria andInputcodeIsNotNull() {
            addCriterion("InputCode is not null");
            return (Criteria) this;
        }

        public Criteria andInputcodeEqualTo(String value) {
            addCriterion("InputCode =", value, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeNotEqualTo(String value) {
            addCriterion("InputCode <>", value, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeGreaterThan(String value) {
            addCriterion("InputCode >", value, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeGreaterThanOrEqualTo(String value) {
            addCriterion("InputCode >=", value, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeLessThan(String value) {
            addCriterion("InputCode <", value, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeLessThanOrEqualTo(String value) {
            addCriterion("InputCode <=", value, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeLike(String value) {
            addCriterion("InputCode like", value, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeNotLike(String value) {
            addCriterion("InputCode not like", value, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeIn(List<String> values) {
            addCriterion("InputCode in", values, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeNotIn(List<String> values) {
            addCriterion("InputCode not in", values, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeBetween(String value1, String value2) {
            addCriterion("InputCode between", value1, value2, "inputcode");
            return (Criteria) this;
        }

        public Criteria andInputcodeNotBetween(String value1, String value2) {
            addCriterion("InputCode not between", value1, value2, "inputcode");
            return (Criteria) this;
        }

        public Criteria andBasetypeIsNull() {
            addCriterion("BaseType is null");
            return (Criteria) this;
        }

        public Criteria andBasetypeIsNotNull() {
            addCriterion("BaseType is not null");
            return (Criteria) this;
        }

        public Criteria andBasetypeEqualTo(String value) {
            addCriterion("BaseType =", value, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeNotEqualTo(String value) {
            addCriterion("BaseType <>", value, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeGreaterThan(String value) {
            addCriterion("BaseType >", value, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeGreaterThanOrEqualTo(String value) {
            addCriterion("BaseType >=", value, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeLessThan(String value) {
            addCriterion("BaseType <", value, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeLessThanOrEqualTo(String value) {
            addCriterion("BaseType <=", value, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeLike(String value) {
            addCriterion("BaseType like", value, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeNotLike(String value) {
            addCriterion("BaseType not like", value, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeIn(List<String> values) {
            addCriterion("BaseType in", values, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeNotIn(List<String> values) {
            addCriterion("BaseType not in", values, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeBetween(String value1, String value2) {
            addCriterion("BaseType between", value1, value2, "basetype");
            return (Criteria) this;
        }

        public Criteria andBasetypeNotBetween(String value1, String value2) {
            addCriterion("BaseType not between", value1, value2, "basetype");
            return (Criteria) this;
        }

        public Criteria andInputtypeIsNull() {
            addCriterion("InputType is null");
            return (Criteria) this;
        }

        public Criteria andInputtypeIsNotNull() {
            addCriterion("InputType is not null");
            return (Criteria) this;
        }

        public Criteria andInputtypeEqualTo(String value) {
            addCriterion("InputType =", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotEqualTo(String value) {
            addCriterion("InputType <>", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeGreaterThan(String value) {
            addCriterion("InputType >", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeGreaterThanOrEqualTo(String value) {
            addCriterion("InputType >=", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLessThan(String value) {
            addCriterion("InputType <", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLessThanOrEqualTo(String value) {
            addCriterion("InputType <=", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeLike(String value) {
            addCriterion("InputType like", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotLike(String value) {
            addCriterion("InputType not like", value, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeIn(List<String> values) {
            addCriterion("InputType in", values, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotIn(List<String> values) {
            addCriterion("InputType not in", values, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeBetween(String value1, String value2) {
            addCriterion("InputType between", value1, value2, "inputtype");
            return (Criteria) this;
        }

        public Criteria andInputtypeNotBetween(String value1, String value2) {
            addCriterion("InputType not between", value1, value2, "inputtype");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("Score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("Score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("Score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("Score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("Score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("Score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("Score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("Score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("Order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("Order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("Order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("Order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("Order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("Order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("Order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("Order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("Order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("Order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("Order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andInputscoreIsNull() {
            addCriterion("InputScore is null");
            return (Criteria) this;
        }

        public Criteria andInputscoreIsNotNull() {
            addCriterion("InputScore is not null");
            return (Criteria) this;
        }

        public Criteria andInputscoreEqualTo(String value) {
            addCriterion("InputScore =", value, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreNotEqualTo(String value) {
            addCriterion("InputScore <>", value, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreGreaterThan(String value) {
            addCriterion("InputScore >", value, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreGreaterThanOrEqualTo(String value) {
            addCriterion("InputScore >=", value, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreLessThan(String value) {
            addCriterion("InputScore <", value, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreLessThanOrEqualTo(String value) {
            addCriterion("InputScore <=", value, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreLike(String value) {
            addCriterion("InputScore like", value, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreNotLike(String value) {
            addCriterion("InputScore not like", value, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreIn(List<String> values) {
            addCriterion("InputScore in", values, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreNotIn(List<String> values) {
            addCriterion("InputScore not in", values, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreBetween(String value1, String value2) {
            addCriterion("InputScore between", value1, value2, "inputscore");
            return (Criteria) this;
        }

        public Criteria andInputscoreNotBetween(String value1, String value2) {
            addCriterion("InputScore not between", value1, value2, "inputscore");
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