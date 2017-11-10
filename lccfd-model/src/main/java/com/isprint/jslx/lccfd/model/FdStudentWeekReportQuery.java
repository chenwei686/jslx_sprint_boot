package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FdStudentWeekReportQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentWeekReportQuery() {
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

        public Criteria andVideoTimeIsNull() {
            addCriterion("video_time is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNotNull() {
            addCriterion("video_time is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeEqualTo(Integer value) {
            addCriterion("video_time =", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotEqualTo(Integer value) {
            addCriterion("video_time <>", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThan(Integer value) {
            addCriterion("video_time >", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_time >=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThan(Integer value) {
            addCriterion("video_time <", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThanOrEqualTo(Integer value) {
            addCriterion("video_time <=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIn(List<Integer> values) {
            addCriterion("video_time in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotIn(List<Integer> values) {
            addCriterion("video_time not in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeBetween(Integer value1, Integer value2) {
            addCriterion("video_time between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("video_time not between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastIsNull() {
            addCriterion("video_time_last is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastIsNotNull() {
            addCriterion("video_time_last is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastEqualTo(Integer value) {
            addCriterion("video_time_last =", value, "videoTimeLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastNotEqualTo(Integer value) {
            addCriterion("video_time_last <>", value, "videoTimeLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastGreaterThan(Integer value) {
            addCriterion("video_time_last >", value, "videoTimeLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_time_last >=", value, "videoTimeLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastLessThan(Integer value) {
            addCriterion("video_time_last <", value, "videoTimeLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastLessThanOrEqualTo(Integer value) {
            addCriterion("video_time_last <=", value, "videoTimeLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastIn(List<Integer> values) {
            addCriterion("video_time_last in", values, "videoTimeLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastNotIn(List<Integer> values) {
            addCriterion("video_time_last not in", values, "videoTimeLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastBetween(Integer value1, Integer value2) {
            addCriterion("video_time_last between", value1, value2, "videoTimeLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLastNotBetween(Integer value1, Integer value2) {
            addCriterion("video_time_last not between", value1, value2, "videoTimeLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedIsNull() {
            addCriterion("video_time_treed is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedIsNotNull() {
            addCriterion("video_time_treed is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedEqualTo(Byte value) {
            addCriterion("video_time_treed =", value, "videoTimeTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedNotEqualTo(Byte value) {
            addCriterion("video_time_treed <>", value, "videoTimeTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedGreaterThan(Byte value) {
            addCriterion("video_time_treed >", value, "videoTimeTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedGreaterThanOrEqualTo(Byte value) {
            addCriterion("video_time_treed >=", value, "videoTimeTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedLessThan(Byte value) {
            addCriterion("video_time_treed <", value, "videoTimeTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedLessThanOrEqualTo(Byte value) {
            addCriterion("video_time_treed <=", value, "videoTimeTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedIn(List<Byte> values) {
            addCriterion("video_time_treed in", values, "videoTimeTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedNotIn(List<Byte> values) {
            addCriterion("video_time_treed not in", values, "videoTimeTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedBetween(Byte value1, Byte value2) {
            addCriterion("video_time_treed between", value1, value2, "videoTimeTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeTreedNotBetween(Byte value1, Byte value2) {
            addCriterion("video_time_treed not between", value1, value2, "videoTimeTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingIsNull() {
            addCriterion("video_time_ranking is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingIsNotNull() {
            addCriterion("video_time_ranking is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingEqualTo(Integer value) {
            addCriterion("video_time_ranking =", value, "videoTimeRanking");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingNotEqualTo(Integer value) {
            addCriterion("video_time_ranking <>", value, "videoTimeRanking");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingGreaterThan(Integer value) {
            addCriterion("video_time_ranking >", value, "videoTimeRanking");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_time_ranking >=", value, "videoTimeRanking");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLessThan(Integer value) {
            addCriterion("video_time_ranking <", value, "videoTimeRanking");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLessThanOrEqualTo(Integer value) {
            addCriterion("video_time_ranking <=", value, "videoTimeRanking");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingIn(List<Integer> values) {
            addCriterion("video_time_ranking in", values, "videoTimeRanking");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingNotIn(List<Integer> values) {
            addCriterion("video_time_ranking not in", values, "videoTimeRanking");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingBetween(Integer value1, Integer value2) {
            addCriterion("video_time_ranking between", value1, value2, "videoTimeRanking");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("video_time_ranking not between", value1, value2, "videoTimeRanking");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastIsNull() {
            addCriterion("video_time_ranking_last is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastIsNotNull() {
            addCriterion("video_time_ranking_last is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastEqualTo(Integer value) {
            addCriterion("video_time_ranking_last =", value, "videoTimeRankingLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastNotEqualTo(Integer value) {
            addCriterion("video_time_ranking_last <>", value, "videoTimeRankingLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastGreaterThan(Integer value) {
            addCriterion("video_time_ranking_last >", value, "videoTimeRankingLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_time_ranking_last >=", value, "videoTimeRankingLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastLessThan(Integer value) {
            addCriterion("video_time_ranking_last <", value, "videoTimeRankingLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastLessThanOrEqualTo(Integer value) {
            addCriterion("video_time_ranking_last <=", value, "videoTimeRankingLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastIn(List<Integer> values) {
            addCriterion("video_time_ranking_last in", values, "videoTimeRankingLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastNotIn(List<Integer> values) {
            addCriterion("video_time_ranking_last not in", values, "videoTimeRankingLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastBetween(Integer value1, Integer value2) {
            addCriterion("video_time_ranking_last between", value1, value2, "videoTimeRankingLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingLastNotBetween(Integer value1, Integer value2) {
            addCriterion("video_time_ranking_last not between", value1, value2, "videoTimeRankingLast");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedIsNull() {
            addCriterion("video_time_ranking_treed is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedIsNotNull() {
            addCriterion("video_time_ranking_treed is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedEqualTo(Byte value) {
            addCriterion("video_time_ranking_treed =", value, "videoTimeRankingTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedNotEqualTo(Byte value) {
            addCriterion("video_time_ranking_treed <>", value, "videoTimeRankingTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedGreaterThan(Byte value) {
            addCriterion("video_time_ranking_treed >", value, "videoTimeRankingTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedGreaterThanOrEqualTo(Byte value) {
            addCriterion("video_time_ranking_treed >=", value, "videoTimeRankingTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedLessThan(Byte value) {
            addCriterion("video_time_ranking_treed <", value, "videoTimeRankingTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedLessThanOrEqualTo(Byte value) {
            addCriterion("video_time_ranking_treed <=", value, "videoTimeRankingTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedIn(List<Byte> values) {
            addCriterion("video_time_ranking_treed in", values, "videoTimeRankingTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedNotIn(List<Byte> values) {
            addCriterion("video_time_ranking_treed not in", values, "videoTimeRankingTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedBetween(Byte value1, Byte value2) {
            addCriterion("video_time_ranking_treed between", value1, value2, "videoTimeRankingTreed");
            return (Criteria) this;
        }

        public Criteria andVideoTimeRankingTreedNotBetween(Byte value1, Byte value2) {
            addCriterion("video_time_ranking_treed not between", value1, value2, "videoTimeRankingTreed");
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

        public Criteria andCorrectNumLastIsNull() {
            addCriterion("correct_num_last is null");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastIsNotNull() {
            addCriterion("correct_num_last is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastEqualTo(Integer value) {
            addCriterion("correct_num_last =", value, "correctNumLast");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastNotEqualTo(Integer value) {
            addCriterion("correct_num_last <>", value, "correctNumLast");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastGreaterThan(Integer value) {
            addCriterion("correct_num_last >", value, "correctNumLast");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_num_last >=", value, "correctNumLast");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastLessThan(Integer value) {
            addCriterion("correct_num_last <", value, "correctNumLast");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastLessThanOrEqualTo(Integer value) {
            addCriterion("correct_num_last <=", value, "correctNumLast");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastIn(List<Integer> values) {
            addCriterion("correct_num_last in", values, "correctNumLast");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastNotIn(List<Integer> values) {
            addCriterion("correct_num_last not in", values, "correctNumLast");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastBetween(Integer value1, Integer value2) {
            addCriterion("correct_num_last between", value1, value2, "correctNumLast");
            return (Criteria) this;
        }

        public Criteria andCorrectNumLastNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_num_last not between", value1, value2, "correctNumLast");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedIsNull() {
            addCriterion("correct_num_treed is null");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedIsNotNull() {
            addCriterion("correct_num_treed is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedEqualTo(Byte value) {
            addCriterion("correct_num_treed =", value, "correctNumTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedNotEqualTo(Byte value) {
            addCriterion("correct_num_treed <>", value, "correctNumTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedGreaterThan(Byte value) {
            addCriterion("correct_num_treed >", value, "correctNumTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedGreaterThanOrEqualTo(Byte value) {
            addCriterion("correct_num_treed >=", value, "correctNumTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedLessThan(Byte value) {
            addCriterion("correct_num_treed <", value, "correctNumTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedLessThanOrEqualTo(Byte value) {
            addCriterion("correct_num_treed <=", value, "correctNumTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedIn(List<Byte> values) {
            addCriterion("correct_num_treed in", values, "correctNumTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedNotIn(List<Byte> values) {
            addCriterion("correct_num_treed not in", values, "correctNumTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedBetween(Byte value1, Byte value2) {
            addCriterion("correct_num_treed between", value1, value2, "correctNumTreed");
            return (Criteria) this;
        }

        public Criteria andCorrectNumTreedNotBetween(Byte value1, Byte value2) {
            addCriterion("correct_num_treed not between", value1, value2, "correctNumTreed");
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

        public Criteria andExceedNumIsNull() {
            addCriterion("exceed_num is null");
            return (Criteria) this;
        }

        public Criteria andExceedNumIsNotNull() {
            addCriterion("exceed_num is not null");
            return (Criteria) this;
        }

        public Criteria andExceedNumEqualTo(Integer value) {
            addCriterion("exceed_num =", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumNotEqualTo(Integer value) {
            addCriterion("exceed_num <>", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumGreaterThan(Integer value) {
            addCriterion("exceed_num >", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exceed_num >=", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumLessThan(Integer value) {
            addCriterion("exceed_num <", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumLessThanOrEqualTo(Integer value) {
            addCriterion("exceed_num <=", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumIn(List<Integer> values) {
            addCriterion("exceed_num in", values, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumNotIn(List<Integer> values) {
            addCriterion("exceed_num not in", values, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumBetween(Integer value1, Integer value2) {
            addCriterion("exceed_num between", value1, value2, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("exceed_num not between", value1, value2, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andBeatProIsNull() {
            addCriterion("beat_pro is null");
            return (Criteria) this;
        }

        public Criteria andBeatProIsNotNull() {
            addCriterion("beat_pro is not null");
            return (Criteria) this;
        }

        public Criteria andBeatProEqualTo(BigDecimal value) {
            addCriterion("beat_pro =", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProNotEqualTo(BigDecimal value) {
            addCriterion("beat_pro <>", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProGreaterThan(BigDecimal value) {
            addCriterion("beat_pro >", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("beat_pro >=", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProLessThan(BigDecimal value) {
            addCriterion("beat_pro <", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("beat_pro <=", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProIn(List<BigDecimal> values) {
            addCriterion("beat_pro in", values, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProNotIn(List<BigDecimal> values) {
            addCriterion("beat_pro not in", values, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beat_pro between", value1, value2, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beat_pro not between", value1, value2, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProLastIsNull() {
            addCriterion("beat_pro_last is null");
            return (Criteria) this;
        }

        public Criteria andBeatProLastIsNotNull() {
            addCriterion("beat_pro_last is not null");
            return (Criteria) this;
        }

        public Criteria andBeatProLastEqualTo(BigDecimal value) {
            addCriterion("beat_pro_last =", value, "beatProLast");
            return (Criteria) this;
        }

        public Criteria andBeatProLastNotEqualTo(BigDecimal value) {
            addCriterion("beat_pro_last <>", value, "beatProLast");
            return (Criteria) this;
        }

        public Criteria andBeatProLastGreaterThan(BigDecimal value) {
            addCriterion("beat_pro_last >", value, "beatProLast");
            return (Criteria) this;
        }

        public Criteria andBeatProLastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("beat_pro_last >=", value, "beatProLast");
            return (Criteria) this;
        }

        public Criteria andBeatProLastLessThan(BigDecimal value) {
            addCriterion("beat_pro_last <", value, "beatProLast");
            return (Criteria) this;
        }

        public Criteria andBeatProLastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("beat_pro_last <=", value, "beatProLast");
            return (Criteria) this;
        }

        public Criteria andBeatProLastIn(List<BigDecimal> values) {
            addCriterion("beat_pro_last in", values, "beatProLast");
            return (Criteria) this;
        }

        public Criteria andBeatProLastNotIn(List<BigDecimal> values) {
            addCriterion("beat_pro_last not in", values, "beatProLast");
            return (Criteria) this;
        }

        public Criteria andBeatProLastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beat_pro_last between", value1, value2, "beatProLast");
            return (Criteria) this;
        }

        public Criteria andBeatProLastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beat_pro_last not between", value1, value2, "beatProLast");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedIsNull() {
            addCriterion("beat_pro_treed is null");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedIsNotNull() {
            addCriterion("beat_pro_treed is not null");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedEqualTo(Byte value) {
            addCriterion("beat_pro_treed =", value, "beatProTreed");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedNotEqualTo(Byte value) {
            addCriterion("beat_pro_treed <>", value, "beatProTreed");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedGreaterThan(Byte value) {
            addCriterion("beat_pro_treed >", value, "beatProTreed");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedGreaterThanOrEqualTo(Byte value) {
            addCriterion("beat_pro_treed >=", value, "beatProTreed");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedLessThan(Byte value) {
            addCriterion("beat_pro_treed <", value, "beatProTreed");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedLessThanOrEqualTo(Byte value) {
            addCriterion("beat_pro_treed <=", value, "beatProTreed");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedIn(List<Byte> values) {
            addCriterion("beat_pro_treed in", values, "beatProTreed");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedNotIn(List<Byte> values) {
            addCriterion("beat_pro_treed not in", values, "beatProTreed");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedBetween(Byte value1, Byte value2) {
            addCriterion("beat_pro_treed between", value1, value2, "beatProTreed");
            return (Criteria) this;
        }

        public Criteria andBeatProTreedNotBetween(Byte value1, Byte value2) {
            addCriterion("beat_pro_treed not between", value1, value2, "beatProTreed");
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