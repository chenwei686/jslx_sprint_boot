package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdStudentFreeConfigQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentFreeConfigQuery() {
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

        public Criteria andFreeMathNumberIsNull() {
            addCriterion("free_math_number is null");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberIsNotNull() {
            addCriterion("free_math_number is not null");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberEqualTo(Integer value) {
            addCriterion("free_math_number =", value, "freeMathNumber");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberNotEqualTo(Integer value) {
            addCriterion("free_math_number <>", value, "freeMathNumber");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberGreaterThan(Integer value) {
            addCriterion("free_math_number >", value, "freeMathNumber");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_math_number >=", value, "freeMathNumber");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberLessThan(Integer value) {
            addCriterion("free_math_number <", value, "freeMathNumber");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberLessThanOrEqualTo(Integer value) {
            addCriterion("free_math_number <=", value, "freeMathNumber");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberIn(List<Integer> values) {
            addCriterion("free_math_number in", values, "freeMathNumber");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberNotIn(List<Integer> values) {
            addCriterion("free_math_number not in", values, "freeMathNumber");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberBetween(Integer value1, Integer value2) {
            addCriterion("free_math_number between", value1, value2, "freeMathNumber");
            return (Criteria) this;
        }

        public Criteria andFreeMathNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("free_math_number not between", value1, value2, "freeMathNumber");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberIsNull() {
            addCriterion("free_physics_number is null");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberIsNotNull() {
            addCriterion("free_physics_number is not null");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberEqualTo(Integer value) {
            addCriterion("free_physics_number =", value, "freePhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberNotEqualTo(Integer value) {
            addCriterion("free_physics_number <>", value, "freePhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberGreaterThan(Integer value) {
            addCriterion("free_physics_number >", value, "freePhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_physics_number >=", value, "freePhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberLessThan(Integer value) {
            addCriterion("free_physics_number <", value, "freePhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("free_physics_number <=", value, "freePhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberIn(List<Integer> values) {
            addCriterion("free_physics_number in", values, "freePhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberNotIn(List<Integer> values) {
            addCriterion("free_physics_number not in", values, "freePhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberBetween(Integer value1, Integer value2) {
            addCriterion("free_physics_number between", value1, value2, "freePhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andFreePhysicsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("free_physics_number not between", value1, value2, "freePhysicsNumber");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberIsNull() {
            addCriterion("free_chemistry_number is null");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberIsNotNull() {
            addCriterion("free_chemistry_number is not null");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberEqualTo(Integer value) {
            addCriterion("free_chemistry_number =", value, "freeChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberNotEqualTo(Integer value) {
            addCriterion("free_chemistry_number <>", value, "freeChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberGreaterThan(Integer value) {
            addCriterion("free_chemistry_number >", value, "freeChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_chemistry_number >=", value, "freeChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberLessThan(Integer value) {
            addCriterion("free_chemistry_number <", value, "freeChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberLessThanOrEqualTo(Integer value) {
            addCriterion("free_chemistry_number <=", value, "freeChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberIn(List<Integer> values) {
            addCriterion("free_chemistry_number in", values, "freeChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberNotIn(List<Integer> values) {
            addCriterion("free_chemistry_number not in", values, "freeChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberBetween(Integer value1, Integer value2) {
            addCriterion("free_chemistry_number between", value1, value2, "freeChemistryNumber");
            return (Criteria) this;
        }

        public Criteria andFreeChemistryNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("free_chemistry_number not between", value1, value2, "freeChemistryNumber");
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