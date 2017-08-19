package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.List;

public class DrSyllabusQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public DrSyllabusQuery() {
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

        public Criteria andSubjectidIsNull() {
            addCriterion("SubjectId is null");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNotNull() {
            addCriterion("SubjectId is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectidEqualTo(Integer value) {
            addCriterion("SubjectId =", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotEqualTo(Integer value) {
            addCriterion("SubjectId <>", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThan(Integer value) {
            addCriterion("SubjectId >", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SubjectId >=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThan(Integer value) {
            addCriterion("SubjectId <", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("SubjectId <=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidIn(List<Integer> values) {
            addCriterion("SubjectId in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotIn(List<Integer> values) {
            addCriterion("SubjectId not in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("SubjectId between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("SubjectId not between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andDegreeidIsNull() {
            addCriterion("DegreeId is null");
            return (Criteria) this;
        }

        public Criteria andDegreeidIsNotNull() {
            addCriterion("DegreeId is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeidEqualTo(Integer value) {
            addCriterion("DegreeId =", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidNotEqualTo(Integer value) {
            addCriterion("DegreeId <>", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidGreaterThan(Integer value) {
            addCriterion("DegreeId >", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DegreeId >=", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidLessThan(Integer value) {
            addCriterion("DegreeId <", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidLessThanOrEqualTo(Integer value) {
            addCriterion("DegreeId <=", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidIn(List<Integer> values) {
            addCriterion("DegreeId in", values, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidNotIn(List<Integer> values) {
            addCriterion("DegreeId not in", values, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidBetween(Integer value1, Integer value2) {
            addCriterion("DegreeId between", value1, value2, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidNotBetween(Integer value1, Integer value2) {
            addCriterion("DegreeId not between", value1, value2, "degreeid");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidIsNull() {
            addCriterion("SyllabusGradeId is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidIsNotNull() {
            addCriterion("SyllabusGradeId is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidEqualTo(Integer value) {
            addCriterion("SyllabusGradeId =", value, "syllabusgradeid");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidNotEqualTo(Integer value) {
            addCriterion("SyllabusGradeId <>", value, "syllabusgradeid");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidGreaterThan(Integer value) {
            addCriterion("SyllabusGradeId >", value, "syllabusgradeid");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SyllabusGradeId >=", value, "syllabusgradeid");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidLessThan(Integer value) {
            addCriterion("SyllabusGradeId <", value, "syllabusgradeid");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidLessThanOrEqualTo(Integer value) {
            addCriterion("SyllabusGradeId <=", value, "syllabusgradeid");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidIn(List<Integer> values) {
            addCriterion("SyllabusGradeId in", values, "syllabusgradeid");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidNotIn(List<Integer> values) {
            addCriterion("SyllabusGradeId not in", values, "syllabusgradeid");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidBetween(Integer value1, Integer value2) {
            addCriterion("SyllabusGradeId between", value1, value2, "syllabusgradeid");
            return (Criteria) this;
        }

        public Criteria andSyllabusgradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("SyllabusGradeId not between", value1, value2, "syllabusgradeid");
            return (Criteria) this;
        }

        public Criteria andPublisheridIsNull() {
            addCriterion("PublisherId is null");
            return (Criteria) this;
        }

        public Criteria andPublisheridIsNotNull() {
            addCriterion("PublisherId is not null");
            return (Criteria) this;
        }

        public Criteria andPublisheridEqualTo(Integer value) {
            addCriterion("PublisherId =", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotEqualTo(Integer value) {
            addCriterion("PublisherId <>", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridGreaterThan(Integer value) {
            addCriterion("PublisherId >", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("PublisherId >=", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridLessThan(Integer value) {
            addCriterion("PublisherId <", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridLessThanOrEqualTo(Integer value) {
            addCriterion("PublisherId <=", value, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridIn(List<Integer> values) {
            addCriterion("PublisherId in", values, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotIn(List<Integer> values) {
            addCriterion("PublisherId not in", values, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridBetween(Integer value1, Integer value2) {
            addCriterion("PublisherId between", value1, value2, "publisherid");
            return (Criteria) this;
        }

        public Criteria andPublisheridNotBetween(Integer value1, Integer value2) {
            addCriterion("PublisherId not between", value1, value2, "publisherid");
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