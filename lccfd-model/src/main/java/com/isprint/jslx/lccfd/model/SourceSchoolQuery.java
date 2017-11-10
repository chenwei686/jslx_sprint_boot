package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SourceSchoolQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SourceSchoolQuery() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXxmcIsNull() {
            addCriterion("XXMC is null");
            return (Criteria) this;
        }

        public Criteria andXxmcIsNotNull() {
            addCriterion("XXMC is not null");
            return (Criteria) this;
        }

        public Criteria andXxmcEqualTo(String value) {
            addCriterion("XXMC =", value, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcNotEqualTo(String value) {
            addCriterion("XXMC <>", value, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcGreaterThan(String value) {
            addCriterion("XXMC >", value, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcGreaterThanOrEqualTo(String value) {
            addCriterion("XXMC >=", value, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcLessThan(String value) {
            addCriterion("XXMC <", value, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcLessThanOrEqualTo(String value) {
            addCriterion("XXMC <=", value, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcLike(String value) {
            addCriterion("XXMC like", value, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcNotLike(String value) {
            addCriterion("XXMC not like", value, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcIn(List<String> values) {
            addCriterion("XXMC in", values, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcNotIn(List<String> values) {
            addCriterion("XXMC not in", values, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcBetween(String value1, String value2) {
            addCriterion("XXMC between", value1, value2, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxmcNotBetween(String value1, String value2) {
            addCriterion("XXMC not between", value1, value2, "xxmc");
            return (Criteria) this;
        }

        public Criteria andXxbsmIsNull() {
            addCriterion("XXBSM is null");
            return (Criteria) this;
        }

        public Criteria andXxbsmIsNotNull() {
            addCriterion("XXBSM is not null");
            return (Criteria) this;
        }

        public Criteria andXxbsmEqualTo(String value) {
            addCriterion("XXBSM =", value, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmNotEqualTo(String value) {
            addCriterion("XXBSM <>", value, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmGreaterThan(String value) {
            addCriterion("XXBSM >", value, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmGreaterThanOrEqualTo(String value) {
            addCriterion("XXBSM >=", value, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmLessThan(String value) {
            addCriterion("XXBSM <", value, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmLessThanOrEqualTo(String value) {
            addCriterion("XXBSM <=", value, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmLike(String value) {
            addCriterion("XXBSM like", value, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmNotLike(String value) {
            addCriterion("XXBSM not like", value, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmIn(List<String> values) {
            addCriterion("XXBSM in", values, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmNotIn(List<String> values) {
            addCriterion("XXBSM not in", values, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmBetween(String value1, String value2) {
            addCriterion("XXBSM between", value1, value2, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxbsmNotBetween(String value1, String value2) {
            addCriterion("XXBSM not between", value1, value2, "xxbsm");
            return (Criteria) this;
        }

        public Criteria andXxywmcIsNull() {
            addCriterion("XXYWMC is null");
            return (Criteria) this;
        }

        public Criteria andXxywmcIsNotNull() {
            addCriterion("XXYWMC is not null");
            return (Criteria) this;
        }

        public Criteria andXxywmcEqualTo(String value) {
            addCriterion("XXYWMC =", value, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcNotEqualTo(String value) {
            addCriterion("XXYWMC <>", value, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcGreaterThan(String value) {
            addCriterion("XXYWMC >", value, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcGreaterThanOrEqualTo(String value) {
            addCriterion("XXYWMC >=", value, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcLessThan(String value) {
            addCriterion("XXYWMC <", value, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcLessThanOrEqualTo(String value) {
            addCriterion("XXYWMC <=", value, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcLike(String value) {
            addCriterion("XXYWMC like", value, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcNotLike(String value) {
            addCriterion("XXYWMC not like", value, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcIn(List<String> values) {
            addCriterion("XXYWMC in", values, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcNotIn(List<String> values) {
            addCriterion("XXYWMC not in", values, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcBetween(String value1, String value2) {
            addCriterion("XXYWMC between", value1, value2, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxywmcNotBetween(String value1, String value2) {
            addCriterion("XXYWMC not between", value1, value2, "xxywmc");
            return (Criteria) this;
        }

        public Criteria andXxdzIsNull() {
            addCriterion("XXDZ is null");
            return (Criteria) this;
        }

        public Criteria andXxdzIsNotNull() {
            addCriterion("XXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzEqualTo(String value) {
            addCriterion("XXDZ =", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzNotEqualTo(String value) {
            addCriterion("XXDZ <>", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzGreaterThan(String value) {
            addCriterion("XXDZ >", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZ >=", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzLessThan(String value) {
            addCriterion("XXDZ <", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzLessThanOrEqualTo(String value) {
            addCriterion("XXDZ <=", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzLike(String value) {
            addCriterion("XXDZ like", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzNotLike(String value) {
            addCriterion("XXDZ not like", value, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzIn(List<String> values) {
            addCriterion("XXDZ in", values, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzNotIn(List<String> values) {
            addCriterion("XXDZ not in", values, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzBetween(String value1, String value2) {
            addCriterion("XXDZ between", value1, value2, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzNotBetween(String value1, String value2) {
            addCriterion("XXDZ not between", value1, value2, "xxdz");
            return (Criteria) this;
        }

        public Criteria andXxdzdmIsNull() {
            addCriterion("XXDZDM is null");
            return (Criteria) this;
        }

        public Criteria andXxdzdmIsNotNull() {
            addCriterion("XXDZDM is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzdmEqualTo(String value) {
            addCriterion("XXDZDM =", value, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmNotEqualTo(String value) {
            addCriterion("XXDZDM <>", value, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmGreaterThan(String value) {
            addCriterion("XXDZDM >", value, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZDM >=", value, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmLessThan(String value) {
            addCriterion("XXDZDM <", value, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmLessThanOrEqualTo(String value) {
            addCriterion("XXDZDM <=", value, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmLike(String value) {
            addCriterion("XXDZDM like", value, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmNotLike(String value) {
            addCriterion("XXDZDM not like", value, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmIn(List<String> values) {
            addCriterion("XXDZDM in", values, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmNotIn(List<String> values) {
            addCriterion("XXDZDM not in", values, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmBetween(String value1, String value2) {
            addCriterion("XXDZDM between", value1, value2, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxdzdmNotBetween(String value1, String value2) {
            addCriterion("XXDZDM not between", value1, value2, "xxdzdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmIsNull() {
            addCriterion("XXZDCXLXDM is null");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmIsNotNull() {
            addCriterion("XXZDCXLXDM is not null");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmEqualTo(String value) {
            addCriterion("XXZDCXLXDM =", value, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmNotEqualTo(String value) {
            addCriterion("XXZDCXLXDM <>", value, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmGreaterThan(String value) {
            addCriterion("XXZDCXLXDM >", value, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("XXZDCXLXDM >=", value, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmLessThan(String value) {
            addCriterion("XXZDCXLXDM <", value, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmLessThanOrEqualTo(String value) {
            addCriterion("XXZDCXLXDM <=", value, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmLike(String value) {
            addCriterion("XXZDCXLXDM like", value, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmNotLike(String value) {
            addCriterion("XXZDCXLXDM not like", value, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmIn(List<String> values) {
            addCriterion("XXZDCXLXDM in", values, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmNotIn(List<String> values) {
            addCriterion("XXZDCXLXDM not in", values, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmBetween(String value1, String value2) {
            addCriterion("XXZDCXLXDM between", value1, value2, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxzdcxlxdmNotBetween(String value1, String value2) {
            addCriterion("XXZDCXLXDM not between", value1, value2, "xxzdcxlxdm");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcIsNull() {
            addCriterion("SDGLJYXZMC is null");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcIsNotNull() {
            addCriterion("SDGLJYXZMC is not null");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcEqualTo(String value) {
            addCriterion("SDGLJYXZMC =", value, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcNotEqualTo(String value) {
            addCriterion("SDGLJYXZMC <>", value, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcGreaterThan(String value) {
            addCriterion("SDGLJYXZMC >", value, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcGreaterThanOrEqualTo(String value) {
            addCriterion("SDGLJYXZMC >=", value, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcLessThan(String value) {
            addCriterion("SDGLJYXZMC <", value, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcLessThanOrEqualTo(String value) {
            addCriterion("SDGLJYXZMC <=", value, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcLike(String value) {
            addCriterion("SDGLJYXZMC like", value, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcNotLike(String value) {
            addCriterion("SDGLJYXZMC not like", value, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcIn(List<String> values) {
            addCriterion("SDGLJYXZMC in", values, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcNotIn(List<String> values) {
            addCriterion("SDGLJYXZMC not in", values, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcBetween(String value1, String value2) {
            addCriterion("SDGLJYXZMC between", value1, value2, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andSdgljyxzmcNotBetween(String value1, String value2) {
            addCriterion("SDGLJYXZMC not between", value1, value2, "sdgljyxzmc");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmIsNull() {
            addCriterion("XXBXLXDM is null");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmIsNotNull() {
            addCriterion("XXBXLXDM is not null");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmEqualTo(String value) {
            addCriterion("XXBXLXDM =", value, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmNotEqualTo(String value) {
            addCriterion("XXBXLXDM <>", value, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmGreaterThan(String value) {
            addCriterion("XXBXLXDM >", value, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("XXBXLXDM >=", value, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmLessThan(String value) {
            addCriterion("XXBXLXDM <", value, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmLessThanOrEqualTo(String value) {
            addCriterion("XXBXLXDM <=", value, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmLike(String value) {
            addCriterion("XXBXLXDM like", value, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmNotLike(String value) {
            addCriterion("XXBXLXDM not like", value, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmIn(List<String> values) {
            addCriterion("XXBXLXDM in", values, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmNotIn(List<String> values) {
            addCriterion("XXBXLXDM not in", values, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmBetween(String value1, String value2) {
            addCriterion("XXBXLXDM between", value1, value2, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxbxlxdmNotBetween(String value1, String value2) {
            addCriterion("XXBXLXDM not between", value1, value2, "xxbxlxdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmIsNull() {
            addCriterion("XXJBZDM is null");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmIsNotNull() {
            addCriterion("XXJBZDM is not null");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmEqualTo(String value) {
            addCriterion("XXJBZDM =", value, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmNotEqualTo(String value) {
            addCriterion("XXJBZDM <>", value, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmGreaterThan(String value) {
            addCriterion("XXJBZDM >", value, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmGreaterThanOrEqualTo(String value) {
            addCriterion("XXJBZDM >=", value, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmLessThan(String value) {
            addCriterion("XXJBZDM <", value, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmLessThanOrEqualTo(String value) {
            addCriterion("XXJBZDM <=", value, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmLike(String value) {
            addCriterion("XXJBZDM like", value, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmNotLike(String value) {
            addCriterion("XXJBZDM not like", value, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmIn(List<String> values) {
            addCriterion("XXJBZDM in", values, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmNotIn(List<String> values) {
            addCriterion("XXJBZDM not in", values, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmBetween(String value1, String value2) {
            addCriterion("XXJBZDM between", value1, value2, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andXxjbzdmNotBetween(String value1, String value2) {
            addCriterion("XXJBZDM not between", value1, value2, "xxjbzdm");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNull() {
            addCriterion("YZBM is null");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNotNull() {
            addCriterion("YZBM is not null");
            return (Criteria) this;
        }

        public Criteria andYzbmEqualTo(String value) {
            addCriterion("YZBM =", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotEqualTo(String value) {
            addCriterion("YZBM <>", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThan(String value) {
            addCriterion("YZBM >", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThanOrEqualTo(String value) {
            addCriterion("YZBM >=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThan(String value) {
            addCriterion("YZBM <", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThanOrEqualTo(String value) {
            addCriterion("YZBM <=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLike(String value) {
            addCriterion("YZBM like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotLike(String value) {
            addCriterion("YZBM not like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmIn(List<String> values) {
            addCriterion("YZBM in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotIn(List<String> values) {
            addCriterion("YZBM not in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmBetween(String value1, String value2) {
            addCriterion("YZBM between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotBetween(String value1, String value2) {
            addCriterion("YZBM not between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andWzzydzIsNull() {
            addCriterion("WZZYDZ is null");
            return (Criteria) this;
        }

        public Criteria andWzzydzIsNotNull() {
            addCriterion("WZZYDZ is not null");
            return (Criteria) this;
        }

        public Criteria andWzzydzEqualTo(String value) {
            addCriterion("WZZYDZ =", value, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzNotEqualTo(String value) {
            addCriterion("WZZYDZ <>", value, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzGreaterThan(String value) {
            addCriterion("WZZYDZ >", value, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzGreaterThanOrEqualTo(String value) {
            addCriterion("WZZYDZ >=", value, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzLessThan(String value) {
            addCriterion("WZZYDZ <", value, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzLessThanOrEqualTo(String value) {
            addCriterion("WZZYDZ <=", value, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzLike(String value) {
            addCriterion("WZZYDZ like", value, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzNotLike(String value) {
            addCriterion("WZZYDZ not like", value, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzIn(List<String> values) {
            addCriterion("WZZYDZ in", values, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzNotIn(List<String> values) {
            addCriterion("WZZYDZ not in", values, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzBetween(String value1, String value2) {
            addCriterion("WZZYDZ between", value1, value2, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andWzzydzNotBetween(String value1, String value2) {
            addCriterion("WZZYDZ not between", value1, value2, "wzzydz");
            return (Criteria) this;
        }

        public Criteria andDwdzxxIsNull() {
            addCriterion("DWDZXX is null");
            return (Criteria) this;
        }

        public Criteria andDwdzxxIsNotNull() {
            addCriterion("DWDZXX is not null");
            return (Criteria) this;
        }

        public Criteria andDwdzxxEqualTo(String value) {
            addCriterion("DWDZXX =", value, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxNotEqualTo(String value) {
            addCriterion("DWDZXX <>", value, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxGreaterThan(String value) {
            addCriterion("DWDZXX >", value, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxGreaterThanOrEqualTo(String value) {
            addCriterion("DWDZXX >=", value, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxLessThan(String value) {
            addCriterion("DWDZXX <", value, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxLessThanOrEqualTo(String value) {
            addCriterion("DWDZXX <=", value, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxLike(String value) {
            addCriterion("DWDZXX like", value, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxNotLike(String value) {
            addCriterion("DWDZXX not like", value, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxIn(List<String> values) {
            addCriterion("DWDZXX in", values, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxNotIn(List<String> values) {
            addCriterion("DWDZXX not in", values, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxBetween(String value1, String value2) {
            addCriterion("DWDZXX between", value1, value2, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andDwdzxxNotBetween(String value1, String value2) {
            addCriterion("DWDZXX not between", value1, value2, "dwdzxx");
            return (Criteria) this;
        }

        public Criteria andXxxzIsNull() {
            addCriterion("XXXZ is null");
            return (Criteria) this;
        }

        public Criteria andXxxzIsNotNull() {
            addCriterion("XXXZ is not null");
            return (Criteria) this;
        }

        public Criteria andXxxzEqualTo(String value) {
            addCriterion("XXXZ =", value, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzNotEqualTo(String value) {
            addCriterion("XXXZ <>", value, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzGreaterThan(String value) {
            addCriterion("XXXZ >", value, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzGreaterThanOrEqualTo(String value) {
            addCriterion("XXXZ >=", value, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzLessThan(String value) {
            addCriterion("XXXZ <", value, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzLessThanOrEqualTo(String value) {
            addCriterion("XXXZ <=", value, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzLike(String value) {
            addCriterion("XXXZ like", value, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzNotLike(String value) {
            addCriterion("XXXZ not like", value, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzIn(List<String> values) {
            addCriterion("XXXZ in", values, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzNotIn(List<String> values) {
            addCriterion("XXXZ not in", values, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzBetween(String value1, String value2) {
            addCriterion("XXXZ between", value1, value2, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxxzNotBetween(String value1, String value2) {
            addCriterion("XXXZ not between", value1, value2, "xxxz");
            return (Criteria) this;
        }

        public Criteria andXxrxnlIsNull() {
            addCriterion("XXRXNL is null");
            return (Criteria) this;
        }

        public Criteria andXxrxnlIsNotNull() {
            addCriterion("XXRXNL is not null");
            return (Criteria) this;
        }

        public Criteria andXxrxnlEqualTo(String value) {
            addCriterion("XXRXNL =", value, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlNotEqualTo(String value) {
            addCriterion("XXRXNL <>", value, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlGreaterThan(String value) {
            addCriterion("XXRXNL >", value, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlGreaterThanOrEqualTo(String value) {
            addCriterion("XXRXNL >=", value, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlLessThan(String value) {
            addCriterion("XXRXNL <", value, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlLessThanOrEqualTo(String value) {
            addCriterion("XXRXNL <=", value, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlLike(String value) {
            addCriterion("XXRXNL like", value, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlNotLike(String value) {
            addCriterion("XXRXNL not like", value, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlIn(List<String> values) {
            addCriterion("XXRXNL in", values, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlNotIn(List<String> values) {
            addCriterion("XXRXNL not in", values, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlBetween(String value1, String value2) {
            addCriterion("XXRXNL between", value1, value2, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andXxrxnlNotBetween(String value1, String value2) {
            addCriterion("XXRXNL not between", value1, value2, "xxrxnl");
            return (Criteria) this;
        }

        public Criteria andCzxzIsNull() {
            addCriterion("CZXZ is null");
            return (Criteria) this;
        }

        public Criteria andCzxzIsNotNull() {
            addCriterion("CZXZ is not null");
            return (Criteria) this;
        }

        public Criteria andCzxzEqualTo(String value) {
            addCriterion("CZXZ =", value, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzNotEqualTo(String value) {
            addCriterion("CZXZ <>", value, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzGreaterThan(String value) {
            addCriterion("CZXZ >", value, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzGreaterThanOrEqualTo(String value) {
            addCriterion("CZXZ >=", value, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzLessThan(String value) {
            addCriterion("CZXZ <", value, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzLessThanOrEqualTo(String value) {
            addCriterion("CZXZ <=", value, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzLike(String value) {
            addCriterion("CZXZ like", value, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzNotLike(String value) {
            addCriterion("CZXZ not like", value, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzIn(List<String> values) {
            addCriterion("CZXZ in", values, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzNotIn(List<String> values) {
            addCriterion("CZXZ not in", values, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzBetween(String value1, String value2) {
            addCriterion("CZXZ between", value1, value2, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzxzNotBetween(String value1, String value2) {
            addCriterion("CZXZ not between", value1, value2, "czxz");
            return (Criteria) this;
        }

        public Criteria andCzrxnlIsNull() {
            addCriterion("CZRXNL is null");
            return (Criteria) this;
        }

        public Criteria andCzrxnlIsNotNull() {
            addCriterion("CZRXNL is not null");
            return (Criteria) this;
        }

        public Criteria andCzrxnlEqualTo(String value) {
            addCriterion("CZRXNL =", value, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlNotEqualTo(String value) {
            addCriterion("CZRXNL <>", value, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlGreaterThan(String value) {
            addCriterion("CZRXNL >", value, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlGreaterThanOrEqualTo(String value) {
            addCriterion("CZRXNL >=", value, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlLessThan(String value) {
            addCriterion("CZRXNL <", value, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlLessThanOrEqualTo(String value) {
            addCriterion("CZRXNL <=", value, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlLike(String value) {
            addCriterion("CZRXNL like", value, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlNotLike(String value) {
            addCriterion("CZRXNL not like", value, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlIn(List<String> values) {
            addCriterion("CZRXNL in", values, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlNotIn(List<String> values) {
            addCriterion("CZRXNL not in", values, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlBetween(String value1, String value2) {
            addCriterion("CZRXNL between", value1, value2, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andCzrxnlNotBetween(String value1, String value2) {
            addCriterion("CZRXNL not between", value1, value2, "czrxnl");
            return (Criteria) this;
        }

        public Criteria andGzxzIsNull() {
            addCriterion("GZXZ is null");
            return (Criteria) this;
        }

        public Criteria andGzxzIsNotNull() {
            addCriterion("GZXZ is not null");
            return (Criteria) this;
        }

        public Criteria andGzxzEqualTo(String value) {
            addCriterion("GZXZ =", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzNotEqualTo(String value) {
            addCriterion("GZXZ <>", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzGreaterThan(String value) {
            addCriterion("GZXZ >", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzGreaterThanOrEqualTo(String value) {
            addCriterion("GZXZ >=", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzLessThan(String value) {
            addCriterion("GZXZ <", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzLessThanOrEqualTo(String value) {
            addCriterion("GZXZ <=", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzLike(String value) {
            addCriterion("GZXZ like", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzNotLike(String value) {
            addCriterion("GZXZ not like", value, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzIn(List<String> values) {
            addCriterion("GZXZ in", values, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzNotIn(List<String> values) {
            addCriterion("GZXZ not in", values, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzBetween(String value1, String value2) {
            addCriterion("GZXZ between", value1, value2, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzxzNotBetween(String value1, String value2) {
            addCriterion("GZXZ not between", value1, value2, "gzxz");
            return (Criteria) this;
        }

        public Criteria andGzrxnlIsNull() {
            addCriterion("GZRXNL is null");
            return (Criteria) this;
        }

        public Criteria andGzrxnlIsNotNull() {
            addCriterion("GZRXNL is not null");
            return (Criteria) this;
        }

        public Criteria andGzrxnlEqualTo(String value) {
            addCriterion("GZRXNL =", value, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlNotEqualTo(String value) {
            addCriterion("GZRXNL <>", value, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlGreaterThan(String value) {
            addCriterion("GZRXNL >", value, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlGreaterThanOrEqualTo(String value) {
            addCriterion("GZRXNL >=", value, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlLessThan(String value) {
            addCriterion("GZRXNL <", value, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlLessThanOrEqualTo(String value) {
            addCriterion("GZRXNL <=", value, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlLike(String value) {
            addCriterion("GZRXNL like", value, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlNotLike(String value) {
            addCriterion("GZRXNL not like", value, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlIn(List<String> values) {
            addCriterion("GZRXNL in", values, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlNotIn(List<String> values) {
            addCriterion("GZRXNL not in", values, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlBetween(String value1, String value2) {
            addCriterion("GZRXNL between", value1, value2, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andGzrxnlNotBetween(String value1, String value2) {
            addCriterion("GZRXNL not between", value1, value2, "gzrxnl");
            return (Criteria) this;
        }

        public Criteria andTbryxIsNull() {
            addCriterion("TBRYX is null");
            return (Criteria) this;
        }

        public Criteria andTbryxIsNotNull() {
            addCriterion("TBRYX is not null");
            return (Criteria) this;
        }

        public Criteria andTbryxEqualTo(String value) {
            addCriterion("TBRYX =", value, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxNotEqualTo(String value) {
            addCriterion("TBRYX <>", value, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxGreaterThan(String value) {
            addCriterion("TBRYX >", value, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxGreaterThanOrEqualTo(String value) {
            addCriterion("TBRYX >=", value, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxLessThan(String value) {
            addCriterion("TBRYX <", value, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxLessThanOrEqualTo(String value) {
            addCriterion("TBRYX <=", value, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxLike(String value) {
            addCriterion("TBRYX like", value, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxNotLike(String value) {
            addCriterion("TBRYX not like", value, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxIn(List<String> values) {
            addCriterion("TBRYX in", values, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxNotIn(List<String> values) {
            addCriterion("TBRYX not in", values, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxBetween(String value1, String value2) {
            addCriterion("TBRYX between", value1, value2, "tbryx");
            return (Criteria) this;
        }

        public Criteria andTbryxNotBetween(String value1, String value2) {
            addCriterion("TBRYX not between", value1, value2, "tbryx");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNull() {
            addCriterion("ZZJGDM is null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNotNull() {
            addCriterion("ZZJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmEqualTo(String value) {
            addCriterion("ZZJGDM =", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotEqualTo(String value) {
            addCriterion("ZZJGDM <>", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThan(String value) {
            addCriterion("ZZJGDM >", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("ZZJGDM >=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThan(String value) {
            addCriterion("ZZJGDM <", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThanOrEqualTo(String value) {
            addCriterion("ZZJGDM <=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLike(String value) {
            addCriterion("ZZJGDM like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotLike(String value) {
            addCriterion("ZZJGDM not like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIn(List<String> values) {
            addCriterion("ZZJGDM in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotIn(List<String> values) {
            addCriterion("ZZJGDM not in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmBetween(String value1, String value2) {
            addCriterion("ZZJGDM between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotBetween(String value1, String value2) {
            addCriterion("ZZJGDM not between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andJxnfIsNull() {
            addCriterion("JXNF is null");
            return (Criteria) this;
        }

        public Criteria andJxnfIsNotNull() {
            addCriterion("JXNF is not null");
            return (Criteria) this;
        }

        public Criteria andJxnfEqualTo(String value) {
            addCriterion("JXNF =", value, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfNotEqualTo(String value) {
            addCriterion("JXNF <>", value, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfGreaterThan(String value) {
            addCriterion("JXNF >", value, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfGreaterThanOrEqualTo(String value) {
            addCriterion("JXNF >=", value, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfLessThan(String value) {
            addCriterion("JXNF <", value, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfLessThanOrEqualTo(String value) {
            addCriterion("JXNF <=", value, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfLike(String value) {
            addCriterion("JXNF like", value, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfNotLike(String value) {
            addCriterion("JXNF not like", value, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfIn(List<String> values) {
            addCriterion("JXNF in", values, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfNotIn(List<String> values) {
            addCriterion("JXNF not in", values, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfBetween(String value1, String value2) {
            addCriterion("JXNF between", value1, value2, "jxnf");
            return (Criteria) this;
        }

        public Criteria andJxnfNotBetween(String value1, String value2) {
            addCriterion("JXNF not between", value1, value2, "jxnf");
            return (Criteria) this;
        }

        public Criteria andFrdjzhIsNull() {
            addCriterion("FRDJZH is null");
            return (Criteria) this;
        }

        public Criteria andFrdjzhIsNotNull() {
            addCriterion("FRDJZH is not null");
            return (Criteria) this;
        }

        public Criteria andFrdjzhEqualTo(String value) {
            addCriterion("FRDJZH =", value, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhNotEqualTo(String value) {
            addCriterion("FRDJZH <>", value, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhGreaterThan(String value) {
            addCriterion("FRDJZH >", value, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhGreaterThanOrEqualTo(String value) {
            addCriterion("FRDJZH >=", value, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhLessThan(String value) {
            addCriterion("FRDJZH <", value, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhLessThanOrEqualTo(String value) {
            addCriterion("FRDJZH <=", value, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhLike(String value) {
            addCriterion("FRDJZH like", value, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhNotLike(String value) {
            addCriterion("FRDJZH not like", value, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhIn(List<String> values) {
            addCriterion("FRDJZH in", values, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhNotIn(List<String> values) {
            addCriterion("FRDJZH not in", values, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhBetween(String value1, String value2) {
            addCriterion("FRDJZH between", value1, value2, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andFrdjzhNotBetween(String value1, String value2) {
            addCriterion("FRDJZH not between", value1, value2, "frdjzh");
            return (Criteria) this;
        }

        public Criteria andXqrIsNull() {
            addCriterion("XQR is null");
            return (Criteria) this;
        }

        public Criteria andXqrIsNotNull() {
            addCriterion("XQR is not null");
            return (Criteria) this;
        }

        public Criteria andXqrEqualTo(String value) {
            addCriterion("XQR =", value, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrNotEqualTo(String value) {
            addCriterion("XQR <>", value, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrGreaterThan(String value) {
            addCriterion("XQR >", value, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrGreaterThanOrEqualTo(String value) {
            addCriterion("XQR >=", value, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrLessThan(String value) {
            addCriterion("XQR <", value, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrLessThanOrEqualTo(String value) {
            addCriterion("XQR <=", value, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrLike(String value) {
            addCriterion("XQR like", value, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrNotLike(String value) {
            addCriterion("XQR not like", value, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrIn(List<String> values) {
            addCriterion("XQR in", values, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrNotIn(List<String> values) {
            addCriterion("XQR not in", values, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrBetween(String value1, String value2) {
            addCriterion("XQR between", value1, value2, "xqr");
            return (Criteria) this;
        }

        public Criteria andXqrNotBetween(String value1, String value2) {
            addCriterion("XQR not between", value1, value2, "xqr");
            return (Criteria) this;
        }

        public Criteria andXxtdcqIsNull() {
            addCriterion("XXTDCQ is null");
            return (Criteria) this;
        }

        public Criteria andXxtdcqIsNotNull() {
            addCriterion("XXTDCQ is not null");
            return (Criteria) this;
        }

        public Criteria andXxtdcqEqualTo(String value) {
            addCriterion("XXTDCQ =", value, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqNotEqualTo(String value) {
            addCriterion("XXTDCQ <>", value, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqGreaterThan(String value) {
            addCriterion("XXTDCQ >", value, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqGreaterThanOrEqualTo(String value) {
            addCriterion("XXTDCQ >=", value, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqLessThan(String value) {
            addCriterion("XXTDCQ <", value, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqLessThanOrEqualTo(String value) {
            addCriterion("XXTDCQ <=", value, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqLike(String value) {
            addCriterion("XXTDCQ like", value, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqNotLike(String value) {
            addCriterion("XXTDCQ not like", value, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqIn(List<String> values) {
            addCriterion("XXTDCQ in", values, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqNotIn(List<String> values) {
            addCriterion("XXTDCQ not in", values, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqBetween(String value1, String value2) {
            addCriterion("XXTDCQ between", value1, value2, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andXxtdcqNotBetween(String value1, String value2) {
            addCriterion("XXTDCQ not between", value1, value2, "xxtdcq");
            return (Criteria) this;
        }

        public Criteria andTdzhIsNull() {
            addCriterion("TDZH is null");
            return (Criteria) this;
        }

        public Criteria andTdzhIsNotNull() {
            addCriterion("TDZH is not null");
            return (Criteria) this;
        }

        public Criteria andTdzhEqualTo(String value) {
            addCriterion("TDZH =", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhNotEqualTo(String value) {
            addCriterion("TDZH <>", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhGreaterThan(String value) {
            addCriterion("TDZH >", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhGreaterThanOrEqualTo(String value) {
            addCriterion("TDZH >=", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhLessThan(String value) {
            addCriterion("TDZH <", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhLessThanOrEqualTo(String value) {
            addCriterion("TDZH <=", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhLike(String value) {
            addCriterion("TDZH like", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhNotLike(String value) {
            addCriterion("TDZH not like", value, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhIn(List<String> values) {
            addCriterion("TDZH in", values, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhNotIn(List<String> values) {
            addCriterion("TDZH not in", values, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhBetween(String value1, String value2) {
            addCriterion("TDZH between", value1, value2, "tdzh");
            return (Criteria) this;
        }

        public Criteria andTdzhNotBetween(String value1, String value2) {
            addCriterion("TDZH not between", value1, value2, "tdzh");
            return (Criteria) this;
        }

        public Criteria andJszxsdmIsNull() {
            addCriterion("JSZXSDM is null");
            return (Criteria) this;
        }

        public Criteria andJszxsdmIsNotNull() {
            addCriterion("JSZXSDM is not null");
            return (Criteria) this;
        }

        public Criteria andJszxsdmEqualTo(String value) {
            addCriterion("JSZXSDM =", value, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmNotEqualTo(String value) {
            addCriterion("JSZXSDM <>", value, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmGreaterThan(String value) {
            addCriterion("JSZXSDM >", value, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmGreaterThanOrEqualTo(String value) {
            addCriterion("JSZXSDM >=", value, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmLessThan(String value) {
            addCriterion("JSZXSDM <", value, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmLessThanOrEqualTo(String value) {
            addCriterion("JSZXSDM <=", value, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmLike(String value) {
            addCriterion("JSZXSDM like", value, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmNotLike(String value) {
            addCriterion("JSZXSDM not like", value, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmIn(List<String> values) {
            addCriterion("JSZXSDM in", values, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmNotIn(List<String> values) {
            addCriterion("JSZXSDM not in", values, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmBetween(String value1, String value2) {
            addCriterion("JSZXSDM between", value1, value2, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andJszxsdmNotBetween(String value1, String value2) {
            addCriterion("JSZXSDM not between", value1, value2, "jszxsdm");
            return (Criteria) this;
        }

        public Criteria andHbgdIsNull() {
            addCriterion("HBGD is null");
            return (Criteria) this;
        }

        public Criteria andHbgdIsNotNull() {
            addCriterion("HBGD is not null");
            return (Criteria) this;
        }

        public Criteria andHbgdEqualTo(String value) {
            addCriterion("HBGD =", value, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdNotEqualTo(String value) {
            addCriterion("HBGD <>", value, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdGreaterThan(String value) {
            addCriterion("HBGD >", value, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdGreaterThanOrEqualTo(String value) {
            addCriterion("HBGD >=", value, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdLessThan(String value) {
            addCriterion("HBGD <", value, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdLessThanOrEqualTo(String value) {
            addCriterion("HBGD <=", value, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdLike(String value) {
            addCriterion("HBGD like", value, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdNotLike(String value) {
            addCriterion("HBGD not like", value, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdIn(List<String> values) {
            addCriterion("HBGD in", values, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdNotIn(List<String> values) {
            addCriterion("HBGD not in", values, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdBetween(String value1, String value2) {
            addCriterion("HBGD between", value1, value2, "hbgd");
            return (Criteria) this;
        }

        public Criteria andHbgdNotBetween(String value1, String value2) {
            addCriterion("HBGD not between", value1, value2, "hbgd");
            return (Criteria) this;
        }

        public Criteria andXxjdIsNull() {
            addCriterion("XXJD is null");
            return (Criteria) this;
        }

        public Criteria andXxjdIsNotNull() {
            addCriterion("XXJD is not null");
            return (Criteria) this;
        }

        public Criteria andXxjdEqualTo(String value) {
            addCriterion("XXJD =", value, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdNotEqualTo(String value) {
            addCriterion("XXJD <>", value, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdGreaterThan(String value) {
            addCriterion("XXJD >", value, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdGreaterThanOrEqualTo(String value) {
            addCriterion("XXJD >=", value, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdLessThan(String value) {
            addCriterion("XXJD <", value, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdLessThanOrEqualTo(String value) {
            addCriterion("XXJD <=", value, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdLike(String value) {
            addCriterion("XXJD like", value, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdNotLike(String value) {
            addCriterion("XXJD not like", value, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdIn(List<String> values) {
            addCriterion("XXJD in", values, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdNotIn(List<String> values) {
            addCriterion("XXJD not in", values, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdBetween(String value1, String value2) {
            addCriterion("XXJD between", value1, value2, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxjdNotBetween(String value1, String value2) {
            addCriterion("XXJD not between", value1, value2, "xxjd");
            return (Criteria) this;
        }

        public Criteria andXxwdIsNull() {
            addCriterion("XXWD is null");
            return (Criteria) this;
        }

        public Criteria andXxwdIsNotNull() {
            addCriterion("XXWD is not null");
            return (Criteria) this;
        }

        public Criteria andXxwdEqualTo(String value) {
            addCriterion("XXWD =", value, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdNotEqualTo(String value) {
            addCriterion("XXWD <>", value, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdGreaterThan(String value) {
            addCriterion("XXWD >", value, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdGreaterThanOrEqualTo(String value) {
            addCriterion("XXWD >=", value, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdLessThan(String value) {
            addCriterion("XXWD <", value, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdLessThanOrEqualTo(String value) {
            addCriterion("XXWD <=", value, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdLike(String value) {
            addCriterion("XXWD like", value, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdNotLike(String value) {
            addCriterion("XXWD not like", value, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdIn(List<String> values) {
            addCriterion("XXWD in", values, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdNotIn(List<String> values) {
            addCriterion("XXWD not in", values, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdBetween(String value1, String value2) {
            addCriterion("XXWD between", value1, value2, "xxwd");
            return (Criteria) this;
        }

        public Criteria andXxwdNotBetween(String value1, String value2) {
            addCriterion("XXWD not between", value1, value2, "xxwd");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmIsNull() {
            addCriterion("SZDJJSXDM is null");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmIsNotNull() {
            addCriterion("SZDJJSXDM is not null");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmEqualTo(String value) {
            addCriterion("SZDJJSXDM =", value, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmNotEqualTo(String value) {
            addCriterion("SZDJJSXDM <>", value, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmGreaterThan(String value) {
            addCriterion("SZDJJSXDM >", value, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmGreaterThanOrEqualTo(String value) {
            addCriterion("SZDJJSXDM >=", value, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmLessThan(String value) {
            addCriterion("SZDJJSXDM <", value, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmLessThanOrEqualTo(String value) {
            addCriterion("SZDJJSXDM <=", value, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmLike(String value) {
            addCriterion("SZDJJSXDM like", value, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmNotLike(String value) {
            addCriterion("SZDJJSXDM not like", value, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmIn(List<String> values) {
            addCriterion("SZDJJSXDM in", values, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmNotIn(List<String> values) {
            addCriterion("SZDJJSXDM not in", values, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmBetween(String value1, String value2) {
            addCriterion("SZDJJSXDM between", value1, value2, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdjjsxdmNotBetween(String value1, String value2) {
            addCriterion("SZDJJSXDM not between", value1, value2, "szdjjsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmIsNull() {
            addCriterion("SZDMZSXDM is null");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmIsNotNull() {
            addCriterion("SZDMZSXDM is not null");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmEqualTo(String value) {
            addCriterion("SZDMZSXDM =", value, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmNotEqualTo(String value) {
            addCriterion("SZDMZSXDM <>", value, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmGreaterThan(String value) {
            addCriterion("SZDMZSXDM >", value, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmGreaterThanOrEqualTo(String value) {
            addCriterion("SZDMZSXDM >=", value, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmLessThan(String value) {
            addCriterion("SZDMZSXDM <", value, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmLessThanOrEqualTo(String value) {
            addCriterion("SZDMZSXDM <=", value, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmLike(String value) {
            addCriterion("SZDMZSXDM like", value, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmNotLike(String value) {
            addCriterion("SZDMZSXDM not like", value, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmIn(List<String> values) {
            addCriterion("SZDMZSXDM in", values, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmNotIn(List<String> values) {
            addCriterion("SZDMZSXDM not in", values, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmBetween(String value1, String value2) {
            addCriterion("SZDMZSXDM between", value1, value2, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzdmzsxdmNotBetween(String value1, String value2) {
            addCriterion("SZDMZSXDM not between", value1, value2, "szdmzsxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmIsNull() {
            addCriterion("SZDDYSXDM is null");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmIsNotNull() {
            addCriterion("SZDDYSXDM is not null");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmEqualTo(String value) {
            addCriterion("SZDDYSXDM =", value, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmNotEqualTo(String value) {
            addCriterion("SZDDYSXDM <>", value, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmGreaterThan(String value) {
            addCriterion("SZDDYSXDM >", value, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmGreaterThanOrEqualTo(String value) {
            addCriterion("SZDDYSXDM >=", value, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmLessThan(String value) {
            addCriterion("SZDDYSXDM <", value, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmLessThanOrEqualTo(String value) {
            addCriterion("SZDDYSXDM <=", value, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmLike(String value) {
            addCriterion("SZDDYSXDM like", value, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmNotLike(String value) {
            addCriterion("SZDDYSXDM not like", value, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmIn(List<String> values) {
            addCriterion("SZDDYSXDM in", values, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmNotIn(List<String> values) {
            addCriterion("SZDDYSXDM not in", values, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmBetween(String value1, String value2) {
            addCriterion("SZDDYSXDM between", value1, value2, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andSzddysxdmNotBetween(String value1, String value2) {
            addCriterion("SZDDYSXDM not between", value1, value2, "szddysxdm");
            return (Criteria) this;
        }

        public Criteria andZsbjIsNull() {
            addCriterion("ZSBJ is null");
            return (Criteria) this;
        }

        public Criteria andZsbjIsNotNull() {
            addCriterion("ZSBJ is not null");
            return (Criteria) this;
        }

        public Criteria andZsbjEqualTo(String value) {
            addCriterion("ZSBJ =", value, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjNotEqualTo(String value) {
            addCriterion("ZSBJ <>", value, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjGreaterThan(String value) {
            addCriterion("ZSBJ >", value, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjGreaterThanOrEqualTo(String value) {
            addCriterion("ZSBJ >=", value, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjLessThan(String value) {
            addCriterion("ZSBJ <", value, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjLessThanOrEqualTo(String value) {
            addCriterion("ZSBJ <=", value, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjLike(String value) {
            addCriterion("ZSBJ like", value, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjNotLike(String value) {
            addCriterion("ZSBJ not like", value, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjIn(List<String> values) {
            addCriterion("ZSBJ in", values, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjNotIn(List<String> values) {
            addCriterion("ZSBJ not in", values, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjBetween(String value1, String value2) {
            addCriterion("ZSBJ between", value1, value2, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZsbjNotBetween(String value1, String value2) {
            addCriterion("ZSBJ not between", value1, value2, "zsbj");
            return (Criteria) this;
        }

        public Criteria andZjxyydmIsNull() {
            addCriterion("ZJXYYDM is null");
            return (Criteria) this;
        }

        public Criteria andZjxyydmIsNotNull() {
            addCriterion("ZJXYYDM is not null");
            return (Criteria) this;
        }

        public Criteria andZjxyydmEqualTo(String value) {
            addCriterion("ZJXYYDM =", value, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmNotEqualTo(String value) {
            addCriterion("ZJXYYDM <>", value, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmGreaterThan(String value) {
            addCriterion("ZJXYYDM >", value, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmGreaterThanOrEqualTo(String value) {
            addCriterion("ZJXYYDM >=", value, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmLessThan(String value) {
            addCriterion("ZJXYYDM <", value, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmLessThanOrEqualTo(String value) {
            addCriterion("ZJXYYDM <=", value, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmLike(String value) {
            addCriterion("ZJXYYDM like", value, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmNotLike(String value) {
            addCriterion("ZJXYYDM not like", value, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmIn(List<String> values) {
            addCriterion("ZJXYYDM in", values, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmNotIn(List<String> values) {
            addCriterion("ZJXYYDM not in", values, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmBetween(String value1, String value2) {
            addCriterion("ZJXYYDM between", value1, value2, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andZjxyydmNotBetween(String value1, String value2) {
            addCriterion("ZJXYYDM not between", value1, value2, "zjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmIsNull() {
            addCriterion("FZJXYYDM is null");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmIsNotNull() {
            addCriterion("FZJXYYDM is not null");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmEqualTo(String value) {
            addCriterion("FZJXYYDM =", value, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmNotEqualTo(String value) {
            addCriterion("FZJXYYDM <>", value, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmGreaterThan(String value) {
            addCriterion("FZJXYYDM >", value, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmGreaterThanOrEqualTo(String value) {
            addCriterion("FZJXYYDM >=", value, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmLessThan(String value) {
            addCriterion("FZJXYYDM <", value, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmLessThanOrEqualTo(String value) {
            addCriterion("FZJXYYDM <=", value, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmLike(String value) {
            addCriterion("FZJXYYDM like", value, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmNotLike(String value) {
            addCriterion("FZJXYYDM not like", value, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmIn(List<String> values) {
            addCriterion("FZJXYYDM in", values, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmNotIn(List<String> values) {
            addCriterion("FZJXYYDM not in", values, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmBetween(String value1, String value2) {
            addCriterion("FZJXYYDM between", value1, value2, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andFzjxyydmNotBetween(String value1, String value2) {
            addCriterion("FZJXYYDM not between", value1, value2, "fzjxyydm");
            return (Criteria) this;
        }

        public Criteria andLsygIsNull() {
            addCriterion("LSYG is null");
            return (Criteria) this;
        }

        public Criteria andLsygIsNotNull() {
            addCriterion("LSYG is not null");
            return (Criteria) this;
        }

        public Criteria andLsygEqualTo(String value) {
            addCriterion("LSYG =", value, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygNotEqualTo(String value) {
            addCriterion("LSYG <>", value, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygGreaterThan(String value) {
            addCriterion("LSYG >", value, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygGreaterThanOrEqualTo(String value) {
            addCriterion("LSYG >=", value, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygLessThan(String value) {
            addCriterion("LSYG <", value, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygLessThanOrEqualTo(String value) {
            addCriterion("LSYG <=", value, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygLike(String value) {
            addCriterion("LSYG like", value, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygNotLike(String value) {
            addCriterion("LSYG not like", value, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygIn(List<String> values) {
            addCriterion("LSYG in", values, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygNotIn(List<String> values) {
            addCriterion("LSYG not in", values, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygBetween(String value1, String value2) {
            addCriterion("LSYG between", value1, value2, "lsyg");
            return (Criteria) this;
        }

        public Criteria andLsygNotBetween(String value1, String value2) {
            addCriterion("LSYG not between", value1, value2, "lsyg");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmIsNull() {
            addCriterion("DLSZSSMZXXDM is null");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmIsNotNull() {
            addCriterion("DLSZSSMZXXDM is not null");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmEqualTo(String value) {
            addCriterion("DLSZSSMZXXDM =", value, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmNotEqualTo(String value) {
            addCriterion("DLSZSSMZXXDM <>", value, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmGreaterThan(String value) {
            addCriterion("DLSZSSMZXXDM >", value, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmGreaterThanOrEqualTo(String value) {
            addCriterion("DLSZSSMZXXDM >=", value, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmLessThan(String value) {
            addCriterion("DLSZSSMZXXDM <", value, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmLessThanOrEqualTo(String value) {
            addCriterion("DLSZSSMZXXDM <=", value, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmLike(String value) {
            addCriterion("DLSZSSMZXXDM like", value, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmNotLike(String value) {
            addCriterion("DLSZSSMZXXDM not like", value, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmIn(List<String> values) {
            addCriterion("DLSZSSMZXXDM in", values, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmNotIn(List<String> values) {
            addCriterion("DLSZSSMZXXDM not in", values, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmBetween(String value1, String value2) {
            addCriterion("DLSZSSMZXXDM between", value1, value2, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andDlszssmzxxdmNotBetween(String value1, String value2) {
            addCriterion("DLSZSSMZXXDM not between", value1, value2, "dlszssmzxxdm");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsIsNull() {
            addCriterion("FSGXXXBS is null");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsIsNotNull() {
            addCriterion("FSGXXXBS is not null");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsEqualTo(String value) {
            addCriterion("FSGXXXBS =", value, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsNotEqualTo(String value) {
            addCriterion("FSGXXXBS <>", value, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsGreaterThan(String value) {
            addCriterion("FSGXXXBS >", value, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsGreaterThanOrEqualTo(String value) {
            addCriterion("FSGXXXBS >=", value, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsLessThan(String value) {
            addCriterion("FSGXXXBS <", value, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsLessThanOrEqualTo(String value) {
            addCriterion("FSGXXXBS <=", value, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsLike(String value) {
            addCriterion("FSGXXXBS like", value, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsNotLike(String value) {
            addCriterion("FSGXXXBS not like", value, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsIn(List<String> values) {
            addCriterion("FSGXXXBS in", values, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsNotIn(List<String> values) {
            addCriterion("FSGXXXBS not in", values, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsBetween(String value1, String value2) {
            addCriterion("FSGXXXBS between", value1, value2, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andFsgxxxbsNotBetween(String value1, String value2) {
            addCriterion("FSGXXXBS not between", value1, value2, "fsgxxxbs");
            return (Criteria) this;
        }

        public Criteria andSszgdwmIsNull() {
            addCriterion("SSZGDWM is null");
            return (Criteria) this;
        }

        public Criteria andSszgdwmIsNotNull() {
            addCriterion("SSZGDWM is not null");
            return (Criteria) this;
        }

        public Criteria andSszgdwmEqualTo(String value) {
            addCriterion("SSZGDWM =", value, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmNotEqualTo(String value) {
            addCriterion("SSZGDWM <>", value, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmGreaterThan(String value) {
            addCriterion("SSZGDWM >", value, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmGreaterThanOrEqualTo(String value) {
            addCriterion("SSZGDWM >=", value, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmLessThan(String value) {
            addCriterion("SSZGDWM <", value, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmLessThanOrEqualTo(String value) {
            addCriterion("SSZGDWM <=", value, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmLike(String value) {
            addCriterion("SSZGDWM like", value, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmNotLike(String value) {
            addCriterion("SSZGDWM not like", value, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmIn(List<String> values) {
            addCriterion("SSZGDWM in", values, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmNotIn(List<String> values) {
            addCriterion("SSZGDWM not in", values, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmBetween(String value1, String value2) {
            addCriterion("SSZGDWM between", value1, value2, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andSszgdwmNotBetween(String value1, String value2) {
            addCriterion("SSZGDWM not between", value1, value2, "sszgdwm");
            return (Criteria) this;
        }

        public Criteria andFddbrIsNull() {
            addCriterion("FDDBR is null");
            return (Criteria) this;
        }

        public Criteria andFddbrIsNotNull() {
            addCriterion("FDDBR is not null");
            return (Criteria) this;
        }

        public Criteria andFddbrEqualTo(String value) {
            addCriterion("FDDBR =", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotEqualTo(String value) {
            addCriterion("FDDBR <>", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrGreaterThan(String value) {
            addCriterion("FDDBR >", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrGreaterThanOrEqualTo(String value) {
            addCriterion("FDDBR >=", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLessThan(String value) {
            addCriterion("FDDBR <", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLessThanOrEqualTo(String value) {
            addCriterion("FDDBR <=", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLike(String value) {
            addCriterion("FDDBR like", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotLike(String value) {
            addCriterion("FDDBR not like", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrIn(List<String> values) {
            addCriterion("FDDBR in", values, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotIn(List<String> values) {
            addCriterion("FDDBR not in", values, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrBetween(String value1, String value2) {
            addCriterion("FDDBR between", value1, value2, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotBetween(String value1, String value2) {
            addCriterion("FDDBR not between", value1, value2, "fddbr");
            return (Criteria) this;
        }

        public Criteria andXymymIsNull() {
            addCriterion("XYMYM is null");
            return (Criteria) this;
        }

        public Criteria andXymymIsNotNull() {
            addCriterion("XYMYM is not null");
            return (Criteria) this;
        }

        public Criteria andXymymEqualTo(String value) {
            addCriterion("XYMYM =", value, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymNotEqualTo(String value) {
            addCriterion("XYMYM <>", value, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymGreaterThan(String value) {
            addCriterion("XYMYM >", value, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymGreaterThanOrEqualTo(String value) {
            addCriterion("XYMYM >=", value, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymLessThan(String value) {
            addCriterion("XYMYM <", value, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymLessThanOrEqualTo(String value) {
            addCriterion("XYMYM <=", value, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymLike(String value) {
            addCriterion("XYMYM like", value, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymNotLike(String value) {
            addCriterion("XYMYM not like", value, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymIn(List<String> values) {
            addCriterion("XYMYM in", values, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymNotIn(List<String> values) {
            addCriterion("XYMYM not in", values, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymBetween(String value1, String value2) {
            addCriterion("XYMYM between", value1, value2, "xymym");
            return (Criteria) this;
        }

        public Criteria andXymymNotBetween(String value1, String value2) {
            addCriterion("XYMYM not between", value1, value2, "xymym");
            return (Criteria) this;
        }

        public Criteria andXxztmIsNull() {
            addCriterion("XXZTM is null");
            return (Criteria) this;
        }

        public Criteria andXxztmIsNotNull() {
            addCriterion("XXZTM is not null");
            return (Criteria) this;
        }

        public Criteria andXxztmEqualTo(String value) {
            addCriterion("XXZTM =", value, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmNotEqualTo(String value) {
            addCriterion("XXZTM <>", value, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmGreaterThan(String value) {
            addCriterion("XXZTM >", value, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmGreaterThanOrEqualTo(String value) {
            addCriterion("XXZTM >=", value, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmLessThan(String value) {
            addCriterion("XXZTM <", value, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmLessThanOrEqualTo(String value) {
            addCriterion("XXZTM <=", value, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmLike(String value) {
            addCriterion("XXZTM like", value, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmNotLike(String value) {
            addCriterion("XXZTM not like", value, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmIn(List<String> values) {
            addCriterion("XXZTM in", values, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmNotIn(List<String> values) {
            addCriterion("XXZTM not in", values, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmBetween(String value1, String value2) {
            addCriterion("XXZTM between", value1, value2, "xxztm");
            return (Criteria) this;
        }

        public Criteria andXxztmNotBetween(String value1, String value2) {
            addCriterion("XXZTM not between", value1, value2, "xxztm");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzIsNull() {
            addCriterion("SFZXXBZ is null");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzIsNotNull() {
            addCriterion("SFZXXBZ is not null");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzEqualTo(String value) {
            addCriterion("SFZXXBZ =", value, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzNotEqualTo(String value) {
            addCriterion("SFZXXBZ <>", value, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzGreaterThan(String value) {
            addCriterion("SFZXXBZ >", value, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzGreaterThanOrEqualTo(String value) {
            addCriterion("SFZXXBZ >=", value, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzLessThan(String value) {
            addCriterion("SFZXXBZ <", value, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzLessThanOrEqualTo(String value) {
            addCriterion("SFZXXBZ <=", value, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzLike(String value) {
            addCriterion("SFZXXBZ like", value, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzNotLike(String value) {
            addCriterion("SFZXXBZ not like", value, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzIn(List<String> values) {
            addCriterion("SFZXXBZ in", values, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzNotIn(List<String> values) {
            addCriterion("SFZXXBZ not in", values, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzBetween(String value1, String value2) {
            addCriterion("SFZXXBZ between", value1, value2, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSfzxxbzNotBetween(String value1, String value2) {
            addCriterion("SFZXXBZ not between", value1, value2, "sfzxxbz");
            return (Criteria) this;
        }

        public Criteria andSszxxIdIsNull() {
            addCriterion("SSZXX_ID is null");
            return (Criteria) this;
        }

        public Criteria andSszxxIdIsNotNull() {
            addCriterion("SSZXX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSszxxIdEqualTo(Integer value) {
            addCriterion("SSZXX_ID =", value, "sszxxId");
            return (Criteria) this;
        }

        public Criteria andSszxxIdNotEqualTo(Integer value) {
            addCriterion("SSZXX_ID <>", value, "sszxxId");
            return (Criteria) this;
        }

        public Criteria andSszxxIdGreaterThan(Integer value) {
            addCriterion("SSZXX_ID >", value, "sszxxId");
            return (Criteria) this;
        }

        public Criteria andSszxxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SSZXX_ID >=", value, "sszxxId");
            return (Criteria) this;
        }

        public Criteria andSszxxIdLessThan(Integer value) {
            addCriterion("SSZXX_ID <", value, "sszxxId");
            return (Criteria) this;
        }

        public Criteria andSszxxIdLessThanOrEqualTo(Integer value) {
            addCriterion("SSZXX_ID <=", value, "sszxxId");
            return (Criteria) this;
        }

        public Criteria andSszxxIdIn(List<Integer> values) {
            addCriterion("SSZXX_ID in", values, "sszxxId");
            return (Criteria) this;
        }

        public Criteria andSszxxIdNotIn(List<Integer> values) {
            addCriterion("SSZXX_ID not in", values, "sszxxId");
            return (Criteria) this;
        }

        public Criteria andSszxxIdBetween(Integer value1, Integer value2) {
            addCriterion("SSZXX_ID between", value1, value2, "sszxxId");
            return (Criteria) this;
        }

        public Criteria andSszxxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SSZXX_ID not between", value1, value2, "sszxxId");
            return (Criteria) this;
        }

        public Criteria andSjlybzmIsNull() {
            addCriterion("SJLYBZM is null");
            return (Criteria) this;
        }

        public Criteria andSjlybzmIsNotNull() {
            addCriterion("SJLYBZM is not null");
            return (Criteria) this;
        }

        public Criteria andSjlybzmEqualTo(String value) {
            addCriterion("SJLYBZM =", value, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmNotEqualTo(String value) {
            addCriterion("SJLYBZM <>", value, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmGreaterThan(String value) {
            addCriterion("SJLYBZM >", value, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmGreaterThanOrEqualTo(String value) {
            addCriterion("SJLYBZM >=", value, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmLessThan(String value) {
            addCriterion("SJLYBZM <", value, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmLessThanOrEqualTo(String value) {
            addCriterion("SJLYBZM <=", value, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmLike(String value) {
            addCriterion("SJLYBZM like", value, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmNotLike(String value) {
            addCriterion("SJLYBZM not like", value, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmIn(List<String> values) {
            addCriterion("SJLYBZM in", values, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmNotIn(List<String> values) {
            addCriterion("SJLYBZM not in", values, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmBetween(String value1, String value2) {
            addCriterion("SJLYBZM between", value1, value2, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andSjlybzmNotBetween(String value1, String value2) {
            addCriterion("SJLYBZM not between", value1, value2, "sjlybzm");
            return (Criteria) this;
        }

        public Criteria andLrrIsNull() {
            addCriterion("LRR is null");
            return (Criteria) this;
        }

        public Criteria andLrrIsNotNull() {
            addCriterion("LRR is not null");
            return (Criteria) this;
        }

        public Criteria andLrrEqualTo(String value) {
            addCriterion("LRR =", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrNotEqualTo(String value) {
            addCriterion("LRR <>", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrGreaterThan(String value) {
            addCriterion("LRR >", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrGreaterThanOrEqualTo(String value) {
            addCriterion("LRR >=", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrLessThan(String value) {
            addCriterion("LRR <", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrLessThanOrEqualTo(String value) {
            addCriterion("LRR <=", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrLike(String value) {
            addCriterion("LRR like", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrNotLike(String value) {
            addCriterion("LRR not like", value, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrIn(List<String> values) {
            addCriterion("LRR in", values, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrNotIn(List<String> values) {
            addCriterion("LRR not in", values, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrBetween(String value1, String value2) {
            addCriterion("LRR between", value1, value2, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrrNotBetween(String value1, String value2) {
            addCriterion("LRR not between", value1, value2, "lrr");
            return (Criteria) this;
        }

        public Criteria andLrsjIsNull() {
            addCriterion("LRSJ is null");
            return (Criteria) this;
        }

        public Criteria andLrsjIsNotNull() {
            addCriterion("LRSJ is not null");
            return (Criteria) this;
        }

        public Criteria andLrsjEqualTo(String value) {
            addCriterion("LRSJ =", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotEqualTo(String value) {
            addCriterion("LRSJ <>", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjGreaterThan(String value) {
            addCriterion("LRSJ >", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjGreaterThanOrEqualTo(String value) {
            addCriterion("LRSJ >=", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjLessThan(String value) {
            addCriterion("LRSJ <", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjLessThanOrEqualTo(String value) {
            addCriterion("LRSJ <=", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjLike(String value) {
            addCriterion("LRSJ like", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotLike(String value) {
            addCriterion("LRSJ not like", value, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjIn(List<String> values) {
            addCriterion("LRSJ in", values, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotIn(List<String> values) {
            addCriterion("LRSJ not in", values, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjBetween(String value1, String value2) {
            addCriterion("LRSJ between", value1, value2, "lrsj");
            return (Criteria) this;
        }

        public Criteria andLrsjNotBetween(String value1, String value2) {
            addCriterion("LRSJ not between", value1, value2, "lrsj");
            return (Criteria) this;
        }

        public Criteria andGxrIsNull() {
            addCriterion("GXR is null");
            return (Criteria) this;
        }

        public Criteria andGxrIsNotNull() {
            addCriterion("GXR is not null");
            return (Criteria) this;
        }

        public Criteria andGxrEqualTo(String value) {
            addCriterion("GXR =", value, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrNotEqualTo(String value) {
            addCriterion("GXR <>", value, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrGreaterThan(String value) {
            addCriterion("GXR >", value, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrGreaterThanOrEqualTo(String value) {
            addCriterion("GXR >=", value, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrLessThan(String value) {
            addCriterion("GXR <", value, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrLessThanOrEqualTo(String value) {
            addCriterion("GXR <=", value, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrLike(String value) {
            addCriterion("GXR like", value, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrNotLike(String value) {
            addCriterion("GXR not like", value, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrIn(List<String> values) {
            addCriterion("GXR in", values, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrNotIn(List<String> values) {
            addCriterion("GXR not in", values, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrBetween(String value1, String value2) {
            addCriterion("GXR between", value1, value2, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxrNotBetween(String value1, String value2) {
            addCriterion("GXR not between", value1, value2, "gxr");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNull() {
            addCriterion("GXSJ is null");
            return (Criteria) this;
        }

        public Criteria andGxsjIsNotNull() {
            addCriterion("GXSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGxsjEqualTo(Date value) {
            addCriterion("GXSJ =", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotEqualTo(Date value) {
            addCriterion("GXSJ <>", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThan(Date value) {
            addCriterion("GXSJ >", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjGreaterThanOrEqualTo(Date value) {
            addCriterion("GXSJ >=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThan(Date value) {
            addCriterion("GXSJ <", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjLessThanOrEqualTo(Date value) {
            addCriterion("GXSJ <=", value, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjIn(List<Date> values) {
            addCriterion("GXSJ in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotIn(List<Date> values) {
            addCriterion("GXSJ not in", values, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjBetween(Date value1, Date value2) {
            addCriterion("GXSJ between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andGxsjNotBetween(Date value1, Date value2) {
            addCriterion("GXSJ not between", value1, value2, "gxsj");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsIsNull() {
            addCriterion("school_degree_ids is null");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsIsNotNull() {
            addCriterion("school_degree_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsEqualTo(String value) {
            addCriterion("school_degree_ids =", value, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsNotEqualTo(String value) {
            addCriterion("school_degree_ids <>", value, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsGreaterThan(String value) {
            addCriterion("school_degree_ids >", value, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("school_degree_ids >=", value, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsLessThan(String value) {
            addCriterion("school_degree_ids <", value, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsLessThanOrEqualTo(String value) {
            addCriterion("school_degree_ids <=", value, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsLike(String value) {
            addCriterion("school_degree_ids like", value, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsNotLike(String value) {
            addCriterion("school_degree_ids not like", value, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsIn(List<String> values) {
            addCriterion("school_degree_ids in", values, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsNotIn(List<String> values) {
            addCriterion("school_degree_ids not in", values, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsBetween(String value1, String value2) {
            addCriterion("school_degree_ids between", value1, value2, "schoolDegreeIds");
            return (Criteria) this;
        }

        public Criteria andSchoolDegreeIdsNotBetween(String value1, String value2) {
            addCriterion("school_degree_ids not between", value1, value2, "schoolDegreeIds");
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