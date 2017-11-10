package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FdTeacherDayReportQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdTeacherDayReportQuery() {
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

        public Criteria andPaitiAvgIsNull() {
            addCriterion("paiti_avg is null");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgIsNotNull() {
            addCriterion("paiti_avg is not null");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgEqualTo(Integer value) {
            addCriterion("paiti_avg =", value, "paitiAvg");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgNotEqualTo(Integer value) {
            addCriterion("paiti_avg <>", value, "paitiAvg");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgGreaterThan(Integer value) {
            addCriterion("paiti_avg >", value, "paitiAvg");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("paiti_avg >=", value, "paitiAvg");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgLessThan(Integer value) {
            addCriterion("paiti_avg <", value, "paitiAvg");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgLessThanOrEqualTo(Integer value) {
            addCriterion("paiti_avg <=", value, "paitiAvg");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgIn(List<Integer> values) {
            addCriterion("paiti_avg in", values, "paitiAvg");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgNotIn(List<Integer> values) {
            addCriterion("paiti_avg not in", values, "paitiAvg");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgBetween(Integer value1, Integer value2) {
            addCriterion("paiti_avg between", value1, value2, "paitiAvg");
            return (Criteria) this;
        }

        public Criteria andPaitiAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("paiti_avg not between", value1, value2, "paitiAvg");
            return (Criteria) this;
        }

        public Criteria andPaitiRankIsNull() {
            addCriterion("paiti_rank is null");
            return (Criteria) this;
        }

        public Criteria andPaitiRankIsNotNull() {
            addCriterion("paiti_rank is not null");
            return (Criteria) this;
        }

        public Criteria andPaitiRankEqualTo(Integer value) {
            addCriterion("paiti_rank =", value, "paitiRank");
            return (Criteria) this;
        }

        public Criteria andPaitiRankNotEqualTo(Integer value) {
            addCriterion("paiti_rank <>", value, "paitiRank");
            return (Criteria) this;
        }

        public Criteria andPaitiRankGreaterThan(Integer value) {
            addCriterion("paiti_rank >", value, "paitiRank");
            return (Criteria) this;
        }

        public Criteria andPaitiRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("paiti_rank >=", value, "paitiRank");
            return (Criteria) this;
        }

        public Criteria andPaitiRankLessThan(Integer value) {
            addCriterion("paiti_rank <", value, "paitiRank");
            return (Criteria) this;
        }

        public Criteria andPaitiRankLessThanOrEqualTo(Integer value) {
            addCriterion("paiti_rank <=", value, "paitiRank");
            return (Criteria) this;
        }

        public Criteria andPaitiRankIn(List<Integer> values) {
            addCriterion("paiti_rank in", values, "paitiRank");
            return (Criteria) this;
        }

        public Criteria andPaitiRankNotIn(List<Integer> values) {
            addCriterion("paiti_rank not in", values, "paitiRank");
            return (Criteria) this;
        }

        public Criteria andPaitiRankBetween(Integer value1, Integer value2) {
            addCriterion("paiti_rank between", value1, value2, "paitiRank");
            return (Criteria) this;
        }

        public Criteria andPaitiRankNotBetween(Integer value1, Integer value2) {
            addCriterion("paiti_rank not between", value1, value2, "paitiRank");
            return (Criteria) this;
        }

        public Criteria andPatiCompareIsNull() {
            addCriterion("pati_compare is null");
            return (Criteria) this;
        }

        public Criteria andPatiCompareIsNotNull() {
            addCriterion("pati_compare is not null");
            return (Criteria) this;
        }

        public Criteria andPatiCompareEqualTo(String value) {
            addCriterion("pati_compare =", value, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareNotEqualTo(String value) {
            addCriterion("pati_compare <>", value, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareGreaterThan(String value) {
            addCriterion("pati_compare >", value, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareGreaterThanOrEqualTo(String value) {
            addCriterion("pati_compare >=", value, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareLessThan(String value) {
            addCriterion("pati_compare <", value, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareLessThanOrEqualTo(String value) {
            addCriterion("pati_compare <=", value, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareLike(String value) {
            addCriterion("pati_compare like", value, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareNotLike(String value) {
            addCriterion("pati_compare not like", value, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareIn(List<String> values) {
            addCriterion("pati_compare in", values, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareNotIn(List<String> values) {
            addCriterion("pati_compare not in", values, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareBetween(String value1, String value2) {
            addCriterion("pati_compare between", value1, value2, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiCompareNotBetween(String value1, String value2) {
            addCriterion("pati_compare not between", value1, value2, "patiCompare");
            return (Criteria) this;
        }

        public Criteria andPatiTop10IsNull() {
            addCriterion("pati_top_10 is null");
            return (Criteria) this;
        }

        public Criteria andPatiTop10IsNotNull() {
            addCriterion("pati_top_10 is not null");
            return (Criteria) this;
        }

        public Criteria andPatiTop10EqualTo(String value) {
            addCriterion("pati_top_10 =", value, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10NotEqualTo(String value) {
            addCriterion("pati_top_10 <>", value, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10GreaterThan(String value) {
            addCriterion("pati_top_10 >", value, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10GreaterThanOrEqualTo(String value) {
            addCriterion("pati_top_10 >=", value, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10LessThan(String value) {
            addCriterion("pati_top_10 <", value, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10LessThanOrEqualTo(String value) {
            addCriterion("pati_top_10 <=", value, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10Like(String value) {
            addCriterion("pati_top_10 like", value, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10NotLike(String value) {
            addCriterion("pati_top_10 not like", value, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10In(List<String> values) {
            addCriterion("pati_top_10 in", values, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10NotIn(List<String> values) {
            addCriterion("pati_top_10 not in", values, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10Between(String value1, String value2) {
            addCriterion("pati_top_10 between", value1, value2, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiTop10NotBetween(String value1, String value2) {
            addCriterion("pati_top_10 not between", value1, value2, "patiTop10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10IsNull() {
            addCriterion("pati_last_10 is null");
            return (Criteria) this;
        }

        public Criteria andPatiLast10IsNotNull() {
            addCriterion("pati_last_10 is not null");
            return (Criteria) this;
        }

        public Criteria andPatiLast10EqualTo(String value) {
            addCriterion("pati_last_10 =", value, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10NotEqualTo(String value) {
            addCriterion("pati_last_10 <>", value, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10GreaterThan(String value) {
            addCriterion("pati_last_10 >", value, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10GreaterThanOrEqualTo(String value) {
            addCriterion("pati_last_10 >=", value, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10LessThan(String value) {
            addCriterion("pati_last_10 <", value, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10LessThanOrEqualTo(String value) {
            addCriterion("pati_last_10 <=", value, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10Like(String value) {
            addCriterion("pati_last_10 like", value, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10NotLike(String value) {
            addCriterion("pati_last_10 not like", value, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10In(List<String> values) {
            addCriterion("pati_last_10 in", values, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10NotIn(List<String> values) {
            addCriterion("pati_last_10 not in", values, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10Between(String value1, String value2) {
            addCriterion("pati_last_10 between", value1, value2, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andPatiLast10NotBetween(String value1, String value2) {
            addCriterion("pati_last_10 not between", value1, value2, "patiLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectRateIsNull() {
            addCriterion("correct_rate is null");
            return (Criteria) this;
        }

        public Criteria andCorrectRateIsNotNull() {
            addCriterion("correct_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectRateEqualTo(BigDecimal value) {
            addCriterion("correct_rate =", value, "correctRate");
            return (Criteria) this;
        }

        public Criteria andCorrectRateNotEqualTo(BigDecimal value) {
            addCriterion("correct_rate <>", value, "correctRate");
            return (Criteria) this;
        }

        public Criteria andCorrectRateGreaterThan(BigDecimal value) {
            addCriterion("correct_rate >", value, "correctRate");
            return (Criteria) this;
        }

        public Criteria andCorrectRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_rate >=", value, "correctRate");
            return (Criteria) this;
        }

        public Criteria andCorrectRateLessThan(BigDecimal value) {
            addCriterion("correct_rate <", value, "correctRate");
            return (Criteria) this;
        }

        public Criteria andCorrectRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("correct_rate <=", value, "correctRate");
            return (Criteria) this;
        }

        public Criteria andCorrectRateIn(List<BigDecimal> values) {
            addCriterion("correct_rate in", values, "correctRate");
            return (Criteria) this;
        }

        public Criteria andCorrectRateNotIn(List<BigDecimal> values) {
            addCriterion("correct_rate not in", values, "correctRate");
            return (Criteria) this;
        }

        public Criteria andCorrectRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_rate between", value1, value2, "correctRate");
            return (Criteria) this;
        }

        public Criteria andCorrectRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("correct_rate not between", value1, value2, "correctRate");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareIsNull() {
            addCriterion("correct_compare is null");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareIsNotNull() {
            addCriterion("correct_compare is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareEqualTo(String value) {
            addCriterion("correct_compare =", value, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareNotEqualTo(String value) {
            addCriterion("correct_compare <>", value, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareGreaterThan(String value) {
            addCriterion("correct_compare >", value, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareGreaterThanOrEqualTo(String value) {
            addCriterion("correct_compare >=", value, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareLessThan(String value) {
            addCriterion("correct_compare <", value, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareLessThanOrEqualTo(String value) {
            addCriterion("correct_compare <=", value, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareLike(String value) {
            addCriterion("correct_compare like", value, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareNotLike(String value) {
            addCriterion("correct_compare not like", value, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareIn(List<String> values) {
            addCriterion("correct_compare in", values, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareNotIn(List<String> values) {
            addCriterion("correct_compare not in", values, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareBetween(String value1, String value2) {
            addCriterion("correct_compare between", value1, value2, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectCompareNotBetween(String value1, String value2) {
            addCriterion("correct_compare not between", value1, value2, "correctCompare");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankIsNull() {
            addCriterion("correct_rete_rank is null");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankIsNotNull() {
            addCriterion("correct_rete_rank is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankEqualTo(Integer value) {
            addCriterion("correct_rete_rank =", value, "correctReteRank");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankNotEqualTo(Integer value) {
            addCriterion("correct_rete_rank <>", value, "correctReteRank");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankGreaterThan(Integer value) {
            addCriterion("correct_rete_rank >", value, "correctReteRank");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_rete_rank >=", value, "correctReteRank");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankLessThan(Integer value) {
            addCriterion("correct_rete_rank <", value, "correctReteRank");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankLessThanOrEqualTo(Integer value) {
            addCriterion("correct_rete_rank <=", value, "correctReteRank");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankIn(List<Integer> values) {
            addCriterion("correct_rete_rank in", values, "correctReteRank");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankNotIn(List<Integer> values) {
            addCriterion("correct_rete_rank not in", values, "correctReteRank");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankBetween(Integer value1, Integer value2) {
            addCriterion("correct_rete_rank between", value1, value2, "correctReteRank");
            return (Criteria) this;
        }

        public Criteria andCorrectReteRankNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_rete_rank not between", value1, value2, "correctReteRank");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10IsNull() {
            addCriterion("correct_top_10 is null");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10IsNotNull() {
            addCriterion("correct_top_10 is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10EqualTo(String value) {
            addCriterion("correct_top_10 =", value, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10NotEqualTo(String value) {
            addCriterion("correct_top_10 <>", value, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10GreaterThan(String value) {
            addCriterion("correct_top_10 >", value, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10GreaterThanOrEqualTo(String value) {
            addCriterion("correct_top_10 >=", value, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10LessThan(String value) {
            addCriterion("correct_top_10 <", value, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10LessThanOrEqualTo(String value) {
            addCriterion("correct_top_10 <=", value, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10Like(String value) {
            addCriterion("correct_top_10 like", value, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10NotLike(String value) {
            addCriterion("correct_top_10 not like", value, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10In(List<String> values) {
            addCriterion("correct_top_10 in", values, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10NotIn(List<String> values) {
            addCriterion("correct_top_10 not in", values, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10Between(String value1, String value2) {
            addCriterion("correct_top_10 between", value1, value2, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectTop10NotBetween(String value1, String value2) {
            addCriterion("correct_top_10 not between", value1, value2, "correctTop10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10IsNull() {
            addCriterion("correct_last_10 is null");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10IsNotNull() {
            addCriterion("correct_last_10 is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10EqualTo(String value) {
            addCriterion("correct_last_10 =", value, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10NotEqualTo(String value) {
            addCriterion("correct_last_10 <>", value, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10GreaterThan(String value) {
            addCriterion("correct_last_10 >", value, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10GreaterThanOrEqualTo(String value) {
            addCriterion("correct_last_10 >=", value, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10LessThan(String value) {
            addCriterion("correct_last_10 <", value, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10LessThanOrEqualTo(String value) {
            addCriterion("correct_last_10 <=", value, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10Like(String value) {
            addCriterion("correct_last_10 like", value, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10NotLike(String value) {
            addCriterion("correct_last_10 not like", value, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10In(List<String> values) {
            addCriterion("correct_last_10 in", values, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10NotIn(List<String> values) {
            addCriterion("correct_last_10 not in", values, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10Between(String value1, String value2) {
            addCriterion("correct_last_10 between", value1, value2, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andCorrectLast10NotBetween(String value1, String value2) {
            addCriterion("correct_last_10 not between", value1, value2, "correctLast10");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisIsNull() {
            addCriterion("class_diacrisis is null");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisIsNotNull() {
            addCriterion("class_diacrisis is not null");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisEqualTo(String value) {
            addCriterion("class_diacrisis =", value, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisNotEqualTo(String value) {
            addCriterion("class_diacrisis <>", value, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisGreaterThan(String value) {
            addCriterion("class_diacrisis >", value, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisGreaterThanOrEqualTo(String value) {
            addCriterion("class_diacrisis >=", value, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisLessThan(String value) {
            addCriterion("class_diacrisis <", value, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisLessThanOrEqualTo(String value) {
            addCriterion("class_diacrisis <=", value, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisLike(String value) {
            addCriterion("class_diacrisis like", value, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisNotLike(String value) {
            addCriterion("class_diacrisis not like", value, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisIn(List<String> values) {
            addCriterion("class_diacrisis in", values, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisNotIn(List<String> values) {
            addCriterion("class_diacrisis not in", values, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisBetween(String value1, String value2) {
            addCriterion("class_diacrisis between", value1, value2, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassDiacrisisNotBetween(String value1, String value2) {
            addCriterion("class_diacrisis not between", value1, value2, "classDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassWarningIsNull() {
            addCriterion("class_warning is null");
            return (Criteria) this;
        }

        public Criteria andClassWarningIsNotNull() {
            addCriterion("class_warning is not null");
            return (Criteria) this;
        }

        public Criteria andClassWarningEqualTo(String value) {
            addCriterion("class_warning =", value, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningNotEqualTo(String value) {
            addCriterion("class_warning <>", value, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningGreaterThan(String value) {
            addCriterion("class_warning >", value, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningGreaterThanOrEqualTo(String value) {
            addCriterion("class_warning >=", value, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningLessThan(String value) {
            addCriterion("class_warning <", value, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningLessThanOrEqualTo(String value) {
            addCriterion("class_warning <=", value, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningLike(String value) {
            addCriterion("class_warning like", value, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningNotLike(String value) {
            addCriterion("class_warning not like", value, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningIn(List<String> values) {
            addCriterion("class_warning in", values, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningNotIn(List<String> values) {
            addCriterion("class_warning not in", values, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningBetween(String value1, String value2) {
            addCriterion("class_warning between", value1, value2, "classWarning");
            return (Criteria) this;
        }

        public Criteria andClassWarningNotBetween(String value1, String value2) {
            addCriterion("class_warning not between", value1, value2, "classWarning");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreIsNull() {
            addCriterion("timu_id_score is null");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreIsNotNull() {
            addCriterion("timu_id_score is not null");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreEqualTo(Integer value) {
            addCriterion("timu_id_score =", value, "timuIdScore");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreNotEqualTo(Integer value) {
            addCriterion("timu_id_score <>", value, "timuIdScore");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreGreaterThan(Integer value) {
            addCriterion("timu_id_score >", value, "timuIdScore");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("timu_id_score >=", value, "timuIdScore");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreLessThan(Integer value) {
            addCriterion("timu_id_score <", value, "timuIdScore");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreLessThanOrEqualTo(Integer value) {
            addCriterion("timu_id_score <=", value, "timuIdScore");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreIn(List<Integer> values) {
            addCriterion("timu_id_score in", values, "timuIdScore");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreNotIn(List<Integer> values) {
            addCriterion("timu_id_score not in", values, "timuIdScore");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreBetween(Integer value1, Integer value2) {
            addCriterion("timu_id_score between", value1, value2, "timuIdScore");
            return (Criteria) this;
        }

        public Criteria andTimuIdScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("timu_id_score not between", value1, value2, "timuIdScore");
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

        public Criteria andTeacherExampaperCommitCountIsNull() {
            addCriterion("teacher_exampaper_commit_count is null");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountIsNotNull() {
            addCriterion("teacher_exampaper_commit_count is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountEqualTo(Integer value) {
            addCriterion("teacher_exampaper_commit_count =", value, "teacherExampaperCommitCount");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountNotEqualTo(Integer value) {
            addCriterion("teacher_exampaper_commit_count <>", value, "teacherExampaperCommitCount");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountGreaterThan(Integer value) {
            addCriterion("teacher_exampaper_commit_count >", value, "teacherExampaperCommitCount");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_exampaper_commit_count >=", value, "teacherExampaperCommitCount");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountLessThan(Integer value) {
            addCriterion("teacher_exampaper_commit_count <", value, "teacherExampaperCommitCount");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_exampaper_commit_count <=", value, "teacherExampaperCommitCount");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountIn(List<Integer> values) {
            addCriterion("teacher_exampaper_commit_count in", values, "teacherExampaperCommitCount");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountNotIn(List<Integer> values) {
            addCriterion("teacher_exampaper_commit_count not in", values, "teacherExampaperCommitCount");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountBetween(Integer value1, Integer value2) {
            addCriterion("teacher_exampaper_commit_count between", value1, value2, "teacherExampaperCommitCount");
            return (Criteria) this;
        }

        public Criteria andTeacherExampaperCommitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_exampaper_commit_count not between", value1, value2, "teacherExampaperCommitCount");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreIsNull() {
            addCriterion("avg_exampaper_score is null");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreIsNotNull() {
            addCriterion("avg_exampaper_score is not null");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreEqualTo(Integer value) {
            addCriterion("avg_exampaper_score =", value, "avgExampaperScore");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreNotEqualTo(Integer value) {
            addCriterion("avg_exampaper_score <>", value, "avgExampaperScore");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreGreaterThan(Integer value) {
            addCriterion("avg_exampaper_score >", value, "avgExampaperScore");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_exampaper_score >=", value, "avgExampaperScore");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreLessThan(Integer value) {
            addCriterion("avg_exampaper_score <", value, "avgExampaperScore");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreLessThanOrEqualTo(Integer value) {
            addCriterion("avg_exampaper_score <=", value, "avgExampaperScore");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreIn(List<Integer> values) {
            addCriterion("avg_exampaper_score in", values, "avgExampaperScore");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreNotIn(List<Integer> values) {
            addCriterion("avg_exampaper_score not in", values, "avgExampaperScore");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreBetween(Integer value1, Integer value2) {
            addCriterion("avg_exampaper_score between", value1, value2, "avgExampaperScore");
            return (Criteria) this;
        }

        public Criteria andAvgExampaperScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_exampaper_score not between", value1, value2, "avgExampaperScore");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreIsNull() {
            addCriterion("exampaper_full_score is null");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreIsNotNull() {
            addCriterion("exampaper_full_score is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreEqualTo(Integer value) {
            addCriterion("exampaper_full_score =", value, "exampaperFullScore");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreNotEqualTo(Integer value) {
            addCriterion("exampaper_full_score <>", value, "exampaperFullScore");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreGreaterThan(Integer value) {
            addCriterion("exampaper_full_score >", value, "exampaperFullScore");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampaper_full_score >=", value, "exampaperFullScore");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreLessThan(Integer value) {
            addCriterion("exampaper_full_score <", value, "exampaperFullScore");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreLessThanOrEqualTo(Integer value) {
            addCriterion("exampaper_full_score <=", value, "exampaperFullScore");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreIn(List<Integer> values) {
            addCriterion("exampaper_full_score in", values, "exampaperFullScore");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreNotIn(List<Integer> values) {
            addCriterion("exampaper_full_score not in", values, "exampaperFullScore");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_full_score between", value1, value2, "exampaperFullScore");
            return (Criteria) this;
        }

        public Criteria andExampaperFullScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_full_score not between", value1, value2, "exampaperFullScore");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountIsNull() {
            addCriterion("teacher_paper_object_count is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountIsNotNull() {
            addCriterion("teacher_paper_object_count is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountEqualTo(Integer value) {
            addCriterion("teacher_paper_object_count =", value, "teacherPaperObjectCount");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountNotEqualTo(Integer value) {
            addCriterion("teacher_paper_object_count <>", value, "teacherPaperObjectCount");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountGreaterThan(Integer value) {
            addCriterion("teacher_paper_object_count >", value, "teacherPaperObjectCount");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_paper_object_count >=", value, "teacherPaperObjectCount");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountLessThan(Integer value) {
            addCriterion("teacher_paper_object_count <", value, "teacherPaperObjectCount");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_paper_object_count <=", value, "teacherPaperObjectCount");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountIn(List<Integer> values) {
            addCriterion("teacher_paper_object_count in", values, "teacherPaperObjectCount");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountNotIn(List<Integer> values) {
            addCriterion("teacher_paper_object_count not in", values, "teacherPaperObjectCount");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountBetween(Integer value1, Integer value2) {
            addCriterion("teacher_paper_object_count between", value1, value2, "teacherPaperObjectCount");
            return (Criteria) this;
        }

        public Criteria andTeacherPaperObjectCountNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_paper_object_count not between", value1, value2, "teacherPaperObjectCount");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameIsNull() {
            addCriterion("top_1_student_name is null");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameIsNotNull() {
            addCriterion("top_1_student_name is not null");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameEqualTo(String value) {
            addCriterion("top_1_student_name =", value, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameNotEqualTo(String value) {
            addCriterion("top_1_student_name <>", value, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameGreaterThan(String value) {
            addCriterion("top_1_student_name >", value, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("top_1_student_name >=", value, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameLessThan(String value) {
            addCriterion("top_1_student_name <", value, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameLessThanOrEqualTo(String value) {
            addCriterion("top_1_student_name <=", value, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameLike(String value) {
            addCriterion("top_1_student_name like", value, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameNotLike(String value) {
            addCriterion("top_1_student_name not like", value, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameIn(List<String> values) {
            addCriterion("top_1_student_name in", values, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameNotIn(List<String> values) {
            addCriterion("top_1_student_name not in", values, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameBetween(String value1, String value2) {
            addCriterion("top_1_student_name between", value1, value2, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentNameNotBetween(String value1, String value2) {
            addCriterion("top_1_student_name not between", value1, value2, "top1StudentName");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreIsNull() {
            addCriterion("top_1_student_score is null");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreIsNotNull() {
            addCriterion("top_1_student_score is not null");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreEqualTo(Integer value) {
            addCriterion("top_1_student_score =", value, "top1StudentScore");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreNotEqualTo(Integer value) {
            addCriterion("top_1_student_score <>", value, "top1StudentScore");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreGreaterThan(Integer value) {
            addCriterion("top_1_student_score >", value, "top1StudentScore");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_1_student_score >=", value, "top1StudentScore");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreLessThan(Integer value) {
            addCriterion("top_1_student_score <", value, "top1StudentScore");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreLessThanOrEqualTo(Integer value) {
            addCriterion("top_1_student_score <=", value, "top1StudentScore");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreIn(List<Integer> values) {
            addCriterion("top_1_student_score in", values, "top1StudentScore");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreNotIn(List<Integer> values) {
            addCriterion("top_1_student_score not in", values, "top1StudentScore");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreBetween(Integer value1, Integer value2) {
            addCriterion("top_1_student_score between", value1, value2, "top1StudentScore");
            return (Criteria) this;
        }

        public Criteria andTop1StudentScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("top_1_student_score not between", value1, value2, "top1StudentScore");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisIsNull() {
            addCriterion("class_paper_diacrisis is null");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisIsNotNull() {
            addCriterion("class_paper_diacrisis is not null");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisEqualTo(String value) {
            addCriterion("class_paper_diacrisis =", value, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisNotEqualTo(String value) {
            addCriterion("class_paper_diacrisis <>", value, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisGreaterThan(String value) {
            addCriterion("class_paper_diacrisis >", value, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisGreaterThanOrEqualTo(String value) {
            addCriterion("class_paper_diacrisis >=", value, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisLessThan(String value) {
            addCriterion("class_paper_diacrisis <", value, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisLessThanOrEqualTo(String value) {
            addCriterion("class_paper_diacrisis <=", value, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisLike(String value) {
            addCriterion("class_paper_diacrisis like", value, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisNotLike(String value) {
            addCriterion("class_paper_diacrisis not like", value, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisIn(List<String> values) {
            addCriterion("class_paper_diacrisis in", values, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisNotIn(List<String> values) {
            addCriterion("class_paper_diacrisis not in", values, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisBetween(String value1, String value2) {
            addCriterion("class_paper_diacrisis between", value1, value2, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andClassPaperDiacrisisNotBetween(String value1, String value2) {
            addCriterion("class_paper_diacrisis not between", value1, value2, "classPaperDiacrisis");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountIsNull() {
            addCriterion("student_prictise_count is null");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountIsNotNull() {
            addCriterion("student_prictise_count is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountEqualTo(Integer value) {
            addCriterion("student_prictise_count =", value, "studentPrictiseCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountNotEqualTo(Integer value) {
            addCriterion("student_prictise_count <>", value, "studentPrictiseCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountGreaterThan(Integer value) {
            addCriterion("student_prictise_count >", value, "studentPrictiseCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_prictise_count >=", value, "studentPrictiseCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountLessThan(Integer value) {
            addCriterion("student_prictise_count <", value, "studentPrictiseCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountLessThanOrEqualTo(Integer value) {
            addCriterion("student_prictise_count <=", value, "studentPrictiseCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountIn(List<Integer> values) {
            addCriterion("student_prictise_count in", values, "studentPrictiseCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountNotIn(List<Integer> values) {
            addCriterion("student_prictise_count not in", values, "studentPrictiseCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountBetween(Integer value1, Integer value2) {
            addCriterion("student_prictise_count between", value1, value2, "studentPrictiseCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("student_prictise_count not between", value1, value2, "studentPrictiseCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountIsNull() {
            addCriterion("student_prictise_commit_count is null");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountIsNotNull() {
            addCriterion("student_prictise_commit_count is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountEqualTo(Integer value) {
            addCriterion("student_prictise_commit_count =", value, "studentPrictiseCommitCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountNotEqualTo(Integer value) {
            addCriterion("student_prictise_commit_count <>", value, "studentPrictiseCommitCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountGreaterThan(Integer value) {
            addCriterion("student_prictise_commit_count >", value, "studentPrictiseCommitCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_prictise_commit_count >=", value, "studentPrictiseCommitCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountLessThan(Integer value) {
            addCriterion("student_prictise_commit_count <", value, "studentPrictiseCommitCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountLessThanOrEqualTo(Integer value) {
            addCriterion("student_prictise_commit_count <=", value, "studentPrictiseCommitCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountIn(List<Integer> values) {
            addCriterion("student_prictise_commit_count in", values, "studentPrictiseCommitCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountNotIn(List<Integer> values) {
            addCriterion("student_prictise_commit_count not in", values, "studentPrictiseCommitCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountBetween(Integer value1, Integer value2) {
            addCriterion("student_prictise_commit_count between", value1, value2, "studentPrictiseCommitCount");
            return (Criteria) this;
        }

        public Criteria andStudentPrictiseCommitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("student_prictise_commit_count not between", value1, value2, "studentPrictiseCommitCount");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesIsNull() {
            addCriterion("student_practise_not_done_names is null");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesIsNotNull() {
            addCriterion("student_practise_not_done_names is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesEqualTo(String value) {
            addCriterion("student_practise_not_done_names =", value, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesNotEqualTo(String value) {
            addCriterion("student_practise_not_done_names <>", value, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesGreaterThan(String value) {
            addCriterion("student_practise_not_done_names >", value, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesGreaterThanOrEqualTo(String value) {
            addCriterion("student_practise_not_done_names >=", value, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesLessThan(String value) {
            addCriterion("student_practise_not_done_names <", value, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesLessThanOrEqualTo(String value) {
            addCriterion("student_practise_not_done_names <=", value, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesLike(String value) {
            addCriterion("student_practise_not_done_names like", value, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesNotLike(String value) {
            addCriterion("student_practise_not_done_names not like", value, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesIn(List<String> values) {
            addCriterion("student_practise_not_done_names in", values, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesNotIn(List<String> values) {
            addCriterion("student_practise_not_done_names not in", values, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesBetween(String value1, String value2) {
            addCriterion("student_practise_not_done_names between", value1, value2, "studentPractiseNotDoneNames");
            return (Criteria) this;
        }

        public Criteria andStudentPractiseNotDoneNamesNotBetween(String value1, String value2) {
            addCriterion("student_practise_not_done_names not between", value1, value2, "studentPractiseNotDoneNames");
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

        public Criteria andClasspaiticountIsNull() {
            addCriterion("classPaitiCount is null");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountIsNotNull() {
            addCriterion("classPaitiCount is not null");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountEqualTo(Integer value) {
            addCriterion("classPaitiCount =", value, "classpaiticount");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountNotEqualTo(Integer value) {
            addCriterion("classPaitiCount <>", value, "classpaiticount");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountGreaterThan(Integer value) {
            addCriterion("classPaitiCount >", value, "classpaiticount");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountGreaterThanOrEqualTo(Integer value) {
            addCriterion("classPaitiCount >=", value, "classpaiticount");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountLessThan(Integer value) {
            addCriterion("classPaitiCount <", value, "classpaiticount");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountLessThanOrEqualTo(Integer value) {
            addCriterion("classPaitiCount <=", value, "classpaiticount");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountIn(List<Integer> values) {
            addCriterion("classPaitiCount in", values, "classpaiticount");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountNotIn(List<Integer> values) {
            addCriterion("classPaitiCount not in", values, "classpaiticount");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountBetween(Integer value1, Integer value2) {
            addCriterion("classPaitiCount between", value1, value2, "classpaiticount");
            return (Criteria) this;
        }

        public Criteria andClasspaiticountNotBetween(Integer value1, Integer value2) {
            addCriterion("classPaitiCount not between", value1, value2, "classpaiticount");
            return (Criteria) this;
        }

        public Criteria andExampaperidIsNull() {
            addCriterion("exampaperId is null");
            return (Criteria) this;
        }

        public Criteria andExampaperidIsNotNull() {
            addCriterion("exampaperId is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperidEqualTo(Integer value) {
            addCriterion("exampaperId =", value, "exampaperid");
            return (Criteria) this;
        }

        public Criteria andExampaperidNotEqualTo(Integer value) {
            addCriterion("exampaperId <>", value, "exampaperid");
            return (Criteria) this;
        }

        public Criteria andExampaperidGreaterThan(Integer value) {
            addCriterion("exampaperId >", value, "exampaperid");
            return (Criteria) this;
        }

        public Criteria andExampaperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampaperId >=", value, "exampaperid");
            return (Criteria) this;
        }

        public Criteria andExampaperidLessThan(Integer value) {
            addCriterion("exampaperId <", value, "exampaperid");
            return (Criteria) this;
        }

        public Criteria andExampaperidLessThanOrEqualTo(Integer value) {
            addCriterion("exampaperId <=", value, "exampaperid");
            return (Criteria) this;
        }

        public Criteria andExampaperidIn(List<Integer> values) {
            addCriterion("exampaperId in", values, "exampaperid");
            return (Criteria) this;
        }

        public Criteria andExampaperidNotIn(List<Integer> values) {
            addCriterion("exampaperId not in", values, "exampaperid");
            return (Criteria) this;
        }

        public Criteria andExampaperidBetween(Integer value1, Integer value2) {
            addCriterion("exampaperId between", value1, value2, "exampaperid");
            return (Criteria) this;
        }

        public Criteria andExampaperidNotBetween(Integer value1, Integer value2) {
            addCriterion("exampaperId not between", value1, value2, "exampaperid");
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