package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.List;

public class InputchoiceQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public InputchoiceQuery() {
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

        public Criteria andInputidIsNull() {
            addCriterion("InputId is null");
            return (Criteria) this;
        }

        public Criteria andInputidIsNotNull() {
            addCriterion("InputId is not null");
            return (Criteria) this;
        }

        public Criteria andInputidEqualTo(String value) {
            addCriterion("InputId =", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidNotEqualTo(String value) {
            addCriterion("InputId <>", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidGreaterThan(String value) {
            addCriterion("InputId >", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidGreaterThanOrEqualTo(String value) {
            addCriterion("InputId >=", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidLessThan(String value) {
            addCriterion("InputId <", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidLessThanOrEqualTo(String value) {
            addCriterion("InputId <=", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidLike(String value) {
            addCriterion("InputId like", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidNotLike(String value) {
            addCriterion("InputId not like", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidIn(List<String> values) {
            addCriterion("InputId in", values, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidNotIn(List<String> values) {
            addCriterion("InputId not in", values, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidBetween(String value1, String value2) {
            addCriterion("InputId between", value1, value2, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidNotBetween(String value1, String value2) {
            addCriterion("InputId not between", value1, value2, "inputid");
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

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("Score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("Score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("Score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("Score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("Score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("Score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("Score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("Score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("Score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
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