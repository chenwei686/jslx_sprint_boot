package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimuQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public TimuQuery() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNull() {
            addCriterion("SubjectId is null");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNotNull() {
            addCriterion("SubjectId is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectidEqualTo(Integer value) {
            addCriterion("SubjectId =", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotEqualTo(Integer value) {
            addCriterion("SubjectId <>", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThan(Integer value) {
            addCriterion("SubjectId >", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SubjectId >=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThan(Integer value) {
            addCriterion("SubjectId <", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("SubjectId <=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidIn(List<Integer> values) {
            addCriterion("SubjectId in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotIn(List<Integer> values) {
            addCriterion("SubjectId not in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("SubjectId between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("SubjectId not between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andTimutypeidIsNull() {
            addCriterion("TiMuTypeId is null");
            return (Criteria) this;
        }

        public Criteria andTimutypeidIsNotNull() {
            addCriterion("TiMuTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andTimutypeidEqualTo(Integer value) {
            addCriterion("TiMuTypeId =", value, "timutypeid");
            return (Criteria) this;
        }

        public Criteria andTimutypeidNotEqualTo(Integer value) {
            addCriterion("TiMuTypeId <>", value, "timutypeid");
            return (Criteria) this;
        }

        public Criteria andTimutypeidGreaterThan(Integer value) {
            addCriterion("TiMuTypeId >", value, "timutypeid");
            return (Criteria) this;
        }

        public Criteria andTimutypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TiMuTypeId >=", value, "timutypeid");
            return (Criteria) this;
        }

        public Criteria andTimutypeidLessThan(Integer value) {
            addCriterion("TiMuTypeId <", value, "timutypeid");
            return (Criteria) this;
        }

        public Criteria andTimutypeidLessThanOrEqualTo(Integer value) {
            addCriterion("TiMuTypeId <=", value, "timutypeid");
            return (Criteria) this;
        }

        public Criteria andTimutypeidIn(List<Integer> values) {
            addCriterion("TiMuTypeId in", values, "timutypeid");
            return (Criteria) this;
        }

        public Criteria andTimutypeidNotIn(List<Integer> values) {
            addCriterion("TiMuTypeId not in", values, "timutypeid");
            return (Criteria) this;
        }

        public Criteria andTimutypeidBetween(Integer value1, Integer value2) {
            addCriterion("TiMuTypeId between", value1, value2, "timutypeid");
            return (Criteria) this;
        }

        public Criteria andTimutypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("TiMuTypeId not between", value1, value2, "timutypeid");
            return (Criteria) this;
        }

        public Criteria andDifficultIsNull() {
            addCriterion("Difficult is null");
            return (Criteria) this;
        }

        public Criteria andDifficultIsNotNull() {
            addCriterion("Difficult is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultEqualTo(Integer value) {
            addCriterion("Difficult =", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultNotEqualTo(Integer value) {
            addCriterion("Difficult <>", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultGreaterThan(Integer value) {
            addCriterion("Difficult >", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultGreaterThanOrEqualTo(Integer value) {
            addCriterion("Difficult >=", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultLessThan(Integer value) {
            addCriterion("Difficult <", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultLessThanOrEqualTo(Integer value) {
            addCriterion("Difficult <=", value, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultIn(List<Integer> values) {
            addCriterion("Difficult in", values, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultNotIn(List<Integer> values) {
            addCriterion("Difficult not in", values, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultBetween(Integer value1, Integer value2) {
            addCriterion("Difficult between", value1, value2, "difficult");
            return (Criteria) this;
        }

        public Criteria andDifficultNotBetween(Integer value1, Integer value2) {
            addCriterion("Difficult not between", value1, value2, "difficult");
            return (Criteria) this;
        }

        public Criteria andDiscriminateIsNull() {
            addCriterion("Discriminate is null");
            return (Criteria) this;
        }

        public Criteria andDiscriminateIsNotNull() {
            addCriterion("Discriminate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscriminateEqualTo(Integer value) {
            addCriterion("Discriminate =", value, "discriminate");
            return (Criteria) this;
        }

        public Criteria andDiscriminateNotEqualTo(Integer value) {
            addCriterion("Discriminate <>", value, "discriminate");
            return (Criteria) this;
        }

        public Criteria andDiscriminateGreaterThan(Integer value) {
            addCriterion("Discriminate >", value, "discriminate");
            return (Criteria) this;
        }

        public Criteria andDiscriminateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Discriminate >=", value, "discriminate");
            return (Criteria) this;
        }

        public Criteria andDiscriminateLessThan(Integer value) {
            addCriterion("Discriminate <", value, "discriminate");
            return (Criteria) this;
        }

        public Criteria andDiscriminateLessThanOrEqualTo(Integer value) {
            addCriterion("Discriminate <=", value, "discriminate");
            return (Criteria) this;
        }

        public Criteria andDiscriminateIn(List<Integer> values) {
            addCriterion("Discriminate in", values, "discriminate");
            return (Criteria) this;
        }

        public Criteria andDiscriminateNotIn(List<Integer> values) {
            addCriterion("Discriminate not in", values, "discriminate");
            return (Criteria) this;
        }

        public Criteria andDiscriminateBetween(Integer value1, Integer value2) {
            addCriterion("Discriminate between", value1, value2, "discriminate");
            return (Criteria) this;
        }

        public Criteria andDiscriminateNotBetween(Integer value1, Integer value2) {
            addCriterion("Discriminate not between", value1, value2, "discriminate");
            return (Criteria) this;
        }

        public Criteria andStandardtimeIsNull() {
            addCriterion("StandardTime is null");
            return (Criteria) this;
        }

        public Criteria andStandardtimeIsNotNull() {
            addCriterion("StandardTime is not null");
            return (Criteria) this;
        }

        public Criteria andStandardtimeEqualTo(Integer value) {
            addCriterion("StandardTime =", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeNotEqualTo(Integer value) {
            addCriterion("StandardTime <>", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeGreaterThan(Integer value) {
            addCriterion("StandardTime >", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("StandardTime >=", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeLessThan(Integer value) {
            addCriterion("StandardTime <", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeLessThanOrEqualTo(Integer value) {
            addCriterion("StandardTime <=", value, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeIn(List<Integer> values) {
            addCriterion("StandardTime in", values, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeNotIn(List<Integer> values) {
            addCriterion("StandardTime not in", values, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeBetween(Integer value1, Integer value2) {
            addCriterion("StandardTime between", value1, value2, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStandardtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("StandardTime not between", value1, value2, "standardtime");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeIsNull() {
            addCriterion("StanderdScroe is null");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeIsNotNull() {
            addCriterion("StanderdScroe is not null");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeEqualTo(BigDecimal value) {
            addCriterion("StanderdScroe =", value, "standerdscroe");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeNotEqualTo(BigDecimal value) {
            addCriterion("StanderdScroe <>", value, "standerdscroe");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeGreaterThan(BigDecimal value) {
            addCriterion("StanderdScroe >", value, "standerdscroe");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("StanderdScroe >=", value, "standerdscroe");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeLessThan(BigDecimal value) {
            addCriterion("StanderdScroe <", value, "standerdscroe");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("StanderdScroe <=", value, "standerdscroe");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeIn(List<BigDecimal> values) {
            addCriterion("StanderdScroe in", values, "standerdscroe");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeNotIn(List<BigDecimal> values) {
            addCriterion("StanderdScroe not in", values, "standerdscroe");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StanderdScroe between", value1, value2, "standerdscroe");
            return (Criteria) this;
        }

        public Criteria andStanderdscroeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StanderdScroe not between", value1, value2, "standerdscroe");
            return (Criteria) this;
        }

        public Criteria andCognizeidIsNull() {
            addCriterion("CognizeId is null");
            return (Criteria) this;
        }

        public Criteria andCognizeidIsNotNull() {
            addCriterion("CognizeId is not null");
            return (Criteria) this;
        }

        public Criteria andCognizeidEqualTo(Integer value) {
            addCriterion("CognizeId =", value, "cognizeid");
            return (Criteria) this;
        }

        public Criteria andCognizeidNotEqualTo(Integer value) {
            addCriterion("CognizeId <>", value, "cognizeid");
            return (Criteria) this;
        }

        public Criteria andCognizeidGreaterThan(Integer value) {
            addCriterion("CognizeId >", value, "cognizeid");
            return (Criteria) this;
        }

        public Criteria andCognizeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CognizeId >=", value, "cognizeid");
            return (Criteria) this;
        }

        public Criteria andCognizeidLessThan(Integer value) {
            addCriterion("CognizeId <", value, "cognizeid");
            return (Criteria) this;
        }

        public Criteria andCognizeidLessThanOrEqualTo(Integer value) {
            addCriterion("CognizeId <=", value, "cognizeid");
            return (Criteria) this;
        }

        public Criteria andCognizeidIn(List<Integer> values) {
            addCriterion("CognizeId in", values, "cognizeid");
            return (Criteria) this;
        }

        public Criteria andCognizeidNotIn(List<Integer> values) {
            addCriterion("CognizeId not in", values, "cognizeid");
            return (Criteria) this;
        }

        public Criteria andCognizeidBetween(Integer value1, Integer value2) {
            addCriterion("CognizeId between", value1, value2, "cognizeid");
            return (Criteria) this;
        }

        public Criteria andCognizeidNotBetween(Integer value1, Integer value2) {
            addCriterion("CognizeId not between", value1, value2, "cognizeid");
            return (Criteria) this;
        }

        public Criteria andAbilityidIsNull() {
            addCriterion("AbilityId is null");
            return (Criteria) this;
        }

        public Criteria andAbilityidIsNotNull() {
            addCriterion("AbilityId is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityidEqualTo(Integer value) {
            addCriterion("AbilityId =", value, "abilityid");
            return (Criteria) this;
        }

        public Criteria andAbilityidNotEqualTo(Integer value) {
            addCriterion("AbilityId <>", value, "abilityid");
            return (Criteria) this;
        }

        public Criteria andAbilityidGreaterThan(Integer value) {
            addCriterion("AbilityId >", value, "abilityid");
            return (Criteria) this;
        }

        public Criteria andAbilityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AbilityId >=", value, "abilityid");
            return (Criteria) this;
        }

        public Criteria andAbilityidLessThan(Integer value) {
            addCriterion("AbilityId <", value, "abilityid");
            return (Criteria) this;
        }

        public Criteria andAbilityidLessThanOrEqualTo(Integer value) {
            addCriterion("AbilityId <=", value, "abilityid");
            return (Criteria) this;
        }

        public Criteria andAbilityidIn(List<Integer> values) {
            addCriterion("AbilityId in", values, "abilityid");
            return (Criteria) this;
        }

        public Criteria andAbilityidNotIn(List<Integer> values) {
            addCriterion("AbilityId not in", values, "abilityid");
            return (Criteria) this;
        }

        public Criteria andAbilityidBetween(Integer value1, Integer value2) {
            addCriterion("AbilityId between", value1, value2, "abilityid");
            return (Criteria) this;
        }

        public Criteria andAbilityidNotBetween(Integer value1, Integer value2) {
            addCriterion("AbilityId not between", value1, value2, "abilityid");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNull() {
            addCriterion("GradeId is null");
            return (Criteria) this;
        }

        public Criteria andGradeidIsNotNull() {
            addCriterion("GradeId is not null");
            return (Criteria) this;
        }

        public Criteria andGradeidEqualTo(Integer value) {
            addCriterion("GradeId =", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotEqualTo(Integer value) {
            addCriterion("GradeId <>", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThan(Integer value) {
            addCriterion("GradeId >", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GradeId >=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThan(Integer value) {
            addCriterion("GradeId <", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidLessThanOrEqualTo(Integer value) {
            addCriterion("GradeId <=", value, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidIn(List<Integer> values) {
            addCriterion("GradeId in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotIn(List<Integer> values) {
            addCriterion("GradeId not in", values, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidBetween(Integer value1, Integer value2) {
            addCriterion("GradeId between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andGradeidNotBetween(Integer value1, Integer value2) {
            addCriterion("GradeId not between", value1, value2, "gradeid");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("AreaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AreaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("AreaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("AreaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("AreaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AreaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("AreaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("AreaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("AreaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("AreaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("AreaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("AreaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("Year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("Year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("Year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("Year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("Year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("Year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("Year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("Year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("Year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("Year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("Year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andSoureIsNull() {
            addCriterion("Soure is null");
            return (Criteria) this;
        }

        public Criteria andSoureIsNotNull() {
            addCriterion("Soure is not null");
            return (Criteria) this;
        }

        public Criteria andSoureEqualTo(String value) {
            addCriterion("Soure =", value, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureNotEqualTo(String value) {
            addCriterion("Soure <>", value, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureGreaterThan(String value) {
            addCriterion("Soure >", value, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureGreaterThanOrEqualTo(String value) {
            addCriterion("Soure >=", value, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureLessThan(String value) {
            addCriterion("Soure <", value, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureLessThanOrEqualTo(String value) {
            addCriterion("Soure <=", value, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureLike(String value) {
            addCriterion("Soure like", value, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureNotLike(String value) {
            addCriterion("Soure not like", value, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureIn(List<String> values) {
            addCriterion("Soure in", values, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureNotIn(List<String> values) {
            addCriterion("Soure not in", values, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureBetween(String value1, String value2) {
            addCriterion("Soure between", value1, value2, "soure");
            return (Criteria) this;
        }

        public Criteria andSoureNotBetween(String value1, String value2) {
            addCriterion("Soure not between", value1, value2, "soure");
            return (Criteria) this;
        }

        public Criteria andQualityidIsNull() {
            addCriterion("QualityId is null");
            return (Criteria) this;
        }

        public Criteria andQualityidIsNotNull() {
            addCriterion("QualityId is not null");
            return (Criteria) this;
        }

        public Criteria andQualityidEqualTo(Integer value) {
            addCriterion("QualityId =", value, "qualityid");
            return (Criteria) this;
        }

        public Criteria andQualityidNotEqualTo(Integer value) {
            addCriterion("QualityId <>", value, "qualityid");
            return (Criteria) this;
        }

        public Criteria andQualityidGreaterThan(Integer value) {
            addCriterion("QualityId >", value, "qualityid");
            return (Criteria) this;
        }

        public Criteria andQualityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("QualityId >=", value, "qualityid");
            return (Criteria) this;
        }

        public Criteria andQualityidLessThan(Integer value) {
            addCriterion("QualityId <", value, "qualityid");
            return (Criteria) this;
        }

        public Criteria andQualityidLessThanOrEqualTo(Integer value) {
            addCriterion("QualityId <=", value, "qualityid");
            return (Criteria) this;
        }

        public Criteria andQualityidIn(List<Integer> values) {
            addCriterion("QualityId in", values, "qualityid");
            return (Criteria) this;
        }

        public Criteria andQualityidNotIn(List<Integer> values) {
            addCriterion("QualityId not in", values, "qualityid");
            return (Criteria) this;
        }

        public Criteria andQualityidBetween(Integer value1, Integer value2) {
            addCriterion("QualityId between", value1, value2, "qualityid");
            return (Criteria) this;
        }

        public Criteria andQualityidNotBetween(Integer value1, Integer value2) {
            addCriterion("QualityId not between", value1, value2, "qualityid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andInputidIsNull() {
            addCriterion("InputId is null");
            return (Criteria) this;
        }

        public Criteria andInputidIsNotNull() {
            addCriterion("InputId is not null");
            return (Criteria) this;
        }

        public Criteria andInputidEqualTo(String value) {
            addCriterion("InputId =", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidNotEqualTo(String value) {
            addCriterion("InputId <>", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidGreaterThan(String value) {
            addCriterion("InputId >", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidGreaterThanOrEqualTo(String value) {
            addCriterion("InputId >=", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidLessThan(String value) {
            addCriterion("InputId <", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidLessThanOrEqualTo(String value) {
            addCriterion("InputId <=", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidLike(String value) {
            addCriterion("InputId like", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidNotLike(String value) {
            addCriterion("InputId not like", value, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidIn(List<String> values) {
            addCriterion("InputId in", values, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidNotIn(List<String> values) {
            addCriterion("InputId not in", values, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidBetween(String value1, String value2) {
            addCriterion("InputId between", value1, value2, "inputid");
            return (Criteria) this;
        }

        public Criteria andInputidNotBetween(String value1, String value2) {
            addCriterion("InputId not between", value1, value2, "inputid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("ParentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("ParentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("ParentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("ParentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("ParentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("ParentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("ParentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("ParentId like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("ParentId not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("ParentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("ParentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("ParentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("ParentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andVideocodeIsNull() {
            addCriterion("VideoCode is null");
            return (Criteria) this;
        }

        public Criteria andVideocodeIsNotNull() {
            addCriterion("VideoCode is not null");
            return (Criteria) this;
        }

        public Criteria andVideocodeEqualTo(String value) {
            addCriterion("VideoCode =", value, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeNotEqualTo(String value) {
            addCriterion("VideoCode <>", value, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeGreaterThan(String value) {
            addCriterion("VideoCode >", value, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeGreaterThanOrEqualTo(String value) {
            addCriterion("VideoCode >=", value, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeLessThan(String value) {
            addCriterion("VideoCode <", value, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeLessThanOrEqualTo(String value) {
            addCriterion("VideoCode <=", value, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeLike(String value) {
            addCriterion("VideoCode like", value, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeNotLike(String value) {
            addCriterion("VideoCode not like", value, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeIn(List<String> values) {
            addCriterion("VideoCode in", values, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeNotIn(List<String> values) {
            addCriterion("VideoCode not in", values, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeBetween(String value1, String value2) {
            addCriterion("VideoCode between", value1, value2, "videocode");
            return (Criteria) this;
        }

        public Criteria andVideocodeNotBetween(String value1, String value2) {
            addCriterion("VideoCode not between", value1, value2, "videocode");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNull() {
            addCriterion("SourceType is null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNotNull() {
            addCriterion("SourceType is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeEqualTo(Integer value) {
            addCriterion("SourceType =", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotEqualTo(Integer value) {
            addCriterion("SourceType <>", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThan(Integer value) {
            addCriterion("SourceType >", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SourceType >=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThan(Integer value) {
            addCriterion("SourceType <", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThanOrEqualTo(Integer value) {
            addCriterion("SourceType <=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIn(List<Integer> values) {
            addCriterion("SourceType in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotIn(List<Integer> values) {
            addCriterion("SourceType not in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeBetween(Integer value1, Integer value2) {
            addCriterion("SourceType between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SourceType not between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeIsNull() {
            addCriterion("IsExpandPractice is null");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeIsNotNull() {
            addCriterion("IsExpandPractice is not null");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeEqualTo(Boolean value) {
            addCriterion("IsExpandPractice =", value, "isexpandpractice");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeNotEqualTo(Boolean value) {
            addCriterion("IsExpandPractice <>", value, "isexpandpractice");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeGreaterThan(Boolean value) {
            addCriterion("IsExpandPractice >", value, "isexpandpractice");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsExpandPractice >=", value, "isexpandpractice");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeLessThan(Boolean value) {
            addCriterion("IsExpandPractice <", value, "isexpandpractice");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeLessThanOrEqualTo(Boolean value) {
            addCriterion("IsExpandPractice <=", value, "isexpandpractice");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeIn(List<Boolean> values) {
            addCriterion("IsExpandPractice in", values, "isexpandpractice");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeNotIn(List<Boolean> values) {
            addCriterion("IsExpandPractice not in", values, "isexpandpractice");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeBetween(Boolean value1, Boolean value2) {
            addCriterion("IsExpandPractice between", value1, value2, "isexpandpractice");
            return (Criteria) this;
        }

        public Criteria andIsexpandpracticeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsExpandPractice not between", value1, value2, "isexpandpractice");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuIsNull() {
            addCriterion("HaveChildTimu is null");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuIsNotNull() {
            addCriterion("HaveChildTimu is not null");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuEqualTo(Boolean value) {
            addCriterion("HaveChildTimu =", value, "havechildtimu");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuNotEqualTo(Boolean value) {
            addCriterion("HaveChildTimu <>", value, "havechildtimu");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuGreaterThan(Boolean value) {
            addCriterion("HaveChildTimu >", value, "havechildtimu");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuGreaterThanOrEqualTo(Boolean value) {
            addCriterion("HaveChildTimu >=", value, "havechildtimu");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuLessThan(Boolean value) {
            addCriterion("HaveChildTimu <", value, "havechildtimu");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuLessThanOrEqualTo(Boolean value) {
            addCriterion("HaveChildTimu <=", value, "havechildtimu");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuIn(List<Boolean> values) {
            addCriterion("HaveChildTimu in", values, "havechildtimu");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuNotIn(List<Boolean> values) {
            addCriterion("HaveChildTimu not in", values, "havechildtimu");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuBetween(Boolean value1, Boolean value2) {
            addCriterion("HaveChildTimu between", value1, value2, "havechildtimu");
            return (Criteria) this;
        }

        public Criteria andHavechildtimuNotBetween(Boolean value1, Boolean value2) {
            addCriterion("HaveChildTimu not between", value1, value2, "havechildtimu");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("Number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("Number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("Number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("Number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("Number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("Number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("Number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("Number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("Number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("Number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("Number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("Number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("Number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("Order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("Order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("Order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("Order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("Order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("Order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("Order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("Order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("Order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("Order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("Order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
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