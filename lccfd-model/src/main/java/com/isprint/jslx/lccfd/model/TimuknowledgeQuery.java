package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.List;

public class TimuknowledgeQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public TimuknowledgeQuery() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andKnowledgeidIsNull() {
            addCriterion("KnowledgeId is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidIsNotNull() {
            addCriterion("KnowledgeId is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidEqualTo(Integer value) {
            addCriterion("KnowledgeId =", value, "knowledgeid");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidNotEqualTo(Integer value) {
            addCriterion("KnowledgeId <>", value, "knowledgeid");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidGreaterThan(Integer value) {
            addCriterion("KnowledgeId >", value, "knowledgeid");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("KnowledgeId >=", value, "knowledgeid");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidLessThan(Integer value) {
            addCriterion("KnowledgeId <", value, "knowledgeid");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidLessThanOrEqualTo(Integer value) {
            addCriterion("KnowledgeId <=", value, "knowledgeid");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidIn(List<Integer> values) {
            addCriterion("KnowledgeId in", values, "knowledgeid");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidNotIn(List<Integer> values) {
            addCriterion("KnowledgeId not in", values, "knowledgeid");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidBetween(Integer value1, Integer value2) {
            addCriterion("KnowledgeId between", value1, value2, "knowledgeid");
            return (Criteria) this;
        }

        public Criteria andKnowledgeidNotBetween(Integer value1, Integer value2) {
            addCriterion("KnowledgeId not between", value1, value2, "knowledgeid");
            return (Criteria) this;
        }

        public Criteria andIsmainIsNull() {
            addCriterion("IsMain is null");
            return (Criteria) this;
        }

        public Criteria andIsmainIsNotNull() {
            addCriterion("IsMain is not null");
            return (Criteria) this;
        }

        public Criteria andIsmainEqualTo(Boolean value) {
            addCriterion("IsMain =", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotEqualTo(Boolean value) {
            addCriterion("IsMain <>", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainGreaterThan(Boolean value) {
            addCriterion("IsMain >", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsMain >=", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainLessThan(Boolean value) {
            addCriterion("IsMain <", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainLessThanOrEqualTo(Boolean value) {
            addCriterion("IsMain <=", value, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainIn(List<Boolean> values) {
            addCriterion("IsMain in", values, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotIn(List<Boolean> values) {
            addCriterion("IsMain not in", values, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainBetween(Boolean value1, Boolean value2) {
            addCriterion("IsMain between", value1, value2, "ismain");
            return (Criteria) this;
        }

        public Criteria andIsmainNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsMain not between", value1, value2, "ismain");
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