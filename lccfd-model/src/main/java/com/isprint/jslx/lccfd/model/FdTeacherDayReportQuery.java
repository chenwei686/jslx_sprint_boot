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

        public Criteria andSearchMaxTimuIdIsNull() {
            addCriterion("search_max_timu_id is null");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdIsNotNull() {
            addCriterion("search_max_timu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdEqualTo(Integer value) {
            addCriterion("search_max_timu_id =", value, "searchMaxTimuId");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdNotEqualTo(Integer value) {
            addCriterion("search_max_timu_id <>", value, "searchMaxTimuId");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdGreaterThan(Integer value) {
            addCriterion("search_max_timu_id >", value, "searchMaxTimuId");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_max_timu_id >=", value, "searchMaxTimuId");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdLessThan(Integer value) {
            addCriterion("search_max_timu_id <", value, "searchMaxTimuId");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdLessThanOrEqualTo(Integer value) {
            addCriterion("search_max_timu_id <=", value, "searchMaxTimuId");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdIn(List<Integer> values) {
            addCriterion("search_max_timu_id in", values, "searchMaxTimuId");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdNotIn(List<Integer> values) {
            addCriterion("search_max_timu_id not in", values, "searchMaxTimuId");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdBetween(Integer value1, Integer value2) {
            addCriterion("search_max_timu_id between", value1, value2, "searchMaxTimuId");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("search_max_timu_id not between", value1, value2, "searchMaxTimuId");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumIsNull() {
            addCriterion("search_max_timu_num is null");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumIsNotNull() {
            addCriterion("search_max_timu_num is not null");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumEqualTo(Integer value) {
            addCriterion("search_max_timu_num =", value, "searchMaxTimuNum");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumNotEqualTo(Integer value) {
            addCriterion("search_max_timu_num <>", value, "searchMaxTimuNum");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumGreaterThan(Integer value) {
            addCriterion("search_max_timu_num >", value, "searchMaxTimuNum");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_max_timu_num >=", value, "searchMaxTimuNum");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumLessThan(Integer value) {
            addCriterion("search_max_timu_num <", value, "searchMaxTimuNum");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumLessThanOrEqualTo(Integer value) {
            addCriterion("search_max_timu_num <=", value, "searchMaxTimuNum");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumIn(List<Integer> values) {
            addCriterion("search_max_timu_num in", values, "searchMaxTimuNum");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumNotIn(List<Integer> values) {
            addCriterion("search_max_timu_num not in", values, "searchMaxTimuNum");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumBetween(Integer value1, Integer value2) {
            addCriterion("search_max_timu_num between", value1, value2, "searchMaxTimuNum");
            return (Criteria) this;
        }

        public Criteria andSearchMaxTimuNumNotBetween(Integer value1, Integer value2) {
            addCriterion("search_max_timu_num not between", value1, value2, "searchMaxTimuNum");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsIsNull() {
            addCriterion("correct_max_student_ids is null");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsIsNotNull() {
            addCriterion("correct_max_student_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsEqualTo(String value) {
            addCriterion("correct_max_student_ids =", value, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsNotEqualTo(String value) {
            addCriterion("correct_max_student_ids <>", value, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsGreaterThan(String value) {
            addCriterion("correct_max_student_ids >", value, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("correct_max_student_ids >=", value, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsLessThan(String value) {
            addCriterion("correct_max_student_ids <", value, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsLessThanOrEqualTo(String value) {
            addCriterion("correct_max_student_ids <=", value, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsLike(String value) {
            addCriterion("correct_max_student_ids like", value, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsNotLike(String value) {
            addCriterion("correct_max_student_ids not like", value, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsIn(List<String> values) {
            addCriterion("correct_max_student_ids in", values, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsNotIn(List<String> values) {
            addCriterion("correct_max_student_ids not in", values, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsBetween(String value1, String value2) {
            addCriterion("correct_max_student_ids between", value1, value2, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMaxStudentIdsNotBetween(String value1, String value2) {
            addCriterion("correct_max_student_ids not between", value1, value2, "correctMaxStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsIsNull() {
            addCriterion("correct_min_student_ids is null");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsIsNotNull() {
            addCriterion("correct_min_student_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsEqualTo(String value) {
            addCriterion("correct_min_student_ids =", value, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsNotEqualTo(String value) {
            addCriterion("correct_min_student_ids <>", value, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsGreaterThan(String value) {
            addCriterion("correct_min_student_ids >", value, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("correct_min_student_ids >=", value, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsLessThan(String value) {
            addCriterion("correct_min_student_ids <", value, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsLessThanOrEqualTo(String value) {
            addCriterion("correct_min_student_ids <=", value, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsLike(String value) {
            addCriterion("correct_min_student_ids like", value, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsNotLike(String value) {
            addCriterion("correct_min_student_ids not like", value, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsIn(List<String> values) {
            addCriterion("correct_min_student_ids in", values, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsNotIn(List<String> values) {
            addCriterion("correct_min_student_ids not in", values, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsBetween(String value1, String value2) {
            addCriterion("correct_min_student_ids between", value1, value2, "correctMinStudentIds");
            return (Criteria) this;
        }

        public Criteria andCorrectMinStudentIdsNotBetween(String value1, String value2) {
            addCriterion("correct_min_student_ids not between", value1, value2, "correctMinStudentIds");
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

        public Criteria andExampaperTotalNumIsNull() {
            addCriterion("exampaper_total_num is null");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumIsNotNull() {
            addCriterion("exampaper_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumEqualTo(Integer value) {
            addCriterion("exampaper_total_num =", value, "exampaperTotalNum");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumNotEqualTo(Integer value) {
            addCriterion("exampaper_total_num <>", value, "exampaperTotalNum");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumGreaterThan(Integer value) {
            addCriterion("exampaper_total_num >", value, "exampaperTotalNum");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampaper_total_num >=", value, "exampaperTotalNum");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumLessThan(Integer value) {
            addCriterion("exampaper_total_num <", value, "exampaperTotalNum");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("exampaper_total_num <=", value, "exampaperTotalNum");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumIn(List<Integer> values) {
            addCriterion("exampaper_total_num in", values, "exampaperTotalNum");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumNotIn(List<Integer> values) {
            addCriterion("exampaper_total_num not in", values, "exampaperTotalNum");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_total_num between", value1, value2, "exampaperTotalNum");
            return (Criteria) this;
        }

        public Criteria andExampaperTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_total_num not between", value1, value2, "exampaperTotalNum");
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

        public Criteria andExampaperCommitNumIsNull() {
            addCriterion("exampaper_commit_num is null");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumIsNotNull() {
            addCriterion("exampaper_commit_num is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumEqualTo(Integer value) {
            addCriterion("exampaper_commit_num =", value, "exampaperCommitNum");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumNotEqualTo(Integer value) {
            addCriterion("exampaper_commit_num <>", value, "exampaperCommitNum");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumGreaterThan(Integer value) {
            addCriterion("exampaper_commit_num >", value, "exampaperCommitNum");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampaper_commit_num >=", value, "exampaperCommitNum");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumLessThan(Integer value) {
            addCriterion("exampaper_commit_num <", value, "exampaperCommitNum");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumLessThanOrEqualTo(Integer value) {
            addCriterion("exampaper_commit_num <=", value, "exampaperCommitNum");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumIn(List<Integer> values) {
            addCriterion("exampaper_commit_num in", values, "exampaperCommitNum");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumNotIn(List<Integer> values) {
            addCriterion("exampaper_commit_num not in", values, "exampaperCommitNum");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_commit_num between", value1, value2, "exampaperCommitNum");
            return (Criteria) this;
        }

        public Criteria andExampaperCommitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_commit_num not between", value1, value2, "exampaperCommitNum");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdIsNull() {
            addCriterion("exampaper_student_id is null");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdIsNotNull() {
            addCriterion("exampaper_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdEqualTo(Integer value) {
            addCriterion("exampaper_student_id =", value, "exampaperStudentId");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdNotEqualTo(Integer value) {
            addCriterion("exampaper_student_id <>", value, "exampaperStudentId");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdGreaterThan(Integer value) {
            addCriterion("exampaper_student_id >", value, "exampaperStudentId");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampaper_student_id >=", value, "exampaperStudentId");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdLessThan(Integer value) {
            addCriterion("exampaper_student_id <", value, "exampaperStudentId");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("exampaper_student_id <=", value, "exampaperStudentId");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdIn(List<Integer> values) {
            addCriterion("exampaper_student_id in", values, "exampaperStudentId");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdNotIn(List<Integer> values) {
            addCriterion("exampaper_student_id not in", values, "exampaperStudentId");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_student_id between", value1, value2, "exampaperStudentId");
            return (Criteria) this;
        }

        public Criteria andExampaperStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_student_id not between", value1, value2, "exampaperStudentId");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreIsNull() {
            addCriterion("exampaper_max_score is null");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreIsNotNull() {
            addCriterion("exampaper_max_score is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreEqualTo(BigDecimal value) {
            addCriterion("exampaper_max_score =", value, "exampaperMaxScore");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreNotEqualTo(BigDecimal value) {
            addCriterion("exampaper_max_score <>", value, "exampaperMaxScore");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreGreaterThan(BigDecimal value) {
            addCriterion("exampaper_max_score >", value, "exampaperMaxScore");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_max_score >=", value, "exampaperMaxScore");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreLessThan(BigDecimal value) {
            addCriterion("exampaper_max_score <", value, "exampaperMaxScore");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exampaper_max_score <=", value, "exampaperMaxScore");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreIn(List<BigDecimal> values) {
            addCriterion("exampaper_max_score in", values, "exampaperMaxScore");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreNotIn(List<BigDecimal> values) {
            addCriterion("exampaper_max_score not in", values, "exampaperMaxScore");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_max_score between", value1, value2, "exampaperMaxScore");
            return (Criteria) this;
        }

        public Criteria andExampaperMaxScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exampaper_max_score not between", value1, value2, "exampaperMaxScore");
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

        public Criteria andSearchCommentIdIsNull() {
            addCriterion("search_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdIsNotNull() {
            addCriterion("search_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdEqualTo(Integer value) {
            addCriterion("search_comment_id =", value, "searchCommentId");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdNotEqualTo(Integer value) {
            addCriterion("search_comment_id <>", value, "searchCommentId");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdGreaterThan(Integer value) {
            addCriterion("search_comment_id >", value, "searchCommentId");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_comment_id >=", value, "searchCommentId");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdLessThan(Integer value) {
            addCriterion("search_comment_id <", value, "searchCommentId");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("search_comment_id <=", value, "searchCommentId");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdIn(List<Integer> values) {
            addCriterion("search_comment_id in", values, "searchCommentId");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdNotIn(List<Integer> values) {
            addCriterion("search_comment_id not in", values, "searchCommentId");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("search_comment_id between", value1, value2, "searchCommentId");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("search_comment_id not between", value1, value2, "searchCommentId");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIsNull() {
            addCriterion("search_comment is null");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIsNotNull() {
            addCriterion("search_comment is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCommentEqualTo(String value) {
            addCriterion("search_comment =", value, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentNotEqualTo(String value) {
            addCriterion("search_comment <>", value, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentGreaterThan(String value) {
            addCriterion("search_comment >", value, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentGreaterThanOrEqualTo(String value) {
            addCriterion("search_comment >=", value, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentLessThan(String value) {
            addCriterion("search_comment <", value, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentLessThanOrEqualTo(String value) {
            addCriterion("search_comment <=", value, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentLike(String value) {
            addCriterion("search_comment like", value, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentNotLike(String value) {
            addCriterion("search_comment not like", value, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentIn(List<String> values) {
            addCriterion("search_comment in", values, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentNotIn(List<String> values) {
            addCriterion("search_comment not in", values, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentBetween(String value1, String value2) {
            addCriterion("search_comment between", value1, value2, "searchComment");
            return (Criteria) this;
        }

        public Criteria andSearchCommentNotBetween(String value1, String value2) {
            addCriterion("search_comment not between", value1, value2, "searchComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdIsNull() {
            addCriterion("correct_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdIsNotNull() {
            addCriterion("correct_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdEqualTo(Integer value) {
            addCriterion("correct_comment_id =", value, "correctCommentId");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdNotEqualTo(Integer value) {
            addCriterion("correct_comment_id <>", value, "correctCommentId");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdGreaterThan(Integer value) {
            addCriterion("correct_comment_id >", value, "correctCommentId");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_comment_id >=", value, "correctCommentId");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdLessThan(Integer value) {
            addCriterion("correct_comment_id <", value, "correctCommentId");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("correct_comment_id <=", value, "correctCommentId");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdIn(List<Integer> values) {
            addCriterion("correct_comment_id in", values, "correctCommentId");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdNotIn(List<Integer> values) {
            addCriterion("correct_comment_id not in", values, "correctCommentId");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("correct_comment_id between", value1, value2, "correctCommentId");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_comment_id not between", value1, value2, "correctCommentId");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIsNull() {
            addCriterion("correct_comment is null");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIsNotNull() {
            addCriterion("correct_comment is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentEqualTo(String value) {
            addCriterion("correct_comment =", value, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentNotEqualTo(String value) {
            addCriterion("correct_comment <>", value, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentGreaterThan(String value) {
            addCriterion("correct_comment >", value, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentGreaterThanOrEqualTo(String value) {
            addCriterion("correct_comment >=", value, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentLessThan(String value) {
            addCriterion("correct_comment <", value, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentLessThanOrEqualTo(String value) {
            addCriterion("correct_comment <=", value, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentLike(String value) {
            addCriterion("correct_comment like", value, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentNotLike(String value) {
            addCriterion("correct_comment not like", value, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentIn(List<String> values) {
            addCriterion("correct_comment in", values, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentNotIn(List<String> values) {
            addCriterion("correct_comment not in", values, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentBetween(String value1, String value2) {
            addCriterion("correct_comment between", value1, value2, "correctComment");
            return (Criteria) this;
        }

        public Criteria andCorrectCommentNotBetween(String value1, String value2) {
            addCriterion("correct_comment not between", value1, value2, "correctComment");
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

        public Criteria andPracticeStudentNumIsNull() {
            addCriterion("practice_student_num is null");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumIsNotNull() {
            addCriterion("practice_student_num is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumEqualTo(Integer value) {
            addCriterion("practice_student_num =", value, "practiceStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumNotEqualTo(Integer value) {
            addCriterion("practice_student_num <>", value, "practiceStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumGreaterThan(Integer value) {
            addCriterion("practice_student_num >", value, "practiceStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("practice_student_num >=", value, "practiceStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumLessThan(Integer value) {
            addCriterion("practice_student_num <", value, "practiceStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumLessThanOrEqualTo(Integer value) {
            addCriterion("practice_student_num <=", value, "practiceStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumIn(List<Integer> values) {
            addCriterion("practice_student_num in", values, "practiceStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumNotIn(List<Integer> values) {
            addCriterion("practice_student_num not in", values, "practiceStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumBetween(Integer value1, Integer value2) {
            addCriterion("practice_student_num between", value1, value2, "practiceStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeStudentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("practice_student_num not between", value1, value2, "practiceStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsIsNull() {
            addCriterion("practice_finish_student_ids is null");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsIsNotNull() {
            addCriterion("practice_finish_student_ids is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsEqualTo(String value) {
            addCriterion("practice_finish_student_ids =", value, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsNotEqualTo(String value) {
            addCriterion("practice_finish_student_ids <>", value, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsGreaterThan(String value) {
            addCriterion("practice_finish_student_ids >", value, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("practice_finish_student_ids >=", value, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsLessThan(String value) {
            addCriterion("practice_finish_student_ids <", value, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsLessThanOrEqualTo(String value) {
            addCriterion("practice_finish_student_ids <=", value, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsLike(String value) {
            addCriterion("practice_finish_student_ids like", value, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsNotLike(String value) {
            addCriterion("practice_finish_student_ids not like", value, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsIn(List<String> values) {
            addCriterion("practice_finish_student_ids in", values, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsNotIn(List<String> values) {
            addCriterion("practice_finish_student_ids not in", values, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsBetween(String value1, String value2) {
            addCriterion("practice_finish_student_ids between", value1, value2, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentIdsNotBetween(String value1, String value2) {
            addCriterion("practice_finish_student_ids not between", value1, value2, "practiceFinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumIsNull() {
            addCriterion("practice_finish_student_num is null");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumIsNotNull() {
            addCriterion("practice_finish_student_num is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumEqualTo(Integer value) {
            addCriterion("practice_finish_student_num =", value, "practiceFinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumNotEqualTo(Integer value) {
            addCriterion("practice_finish_student_num <>", value, "practiceFinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumGreaterThan(Integer value) {
            addCriterion("practice_finish_student_num >", value, "practiceFinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("practice_finish_student_num >=", value, "practiceFinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumLessThan(Integer value) {
            addCriterion("practice_finish_student_num <", value, "practiceFinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumLessThanOrEqualTo(Integer value) {
            addCriterion("practice_finish_student_num <=", value, "practiceFinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumIn(List<Integer> values) {
            addCriterion("practice_finish_student_num in", values, "practiceFinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumNotIn(List<Integer> values) {
            addCriterion("practice_finish_student_num not in", values, "practiceFinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumBetween(Integer value1, Integer value2) {
            addCriterion("practice_finish_student_num between", value1, value2, "practiceFinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeFinishStudentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("practice_finish_student_num not between", value1, value2, "practiceFinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsIsNull() {
            addCriterion("practice_unfinish_student_ids is null");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsIsNotNull() {
            addCriterion("practice_unfinish_student_ids is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsEqualTo(String value) {
            addCriterion("practice_unfinish_student_ids =", value, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsNotEqualTo(String value) {
            addCriterion("practice_unfinish_student_ids <>", value, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsGreaterThan(String value) {
            addCriterion("practice_unfinish_student_ids >", value, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("practice_unfinish_student_ids >=", value, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsLessThan(String value) {
            addCriterion("practice_unfinish_student_ids <", value, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsLessThanOrEqualTo(String value) {
            addCriterion("practice_unfinish_student_ids <=", value, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsLike(String value) {
            addCriterion("practice_unfinish_student_ids like", value, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsNotLike(String value) {
            addCriterion("practice_unfinish_student_ids not like", value, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsIn(List<String> values) {
            addCriterion("practice_unfinish_student_ids in", values, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsNotIn(List<String> values) {
            addCriterion("practice_unfinish_student_ids not in", values, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsBetween(String value1, String value2) {
            addCriterion("practice_unfinish_student_ids between", value1, value2, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentIdsNotBetween(String value1, String value2) {
            addCriterion("practice_unfinish_student_ids not between", value1, value2, "practiceUnfinishStudentIds");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumIsNull() {
            addCriterion("practice_unfinish_student_num is null");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumIsNotNull() {
            addCriterion("practice_unfinish_student_num is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumEqualTo(Integer value) {
            addCriterion("practice_unfinish_student_num =", value, "practiceUnfinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumNotEqualTo(Integer value) {
            addCriterion("practice_unfinish_student_num <>", value, "practiceUnfinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumGreaterThan(Integer value) {
            addCriterion("practice_unfinish_student_num >", value, "practiceUnfinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("practice_unfinish_student_num >=", value, "practiceUnfinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumLessThan(Integer value) {
            addCriterion("practice_unfinish_student_num <", value, "practiceUnfinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumLessThanOrEqualTo(Integer value) {
            addCriterion("practice_unfinish_student_num <=", value, "practiceUnfinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumIn(List<Integer> values) {
            addCriterion("practice_unfinish_student_num in", values, "practiceUnfinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumNotIn(List<Integer> values) {
            addCriterion("practice_unfinish_student_num not in", values, "practiceUnfinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumBetween(Integer value1, Integer value2) {
            addCriterion("practice_unfinish_student_num between", value1, value2, "practiceUnfinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andPracticeUnfinishStudentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("practice_unfinish_student_num not between", value1, value2, "practiceUnfinishStudentNum");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
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