package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FdTeacherDayReportDetailQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdTeacherDayReportDetailQuery() {
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

        public Criteria andKnowledgeNameIsNull() {
            addCriterion("knowledge_name is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameIsNotNull() {
            addCriterion("knowledge_name is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameEqualTo(String value) {
            addCriterion("knowledge_name =", value, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameNotEqualTo(String value) {
            addCriterion("knowledge_name <>", value, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameGreaterThan(String value) {
            addCriterion("knowledge_name >", value, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameGreaterThanOrEqualTo(String value) {
            addCriterion("knowledge_name >=", value, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameLessThan(String value) {
            addCriterion("knowledge_name <", value, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameLessThanOrEqualTo(String value) {
            addCriterion("knowledge_name <=", value, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameLike(String value) {
            addCriterion("knowledge_name like", value, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameNotLike(String value) {
            addCriterion("knowledge_name not like", value, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameIn(List<String> values) {
            addCriterion("knowledge_name in", values, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameNotIn(List<String> values) {
            addCriterion("knowledge_name not in", values, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameBetween(String value1, String value2) {
            addCriterion("knowledge_name between", value1, value2, "knowledgeName");
            return (Criteria) this;
        }

        public Criteria andKnowledgeNameNotBetween(String value1, String value2) {
            addCriterion("knowledge_name not between", value1, value2, "knowledgeName");
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

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
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

        public Criteria andLosepointIsNull() {
            addCriterion("losepoint is null");
            return (Criteria) this;
        }

        public Criteria andLosepointIsNotNull() {
            addCriterion("losepoint is not null");
            return (Criteria) this;
        }

        public Criteria andLosepointEqualTo(BigDecimal value) {
            addCriterion("losepoint =", value, "losepoint");
            return (Criteria) this;
        }

        public Criteria andLosepointNotEqualTo(BigDecimal value) {
            addCriterion("losepoint <>", value, "losepoint");
            return (Criteria) this;
        }

        public Criteria andLosepointGreaterThan(BigDecimal value) {
            addCriterion("losepoint >", value, "losepoint");
            return (Criteria) this;
        }

        public Criteria andLosepointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("losepoint >=", value, "losepoint");
            return (Criteria) this;
        }

        public Criteria andLosepointLessThan(BigDecimal value) {
            addCriterion("losepoint <", value, "losepoint");
            return (Criteria) this;
        }

        public Criteria andLosepointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("losepoint <=", value, "losepoint");
            return (Criteria) this;
        }

        public Criteria andLosepointIn(List<BigDecimal> values) {
            addCriterion("losepoint in", values, "losepoint");
            return (Criteria) this;
        }

        public Criteria andLosepointNotIn(List<BigDecimal> values) {
            addCriterion("losepoint not in", values, "losepoint");
            return (Criteria) this;
        }

        public Criteria andLosepointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("losepoint between", value1, value2, "losepoint");
            return (Criteria) this;
        }

        public Criteria andLosepointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("losepoint not between", value1, value2, "losepoint");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalIsNull() {
            addCriterion("losepoint_total is null");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalIsNotNull() {
            addCriterion("losepoint_total is not null");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalEqualTo(Integer value) {
            addCriterion("losepoint_total =", value, "losepointTotal");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalNotEqualTo(Integer value) {
            addCriterion("losepoint_total <>", value, "losepointTotal");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalGreaterThan(Integer value) {
            addCriterion("losepoint_total >", value, "losepointTotal");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("losepoint_total >=", value, "losepointTotal");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalLessThan(Integer value) {
            addCriterion("losepoint_total <", value, "losepointTotal");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalLessThanOrEqualTo(Integer value) {
            addCriterion("losepoint_total <=", value, "losepointTotal");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalIn(List<Integer> values) {
            addCriterion("losepoint_total in", values, "losepointTotal");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalNotIn(List<Integer> values) {
            addCriterion("losepoint_total not in", values, "losepointTotal");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalBetween(Integer value1, Integer value2) {
            addCriterion("losepoint_total between", value1, value2, "losepointTotal");
            return (Criteria) this;
        }

        public Criteria andLosepointTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("losepoint_total not between", value1, value2, "losepointTotal");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorIsNull() {
            addCriterion("losepoint_error is null");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorIsNotNull() {
            addCriterion("losepoint_error is not null");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorEqualTo(Integer value) {
            addCriterion("losepoint_error =", value, "losepointError");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorNotEqualTo(Integer value) {
            addCriterion("losepoint_error <>", value, "losepointError");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorGreaterThan(Integer value) {
            addCriterion("losepoint_error >", value, "losepointError");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorGreaterThanOrEqualTo(Integer value) {
            addCriterion("losepoint_error >=", value, "losepointError");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorLessThan(Integer value) {
            addCriterion("losepoint_error <", value, "losepointError");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorLessThanOrEqualTo(Integer value) {
            addCriterion("losepoint_error <=", value, "losepointError");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorIn(List<Integer> values) {
            addCriterion("losepoint_error in", values, "losepointError");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorNotIn(List<Integer> values) {
            addCriterion("losepoint_error not in", values, "losepointError");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorBetween(Integer value1, Integer value2) {
            addCriterion("losepoint_error between", value1, value2, "losepointError");
            return (Criteria) this;
        }

        public Criteria andLosepointErrorNotBetween(Integer value1, Integer value2) {
            addCriterion("losepoint_error not between", value1, value2, "losepointError");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
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