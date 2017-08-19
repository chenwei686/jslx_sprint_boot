package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdTeacherWeekExampaperReportQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdTeacherWeekExampaperReportQuery() {
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

        public Criteria andTeacherWeekReportIdIsNull() {
            addCriterion("teacher_week_report_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdIsNotNull() {
            addCriterion("teacher_week_report_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdEqualTo(Integer value) {
            addCriterion("teacher_week_report_id =", value, "teacherWeekReportId");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdNotEqualTo(Integer value) {
            addCriterion("teacher_week_report_id <>", value, "teacherWeekReportId");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdGreaterThan(Integer value) {
            addCriterion("teacher_week_report_id >", value, "teacherWeekReportId");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_week_report_id >=", value, "teacherWeekReportId");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdLessThan(Integer value) {
            addCriterion("teacher_week_report_id <", value, "teacherWeekReportId");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_week_report_id <=", value, "teacherWeekReportId");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdIn(List<Integer> values) {
            addCriterion("teacher_week_report_id in", values, "teacherWeekReportId");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdNotIn(List<Integer> values) {
            addCriterion("teacher_week_report_id not in", values, "teacherWeekReportId");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_week_report_id between", value1, value2, "teacherWeekReportId");
            return (Criteria) this;
        }

        public Criteria andTeacherWeekReportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_week_report_id not between", value1, value2, "teacherWeekReportId");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreIsNull() {
            addCriterion("exampaper_score is null");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreIsNotNull() {
            addCriterion("exampaper_score is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreEqualTo(BigDecimal value) {
            addCriterion("exampaper_score =", value, "exampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreNotEqualTo(BigDecimal value) {
            addCriterion("exampaper_score <>", value, "exampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreGreaterThan(BigDecimal value) {
            addCriterion("exampaper_score >", value, "exampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_score >=", value, "exampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreLessThan(BigDecimal value) {
            addCriterion("exampaper_score <", value, "exampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_score <=", value, "exampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreIn(List<BigDecimal> values) {
            addCriterion("exampaper_score in", values, "exampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreNotIn(List<BigDecimal> values) {
            addCriterion("exampaper_score not in", values, "exampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_score between", value1, value2, "exampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_score not between", value1, value2, "exampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreIsNull() {
            addCriterion("exampaper_average_score is null");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreIsNotNull() {
            addCriterion("exampaper_average_score is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreEqualTo(BigDecimal value) {
            addCriterion("exampaper_average_score =", value, "exampaperAverageScore");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreNotEqualTo(BigDecimal value) {
            addCriterion("exampaper_average_score <>", value, "exampaperAverageScore");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreGreaterThan(BigDecimal value) {
            addCriterion("exampaper_average_score >", value, "exampaperAverageScore");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_average_score >=", value, "exampaperAverageScore");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreLessThan(BigDecimal value) {
            addCriterion("exampaper_average_score <", value, "exampaperAverageScore");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_average_score <=", value, "exampaperAverageScore");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreIn(List<BigDecimal> values) {
            addCriterion("exampaper_average_score in", values, "exampaperAverageScore");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreNotIn(List<BigDecimal> values) {
            addCriterion("exampaper_average_score not in", values, "exampaperAverageScore");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_average_score between", value1, value2, "exampaperAverageScore");
            return (Criteria) this;
        }

        public Criteria andExampaperAverageScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_average_score not between", value1, value2, "exampaperAverageScore");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentIsNull() {
            addCriterion("exampaper_max_student is null");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentIsNotNull() {
            addCriterion("exampaper_max_student is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentEqualTo(String value) {
            addCriterion("exampaper_max_student =", value, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentNotEqualTo(String value) {
            addCriterion("exampaper_max_student <>", value, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentGreaterThan(String value) {
            addCriterion("exampaper_max_student >", value, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentGreaterThanOrEqualTo(String value) {
            addCriterion("exampaper_max_student >=", value, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentLessThan(String value) {
            addCriterion("exampaper_max_student <", value, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentLessThanOrEqualTo(String value) {
            addCriterion("exampaper_max_student <=", value, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentLike(String value) {
            addCriterion("exampaper_max_student like", value, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentNotLike(String value) {
            addCriterion("exampaper_max_student not like", value, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentIn(List<String> values) {
            addCriterion("exampaper_max_student in", values, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentNotIn(List<String> values) {
            addCriterion("exampaper_max_student not in", values, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentBetween(String value1, String value2) {
            addCriterion("exampaper_max_student between", value1, value2, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxStudentNotBetween(String value1, String value2) {
            addCriterion("exampaper_max_student not between", value1, value2, "exampaperMaxStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentIsNull() {
            addCriterion("exampaper_min_student is null");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentIsNotNull() {
            addCriterion("exampaper_min_student is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentEqualTo(String value) {
            addCriterion("exampaper_min_student =", value, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentNotEqualTo(String value) {
            addCriterion("exampaper_min_student <>", value, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentGreaterThan(String value) {
            addCriterion("exampaper_min_student >", value, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentGreaterThanOrEqualTo(String value) {
            addCriterion("exampaper_min_student >=", value, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentLessThan(String value) {
            addCriterion("exampaper_min_student <", value, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentLessThanOrEqualTo(String value) {
            addCriterion("exampaper_min_student <=", value, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentLike(String value) {
            addCriterion("exampaper_min_student like", value, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentNotLike(String value) {
            addCriterion("exampaper_min_student not like", value, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentIn(List<String> values) {
            addCriterion("exampaper_min_student in", values, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentNotIn(List<String> values) {
            addCriterion("exampaper_min_student not in", values, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentBetween(String value1, String value2) {
            addCriterion("exampaper_min_student between", value1, value2, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperMinStudentNotBetween(String value1, String value2) {
            addCriterion("exampaper_min_student not between", value1, value2, "exampaperMinStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentIsNull() {
            addCriterion("exampaper_uncommit_student is null");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentIsNotNull() {
            addCriterion("exampaper_uncommit_student is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentEqualTo(String value) {
            addCriterion("exampaper_uncommit_student =", value, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentNotEqualTo(String value) {
            addCriterion("exampaper_uncommit_student <>", value, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentGreaterThan(String value) {
            addCriterion("exampaper_uncommit_student >", value, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentGreaterThanOrEqualTo(String value) {
            addCriterion("exampaper_uncommit_student >=", value, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentLessThan(String value) {
            addCriterion("exampaper_uncommit_student <", value, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentLessThanOrEqualTo(String value) {
            addCriterion("exampaper_uncommit_student <=", value, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentLike(String value) {
            addCriterion("exampaper_uncommit_student like", value, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentNotLike(String value) {
            addCriterion("exampaper_uncommit_student not like", value, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentIn(List<String> values) {
            addCriterion("exampaper_uncommit_student in", values, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentNotIn(List<String> values) {
            addCriterion("exampaper_uncommit_student not in", values, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentBetween(String value1, String value2) {
            addCriterion("exampaper_uncommit_student between", value1, value2, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperUncommitStudentNotBetween(String value1, String value2) {
            addCriterion("exampaper_uncommit_student not between", value1, value2, "exampaperUncommitStudent");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIsNull() {
            addCriterion("exampaper_comment is null");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIsNotNull() {
            addCriterion("exampaper_comment is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentEqualTo(String value) {
            addCriterion("exampaper_comment =", value, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentNotEqualTo(String value) {
            addCriterion("exampaper_comment <>", value, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentGreaterThan(String value) {
            addCriterion("exampaper_comment >", value, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentGreaterThanOrEqualTo(String value) {
            addCriterion("exampaper_comment >=", value, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentLessThan(String value) {
            addCriterion("exampaper_comment <", value, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentLessThanOrEqualTo(String value) {
            addCriterion("exampaper_comment <=", value, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentLike(String value) {
            addCriterion("exampaper_comment like", value, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentNotLike(String value) {
            addCriterion("exampaper_comment not like", value, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIn(List<String> values) {
            addCriterion("exampaper_comment in", values, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentNotIn(List<String> values) {
            addCriterion("exampaper_comment not in", values, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentBetween(String value1, String value2) {
            addCriterion("exampaper_comment between", value1, value2, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentNotBetween(String value1, String value2) {
            addCriterion("exampaper_comment not between", value1, value2, "exampaperComment");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdIsNull() {
            addCriterion("exampaper_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdIsNotNull() {
            addCriterion("exampaper_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdEqualTo(Integer value) {
            addCriterion("exampaper_comment_id =", value, "exampaperCommentId");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdNotEqualTo(Integer value) {
            addCriterion("exampaper_comment_id <>", value, "exampaperCommentId");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdGreaterThan(Integer value) {
            addCriterion("exampaper_comment_id >", value, "exampaperCommentId");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampaper_comment_id >=", value, "exampaperCommentId");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdLessThan(Integer value) {
            addCriterion("exampaper_comment_id <", value, "exampaperCommentId");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("exampaper_comment_id <=", value, "exampaperCommentId");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdIn(List<Integer> values) {
            addCriterion("exampaper_comment_id in", values, "exampaperCommentId");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdNotIn(List<Integer> values) {
            addCriterion("exampaper_comment_id not in", values, "exampaperCommentId");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_comment_id between", value1, value2, "exampaperCommentId");
            return (Criteria) this;
        }

        public Criteria andExampaperCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_comment_id not between", value1, value2, "exampaperCommentId");
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