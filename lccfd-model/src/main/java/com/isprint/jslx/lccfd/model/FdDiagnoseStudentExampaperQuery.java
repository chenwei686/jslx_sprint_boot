package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FdDiagnoseStudentExampaperQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdDiagnoseStudentExampaperQuery() {
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

        public Criteria andErrorNumMinIsNull() {
            addCriterion("error_num_min is null");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinIsNotNull() {
            addCriterion("error_num_min is not null");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinEqualTo(BigDecimal value) {
            addCriterion("error_num_min =", value, "errorNumMin");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinNotEqualTo(BigDecimal value) {
            addCriterion("error_num_min <>", value, "errorNumMin");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinGreaterThan(BigDecimal value) {
            addCriterion("error_num_min >", value, "errorNumMin");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("error_num_min >=", value, "errorNumMin");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinLessThan(BigDecimal value) {
            addCriterion("error_num_min <", value, "errorNumMin");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("error_num_min <=", value, "errorNumMin");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinIn(List<BigDecimal> values) {
            addCriterion("error_num_min in", values, "errorNumMin");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinNotIn(List<BigDecimal> values) {
            addCriterion("error_num_min not in", values, "errorNumMin");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("error_num_min between", value1, value2, "errorNumMin");
            return (Criteria) this;
        }

        public Criteria andErrorNumMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("error_num_min not between", value1, value2, "errorNumMin");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxIsNull() {
            addCriterion("error_num_max is null");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxIsNotNull() {
            addCriterion("error_num_max is not null");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxEqualTo(BigDecimal value) {
            addCriterion("error_num_max =", value, "errorNumMax");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxNotEqualTo(BigDecimal value) {
            addCriterion("error_num_max <>", value, "errorNumMax");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxGreaterThan(BigDecimal value) {
            addCriterion("error_num_max >", value, "errorNumMax");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("error_num_max >=", value, "errorNumMax");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxLessThan(BigDecimal value) {
            addCriterion("error_num_max <", value, "errorNumMax");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("error_num_max <=", value, "errorNumMax");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxIn(List<BigDecimal> values) {
            addCriterion("error_num_max in", values, "errorNumMax");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxNotIn(List<BigDecimal> values) {
            addCriterion("error_num_max not in", values, "errorNumMax");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("error_num_max between", value1, value2, "errorNumMax");
            return (Criteria) this;
        }

        public Criteria andErrorNumMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("error_num_max not between", value1, value2, "errorNumMax");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinIsNull() {
            addCriterion("difficulty_pro_min is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinIsNotNull() {
            addCriterion("difficulty_pro_min is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_min =", value, "difficultyProMin");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinNotEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_min <>", value, "difficultyProMin");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinGreaterThan(BigDecimal value) {
            addCriterion("difficulty_pro_min >", value, "difficultyProMin");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_min >=", value, "difficultyProMin");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinLessThan(BigDecimal value) {
            addCriterion("difficulty_pro_min <", value, "difficultyProMin");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_min <=", value, "difficultyProMin");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinIn(List<BigDecimal> values) {
            addCriterion("difficulty_pro_min in", values, "difficultyProMin");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinNotIn(List<BigDecimal> values) {
            addCriterion("difficulty_pro_min not in", values, "difficultyProMin");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty_pro_min between", value1, value2, "difficultyProMin");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty_pro_min not between", value1, value2, "difficultyProMin");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxIsNull() {
            addCriterion("difficulty_pro_max is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxIsNotNull() {
            addCriterion("difficulty_pro_max is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_max =", value, "difficultyProMax");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxNotEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_max <>", value, "difficultyProMax");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxGreaterThan(BigDecimal value) {
            addCriterion("difficulty_pro_max >", value, "difficultyProMax");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_max >=", value, "difficultyProMax");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxLessThan(BigDecimal value) {
            addCriterion("difficulty_pro_max <", value, "difficultyProMax");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_max <=", value, "difficultyProMax");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxIn(List<BigDecimal> values) {
            addCriterion("difficulty_pro_max in", values, "difficultyProMax");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxNotIn(List<BigDecimal> values) {
            addCriterion("difficulty_pro_max not in", values, "difficultyProMax");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty_pro_max between", value1, value2, "difficultyProMax");
            return (Criteria) this;
        }

        public Criteria andDifficultyProMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty_pro_max not between", value1, value2, "difficultyProMax");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinIsNull() {
            addCriterion("correct_pro_min is null");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinIsNotNull() {
            addCriterion("correct_pro_min is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinEqualTo(BigDecimal value) {
            addCriterion("correct_pro_min =", value, "correctProMin");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinNotEqualTo(BigDecimal value) {
            addCriterion("correct_pro_min <>", value, "correctProMin");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinGreaterThan(BigDecimal value) {
            addCriterion("correct_pro_min >", value, "correctProMin");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_pro_min >=", value, "correctProMin");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinLessThan(BigDecimal value) {
            addCriterion("correct_pro_min <", value, "correctProMin");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_pro_min <=", value, "correctProMin");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinIn(List<BigDecimal> values) {
            addCriterion("correct_pro_min in", values, "correctProMin");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinNotIn(List<BigDecimal> values) {
            addCriterion("correct_pro_min not in", values, "correctProMin");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_pro_min between", value1, value2, "correctProMin");
            return (Criteria) this;
        }

        public Criteria andCorrectProMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_pro_min not between", value1, value2, "correctProMin");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxIsNull() {
            addCriterion("correct_pro_max is null");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxIsNotNull() {
            addCriterion("correct_pro_max is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxEqualTo(BigDecimal value) {
            addCriterion("correct_pro_max =", value, "correctProMax");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxNotEqualTo(BigDecimal value) {
            addCriterion("correct_pro_max <>", value, "correctProMax");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxGreaterThan(BigDecimal value) {
            addCriterion("correct_pro_max >", value, "correctProMax");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_pro_max >=", value, "correctProMax");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxLessThan(BigDecimal value) {
            addCriterion("correct_pro_max <", value, "correctProMax");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_pro_max <=", value, "correctProMax");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxIn(List<BigDecimal> values) {
            addCriterion("correct_pro_max in", values, "correctProMax");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxNotIn(List<BigDecimal> values) {
            addCriterion("correct_pro_max not in", values, "correctProMax");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_pro_max between", value1, value2, "correctProMax");
            return (Criteria) this;
        }

        public Criteria andCorrectProMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_pro_max not between", value1, value2, "correctProMax");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinIsNull() {
            addCriterion("student_level_min is null");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinIsNotNull() {
            addCriterion("student_level_min is not null");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinEqualTo(BigDecimal value) {
            addCriterion("student_level_min =", value, "studentLevelMin");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinNotEqualTo(BigDecimal value) {
            addCriterion("student_level_min <>", value, "studentLevelMin");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinGreaterThan(BigDecimal value) {
            addCriterion("student_level_min >", value, "studentLevelMin");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("student_level_min >=", value, "studentLevelMin");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinLessThan(BigDecimal value) {
            addCriterion("student_level_min <", value, "studentLevelMin");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("student_level_min <=", value, "studentLevelMin");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinIn(List<BigDecimal> values) {
            addCriterion("student_level_min in", values, "studentLevelMin");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinNotIn(List<BigDecimal> values) {
            addCriterion("student_level_min not in", values, "studentLevelMin");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("student_level_min between", value1, value2, "studentLevelMin");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("student_level_min not between", value1, value2, "studentLevelMin");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxIsNull() {
            addCriterion("student_level_max is null");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxIsNotNull() {
            addCriterion("student_level_max is not null");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxEqualTo(BigDecimal value) {
            addCriterion("student_level_max =", value, "studentLevelMax");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxNotEqualTo(BigDecimal value) {
            addCriterion("student_level_max <>", value, "studentLevelMax");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxGreaterThan(BigDecimal value) {
            addCriterion("student_level_max >", value, "studentLevelMax");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("student_level_max >=", value, "studentLevelMax");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxLessThan(BigDecimal value) {
            addCriterion("student_level_max <", value, "studentLevelMax");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("student_level_max <=", value, "studentLevelMax");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxIn(List<BigDecimal> values) {
            addCriterion("student_level_max in", values, "studentLevelMax");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxNotIn(List<BigDecimal> values) {
            addCriterion("student_level_max not in", values, "studentLevelMax");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("student_level_max between", value1, value2, "studentLevelMax");
            return (Criteria) this;
        }

        public Criteria andStudentLevelMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("student_level_max not between", value1, value2, "studentLevelMax");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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