package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseTimuQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public BaseTimuQuery() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
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

        public Criteria andTimuTypeIdIsNull() {
            addCriterion("timu_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdIsNotNull() {
            addCriterion("timu_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdEqualTo(Integer value) {
            addCriterion("timu_type_id =", value, "timuTypeId");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdNotEqualTo(Integer value) {
            addCriterion("timu_type_id <>", value, "timuTypeId");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdGreaterThan(Integer value) {
            addCriterion("timu_type_id >", value, "timuTypeId");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("timu_type_id >=", value, "timuTypeId");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdLessThan(Integer value) {
            addCriterion("timu_type_id <", value, "timuTypeId");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("timu_type_id <=", value, "timuTypeId");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdIn(List<Integer> values) {
            addCriterion("timu_type_id in", values, "timuTypeId");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdNotIn(List<Integer> values) {
            addCriterion("timu_type_id not in", values, "timuTypeId");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("timu_type_id between", value1, value2, "timuTypeId");
            return (Criteria) this;
        }

        public Criteria andTimuTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("timu_type_id not between", value1, value2, "timuTypeId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsIsNull() {
            addCriterion("province_ids is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsIsNotNull() {
            addCriterion("province_ids is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsEqualTo(String value) {
            addCriterion("province_ids =", value, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsNotEqualTo(String value) {
            addCriterion("province_ids <>", value, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsGreaterThan(String value) {
            addCriterion("province_ids >", value, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsGreaterThanOrEqualTo(String value) {
            addCriterion("province_ids >=", value, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsLessThan(String value) {
            addCriterion("province_ids <", value, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsLessThanOrEqualTo(String value) {
            addCriterion("province_ids <=", value, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsLike(String value) {
            addCriterion("province_ids like", value, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsNotLike(String value) {
            addCriterion("province_ids not like", value, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsIn(List<String> values) {
            addCriterion("province_ids in", values, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsNotIn(List<String> values) {
            addCriterion("province_ids not in", values, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsBetween(String value1, String value2) {
            addCriterion("province_ids between", value1, value2, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andProvinceIdsNotBetween(String value1, String value2) {
            addCriterion("province_ids not between", value1, value2, "provinceIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsIsNull() {
            addCriterion("city_ids is null");
            return (Criteria) this;
        }

        public Criteria andCityIdsIsNotNull() {
            addCriterion("city_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdsEqualTo(String value) {
            addCriterion("city_ids =", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsNotEqualTo(String value) {
            addCriterion("city_ids <>", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsGreaterThan(String value) {
            addCriterion("city_ids >", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsGreaterThanOrEqualTo(String value) {
            addCriterion("city_ids >=", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsLessThan(String value) {
            addCriterion("city_ids <", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsLessThanOrEqualTo(String value) {
            addCriterion("city_ids <=", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsLike(String value) {
            addCriterion("city_ids like", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsNotLike(String value) {
            addCriterion("city_ids not like", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsIn(List<String> values) {
            addCriterion("city_ids in", values, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsNotIn(List<String> values) {
            addCriterion("city_ids not in", values, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsBetween(String value1, String value2) {
            addCriterion("city_ids between", value1, value2, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsNotBetween(String value1, String value2) {
            addCriterion("city_ids not between", value1, value2, "cityIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsIsNull() {
            addCriterion("area_ids is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdsIsNotNull() {
            addCriterion("area_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdsEqualTo(String value) {
            addCriterion("area_ids =", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotEqualTo(String value) {
            addCriterion("area_ids <>", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsGreaterThan(String value) {
            addCriterion("area_ids >", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsGreaterThanOrEqualTo(String value) {
            addCriterion("area_ids >=", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsLessThan(String value) {
            addCriterion("area_ids <", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsLessThanOrEqualTo(String value) {
            addCriterion("area_ids <=", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsLike(String value) {
            addCriterion("area_ids like", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotLike(String value) {
            addCriterion("area_ids not like", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsIn(List<String> values) {
            addCriterion("area_ids in", values, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotIn(List<String> values) {
            addCriterion("area_ids not in", values, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsBetween(String value1, String value2) {
            addCriterion("area_ids between", value1, value2, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotBetween(String value1, String value2) {
            addCriterion("area_ids not between", value1, value2, "areaIds");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andScroeIsNull() {
            addCriterion("scroe is null");
            return (Criteria) this;
        }

        public Criteria andScroeIsNotNull() {
            addCriterion("scroe is not null");
            return (Criteria) this;
        }

        public Criteria andScroeEqualTo(BigDecimal value) {
            addCriterion("scroe =", value, "scroe");
            return (Criteria) this;
        }

        public Criteria andScroeNotEqualTo(BigDecimal value) {
            addCriterion("scroe <>", value, "scroe");
            return (Criteria) this;
        }

        public Criteria andScroeGreaterThan(BigDecimal value) {
            addCriterion("scroe >", value, "scroe");
            return (Criteria) this;
        }

        public Criteria andScroeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("scroe >=", value, "scroe");
            return (Criteria) this;
        }

        public Criteria andScroeLessThan(BigDecimal value) {
            addCriterion("scroe <", value, "scroe");
            return (Criteria) this;
        }

        public Criteria andScroeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("scroe <=", value, "scroe");
            return (Criteria) this;
        }

        public Criteria andScroeIn(List<BigDecimal> values) {
            addCriterion("scroe in", values, "scroe");
            return (Criteria) this;
        }

        public Criteria andScroeNotIn(List<BigDecimal> values) {
            addCriterion("scroe not in", values, "scroe");
            return (Criteria) this;
        }

        public Criteria andScroeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("scroe between", value1, value2, "scroe");
            return (Criteria) this;
        }

        public Criteria andScroeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("scroe not between", value1, value2, "scroe");
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andVideoCodeIsNull() {
            addCriterion("video_code is null");
            return (Criteria) this;
        }

        public Criteria andVideoCodeIsNotNull() {
            addCriterion("video_code is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCodeEqualTo(String value) {
            addCriterion("video_code =", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotEqualTo(String value) {
            addCriterion("video_code <>", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeGreaterThan(String value) {
            addCriterion("video_code >", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("video_code >=", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeLessThan(String value) {
            addCriterion("video_code <", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeLessThanOrEqualTo(String value) {
            addCriterion("video_code <=", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeLike(String value) {
            addCriterion("video_code like", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotLike(String value) {
            addCriterion("video_code not like", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeIn(List<String> values) {
            addCriterion("video_code in", values, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotIn(List<String> values) {
            addCriterion("video_code not in", values, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeBetween(String value1, String value2) {
            addCriterion("video_code between", value1, value2, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotBetween(String value1, String value2) {
            addCriterion("video_code not between", value1, value2, "videoCode");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Byte value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Byte value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Byte value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Byte value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Byte value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Byte> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Byte> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Byte value1, Byte value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeIsNull() {
            addCriterion("is_expand_practice is null");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeIsNotNull() {
            addCriterion("is_expand_practice is not null");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeEqualTo(Boolean value) {
            addCriterion("is_expand_practice =", value, "isExpandPractice");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeNotEqualTo(Boolean value) {
            addCriterion("is_expand_practice <>", value, "isExpandPractice");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeGreaterThan(Boolean value) {
            addCriterion("is_expand_practice >", value, "isExpandPractice");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_expand_practice >=", value, "isExpandPractice");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeLessThan(Boolean value) {
            addCriterion("is_expand_practice <", value, "isExpandPractice");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_expand_practice <=", value, "isExpandPractice");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeIn(List<Boolean> values) {
            addCriterion("is_expand_practice in", values, "isExpandPractice");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeNotIn(List<Boolean> values) {
            addCriterion("is_expand_practice not in", values, "isExpandPractice");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_expand_practice between", value1, value2, "isExpandPractice");
            return (Criteria) this;
        }

        public Criteria andIsExpandPracticeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_expand_practice not between", value1, value2, "isExpandPractice");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildIsNull() {
            addCriterion("is_have_child is null");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildIsNotNull() {
            addCriterion("is_have_child is not null");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildEqualTo(Boolean value) {
            addCriterion("is_have_child =", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildNotEqualTo(Boolean value) {
            addCriterion("is_have_child <>", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildGreaterThan(Boolean value) {
            addCriterion("is_have_child >", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_have_child >=", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildLessThan(Boolean value) {
            addCriterion("is_have_child <", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildLessThanOrEqualTo(Boolean value) {
            addCriterion("is_have_child <=", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildIn(List<Boolean> values) {
            addCriterion("is_have_child in", values, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildNotIn(List<Boolean> values) {
            addCriterion("is_have_child not in", values, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildBetween(Boolean value1, Boolean value2) {
            addCriterion("is_have_child between", value1, value2, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_have_child not between", value1, value2, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andPictureJsonIsNull() {
            addCriterion("picture_json is null");
            return (Criteria) this;
        }

        public Criteria andPictureJsonIsNotNull() {
            addCriterion("picture_json is not null");
            return (Criteria) this;
        }

        public Criteria andPictureJsonEqualTo(String value) {
            addCriterion("picture_json =", value, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonNotEqualTo(String value) {
            addCriterion("picture_json <>", value, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonGreaterThan(String value) {
            addCriterion("picture_json >", value, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonGreaterThanOrEqualTo(String value) {
            addCriterion("picture_json >=", value, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonLessThan(String value) {
            addCriterion("picture_json <", value, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonLessThanOrEqualTo(String value) {
            addCriterion("picture_json <=", value, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonLike(String value) {
            addCriterion("picture_json like", value, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonNotLike(String value) {
            addCriterion("picture_json not like", value, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonIn(List<String> values) {
            addCriterion("picture_json in", values, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonNotIn(List<String> values) {
            addCriterion("picture_json not in", values, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonBetween(String value1, String value2) {
            addCriterion("picture_json between", value1, value2, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andPictureJsonNotBetween(String value1, String value2) {
            addCriterion("picture_json not between", value1, value2, "pictureJson");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelIsNull() {
            addCriterion("difficult_level is null");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelIsNotNull() {
            addCriterion("difficult_level is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelEqualTo(Byte value) {
            addCriterion("difficult_level =", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelNotEqualTo(Byte value) {
            addCriterion("difficult_level <>", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelGreaterThan(Byte value) {
            addCriterion("difficult_level >", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("difficult_level >=", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelLessThan(Byte value) {
            addCriterion("difficult_level <", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelLessThanOrEqualTo(Byte value) {
            addCriterion("difficult_level <=", value, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelIn(List<Byte> values) {
            addCriterion("difficult_level in", values, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelNotIn(List<Byte> values) {
            addCriterion("difficult_level not in", values, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelBetween(Byte value1, Byte value2) {
            addCriterion("difficult_level between", value1, value2, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andDifficultLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("difficult_level not between", value1, value2, "difficultLevel");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdIsNull() {
            addCriterion("school_degree_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdIsNotNull() {
            addCriterion("school_degree_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdEqualTo(Integer value) {
            addCriterion("school_degree_id =", value, "schoolDegreeId");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdNotEqualTo(Integer value) {
            addCriterion("school_degree_id <>", value, "schoolDegreeId");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdGreaterThan(Integer value) {
            addCriterion("school_degree_id >", value, "schoolDegreeId");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_degree_id >=", value, "schoolDegreeId");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdLessThan(Integer value) {
            addCriterion("school_degree_id <", value, "schoolDegreeId");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_degree_id <=", value, "schoolDegreeId");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdIn(List<Integer> values) {
            addCriterion("school_degree_id in", values, "schoolDegreeId");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdNotIn(List<Integer> values) {
            addCriterion("school_degree_id not in", values, "schoolDegreeId");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdBetween(Integer value1, Integer value2) {
            addCriterion("school_degree_id between", value1, value2, "schoolDegreeId");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_degree_id not between", value1, value2, "schoolDegreeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdIsNull() {
            addCriterion("main_knowledge_id is null");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdIsNotNull() {
            addCriterion("main_knowledge_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdEqualTo(Integer value) {
            addCriterion("main_knowledge_id =", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdNotEqualTo(Integer value) {
            addCriterion("main_knowledge_id <>", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdGreaterThan(Integer value) {
            addCriterion("main_knowledge_id >", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_knowledge_id >=", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdLessThan(Integer value) {
            addCriterion("main_knowledge_id <", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("main_knowledge_id <=", value, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdIn(List<Integer> values) {
            addCriterion("main_knowledge_id in", values, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdNotIn(List<Integer> values) {
            addCriterion("main_knowledge_id not in", values, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdBetween(Integer value1, Integer value2) {
            addCriterion("main_knowledge_id between", value1, value2, "mainKnowledgeId");
            return (Criteria) this;
        }

        public Criteria andMainKnowledgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("main_knowledge_id not between", value1, value2, "mainKnowledgeId");
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