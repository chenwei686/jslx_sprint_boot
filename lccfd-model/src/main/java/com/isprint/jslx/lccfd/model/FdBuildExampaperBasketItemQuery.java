package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdBuildExampaperBasketItemQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdBuildExampaperBasketItemQuery() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdIsNull() {
            addCriterion("build_exampaper_basket_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdIsNotNull() {
            addCriterion("build_exampaper_basket_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdEqualTo(Integer value) {
            addCriterion("build_exampaper_basket_id =", value, "buildExampaperBasketId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdNotEqualTo(Integer value) {
            addCriterion("build_exampaper_basket_id <>", value, "buildExampaperBasketId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdGreaterThan(Integer value) {
            addCriterion("build_exampaper_basket_id >", value, "buildExampaperBasketId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_exampaper_basket_id >=", value, "buildExampaperBasketId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdLessThan(Integer value) {
            addCriterion("build_exampaper_basket_id <", value, "buildExampaperBasketId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdLessThanOrEqualTo(Integer value) {
            addCriterion("build_exampaper_basket_id <=", value, "buildExampaperBasketId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdIn(List<Integer> values) {
            addCriterion("build_exampaper_basket_id in", values, "buildExampaperBasketId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdNotIn(List<Integer> values) {
            addCriterion("build_exampaper_basket_id not in", values, "buildExampaperBasketId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdBetween(Integer value1, Integer value2) {
            addCriterion("build_exampaper_basket_id between", value1, value2, "buildExampaperBasketId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperBasketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("build_exampaper_basket_id not between", value1, value2, "buildExampaperBasketId");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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

        public Criteria andTimuTypeNameIsNull() {
            addCriterion("timu_type_name is null");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameIsNotNull() {
            addCriterion("timu_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameEqualTo(String value) {
            addCriterion("timu_type_name =", value, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameNotEqualTo(String value) {
            addCriterion("timu_type_name <>", value, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameGreaterThan(String value) {
            addCriterion("timu_type_name >", value, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("timu_type_name >=", value, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameLessThan(String value) {
            addCriterion("timu_type_name <", value, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameLessThanOrEqualTo(String value) {
            addCriterion("timu_type_name <=", value, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameLike(String value) {
            addCriterion("timu_type_name like", value, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameNotLike(String value) {
            addCriterion("timu_type_name not like", value, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameIn(List<String> values) {
            addCriterion("timu_type_name in", values, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameNotIn(List<String> values) {
            addCriterion("timu_type_name not in", values, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameBetween(String value1, String value2) {
            addCriterion("timu_type_name between", value1, value2, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuTypeNameNotBetween(String value1, String value2) {
            addCriterion("timu_type_name not between", value1, value2, "timuTypeName");
            return (Criteria) this;
        }

        public Criteria andTimuNumIsNull() {
            addCriterion("timu_num is null");
            return (Criteria) this;
        }

        public Criteria andTimuNumIsNotNull() {
            addCriterion("timu_num is not null");
            return (Criteria) this;
        }

        public Criteria andTimuNumEqualTo(Integer value) {
            addCriterion("timu_num =", value, "timuNum");
            return (Criteria) this;
        }

        public Criteria andTimuNumNotEqualTo(Integer value) {
            addCriterion("timu_num <>", value, "timuNum");
            return (Criteria) this;
        }

        public Criteria andTimuNumGreaterThan(Integer value) {
            addCriterion("timu_num >", value, "timuNum");
            return (Criteria) this;
        }

        public Criteria andTimuNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("timu_num >=", value, "timuNum");
            return (Criteria) this;
        }

        public Criteria andTimuNumLessThan(Integer value) {
            addCriterion("timu_num <", value, "timuNum");
            return (Criteria) this;
        }

        public Criteria andTimuNumLessThanOrEqualTo(Integer value) {
            addCriterion("timu_num <=", value, "timuNum");
            return (Criteria) this;
        }

        public Criteria andTimuNumIn(List<Integer> values) {
            addCriterion("timu_num in", values, "timuNum");
            return (Criteria) this;
        }

        public Criteria andTimuNumNotIn(List<Integer> values) {
            addCriterion("timu_num not in", values, "timuNum");
            return (Criteria) this;
        }

        public Criteria andTimuNumBetween(Integer value1, Integer value2) {
            addCriterion("timu_num between", value1, value2, "timuNum");
            return (Criteria) this;
        }

        public Criteria andTimuNumNotBetween(Integer value1, Integer value2) {
            addCriterion("timu_num not between", value1, value2, "timuNum");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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