package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdBuildExampaperKnowledgeQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdBuildExampaperKnowledgeQuery() {
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

        public Criteria andBookSectionIdIsNull() {
            addCriterion("book_section_id is null");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdIsNotNull() {
            addCriterion("book_section_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdEqualTo(Integer value) {
            addCriterion("book_section_id =", value, "bookSectionId");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdNotEqualTo(Integer value) {
            addCriterion("book_section_id <>", value, "bookSectionId");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdGreaterThan(Integer value) {
            addCriterion("book_section_id >", value, "bookSectionId");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_section_id >=", value, "bookSectionId");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdLessThan(Integer value) {
            addCriterion("book_section_id <", value, "bookSectionId");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_section_id <=", value, "bookSectionId");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdIn(List<Integer> values) {
            addCriterion("book_section_id in", values, "bookSectionId");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdNotIn(List<Integer> values) {
            addCriterion("book_section_id not in", values, "bookSectionId");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("book_section_id between", value1, value2, "bookSectionId");
            return (Criteria) this;
        }

        public Criteria andBookSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_section_id not between", value1, value2, "bookSectionId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdIsNull() {
            addCriterion("knowledge_id is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdIsNotNull() {
            addCriterion("knowledge_id is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdEqualTo(Integer value) {
            addCriterion("knowledge_id =", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdNotEqualTo(Integer value) {
            addCriterion("knowledge_id <>", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdGreaterThan(Integer value) {
            addCriterion("knowledge_id >", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowledge_id >=", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdLessThan(Integer value) {
            addCriterion("knowledge_id <", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("knowledge_id <=", value, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdIn(List<Integer> values) {
            addCriterion("knowledge_id in", values, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdNotIn(List<Integer> values) {
            addCriterion("knowledge_id not in", values, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_id between", value1, value2, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_id not between", value1, value2, "knowledgeId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdIsNull() {
            addCriterion("build_exampaper_id is null");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdIsNotNull() {
            addCriterion("build_exampaper_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdEqualTo(Integer value) {
            addCriterion("build_exampaper_id =", value, "buildExampaperId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdNotEqualTo(Integer value) {
            addCriterion("build_exampaper_id <>", value, "buildExampaperId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdGreaterThan(Integer value) {
            addCriterion("build_exampaper_id >", value, "buildExampaperId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_exampaper_id >=", value, "buildExampaperId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdLessThan(Integer value) {
            addCriterion("build_exampaper_id <", value, "buildExampaperId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("build_exampaper_id <=", value, "buildExampaperId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdIn(List<Integer> values) {
            addCriterion("build_exampaper_id in", values, "buildExampaperId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdNotIn(List<Integer> values) {
            addCriterion("build_exampaper_id not in", values, "buildExampaperId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdBetween(Integer value1, Integer value2) {
            addCriterion("build_exampaper_id between", value1, value2, "buildExampaperId");
            return (Criteria) this;
        }

        public Criteria andBuildExampaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("build_exampaper_id not between", value1, value2, "buildExampaperId");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdIsNull() {
            addCriterion("book_volume_id is null");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdIsNotNull() {
            addCriterion("book_volume_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdEqualTo(Integer value) {
            addCriterion("book_volume_id =", value, "bookVolumeId");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdNotEqualTo(Integer value) {
            addCriterion("book_volume_id <>", value, "bookVolumeId");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdGreaterThan(Integer value) {
            addCriterion("book_volume_id >", value, "bookVolumeId");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_volume_id >=", value, "bookVolumeId");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdLessThan(Integer value) {
            addCriterion("book_volume_id <", value, "bookVolumeId");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_volume_id <=", value, "bookVolumeId");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdIn(List<Integer> values) {
            addCriterion("book_volume_id in", values, "bookVolumeId");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdNotIn(List<Integer> values) {
            addCriterion("book_volume_id not in", values, "bookVolumeId");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdBetween(Integer value1, Integer value2) {
            addCriterion("book_volume_id between", value1, value2, "bookVolumeId");
            return (Criteria) this;
        }

        public Criteria andBookVolumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_volume_id not between", value1, value2, "bookVolumeId");
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