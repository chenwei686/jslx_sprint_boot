package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FdStudentDayConditionQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentDayConditionQuery() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNull() {
            addCriterion("classes_id is null");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNotNull() {
            addCriterion("classes_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassesIdEqualTo(Integer value) {
            addCriterion("classes_id =", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotEqualTo(Integer value) {
            addCriterion("classes_id <>", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThan(Integer value) {
            addCriterion("classes_id >", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classes_id >=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThan(Integer value) {
            addCriterion("classes_id <", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThanOrEqualTo(Integer value) {
            addCriterion("classes_id <=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIn(List<Integer> values) {
            addCriterion("classes_id in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotIn(List<Integer> values) {
            addCriterion("classes_id not in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdBetween(Integer value1, Integer value2) {
            addCriterion("classes_id between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classes_id not between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andSearchNumIsNull() {
            addCriterion("search_num is null");
            return (Criteria) this;
        }

        public Criteria andSearchNumIsNotNull() {
            addCriterion("search_num is not null");
            return (Criteria) this;
        }

        public Criteria andSearchNumEqualTo(Integer value) {
            addCriterion("search_num =", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumNotEqualTo(Integer value) {
            addCriterion("search_num <>", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumGreaterThan(Integer value) {
            addCriterion("search_num >", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_num >=", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumLessThan(Integer value) {
            addCriterion("search_num <", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumLessThanOrEqualTo(Integer value) {
            addCriterion("search_num <=", value, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumIn(List<Integer> values) {
            addCriterion("search_num in", values, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumNotIn(List<Integer> values) {
            addCriterion("search_num not in", values, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumBetween(Integer value1, Integer value2) {
            addCriterion("search_num between", value1, value2, "searchNum");
            return (Criteria) this;
        }

        public Criteria andSearchNumNotBetween(Integer value1, Integer value2) {
            addCriterion("search_num not between", value1, value2, "searchNum");
            return (Criteria) this;
        }

        public Criteria andCorrectNumIsNull() {
            addCriterion("correct_num is null");
            return (Criteria) this;
        }

        public Criteria andCorrectNumIsNotNull() {
            addCriterion("correct_num is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectNumEqualTo(Integer value) {
            addCriterion("correct_num =", value, "correctNum");
            return (Criteria) this;
        }

        public Criteria andCorrectNumNotEqualTo(Integer value) {
            addCriterion("correct_num <>", value, "correctNum");
            return (Criteria) this;
        }

        public Criteria andCorrectNumGreaterThan(Integer value) {
            addCriterion("correct_num >", value, "correctNum");
            return (Criteria) this;
        }

        public Criteria andCorrectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_num >=", value, "correctNum");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLessThan(Integer value) {
            addCriterion("correct_num <", value, "correctNum");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLessThanOrEqualTo(Integer value) {
            addCriterion("correct_num <=", value, "correctNum");
            return (Criteria) this;
        }

        public Criteria andCorrectNumIn(List<Integer> values) {
            addCriterion("correct_num in", values, "correctNum");
            return (Criteria) this;
        }

        public Criteria andCorrectNumNotIn(List<Integer> values) {
            addCriterion("correct_num not in", values, "correctNum");
            return (Criteria) this;
        }

        public Criteria andCorrectNumBetween(Integer value1, Integer value2) {
            addCriterion("correct_num between", value1, value2, "correctNum");
            return (Criteria) this;
        }

        public Criteria andCorrectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_num not between", value1, value2, "correctNum");
            return (Criteria) this;
        }

        public Criteria andCorrectProIsNull() {
            addCriterion("correct_pro is null");
            return (Criteria) this;
        }

        public Criteria andCorrectProIsNotNull() {
            addCriterion("correct_pro is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectProEqualTo(BigDecimal value) {
            addCriterion("correct_pro =", value, "correctPro");
            return (Criteria) this;
        }

        public Criteria andCorrectProNotEqualTo(BigDecimal value) {
            addCriterion("correct_pro <>", value, "correctPro");
            return (Criteria) this;
        }

        public Criteria andCorrectProGreaterThan(BigDecimal value) {
            addCriterion("correct_pro >", value, "correctPro");
            return (Criteria) this;
        }

        public Criteria andCorrectProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_pro >=", value, "correctPro");
            return (Criteria) this;
        }

        public Criteria andCorrectProLessThan(BigDecimal value) {
            addCriterion("correct_pro <", value, "correctPro");
            return (Criteria) this;
        }

        public Criteria andCorrectProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_pro <=", value, "correctPro");
            return (Criteria) this;
        }

        public Criteria andCorrectProIn(List<BigDecimal> values) {
            addCriterion("correct_pro in", values, "correctPro");
            return (Criteria) this;
        }

        public Criteria andCorrectProNotIn(List<BigDecimal> values) {
            addCriterion("correct_pro not in", values, "correctPro");
            return (Criteria) this;
        }

        public Criteria andCorrectProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_pro between", value1, value2, "correctPro");
            return (Criteria) this;
        }

        public Criteria andCorrectProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_pro not between", value1, value2, "correctPro");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProIsNull() {
            addCriterion("correct_right_pro is null");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProIsNotNull() {
            addCriterion("correct_right_pro is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProEqualTo(BigDecimal value) {
            addCriterion("correct_right_pro =", value, "correctRightPro");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProNotEqualTo(BigDecimal value) {
            addCriterion("correct_right_pro <>", value, "correctRightPro");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProGreaterThan(BigDecimal value) {
            addCriterion("correct_right_pro >", value, "correctRightPro");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_right_pro >=", value, "correctRightPro");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProLessThan(BigDecimal value) {
            addCriterion("correct_right_pro <", value, "correctRightPro");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_right_pro <=", value, "correctRightPro");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProIn(List<BigDecimal> values) {
            addCriterion("correct_right_pro in", values, "correctRightPro");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProNotIn(List<BigDecimal> values) {
            addCriterion("correct_right_pro not in", values, "correctRightPro");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_right_pro between", value1, value2, "correctRightPro");
            return (Criteria) this;
        }

        public Criteria andCorrectRightProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_right_pro not between", value1, value2, "correctRightPro");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdIsNull() {
            addCriterion("student_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdIsNotNull() {
            addCriterion("student_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdEqualTo(Integer value) {
            addCriterion("student_comment_id =", value, "studentCommentId");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdNotEqualTo(Integer value) {
            addCriterion("student_comment_id <>", value, "studentCommentId");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdGreaterThan(Integer value) {
            addCriterion("student_comment_id >", value, "studentCommentId");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_comment_id >=", value, "studentCommentId");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdLessThan(Integer value) {
            addCriterion("student_comment_id <", value, "studentCommentId");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_comment_id <=", value, "studentCommentId");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdIn(List<Integer> values) {
            addCriterion("student_comment_id in", values, "studentCommentId");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdNotIn(List<Integer> values) {
            addCriterion("student_comment_id not in", values, "studentCommentId");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_comment_id between", value1, value2, "studentCommentId");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_comment_id not between", value1, value2, "studentCommentId");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIsNull() {
            addCriterion("student_comment is null");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIsNotNull() {
            addCriterion("student_comment is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCommentEqualTo(String value) {
            addCriterion("student_comment =", value, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentNotEqualTo(String value) {
            addCriterion("student_comment <>", value, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentGreaterThan(String value) {
            addCriterion("student_comment >", value, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentGreaterThanOrEqualTo(String value) {
            addCriterion("student_comment >=", value, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentLessThan(String value) {
            addCriterion("student_comment <", value, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentLessThanOrEqualTo(String value) {
            addCriterion("student_comment <=", value, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentLike(String value) {
            addCriterion("student_comment like", value, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentNotLike(String value) {
            addCriterion("student_comment not like", value, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentIn(List<String> values) {
            addCriterion("student_comment in", values, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentNotIn(List<String> values) {
            addCriterion("student_comment not in", values, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentBetween(String value1, String value2) {
            addCriterion("student_comment between", value1, value2, "studentComment");
            return (Criteria) this;
        }

        public Criteria andStudentCommentNotBetween(String value1, String value2) {
            addCriterion("student_comment not between", value1, value2, "studentComment");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumIsNull() {
            addCriterion("practice_total_num is null");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumIsNotNull() {
            addCriterion("practice_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumEqualTo(Integer value) {
            addCriterion("practice_total_num =", value, "practiceTotalNum");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumNotEqualTo(Integer value) {
            addCriterion("practice_total_num <>", value, "practiceTotalNum");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumGreaterThan(Integer value) {
            addCriterion("practice_total_num >", value, "practiceTotalNum");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("practice_total_num >=", value, "practiceTotalNum");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumLessThan(Integer value) {
            addCriterion("practice_total_num <", value, "practiceTotalNum");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("practice_total_num <=", value, "practiceTotalNum");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumIn(List<Integer> values) {
            addCriterion("practice_total_num in", values, "practiceTotalNum");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumNotIn(List<Integer> values) {
            addCriterion("practice_total_num not in", values, "practiceTotalNum");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("practice_total_num between", value1, value2, "practiceTotalNum");
            return (Criteria) this;
        }

        public Criteria andPracticeTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("practice_total_num not between", value1, value2, "practiceTotalNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumIsNull() {
            addCriterion("practice_finish_num is null");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumIsNotNull() {
            addCriterion("practice_finish_num is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumEqualTo(Integer value) {
            addCriterion("practice_finish_num =", value, "practiceFinishNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumNotEqualTo(Integer value) {
            addCriterion("practice_finish_num <>", value, "practiceFinishNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumGreaterThan(Integer value) {
            addCriterion("practice_finish_num >", value, "practiceFinishNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("practice_finish_num >=", value, "practiceFinishNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumLessThan(Integer value) {
            addCriterion("practice_finish_num <", value, "practiceFinishNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumLessThanOrEqualTo(Integer value) {
            addCriterion("practice_finish_num <=", value, "practiceFinishNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumIn(List<Integer> values) {
            addCriterion("practice_finish_num in", values, "practiceFinishNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumNotIn(List<Integer> values) {
            addCriterion("practice_finish_num not in", values, "practiceFinishNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumBetween(Integer value1, Integer value2) {
            addCriterion("practice_finish_num between", value1, value2, "practiceFinishNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishNumNotBetween(Integer value1, Integer value2) {
            addCriterion("practice_finish_num not between", value1, value2, "practiceFinishNum");
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