package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseTimuDetailQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public BaseTimuDetailQuery() {
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

        public Criteria andTimuIdIsNull() {
            addCriterion("timu_id is null");
            return (Criteria) this;
        }

        public Criteria andTimuIdIsNotNull() {
            addCriterion("timu_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimuIdEqualTo(String value) {
            addCriterion("timu_id =", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotEqualTo(String value) {
            addCriterion("timu_id <>", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdGreaterThan(String value) {
            addCriterion("timu_id >", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdGreaterThanOrEqualTo(String value) {
            addCriterion("timu_id >=", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdLessThan(String value) {
            addCriterion("timu_id <", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdLessThanOrEqualTo(String value) {
            addCriterion("timu_id <=", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdLike(String value) {
            addCriterion("timu_id like", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotLike(String value) {
            addCriterion("timu_id not like", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdIn(List<String> values) {
            addCriterion("timu_id in", values, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotIn(List<String> values) {
            addCriterion("timu_id not in", values, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdBetween(String value1, String value2) {
            addCriterion("timu_id between", value1, value2, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotBetween(String value1, String value2) {
            addCriterion("timu_id not between", value1, value2, "timuId");
            return (Criteria) this;
        }

        public Criteria andTrunkIsNull() {
            addCriterion("trunk is null");
            return (Criteria) this;
        }

        public Criteria andTrunkIsNotNull() {
            addCriterion("trunk is not null");
            return (Criteria) this;
        }

        public Criteria andTrunkEqualTo(String value) {
            addCriterion("trunk =", value, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkNotEqualTo(String value) {
            addCriterion("trunk <>", value, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkGreaterThan(String value) {
            addCriterion("trunk >", value, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkGreaterThanOrEqualTo(String value) {
            addCriterion("trunk >=", value, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkLessThan(String value) {
            addCriterion("trunk <", value, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkLessThanOrEqualTo(String value) {
            addCriterion("trunk <=", value, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkLike(String value) {
            addCriterion("trunk like", value, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkNotLike(String value) {
            addCriterion("trunk not like", value, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkIn(List<String> values) {
            addCriterion("trunk in", values, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkNotIn(List<String> values) {
            addCriterion("trunk not in", values, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkBetween(String value1, String value2) {
            addCriterion("trunk between", value1, value2, "trunk");
            return (Criteria) this;
        }

        public Criteria andTrunkNotBetween(String value1, String value2) {
            addCriterion("trunk not between", value1, value2, "trunk");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNull() {
            addCriterion("analysis is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNotNull() {
            addCriterion("analysis is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisEqualTo(String value) {
            addCriterion("analysis =", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotEqualTo(String value) {
            addCriterion("analysis <>", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThan(String value) {
            addCriterion("analysis >", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("analysis >=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThan(String value) {
            addCriterion("analysis <", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThanOrEqualTo(String value) {
            addCriterion("analysis <=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLike(String value) {
            addCriterion("analysis like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotLike(String value) {
            addCriterion("analysis not like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisIn(List<String> values) {
            addCriterion("analysis in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotIn(List<String> values) {
            addCriterion("analysis not in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisBetween(String value1, String value2) {
            addCriterion("analysis between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotBetween(String value1, String value2) {
            addCriterion("analysis not between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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