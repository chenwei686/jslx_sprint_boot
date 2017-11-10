package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        public Criteria andExampaperNameIsNull() {
            addCriterion("exampaper_name is null");
            return (Criteria) this;
        }

        public Criteria andExampaperNameIsNotNull() {
            addCriterion("exampaper_name is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperNameEqualTo(String value) {
            addCriterion("exampaper_name =", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotEqualTo(String value) {
            addCriterion("exampaper_name <>", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameGreaterThan(String value) {
            addCriterion("exampaper_name >", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("exampaper_name >=", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameLessThan(String value) {
            addCriterion("exampaper_name <", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameLessThanOrEqualTo(String value) {
            addCriterion("exampaper_name <=", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameLike(String value) {
            addCriterion("exampaper_name like", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotLike(String value) {
            addCriterion("exampaper_name not like", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameIn(List<String> values) {
            addCriterion("exampaper_name in", values, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotIn(List<String> values) {
            addCriterion("exampaper_name not in", values, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameBetween(String value1, String value2) {
            addCriterion("exampaper_name between", value1, value2, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotBetween(String value1, String value2) {
            addCriterion("exampaper_name not between", value1, value2, "exampaperName");
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

        public Criteria andStudentExampaperNumIsNull() {
            addCriterion("student_exampaper_num is null");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumIsNotNull() {
            addCriterion("student_exampaper_num is not null");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumEqualTo(Integer value) {
            addCriterion("student_exampaper_num =", value, "studentExampaperNum");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumNotEqualTo(Integer value) {
            addCriterion("student_exampaper_num <>", value, "studentExampaperNum");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumGreaterThan(Integer value) {
            addCriterion("student_exampaper_num >", value, "studentExampaperNum");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_exampaper_num >=", value, "studentExampaperNum");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumLessThan(Integer value) {
            addCriterion("student_exampaper_num <", value, "studentExampaperNum");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumLessThanOrEqualTo(Integer value) {
            addCriterion("student_exampaper_num <=", value, "studentExampaperNum");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumIn(List<Integer> values) {
            addCriterion("student_exampaper_num in", values, "studentExampaperNum");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumNotIn(List<Integer> values) {
            addCriterion("student_exampaper_num not in", values, "studentExampaperNum");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumBetween(Integer value1, Integer value2) {
            addCriterion("student_exampaper_num between", value1, value2, "studentExampaperNum");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperNumNotBetween(Integer value1, Integer value2) {
            addCriterion("student_exampaper_num not between", value1, value2, "studentExampaperNum");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreIsNull() {
            addCriterion("student_exampaper_total_score is null");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreIsNotNull() {
            addCriterion("student_exampaper_total_score is not null");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreEqualTo(BigDecimal value) {
            addCriterion("student_exampaper_total_score =", value, "studentExampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreNotEqualTo(BigDecimal value) {
            addCriterion("student_exampaper_total_score <>", value, "studentExampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreGreaterThan(BigDecimal value) {
            addCriterion("student_exampaper_total_score >", value, "studentExampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("student_exampaper_total_score >=", value, "studentExampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreLessThan(BigDecimal value) {
            addCriterion("student_exampaper_total_score <", value, "studentExampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("student_exampaper_total_score <=", value, "studentExampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreIn(List<BigDecimal> values) {
            addCriterion("student_exampaper_total_score in", values, "studentExampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreNotIn(List<BigDecimal> values) {
            addCriterion("student_exampaper_total_score not in", values, "studentExampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("student_exampaper_total_score between", value1, value2, "studentExampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperTotalScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("student_exampaper_total_score not between", value1, value2, "studentExampaperTotalScore");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgIsNull() {
            addCriterion("student_exampaper_score_avg is null");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgIsNotNull() {
            addCriterion("student_exampaper_score_avg is not null");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgEqualTo(Integer value) {
            addCriterion("student_exampaper_score_avg =", value, "studentExampaperScoreAvg");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgNotEqualTo(Integer value) {
            addCriterion("student_exampaper_score_avg <>", value, "studentExampaperScoreAvg");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgGreaterThan(Integer value) {
            addCriterion("student_exampaper_score_avg >", value, "studentExampaperScoreAvg");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_exampaper_score_avg >=", value, "studentExampaperScoreAvg");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgLessThan(Integer value) {
            addCriterion("student_exampaper_score_avg <", value, "studentExampaperScoreAvg");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgLessThanOrEqualTo(Integer value) {
            addCriterion("student_exampaper_score_avg <=", value, "studentExampaperScoreAvg");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgIn(List<Integer> values) {
            addCriterion("student_exampaper_score_avg in", values, "studentExampaperScoreAvg");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgNotIn(List<Integer> values) {
            addCriterion("student_exampaper_score_avg not in", values, "studentExampaperScoreAvg");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgBetween(Integer value1, Integer value2) {
            addCriterion("student_exampaper_score_avg between", value1, value2, "studentExampaperScoreAvg");
            return (Criteria) this;
        }

        public Criteria andStudentExampaperScoreAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("student_exampaper_score_avg not between", value1, value2, "studentExampaperScoreAvg");
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

        public Criteria andErrorNumIsNull() {
            addCriterion("error_num is null");
            return (Criteria) this;
        }

        public Criteria andErrorNumIsNotNull() {
            addCriterion("error_num is not null");
            return (Criteria) this;
        }

        public Criteria andErrorNumEqualTo(BigDecimal value) {
            addCriterion("error_num =", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotEqualTo(BigDecimal value) {
            addCriterion("error_num <>", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumGreaterThan(BigDecimal value) {
            addCriterion("error_num >", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("error_num >=", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumLessThan(BigDecimal value) {
            addCriterion("error_num <", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("error_num <=", value, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumIn(List<BigDecimal> values) {
            addCriterion("error_num in", values, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotIn(List<BigDecimal> values) {
            addCriterion("error_num not in", values, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("error_num between", value1, value2, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("error_num not between", value1, value2, "errorNum");
            return (Criteria) this;
        }

        public Criteria andErrorNumRIsNull() {
            addCriterion("error_num_r is null");
            return (Criteria) this;
        }

        public Criteria andErrorNumRIsNotNull() {
            addCriterion("error_num_r is not null");
            return (Criteria) this;
        }

        public Criteria andErrorNumREqualTo(BigDecimal value) {
            addCriterion("error_num_r =", value, "errorNumR");
            return (Criteria) this;
        }

        public Criteria andErrorNumRNotEqualTo(BigDecimal value) {
            addCriterion("error_num_r <>", value, "errorNumR");
            return (Criteria) this;
        }

        public Criteria andErrorNumRGreaterThan(BigDecimal value) {
            addCriterion("error_num_r >", value, "errorNumR");
            return (Criteria) this;
        }

        public Criteria andErrorNumRGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("error_num_r >=", value, "errorNumR");
            return (Criteria) this;
        }

        public Criteria andErrorNumRLessThan(BigDecimal value) {
            addCriterion("error_num_r <", value, "errorNumR");
            return (Criteria) this;
        }

        public Criteria andErrorNumRLessThanOrEqualTo(BigDecimal value) {
            addCriterion("error_num_r <=", value, "errorNumR");
            return (Criteria) this;
        }

        public Criteria andErrorNumRIn(List<BigDecimal> values) {
            addCriterion("error_num_r in", values, "errorNumR");
            return (Criteria) this;
        }

        public Criteria andErrorNumRNotIn(List<BigDecimal> values) {
            addCriterion("error_num_r not in", values, "errorNumR");
            return (Criteria) this;
        }

        public Criteria andErrorNumRBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("error_num_r between", value1, value2, "errorNumR");
            return (Criteria) this;
        }

        public Criteria andErrorNumRNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("error_num_r not between", value1, value2, "errorNumR");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHIsNull() {
            addCriterion("difficulty_pro_h is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHIsNotNull() {
            addCriterion("difficulty_pro_h is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_h =", value, "difficultyProH");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHNotEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_h <>", value, "difficultyProH");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHGreaterThan(BigDecimal value) {
            addCriterion("difficulty_pro_h >", value, "difficultyProH");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_h >=", value, "difficultyProH");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHLessThan(BigDecimal value) {
            addCriterion("difficulty_pro_h <", value, "difficultyProH");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHLessThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_h <=", value, "difficultyProH");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHIn(List<BigDecimal> values) {
            addCriterion("difficulty_pro_h in", values, "difficultyProH");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHNotIn(List<BigDecimal> values) {
            addCriterion("difficulty_pro_h not in", values, "difficultyProH");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty_pro_h between", value1, value2, "difficultyProH");
            return (Criteria) this;
        }

        public Criteria andDifficultyProHNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty_pro_h not between", value1, value2, "difficultyProH");
            return (Criteria) this;
        }

        public Criteria andDifficultyProAIsNull() {
            addCriterion("difficulty_pro_a is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyProAIsNotNull() {
            addCriterion("difficulty_pro_a is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyProAEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_a =", value, "difficultyProA");
            return (Criteria) this;
        }

        public Criteria andDifficultyProANotEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_a <>", value, "difficultyProA");
            return (Criteria) this;
        }

        public Criteria andDifficultyProAGreaterThan(BigDecimal value) {
            addCriterion("difficulty_pro_a >", value, "difficultyProA");
            return (Criteria) this;
        }

        public Criteria andDifficultyProAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_a >=", value, "difficultyProA");
            return (Criteria) this;
        }

        public Criteria andDifficultyProALessThan(BigDecimal value) {
            addCriterion("difficulty_pro_a <", value, "difficultyProA");
            return (Criteria) this;
        }

        public Criteria andDifficultyProALessThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty_pro_a <=", value, "difficultyProA");
            return (Criteria) this;
        }

        public Criteria andDifficultyProAIn(List<BigDecimal> values) {
            addCriterion("difficulty_pro_a in", values, "difficultyProA");
            return (Criteria) this;
        }

        public Criteria andDifficultyProANotIn(List<BigDecimal> values) {
            addCriterion("difficulty_pro_a not in", values, "difficultyProA");
            return (Criteria) this;
        }

        public Criteria andDifficultyProABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty_pro_a between", value1, value2, "difficultyProA");
            return (Criteria) this;
        }

        public Criteria andDifficultyProANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty_pro_a not between", value1, value2, "difficultyProA");
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