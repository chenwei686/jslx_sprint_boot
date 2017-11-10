package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FdStudentUseDetailQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentUseDetailQuery() {
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

        public Criteria andCorrectRightNumIsNull() {
            addCriterion("correct_right_num is null");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumIsNotNull() {
            addCriterion("correct_right_num is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumEqualTo(Integer value) {
            addCriterion("correct_right_num =", value, "correctRightNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumNotEqualTo(Integer value) {
            addCriterion("correct_right_num <>", value, "correctRightNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumGreaterThan(Integer value) {
            addCriterion("correct_right_num >", value, "correctRightNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_right_num >=", value, "correctRightNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumLessThan(Integer value) {
            addCriterion("correct_right_num <", value, "correctRightNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumLessThanOrEqualTo(Integer value) {
            addCriterion("correct_right_num <=", value, "correctRightNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumIn(List<Integer> values) {
            addCriterion("correct_right_num in", values, "correctRightNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumNotIn(List<Integer> values) {
            addCriterion("correct_right_num not in", values, "correctRightNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumBetween(Integer value1, Integer value2) {
            addCriterion("correct_right_num between", value1, value2, "correctRightNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightNumNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_right_num not between", value1, value2, "correctRightNum");
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

        public Criteria andPracticeFinishProIsNull() {
            addCriterion("practice_finish_pro is null");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProIsNotNull() {
            addCriterion("practice_finish_pro is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProEqualTo(BigDecimal value) {
            addCriterion("practice_finish_pro =", value, "practiceFinishPro");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProNotEqualTo(BigDecimal value) {
            addCriterion("practice_finish_pro <>", value, "practiceFinishPro");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProGreaterThan(BigDecimal value) {
            addCriterion("practice_finish_pro >", value, "practiceFinishPro");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("practice_finish_pro >=", value, "practiceFinishPro");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProLessThan(BigDecimal value) {
            addCriterion("practice_finish_pro <", value, "practiceFinishPro");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("practice_finish_pro <=", value, "practiceFinishPro");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProIn(List<BigDecimal> values) {
            addCriterion("practice_finish_pro in", values, "practiceFinishPro");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProNotIn(List<BigDecimal> values) {
            addCriterion("practice_finish_pro not in", values, "practiceFinishPro");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("practice_finish_pro between", value1, value2, "practiceFinishPro");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("practice_finish_pro not between", value1, value2, "practiceFinishPro");
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

        public Criteria andSearchNumRankingIsNull() {
            addCriterion("search_num_ranking is null");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingIsNotNull() {
            addCriterion("search_num_ranking is not null");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingEqualTo(Integer value) {
            addCriterion("search_num_ranking =", value, "searchNumRanking");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingNotEqualTo(Integer value) {
            addCriterion("search_num_ranking <>", value, "searchNumRanking");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingGreaterThan(Integer value) {
            addCriterion("search_num_ranking >", value, "searchNumRanking");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_num_ranking >=", value, "searchNumRanking");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingLessThan(Integer value) {
            addCriterion("search_num_ranking <", value, "searchNumRanking");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingLessThanOrEqualTo(Integer value) {
            addCriterion("search_num_ranking <=", value, "searchNumRanking");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingIn(List<Integer> values) {
            addCriterion("search_num_ranking in", values, "searchNumRanking");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingNotIn(List<Integer> values) {
            addCriterion("search_num_ranking not in", values, "searchNumRanking");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingBetween(Integer value1, Integer value2) {
            addCriterion("search_num_ranking between", value1, value2, "searchNumRanking");
            return (Criteria) this;
        }

        public Criteria andSearchNumRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("search_num_ranking not between", value1, value2, "searchNumRanking");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIsNull() {
            addCriterion("total_number is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIsNotNull() {
            addCriterion("total_number is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumberEqualTo(Integer value) {
            addCriterion("total_number =", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotEqualTo(Integer value) {
            addCriterion("total_number <>", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberGreaterThan(Integer value) {
            addCriterion("total_number >", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_number >=", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberLessThan(Integer value) {
            addCriterion("total_number <", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberLessThanOrEqualTo(Integer value) {
            addCriterion("total_number <=", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIn(List<Integer> values) {
            addCriterion("total_number in", values, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotIn(List<Integer> values) {
            addCriterion("total_number not in", values, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberBetween(Integer value1, Integer value2) {
            addCriterion("total_number between", value1, value2, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("total_number not between", value1, value2, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andSearchNumProIsNull() {
            addCriterion("search_num_pro is null");
            return (Criteria) this;
        }

        public Criteria andSearchNumProIsNotNull() {
            addCriterion("search_num_pro is not null");
            return (Criteria) this;
        }

        public Criteria andSearchNumProEqualTo(BigDecimal value) {
            addCriterion("search_num_pro =", value, "searchNumPro");
            return (Criteria) this;
        }

        public Criteria andSearchNumProNotEqualTo(BigDecimal value) {
            addCriterion("search_num_pro <>", value, "searchNumPro");
            return (Criteria) this;
        }

        public Criteria andSearchNumProGreaterThan(BigDecimal value) {
            addCriterion("search_num_pro >", value, "searchNumPro");
            return (Criteria) this;
        }

        public Criteria andSearchNumProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("search_num_pro >=", value, "searchNumPro");
            return (Criteria) this;
        }

        public Criteria andSearchNumProLessThan(BigDecimal value) {
            addCriterion("search_num_pro <", value, "searchNumPro");
            return (Criteria) this;
        }

        public Criteria andSearchNumProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("search_num_pro <=", value, "searchNumPro");
            return (Criteria) this;
        }

        public Criteria andSearchNumProIn(List<BigDecimal> values) {
            addCriterion("search_num_pro in", values, "searchNumPro");
            return (Criteria) this;
        }

        public Criteria andSearchNumProNotIn(List<BigDecimal> values) {
            addCriterion("search_num_pro not in", values, "searchNumPro");
            return (Criteria) this;
        }

        public Criteria andSearchNumProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("search_num_pro between", value1, value2, "searchNumPro");
            return (Criteria) this;
        }

        public Criteria andSearchNumProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("search_num_pro not between", value1, value2, "searchNumPro");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNull() {
            addCriterion("difficulty is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNotNull() {
            addCriterion("difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyEqualTo(BigDecimal value) {
            addCriterion("difficulty =", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotEqualTo(BigDecimal value) {
            addCriterion("difficulty <>", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThan(BigDecimal value) {
            addCriterion("difficulty >", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty >=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThan(BigDecimal value) {
            addCriterion("difficulty <", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("difficulty <=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyIn(List<BigDecimal> values) {
            addCriterion("difficulty in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotIn(List<BigDecimal> values) {
            addCriterion("difficulty not in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("difficulty not between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalIsNull() {
            addCriterion("difficulty_total is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalIsNotNull() {
            addCriterion("difficulty_total is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalEqualTo(Integer value) {
            addCriterion("difficulty_total =", value, "difficultyTotal");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalNotEqualTo(Integer value) {
            addCriterion("difficulty_total <>", value, "difficultyTotal");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalGreaterThan(Integer value) {
            addCriterion("difficulty_total >", value, "difficultyTotal");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("difficulty_total >=", value, "difficultyTotal");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalLessThan(Integer value) {
            addCriterion("difficulty_total <", value, "difficultyTotal");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalLessThanOrEqualTo(Integer value) {
            addCriterion("difficulty_total <=", value, "difficultyTotal");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalIn(List<Integer> values) {
            addCriterion("difficulty_total in", values, "difficultyTotal");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalNotIn(List<Integer> values) {
            addCriterion("difficulty_total not in", values, "difficultyTotal");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalBetween(Integer value1, Integer value2) {
            addCriterion("difficulty_total between", value1, value2, "difficultyTotal");
            return (Criteria) this;
        }

        public Criteria andDifficultyTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("difficulty_total not between", value1, value2, "difficultyTotal");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorIsNull() {
            addCriterion("difficulty_numerator is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorIsNotNull() {
            addCriterion("difficulty_numerator is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorEqualTo(Integer value) {
            addCriterion("difficulty_numerator =", value, "difficultyNumerator");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorNotEqualTo(Integer value) {
            addCriterion("difficulty_numerator <>", value, "difficultyNumerator");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorGreaterThan(Integer value) {
            addCriterion("difficulty_numerator >", value, "difficultyNumerator");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorGreaterThanOrEqualTo(Integer value) {
            addCriterion("difficulty_numerator >=", value, "difficultyNumerator");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorLessThan(Integer value) {
            addCriterion("difficulty_numerator <", value, "difficultyNumerator");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorLessThanOrEqualTo(Integer value) {
            addCriterion("difficulty_numerator <=", value, "difficultyNumerator");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorIn(List<Integer> values) {
            addCriterion("difficulty_numerator in", values, "difficultyNumerator");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorNotIn(List<Integer> values) {
            addCriterion("difficulty_numerator not in", values, "difficultyNumerator");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorBetween(Integer value1, Integer value2) {
            addCriterion("difficulty_numerator between", value1, value2, "difficultyNumerator");
            return (Criteria) this;
        }

        public Criteria andDifficultyNumeratorNotBetween(Integer value1, Integer value2) {
            addCriterion("difficulty_numerator not between", value1, value2, "difficultyNumerator");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonIsNull() {
            addCriterion("difficulty_json is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonIsNotNull() {
            addCriterion("difficulty_json is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonEqualTo(String value) {
            addCriterion("difficulty_json =", value, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonNotEqualTo(String value) {
            addCriterion("difficulty_json <>", value, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonGreaterThan(String value) {
            addCriterion("difficulty_json >", value, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonGreaterThanOrEqualTo(String value) {
            addCriterion("difficulty_json >=", value, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonLessThan(String value) {
            addCriterion("difficulty_json <", value, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonLessThanOrEqualTo(String value) {
            addCriterion("difficulty_json <=", value, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonLike(String value) {
            addCriterion("difficulty_json like", value, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonNotLike(String value) {
            addCriterion("difficulty_json not like", value, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonIn(List<String> values) {
            addCriterion("difficulty_json in", values, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonNotIn(List<String> values) {
            addCriterion("difficulty_json not in", values, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonBetween(String value1, String value2) {
            addCriterion("difficulty_json between", value1, value2, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDifficultyJsonNotBetween(String value1, String value2) {
            addCriterion("difficulty_json not between", value1, value2, "difficultyJson");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdIsNull() {
            addCriterion("diagnose_student_id is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdIsNotNull() {
            addCriterion("diagnose_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdEqualTo(Integer value) {
            addCriterion("diagnose_student_id =", value, "diagnoseStudentId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdNotEqualTo(Integer value) {
            addCriterion("diagnose_student_id <>", value, "diagnoseStudentId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdGreaterThan(Integer value) {
            addCriterion("diagnose_student_id >", value, "diagnoseStudentId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("diagnose_student_id >=", value, "diagnoseStudentId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdLessThan(Integer value) {
            addCriterion("diagnose_student_id <", value, "diagnoseStudentId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("diagnose_student_id <=", value, "diagnoseStudentId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdIn(List<Integer> values) {
            addCriterion("diagnose_student_id in", values, "diagnoseStudentId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdNotIn(List<Integer> values) {
            addCriterion("diagnose_student_id not in", values, "diagnoseStudentId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("diagnose_student_id between", value1, value2, "diagnoseStudentId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("diagnose_student_id not between", value1, value2, "diagnoseStudentId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentIsNull() {
            addCriterion("diagnose_student_content is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentIsNotNull() {
            addCriterion("diagnose_student_content is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentEqualTo(String value) {
            addCriterion("diagnose_student_content =", value, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentNotEqualTo(String value) {
            addCriterion("diagnose_student_content <>", value, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentGreaterThan(String value) {
            addCriterion("diagnose_student_content >", value, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_student_content >=", value, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentLessThan(String value) {
            addCriterion("diagnose_student_content <", value, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentLessThanOrEqualTo(String value) {
            addCriterion("diagnose_student_content <=", value, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentLike(String value) {
            addCriterion("diagnose_student_content like", value, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentNotLike(String value) {
            addCriterion("diagnose_student_content not like", value, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentIn(List<String> values) {
            addCriterion("diagnose_student_content in", values, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentNotIn(List<String> values) {
            addCriterion("diagnose_student_content not in", values, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentBetween(String value1, String value2) {
            addCriterion("diagnose_student_content between", value1, value2, "diagnoseStudentContent");
            return (Criteria) this;
        }

        public Criteria andDiagnoseStudentContentNotBetween(String value1, String value2) {
            addCriterion("diagnose_student_content not between", value1, value2, "diagnoseStudentContent");
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

        public Criteria andCorrectRightTotalNumIsNull() {
            addCriterion("correct_right_total_num is null");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumIsNotNull() {
            addCriterion("correct_right_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumEqualTo(Integer value) {
            addCriterion("correct_right_total_num =", value, "correctRightTotalNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumNotEqualTo(Integer value) {
            addCriterion("correct_right_total_num <>", value, "correctRightTotalNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumGreaterThan(Integer value) {
            addCriterion("correct_right_total_num >", value, "correctRightTotalNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_right_total_num >=", value, "correctRightTotalNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumLessThan(Integer value) {
            addCriterion("correct_right_total_num <", value, "correctRightTotalNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("correct_right_total_num <=", value, "correctRightTotalNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumIn(List<Integer> values) {
            addCriterion("correct_right_total_num in", values, "correctRightTotalNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumNotIn(List<Integer> values) {
            addCriterion("correct_right_total_num not in", values, "correctRightTotalNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("correct_right_total_num between", value1, value2, "correctRightTotalNum");
            return (Criteria) this;
        }

        public Criteria andCorrectRightTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_right_total_num not between", value1, value2, "correctRightTotalNum");
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