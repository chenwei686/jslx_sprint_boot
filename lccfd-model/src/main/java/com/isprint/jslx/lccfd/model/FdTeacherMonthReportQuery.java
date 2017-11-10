package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FdTeacherMonthReportQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdTeacherMonthReportQuery() {
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

        public Criteria andYearIdIsNull() {
            addCriterion("year_id is null");
            return (Criteria) this;
        }

        public Criteria andYearIdIsNotNull() {
            addCriterion("year_id is not null");
            return (Criteria) this;
        }

        public Criteria andYearIdEqualTo(Integer value) {
            addCriterion("year_id =", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotEqualTo(Integer value) {
            addCriterion("year_id <>", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThan(Integer value) {
            addCriterion("year_id >", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_id >=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThan(Integer value) {
            addCriterion("year_id <", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThanOrEqualTo(Integer value) {
            addCriterion("year_id <=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdIn(List<Integer> values) {
            addCriterion("year_id in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotIn(List<Integer> values) {
            addCriterion("year_id not in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdBetween(Integer value1, Integer value2) {
            addCriterion("year_id between", value1, value2, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotBetween(Integer value1, Integer value2) {
            addCriterion("year_id not between", value1, value2, "yearId");
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

        public Criteria andParentSubjectIdIsNull() {
            addCriterion("parent_subject_id is null");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdIsNotNull() {
            addCriterion("parent_subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdEqualTo(Integer value) {
            addCriterion("parent_subject_id =", value, "parentSubjectId");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdNotEqualTo(Integer value) {
            addCriterion("parent_subject_id <>", value, "parentSubjectId");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdGreaterThan(Integer value) {
            addCriterion("parent_subject_id >", value, "parentSubjectId");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_subject_id >=", value, "parentSubjectId");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdLessThan(Integer value) {
            addCriterion("parent_subject_id <", value, "parentSubjectId");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_subject_id <=", value, "parentSubjectId");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdIn(List<Integer> values) {
            addCriterion("parent_subject_id in", values, "parentSubjectId");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdNotIn(List<Integer> values) {
            addCriterion("parent_subject_id not in", values, "parentSubjectId");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_subject_id between", value1, value2, "parentSubjectId");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_subject_id not between", value1, value2, "parentSubjectId");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
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

        public Criteria andStudentNumIsNull() {
            addCriterion("student_num is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNotNull() {
            addCriterion("student_num is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumEqualTo(Integer value) {
            addCriterion("student_num =", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotEqualTo(Integer value) {
            addCriterion("student_num <>", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThan(Integer value) {
            addCriterion("student_num >", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_num >=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThan(Integer value) {
            addCriterion("student_num <", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThanOrEqualTo(Integer value) {
            addCriterion("student_num <=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumIn(List<Integer> values) {
            addCriterion("student_num in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotIn(List<Integer> values) {
            addCriterion("student_num not in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumBetween(Integer value1, Integer value2) {
            addCriterion("student_num between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("student_num not between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andSearchAvgIsNull() {
            addCriterion("search_avg is null");
            return (Criteria) this;
        }

        public Criteria andSearchAvgIsNotNull() {
            addCriterion("search_avg is not null");
            return (Criteria) this;
        }

        public Criteria andSearchAvgEqualTo(Integer value) {
            addCriterion("search_avg =", value, "searchAvg");
            return (Criteria) this;
        }

        public Criteria andSearchAvgNotEqualTo(Integer value) {
            addCriterion("search_avg <>", value, "searchAvg");
            return (Criteria) this;
        }

        public Criteria andSearchAvgGreaterThan(Integer value) {
            addCriterion("search_avg >", value, "searchAvg");
            return (Criteria) this;
        }

        public Criteria andSearchAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_avg >=", value, "searchAvg");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLessThan(Integer value) {
            addCriterion("search_avg <", value, "searchAvg");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLessThanOrEqualTo(Integer value) {
            addCriterion("search_avg <=", value, "searchAvg");
            return (Criteria) this;
        }

        public Criteria andSearchAvgIn(List<Integer> values) {
            addCriterion("search_avg in", values, "searchAvg");
            return (Criteria) this;
        }

        public Criteria andSearchAvgNotIn(List<Integer> values) {
            addCriterion("search_avg not in", values, "searchAvg");
            return (Criteria) this;
        }

        public Criteria andSearchAvgBetween(Integer value1, Integer value2) {
            addCriterion("search_avg between", value1, value2, "searchAvg");
            return (Criteria) this;
        }

        public Criteria andSearchAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("search_avg not between", value1, value2, "searchAvg");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingIsNull() {
            addCriterion("search_avg_ranking is null");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingIsNotNull() {
            addCriterion("search_avg_ranking is not null");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingEqualTo(Integer value) {
            addCriterion("search_avg_ranking =", value, "searchAvgRanking");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingNotEqualTo(Integer value) {
            addCriterion("search_avg_ranking <>", value, "searchAvgRanking");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingGreaterThan(Integer value) {
            addCriterion("search_avg_ranking >", value, "searchAvgRanking");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_avg_ranking >=", value, "searchAvgRanking");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingLessThan(Integer value) {
            addCriterion("search_avg_ranking <", value, "searchAvgRanking");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingLessThanOrEqualTo(Integer value) {
            addCriterion("search_avg_ranking <=", value, "searchAvgRanking");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingIn(List<Integer> values) {
            addCriterion("search_avg_ranking in", values, "searchAvgRanking");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingNotIn(List<Integer> values) {
            addCriterion("search_avg_ranking not in", values, "searchAvgRanking");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingBetween(Integer value1, Integer value2) {
            addCriterion("search_avg_ranking between", value1, value2, "searchAvgRanking");
            return (Criteria) this;
        }

        public Criteria andSearchAvgRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("search_avg_ranking not between", value1, value2, "searchAvgRanking");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastIsNull() {
            addCriterion("search_avg_last is null");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastIsNotNull() {
            addCriterion("search_avg_last is not null");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastEqualTo(Integer value) {
            addCriterion("search_avg_last =", value, "searchAvgLast");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastNotEqualTo(Integer value) {
            addCriterion("search_avg_last <>", value, "searchAvgLast");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastGreaterThan(Integer value) {
            addCriterion("search_avg_last >", value, "searchAvgLast");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_avg_last >=", value, "searchAvgLast");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastLessThan(Integer value) {
            addCriterion("search_avg_last <", value, "searchAvgLast");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastLessThanOrEqualTo(Integer value) {
            addCriterion("search_avg_last <=", value, "searchAvgLast");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastIn(List<Integer> values) {
            addCriterion("search_avg_last in", values, "searchAvgLast");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastNotIn(List<Integer> values) {
            addCriterion("search_avg_last not in", values, "searchAvgLast");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastBetween(Integer value1, Integer value2) {
            addCriterion("search_avg_last between", value1, value2, "searchAvgLast");
            return (Criteria) this;
        }

        public Criteria andSearchAvgLastNotBetween(Integer value1, Integer value2) {
            addCriterion("search_avg_last not between", value1, value2, "searchAvgLast");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedIsNull() {
            addCriterion("search_avg_treed is null");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedIsNotNull() {
            addCriterion("search_avg_treed is not null");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedEqualTo(Byte value) {
            addCriterion("search_avg_treed =", value, "searchAvgTreed");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedNotEqualTo(Byte value) {
            addCriterion("search_avg_treed <>", value, "searchAvgTreed");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedGreaterThan(Byte value) {
            addCriterion("search_avg_treed >", value, "searchAvgTreed");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedGreaterThanOrEqualTo(Byte value) {
            addCriterion("search_avg_treed >=", value, "searchAvgTreed");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedLessThan(Byte value) {
            addCriterion("search_avg_treed <", value, "searchAvgTreed");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedLessThanOrEqualTo(Byte value) {
            addCriterion("search_avg_treed <=", value, "searchAvgTreed");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedIn(List<Byte> values) {
            addCriterion("search_avg_treed in", values, "searchAvgTreed");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedNotIn(List<Byte> values) {
            addCriterion("search_avg_treed not in", values, "searchAvgTreed");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedBetween(Byte value1, Byte value2) {
            addCriterion("search_avg_treed between", value1, value2, "searchAvgTreed");
            return (Criteria) this;
        }

        public Criteria andSearchAvgTreedNotBetween(Byte value1, Byte value2) {
            addCriterion("search_avg_treed not between", value1, value2, "searchAvgTreed");
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

        public Criteria andCorrectProLastIsNull() {
            addCriterion("correct_pro_last is null");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastIsNotNull() {
            addCriterion("correct_pro_last is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastEqualTo(BigDecimal value) {
            addCriterion("correct_pro_last =", value, "correctProLast");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastNotEqualTo(BigDecimal value) {
            addCriterion("correct_pro_last <>", value, "correctProLast");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastGreaterThan(BigDecimal value) {
            addCriterion("correct_pro_last >", value, "correctProLast");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_pro_last >=", value, "correctProLast");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastLessThan(BigDecimal value) {
            addCriterion("correct_pro_last <", value, "correctProLast");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_pro_last <=", value, "correctProLast");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastIn(List<BigDecimal> values) {
            addCriterion("correct_pro_last in", values, "correctProLast");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastNotIn(List<BigDecimal> values) {
            addCriterion("correct_pro_last not in", values, "correctProLast");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_pro_last between", value1, value2, "correctProLast");
            return (Criteria) this;
        }

        public Criteria andCorrectProLastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_pro_last not between", value1, value2, "correctProLast");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedIsNull() {
            addCriterion("correct_pro_treed is null");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedIsNotNull() {
            addCriterion("correct_pro_treed is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedEqualTo(Byte value) {
            addCriterion("correct_pro_treed =", value, "correctProTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedNotEqualTo(Byte value) {
            addCriterion("correct_pro_treed <>", value, "correctProTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedGreaterThan(Byte value) {
            addCriterion("correct_pro_treed >", value, "correctProTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedGreaterThanOrEqualTo(Byte value) {
            addCriterion("correct_pro_treed >=", value, "correctProTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedLessThan(Byte value) {
            addCriterion("correct_pro_treed <", value, "correctProTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedLessThanOrEqualTo(Byte value) {
            addCriterion("correct_pro_treed <=", value, "correctProTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedIn(List<Byte> values) {
            addCriterion("correct_pro_treed in", values, "correctProTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedNotIn(List<Byte> values) {
            addCriterion("correct_pro_treed not in", values, "correctProTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedBetween(Byte value1, Byte value2) {
            addCriterion("correct_pro_treed between", value1, value2, "correctProTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectProTreedNotBetween(Byte value1, Byte value2) {
            addCriterion("correct_pro_treed not between", value1, value2, "correctProTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingIsNull() {
            addCriterion("correct_pro_ranking is null");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingIsNotNull() {
            addCriterion("correct_pro_ranking is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingEqualTo(Integer value) {
            addCriterion("correct_pro_ranking =", value, "correctProRanking");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingNotEqualTo(Integer value) {
            addCriterion("correct_pro_ranking <>", value, "correctProRanking");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingGreaterThan(Integer value) {
            addCriterion("correct_pro_ranking >", value, "correctProRanking");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_pro_ranking >=", value, "correctProRanking");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingLessThan(Integer value) {
            addCriterion("correct_pro_ranking <", value, "correctProRanking");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingLessThanOrEqualTo(Integer value) {
            addCriterion("correct_pro_ranking <=", value, "correctProRanking");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingIn(List<Integer> values) {
            addCriterion("correct_pro_ranking in", values, "correctProRanking");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingNotIn(List<Integer> values) {
            addCriterion("correct_pro_ranking not in", values, "correctProRanking");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingBetween(Integer value1, Integer value2) {
            addCriterion("correct_pro_ranking between", value1, value2, "correctProRanking");
            return (Criteria) this;
        }

        public Criteria andCorrectProRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_pro_ranking not between", value1, value2, "correctProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProIsNull() {
            addCriterion("exampaper_avg_pro is null");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProIsNotNull() {
            addCriterion("exampaper_avg_pro is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProEqualTo(BigDecimal value) {
            addCriterion("exampaper_avg_pro =", value, "exampaperAvgPro");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProNotEqualTo(BigDecimal value) {
            addCriterion("exampaper_avg_pro <>", value, "exampaperAvgPro");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProGreaterThan(BigDecimal value) {
            addCriterion("exampaper_avg_pro >", value, "exampaperAvgPro");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_avg_pro >=", value, "exampaperAvgPro");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLessThan(BigDecimal value) {
            addCriterion("exampaper_avg_pro <", value, "exampaperAvgPro");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_avg_pro <=", value, "exampaperAvgPro");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProIn(List<BigDecimal> values) {
            addCriterion("exampaper_avg_pro in", values, "exampaperAvgPro");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProNotIn(List<BigDecimal> values) {
            addCriterion("exampaper_avg_pro not in", values, "exampaperAvgPro");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_avg_pro between", value1, value2, "exampaperAvgPro");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_avg_pro not between", value1, value2, "exampaperAvgPro");
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

        public Criteria andExampaperTotalScoreIsNull() {
            addCriterion("exampaper_total_score is null");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreIsNotNull() {
            addCriterion("exampaper_total_score is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreEqualTo(BigDecimal value) {
            addCriterion("exampaper_total_score =", value, "exampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreNotEqualTo(BigDecimal value) {
            addCriterion("exampaper_total_score <>", value, "exampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreGreaterThan(BigDecimal value) {
            addCriterion("exampaper_total_score >", value, "exampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_total_score >=", value, "exampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreLessThan(BigDecimal value) {
            addCriterion("exampaper_total_score <", value, "exampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_total_score <=", value, "exampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreIn(List<BigDecimal> values) {
            addCriterion("exampaper_total_score in", values, "exampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreNotIn(List<BigDecimal> values) {
            addCriterion("exampaper_total_score not in", values, "exampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_total_score between", value1, value2, "exampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_total_score not between", value1, value2, "exampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andExampaperNumIsNull() {
            addCriterion("exampaper_num is null");
            return (Criteria) this;
        }

        public Criteria andExampaperNumIsNotNull() {
            addCriterion("exampaper_num is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperNumEqualTo(Integer value) {
            addCriterion("exampaper_num =", value, "exampaperNum");
            return (Criteria) this;
        }

        public Criteria andExampaperNumNotEqualTo(Integer value) {
            addCriterion("exampaper_num <>", value, "exampaperNum");
            return (Criteria) this;
        }

        public Criteria andExampaperNumGreaterThan(Integer value) {
            addCriterion("exampaper_num >", value, "exampaperNum");
            return (Criteria) this;
        }

        public Criteria andExampaperNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampaper_num >=", value, "exampaperNum");
            return (Criteria) this;
        }

        public Criteria andExampaperNumLessThan(Integer value) {
            addCriterion("exampaper_num <", value, "exampaperNum");
            return (Criteria) this;
        }

        public Criteria andExampaperNumLessThanOrEqualTo(Integer value) {
            addCriterion("exampaper_num <=", value, "exampaperNum");
            return (Criteria) this;
        }

        public Criteria andExampaperNumIn(List<Integer> values) {
            addCriterion("exampaper_num in", values, "exampaperNum");
            return (Criteria) this;
        }

        public Criteria andExampaperNumNotIn(List<Integer> values) {
            addCriterion("exampaper_num not in", values, "exampaperNum");
            return (Criteria) this;
        }

        public Criteria andExampaperNumBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_num between", value1, value2, "exampaperNum");
            return (Criteria) this;
        }

        public Criteria andExampaperNumNotBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_num not between", value1, value2, "exampaperNum");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastIsNull() {
            addCriterion("exampaper_avg_pro_last is null");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastIsNotNull() {
            addCriterion("exampaper_avg_pro_last is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastEqualTo(BigDecimal value) {
            addCriterion("exampaper_avg_pro_last =", value, "exampaperAvgProLast");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastNotEqualTo(BigDecimal value) {
            addCriterion("exampaper_avg_pro_last <>", value, "exampaperAvgProLast");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastGreaterThan(BigDecimal value) {
            addCriterion("exampaper_avg_pro_last >", value, "exampaperAvgProLast");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_avg_pro_last >=", value, "exampaperAvgProLast");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastLessThan(BigDecimal value) {
            addCriterion("exampaper_avg_pro_last <", value, "exampaperAvgProLast");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_avg_pro_last <=", value, "exampaperAvgProLast");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastIn(List<BigDecimal> values) {
            addCriterion("exampaper_avg_pro_last in", values, "exampaperAvgProLast");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastNotIn(List<BigDecimal> values) {
            addCriterion("exampaper_avg_pro_last not in", values, "exampaperAvgProLast");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_avg_pro_last between", value1, value2, "exampaperAvgProLast");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProLastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_avg_pro_last not between", value1, value2, "exampaperAvgProLast");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingIsNull() {
            addCriterion("exampaper_avg_pro_ranking is null");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingIsNotNull() {
            addCriterion("exampaper_avg_pro_ranking is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingEqualTo(Integer value) {
            addCriterion("exampaper_avg_pro_ranking =", value, "exampaperAvgProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingNotEqualTo(Integer value) {
            addCriterion("exampaper_avg_pro_ranking <>", value, "exampaperAvgProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingGreaterThan(Integer value) {
            addCriterion("exampaper_avg_pro_ranking >", value, "exampaperAvgProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampaper_avg_pro_ranking >=", value, "exampaperAvgProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingLessThan(Integer value) {
            addCriterion("exampaper_avg_pro_ranking <", value, "exampaperAvgProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingLessThanOrEqualTo(Integer value) {
            addCriterion("exampaper_avg_pro_ranking <=", value, "exampaperAvgProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingIn(List<Integer> values) {
            addCriterion("exampaper_avg_pro_ranking in", values, "exampaperAvgProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingNotIn(List<Integer> values) {
            addCriterion("exampaper_avg_pro_ranking not in", values, "exampaperAvgProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_avg_pro_ranking between", value1, value2, "exampaperAvgProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_avg_pro_ranking not between", value1, value2, "exampaperAvgProRanking");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedIsNull() {
            addCriterion("exampaper_avg_pro_treed is null");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedIsNotNull() {
            addCriterion("exampaper_avg_pro_treed is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedEqualTo(Byte value) {
            addCriterion("exampaper_avg_pro_treed =", value, "exampaperAvgProTreed");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedNotEqualTo(Byte value) {
            addCriterion("exampaper_avg_pro_treed <>", value, "exampaperAvgProTreed");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedGreaterThan(Byte value) {
            addCriterion("exampaper_avg_pro_treed >", value, "exampaperAvgProTreed");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedGreaterThanOrEqualTo(Byte value) {
            addCriterion("exampaper_avg_pro_treed >=", value, "exampaperAvgProTreed");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedLessThan(Byte value) {
            addCriterion("exampaper_avg_pro_treed <", value, "exampaperAvgProTreed");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedLessThanOrEqualTo(Byte value) {
            addCriterion("exampaper_avg_pro_treed <=", value, "exampaperAvgProTreed");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedIn(List<Byte> values) {
            addCriterion("exampaper_avg_pro_treed in", values, "exampaperAvgProTreed");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedNotIn(List<Byte> values) {
            addCriterion("exampaper_avg_pro_treed not in", values, "exampaperAvgProTreed");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedBetween(Byte value1, Byte value2) {
            addCriterion("exampaper_avg_pro_treed between", value1, value2, "exampaperAvgProTreed");
            return (Criteria) this;
        }

        public Criteria andExampaperAvgProTreedNotBetween(Byte value1, Byte value2) {
            addCriterion("exampaper_avg_pro_treed not between", value1, value2, "exampaperAvgProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeNumIsNull() {
            addCriterion("practice_num is null");
            return (Criteria) this;
        }

        public Criteria andPracticeNumIsNotNull() {
            addCriterion("practice_num is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeNumEqualTo(Integer value) {
            addCriterion("practice_num =", value, "practiceNum");
            return (Criteria) this;
        }

        public Criteria andPracticeNumNotEqualTo(Integer value) {
            addCriterion("practice_num <>", value, "practiceNum");
            return (Criteria) this;
        }

        public Criteria andPracticeNumGreaterThan(Integer value) {
            addCriterion("practice_num >", value, "practiceNum");
            return (Criteria) this;
        }

        public Criteria andPracticeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("practice_num >=", value, "practiceNum");
            return (Criteria) this;
        }

        public Criteria andPracticeNumLessThan(Integer value) {
            addCriterion("practice_num <", value, "practiceNum");
            return (Criteria) this;
        }

        public Criteria andPracticeNumLessThanOrEqualTo(Integer value) {
            addCriterion("practice_num <=", value, "practiceNum");
            return (Criteria) this;
        }

        public Criteria andPracticeNumIn(List<Integer> values) {
            addCriterion("practice_num in", values, "practiceNum");
            return (Criteria) this;
        }

        public Criteria andPracticeNumNotIn(List<Integer> values) {
            addCriterion("practice_num not in", values, "practiceNum");
            return (Criteria) this;
        }

        public Criteria andPracticeNumBetween(Integer value1, Integer value2) {
            addCriterion("practice_num between", value1, value2, "practiceNum");
            return (Criteria) this;
        }

        public Criteria andPracticeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("practice_num not between", value1, value2, "practiceNum");
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

        public Criteria andPracticeUnfinishedNumIsNull() {
            addCriterion("practice_unfinished_num is null");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumIsNotNull() {
            addCriterion("practice_unfinished_num is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumEqualTo(Integer value) {
            addCriterion("practice_unfinished_num =", value, "practiceUnfinishedNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumNotEqualTo(Integer value) {
            addCriterion("practice_unfinished_num <>", value, "practiceUnfinishedNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumGreaterThan(Integer value) {
            addCriterion("practice_unfinished_num >", value, "practiceUnfinishedNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("practice_unfinished_num >=", value, "practiceUnfinishedNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumLessThan(Integer value) {
            addCriterion("practice_unfinished_num <", value, "practiceUnfinishedNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumLessThanOrEqualTo(Integer value) {
            addCriterion("practice_unfinished_num <=", value, "practiceUnfinishedNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumIn(List<Integer> values) {
            addCriterion("practice_unfinished_num in", values, "practiceUnfinishedNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumNotIn(List<Integer> values) {
            addCriterion("practice_unfinished_num not in", values, "practiceUnfinishedNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumBetween(Integer value1, Integer value2) {
            addCriterion("practice_unfinished_num between", value1, value2, "practiceUnfinishedNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("practice_unfinished_num not between", value1, value2, "practiceUnfinishedNum");
            return (Criteria) this;
        }

        public Criteria andPracticeProIsNull() {
            addCriterion("practice_pro is null");
            return (Criteria) this;
        }

        public Criteria andPracticeProIsNotNull() {
            addCriterion("practice_pro is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeProEqualTo(BigDecimal value) {
            addCriterion("practice_pro =", value, "practicePro");
            return (Criteria) this;
        }

        public Criteria andPracticeProNotEqualTo(BigDecimal value) {
            addCriterion("practice_pro <>", value, "practicePro");
            return (Criteria) this;
        }

        public Criteria andPracticeProGreaterThan(BigDecimal value) {
            addCriterion("practice_pro >", value, "practicePro");
            return (Criteria) this;
        }

        public Criteria andPracticeProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("practice_pro >=", value, "practicePro");
            return (Criteria) this;
        }

        public Criteria andPracticeProLessThan(BigDecimal value) {
            addCriterion("practice_pro <", value, "practicePro");
            return (Criteria) this;
        }

        public Criteria andPracticeProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("practice_pro <=", value, "practicePro");
            return (Criteria) this;
        }

        public Criteria andPracticeProIn(List<BigDecimal> values) {
            addCriterion("practice_pro in", values, "practicePro");
            return (Criteria) this;
        }

        public Criteria andPracticeProNotIn(List<BigDecimal> values) {
            addCriterion("practice_pro not in", values, "practicePro");
            return (Criteria) this;
        }

        public Criteria andPracticeProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("practice_pro between", value1, value2, "practicePro");
            return (Criteria) this;
        }

        public Criteria andPracticeProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("practice_pro not between", value1, value2, "practicePro");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastIsNull() {
            addCriterion("practice_pro_last is null");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastIsNotNull() {
            addCriterion("practice_pro_last is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastEqualTo(BigDecimal value) {
            addCriterion("practice_pro_last =", value, "practiceProLast");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastNotEqualTo(BigDecimal value) {
            addCriterion("practice_pro_last <>", value, "practiceProLast");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastGreaterThan(BigDecimal value) {
            addCriterion("practice_pro_last >", value, "practiceProLast");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("practice_pro_last >=", value, "practiceProLast");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastLessThan(BigDecimal value) {
            addCriterion("practice_pro_last <", value, "practiceProLast");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("practice_pro_last <=", value, "practiceProLast");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastIn(List<BigDecimal> values) {
            addCriterion("practice_pro_last in", values, "practiceProLast");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastNotIn(List<BigDecimal> values) {
            addCriterion("practice_pro_last not in", values, "practiceProLast");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("practice_pro_last between", value1, value2, "practiceProLast");
            return (Criteria) this;
        }

        public Criteria andPracticeProLastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("practice_pro_last not between", value1, value2, "practiceProLast");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedIsNull() {
            addCriterion("practice_pro_treed is null");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedIsNotNull() {
            addCriterion("practice_pro_treed is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedEqualTo(Byte value) {
            addCriterion("practice_pro_treed =", value, "practiceProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedNotEqualTo(Byte value) {
            addCriterion("practice_pro_treed <>", value, "practiceProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedGreaterThan(Byte value) {
            addCriterion("practice_pro_treed >", value, "practiceProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedGreaterThanOrEqualTo(Byte value) {
            addCriterion("practice_pro_treed >=", value, "practiceProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedLessThan(Byte value) {
            addCriterion("practice_pro_treed <", value, "practiceProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedLessThanOrEqualTo(Byte value) {
            addCriterion("practice_pro_treed <=", value, "practiceProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedIn(List<Byte> values) {
            addCriterion("practice_pro_treed in", values, "practiceProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedNotIn(List<Byte> values) {
            addCriterion("practice_pro_treed not in", values, "practiceProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedBetween(Byte value1, Byte value2) {
            addCriterion("practice_pro_treed between", value1, value2, "practiceProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeProTreedNotBetween(Byte value1, Byte value2) {
            addCriterion("practice_pro_treed not between", value1, value2, "practiceProTreed");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingIsNull() {
            addCriterion("practice_pro_renking is null");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingIsNotNull() {
            addCriterion("practice_pro_renking is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingEqualTo(Integer value) {
            addCriterion("practice_pro_renking =", value, "practiceProRenking");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingNotEqualTo(Integer value) {
            addCriterion("practice_pro_renking <>", value, "practiceProRenking");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingGreaterThan(Integer value) {
            addCriterion("practice_pro_renking >", value, "practiceProRenking");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingGreaterThanOrEqualTo(Integer value) {
            addCriterion("practice_pro_renking >=", value, "practiceProRenking");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingLessThan(Integer value) {
            addCriterion("practice_pro_renking <", value, "practiceProRenking");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingLessThanOrEqualTo(Integer value) {
            addCriterion("practice_pro_renking <=", value, "practiceProRenking");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingIn(List<Integer> values) {
            addCriterion("practice_pro_renking in", values, "practiceProRenking");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingNotIn(List<Integer> values) {
            addCriterion("practice_pro_renking not in", values, "practiceProRenking");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingBetween(Integer value1, Integer value2) {
            addCriterion("practice_pro_renking between", value1, value2, "practiceProRenking");
            return (Criteria) this;
        }

        public Criteria andPracticeProRenkingNotBetween(Integer value1, Integer value2) {
            addCriterion("practice_pro_renking not between", value1, value2, "practiceProRenking");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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