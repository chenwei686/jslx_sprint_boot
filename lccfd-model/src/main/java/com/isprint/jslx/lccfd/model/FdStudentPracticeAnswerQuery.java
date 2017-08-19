package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdStudentPracticeAnswerQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentPracticeAnswerQuery() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdIsNull() {
            addCriterion("student_practice_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdIsNotNull() {
            addCriterion("student_practice_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdEqualTo(Integer value) {
            addCriterion("student_practice_id =", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdNotEqualTo(Integer value) {
            addCriterion("student_practice_id <>", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdGreaterThan(Integer value) {
            addCriterion("student_practice_id >", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_practice_id >=", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdLessThan(Integer value) {
            addCriterion("student_practice_id <", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_practice_id <=", value, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdIn(List<Integer> values) {
            addCriterion("student_practice_id in", values, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdNotIn(List<Integer> values) {
            addCriterion("student_practice_id not in", values, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdBetween(Integer value1, Integer value2) {
            addCriterion("student_practice_id between", value1, value2, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andStudentPracticeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_practice_id not between", value1, value2, "studentPracticeId");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
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

        public Criteria andPercentIsNull() {
            addCriterion("percent is null");
            return (Criteria) this;
        }

        public Criteria andPercentIsNotNull() {
            addCriterion("percent is not null");
            return (Criteria) this;
        }

        public Criteria andPercentEqualTo(BigDecimal value) {
            addCriterion("percent =", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotEqualTo(BigDecimal value) {
            addCriterion("percent <>", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThan(BigDecimal value) {
            addCriterion("percent >", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("percent >=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThan(BigDecimal value) {
            addCriterion("percent <", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("percent <=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentIn(List<BigDecimal> values) {
            addCriterion("percent in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotIn(List<BigDecimal> values) {
            addCriterion("percent not in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("percent between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("percent not between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andIsRightIsNull() {
            addCriterion("is_right is null");
            return (Criteria) this;
        }

        public Criteria andIsRightIsNotNull() {
            addCriterion("is_right is not null");
            return (Criteria) this;
        }

        public Criteria andIsRightEqualTo(Boolean value) {
            addCriterion("is_right =", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightNotEqualTo(Boolean value) {
            addCriterion("is_right <>", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightGreaterThan(Boolean value) {
            addCriterion("is_right >", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_right >=", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightLessThan(Boolean value) {
            addCriterion("is_right <", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightLessThanOrEqualTo(Boolean value) {
            addCriterion("is_right <=", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightIn(List<Boolean> values) {
            addCriterion("is_right in", values, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightNotIn(List<Boolean> values) {
            addCriterion("is_right not in", values, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightBetween(Boolean value1, Boolean value2) {
            addCriterion("is_right between", value1, value2, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_right not between", value1, value2, "isRight");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdIsNull() {
            addCriterion("main_knowledge_id is null");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdIsNotNull() {
            addCriterion("main_knowledge_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdEqualTo(Integer value) {
            addCriterion("main_knowledge_id =", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdNotEqualTo(Integer value) {
            addCriterion("main_knowledge_id <>", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdGreaterThan(Integer value) {
            addCriterion("main_knowledge_id >", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_knowledge_id >=", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdLessThan(Integer value) {
            addCriterion("main_knowledge_id <", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("main_knowledge_id <=", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdIn(List<Integer> values) {
            addCriterion("main_knowledge_id in", values, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdNotIn(List<Integer> values) {
            addCriterion("main_knowledge_id not in", values, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdBetween(Integer value1, Integer value2) {
            addCriterion("main_knowledge_id between", value1, value2, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("main_knowledge_id not between", value1, value2, "mainKnowledgeId");
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