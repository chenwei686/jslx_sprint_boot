package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FdTeacherWeekReportQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdTeacherWeekReportQuery() {
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

        public Criteria andSearchMaxStudentIdsIsNull() {
            addCriterion("search_max_student_ids is null");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsIsNotNull() {
            addCriterion("search_max_student_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsEqualTo(String value) {
            addCriterion("search_max_student_ids =", value, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsNotEqualTo(String value) {
            addCriterion("search_max_student_ids <>", value, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsGreaterThan(String value) {
            addCriterion("search_max_student_ids >", value, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("search_max_student_ids >=", value, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsLessThan(String value) {
            addCriterion("search_max_student_ids <", value, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsLessThanOrEqualTo(String value) {
            addCriterion("search_max_student_ids <=", value, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsLike(String value) {
            addCriterion("search_max_student_ids like", value, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsNotLike(String value) {
            addCriterion("search_max_student_ids not like", value, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsIn(List<String> values) {
            addCriterion("search_max_student_ids in", values, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsNotIn(List<String> values) {
            addCriterion("search_max_student_ids not in", values, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsBetween(String value1, String value2) {
            addCriterion("search_max_student_ids between", value1, value2, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMaxStudentIdsNotBetween(String value1, String value2) {
            addCriterion("search_max_student_ids not between", value1, value2, "searchMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsIsNull() {
            addCriterion("search_min_student_ids is null");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsIsNotNull() {
            addCriterion("search_min_student_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsEqualTo(String value) {
            addCriterion("search_min_student_ids =", value, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsNotEqualTo(String value) {
            addCriterion("search_min_student_ids <>", value, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsGreaterThan(String value) {
            addCriterion("search_min_student_ids >", value, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("search_min_student_ids >=", value, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsLessThan(String value) {
            addCriterion("search_min_student_ids <", value, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsLessThanOrEqualTo(String value) {
            addCriterion("search_min_student_ids <=", value, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsLike(String value) {
            addCriterion("search_min_student_ids like", value, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsNotLike(String value) {
            addCriterion("search_min_student_ids not like", value, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsIn(List<String> values) {
            addCriterion("search_min_student_ids in", values, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsNotIn(List<String> values) {
            addCriterion("search_min_student_ids not in", values, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsBetween(String value1, String value2) {
            addCriterion("search_min_student_ids between", value1, value2, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andSearchMinStudentIdsNotBetween(String value1, String value2) {
            addCriterion("search_min_student_ids not between", value1, value2, "searchMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdIsNull() {
            addCriterion("use_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdIsNotNull() {
            addCriterion("use_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdEqualTo(Integer value) {
            addCriterion("use_comment_id =", value, "useCommentId");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdNotEqualTo(Integer value) {
            addCriterion("use_comment_id <>", value, "useCommentId");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdGreaterThan(Integer value) {
            addCriterion("use_comment_id >", value, "useCommentId");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_comment_id >=", value, "useCommentId");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdLessThan(Integer value) {
            addCriterion("use_comment_id <", value, "useCommentId");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("use_comment_id <=", value, "useCommentId");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdIn(List<Integer> values) {
            addCriterion("use_comment_id in", values, "useCommentId");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdNotIn(List<Integer> values) {
            addCriterion("use_comment_id not in", values, "useCommentId");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("use_comment_id between", value1, value2, "useCommentId");
            return (Criteria) this;
        }

        public Criteria andUseCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("use_comment_id not between", value1, value2, "useCommentId");
            return (Criteria) this;
        }

        public Criteria andUseCommentIsNull() {
            addCriterion("use_comment is null");
            return (Criteria) this;
        }

        public Criteria andUseCommentIsNotNull() {
            addCriterion("use_comment is not null");
            return (Criteria) this;
        }

        public Criteria andUseCommentEqualTo(String value) {
            addCriterion("use_comment =", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentNotEqualTo(String value) {
            addCriterion("use_comment <>", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentGreaterThan(String value) {
            addCriterion("use_comment >", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentGreaterThanOrEqualTo(String value) {
            addCriterion("use_comment >=", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentLessThan(String value) {
            addCriterion("use_comment <", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentLessThanOrEqualTo(String value) {
            addCriterion("use_comment <=", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentLike(String value) {
            addCriterion("use_comment like", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentNotLike(String value) {
            addCriterion("use_comment not like", value, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentIn(List<String> values) {
            addCriterion("use_comment in", values, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentNotIn(List<String> values) {
            addCriterion("use_comment not in", values, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentBetween(String value1, String value2) {
            addCriterion("use_comment between", value1, value2, "useComment");
            return (Criteria) this;
        }

        public Criteria andUseCommentNotBetween(String value1, String value2) {
            addCriterion("use_comment not between", value1, value2, "useComment");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeIsNull() {
            addCriterion("blind_knowledge is null");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeIsNotNull() {
            addCriterion("blind_knowledge is not null");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeEqualTo(String value) {
            addCriterion("blind_knowledge =", value, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeNotEqualTo(String value) {
            addCriterion("blind_knowledge <>", value, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeGreaterThan(String value) {
            addCriterion("blind_knowledge >", value, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeGreaterThanOrEqualTo(String value) {
            addCriterion("blind_knowledge >=", value, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeLessThan(String value) {
            addCriterion("blind_knowledge <", value, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeLessThanOrEqualTo(String value) {
            addCriterion("blind_knowledge <=", value, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeLike(String value) {
            addCriterion("blind_knowledge like", value, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeNotLike(String value) {
            addCriterion("blind_knowledge not like", value, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeIn(List<String> values) {
            addCriterion("blind_knowledge in", values, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeNotIn(List<String> values) {
            addCriterion("blind_knowledge not in", values, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeBetween(String value1, String value2) {
            addCriterion("blind_knowledge between", value1, value2, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andBlindKnowledgeNotBetween(String value1, String value2) {
            addCriterion("blind_knowledge not between", value1, value2, "blindKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeIsNull() {
            addCriterion("weak_knowledge is null");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeIsNotNull() {
            addCriterion("weak_knowledge is not null");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeEqualTo(String value) {
            addCriterion("weak_knowledge =", value, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeNotEqualTo(String value) {
            addCriterion("weak_knowledge <>", value, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeGreaterThan(String value) {
            addCriterion("weak_knowledge >", value, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeGreaterThanOrEqualTo(String value) {
            addCriterion("weak_knowledge >=", value, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeLessThan(String value) {
            addCriterion("weak_knowledge <", value, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeLessThanOrEqualTo(String value) {
            addCriterion("weak_knowledge <=", value, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeLike(String value) {
            addCriterion("weak_knowledge like", value, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeNotLike(String value) {
            addCriterion("weak_knowledge not like", value, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeIn(List<String> values) {
            addCriterion("weak_knowledge in", values, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeNotIn(List<String> values) {
            addCriterion("weak_knowledge not in", values, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeBetween(String value1, String value2) {
            addCriterion("weak_knowledge between", value1, value2, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andWeakKnowledgeNotBetween(String value1, String value2) {
            addCriterion("weak_knowledge not between", value1, value2, "weakKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeIsNull() {
            addCriterion("difficulty_knowledge is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeIsNotNull() {
            addCriterion("difficulty_knowledge is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeEqualTo(String value) {
            addCriterion("difficulty_knowledge =", value, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeNotEqualTo(String value) {
            addCriterion("difficulty_knowledge <>", value, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeGreaterThan(String value) {
            addCriterion("difficulty_knowledge >", value, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeGreaterThanOrEqualTo(String value) {
            addCriterion("difficulty_knowledge >=", value, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeLessThan(String value) {
            addCriterion("difficulty_knowledge <", value, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeLessThanOrEqualTo(String value) {
            addCriterion("difficulty_knowledge <=", value, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeLike(String value) {
            addCriterion("difficulty_knowledge like", value, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeNotLike(String value) {
            addCriterion("difficulty_knowledge not like", value, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeIn(List<String> values) {
            addCriterion("difficulty_knowledge in", values, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeNotIn(List<String> values) {
            addCriterion("difficulty_knowledge not in", values, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeBetween(String value1, String value2) {
            addCriterion("difficulty_knowledge between", value1, value2, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andDifficultyKnowledgeNotBetween(String value1, String value2) {
            addCriterion("difficulty_knowledge not between", value1, value2, "difficultyKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeIsNull() {
            addCriterion("base_knowledge is null");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeIsNotNull() {
            addCriterion("base_knowledge is not null");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeEqualTo(String value) {
            addCriterion("base_knowledge =", value, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeNotEqualTo(String value) {
            addCriterion("base_knowledge <>", value, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeGreaterThan(String value) {
            addCriterion("base_knowledge >", value, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeGreaterThanOrEqualTo(String value) {
            addCriterion("base_knowledge >=", value, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeLessThan(String value) {
            addCriterion("base_knowledge <", value, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeLessThanOrEqualTo(String value) {
            addCriterion("base_knowledge <=", value, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeLike(String value) {
            addCriterion("base_knowledge like", value, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeNotLike(String value) {
            addCriterion("base_knowledge not like", value, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeIn(List<String> values) {
            addCriterion("base_knowledge in", values, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeNotIn(List<String> values) {
            addCriterion("base_knowledge not in", values, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeBetween(String value1, String value2) {
            addCriterion("base_knowledge between", value1, value2, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andBaseKnowledgeNotBetween(String value1, String value2) {
            addCriterion("base_knowledge not between", value1, value2, "baseKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeIsNull() {
            addCriterion("merit_knowledge is null");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeIsNotNull() {
            addCriterion("merit_knowledge is not null");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeEqualTo(String value) {
            addCriterion("merit_knowledge =", value, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeNotEqualTo(String value) {
            addCriterion("merit_knowledge <>", value, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeGreaterThan(String value) {
            addCriterion("merit_knowledge >", value, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeGreaterThanOrEqualTo(String value) {
            addCriterion("merit_knowledge >=", value, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeLessThan(String value) {
            addCriterion("merit_knowledge <", value, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeLessThanOrEqualTo(String value) {
            addCriterion("merit_knowledge <=", value, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeLike(String value) {
            addCriterion("merit_knowledge like", value, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeNotLike(String value) {
            addCriterion("merit_knowledge not like", value, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeIn(List<String> values) {
            addCriterion("merit_knowledge in", values, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeNotIn(List<String> values) {
            addCriterion("merit_knowledge not in", values, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeBetween(String value1, String value2) {
            addCriterion("merit_knowledge between", value1, value2, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andMeritKnowledgeNotBetween(String value1, String value2) {
            addCriterion("merit_knowledge not between", value1, value2, "meritKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeIsNull() {
            addCriterion("strong_knowledge is null");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeIsNotNull() {
            addCriterion("strong_knowledge is not null");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeEqualTo(String value) {
            addCriterion("strong_knowledge =", value, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeNotEqualTo(String value) {
            addCriterion("strong_knowledge <>", value, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeGreaterThan(String value) {
            addCriterion("strong_knowledge >", value, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeGreaterThanOrEqualTo(String value) {
            addCriterion("strong_knowledge >=", value, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeLessThan(String value) {
            addCriterion("strong_knowledge <", value, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeLessThanOrEqualTo(String value) {
            addCriterion("strong_knowledge <=", value, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeLike(String value) {
            addCriterion("strong_knowledge like", value, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeNotLike(String value) {
            addCriterion("strong_knowledge not like", value, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeIn(List<String> values) {
            addCriterion("strong_knowledge in", values, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeNotIn(List<String> values) {
            addCriterion("strong_knowledge not in", values, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeBetween(String value1, String value2) {
            addCriterion("strong_knowledge between", value1, value2, "strongKnowledge");
            return (Criteria) this;
        }

        public Criteria andStrongKnowledgeNotBetween(String value1, String value2) {
            addCriterion("strong_knowledge not between", value1, value2, "strongKnowledge");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time not between", value1, value2, "startTime");
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
            addCriterionForJDBCDate("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time not between", value1, value2, "endTime");
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