package com.sankuai.mall.finance.fcs.dao.po;

import java.util.ArrayList;
import java.util.List;

public class ProtocolPoiSubjectCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ProtocolPoiSubjectCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andProtocolIdIsNull() {
            addCriterion("protocol_id is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIdIsNotNull() {
            addCriterion("protocol_id is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolIdEqualTo(Long value) {
            addCriterion("protocol_id =", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotEqualTo(Long value) {
            addCriterion("protocol_id <>", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdGreaterThan(Long value) {
            addCriterion("protocol_id >", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdGreaterThanOrEqualTo(Long value) {
            addCriterion("protocol_id >=", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdLessThan(Long value) {
            addCriterion("protocol_id <", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdLessThanOrEqualTo(Long value) {
            addCriterion("protocol_id <=", value, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdIn(List<Long> values) {
            addCriterion("protocol_id in", values, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotIn(List<Long> values) {
            addCriterion("protocol_id not in", values, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdBetween(Long value1, Long value2) {
            addCriterion("protocol_id between", value1, value2, "protocolId");
            return (Criteria) this;
        }

        public Criteria andProtocolIdNotBetween(Long value1, Long value2) {
            addCriterion("protocol_id not between", value1, value2, "protocolId");
            return (Criteria) this;
        }

        public Criteria andPoiIdIsNull() {
            addCriterion("poi_id is null");
            return (Criteria) this;
        }

        public Criteria andPoiIdIsNotNull() {
            addCriterion("poi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoiIdEqualTo(Long value) {
            addCriterion("poi_id =", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotEqualTo(Long value) {
            addCriterion("poi_id <>", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThan(Long value) {
            addCriterion("poi_id >", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("poi_id >=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThan(Long value) {
            addCriterion("poi_id <", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThanOrEqualTo(Long value) {
            addCriterion("poi_id <=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdIn(List<Long> values) {
            addCriterion("poi_id in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotIn(List<Long> values) {
            addCriterion("poi_id not in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdBetween(Long value1, Long value2) {
            addCriterion("poi_id between", value1, value2, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotBetween(Long value1, Long value2) {
            addCriterion("poi_id not between", value1, value2, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiNameIsNull() {
            addCriterion("poi_name is null");
            return (Criteria) this;
        }

        public Criteria andPoiNameIsNotNull() {
            addCriterion("poi_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoiNameEqualTo(String value) {
            addCriterion("poi_name =", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameNotEqualTo(String value) {
            addCriterion("poi_name <>", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameGreaterThan(String value) {
            addCriterion("poi_name >", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameGreaterThanOrEqualTo(String value) {
            addCriterion("poi_name >=", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameLessThan(String value) {
            addCriterion("poi_name <", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameLessThanOrEqualTo(String value) {
            addCriterion("poi_name <=", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameLike(String value) {
            addCriterion("poi_name like", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameNotLike(String value) {
            addCriterion("poi_name not like", value, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameIn(List<String> values) {
            addCriterion("poi_name in", values, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameNotIn(List<String> values) {
            addCriterion("poi_name not in", values, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameBetween(String value1, String value2) {
            addCriterion("poi_name between", value1, value2, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiNameNotBetween(String value1, String value2) {
            addCriterion("poi_name not between", value1, value2, "poiName");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoIsNull() {
            addCriterion("poi_subject_no is null");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoIsNotNull() {
            addCriterion("poi_subject_no is not null");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoEqualTo(String value) {
            addCriterion("poi_subject_no =", value, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoNotEqualTo(String value) {
            addCriterion("poi_subject_no <>", value, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoGreaterThan(String value) {
            addCriterion("poi_subject_no >", value, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("poi_subject_no >=", value, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoLessThan(String value) {
            addCriterion("poi_subject_no <", value, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoLessThanOrEqualTo(String value) {
            addCriterion("poi_subject_no <=", value, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoLike(String value) {
            addCriterion("poi_subject_no like", value, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoNotLike(String value) {
            addCriterion("poi_subject_no not like", value, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoIn(List<String> values) {
            addCriterion("poi_subject_no in", values, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoNotIn(List<String> values) {
            addCriterion("poi_subject_no not in", values, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoBetween(String value1, String value2) {
            addCriterion("poi_subject_no between", value1, value2, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andPoiSubjectNoNotBetween(String value1, String value2) {
            addCriterion("poi_subject_no not between", value1, value2, "poiSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoIsNull() {
            addCriterion("protocol_subject_no is null");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoIsNotNull() {
            addCriterion("protocol_subject_no is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoEqualTo(String value) {
            addCriterion("protocol_subject_no =", value, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoNotEqualTo(String value) {
            addCriterion("protocol_subject_no <>", value, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoGreaterThan(String value) {
            addCriterion("protocol_subject_no >", value, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("protocol_subject_no >=", value, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoLessThan(String value) {
            addCriterion("protocol_subject_no <", value, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoLessThanOrEqualTo(String value) {
            addCriterion("protocol_subject_no <=", value, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoLike(String value) {
            addCriterion("protocol_subject_no like", value, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoNotLike(String value) {
            addCriterion("protocol_subject_no not like", value, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoIn(List<String> values) {
            addCriterion("protocol_subject_no in", values, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoNotIn(List<String> values) {
            addCriterion("protocol_subject_no not in", values, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoBetween(String value1, String value2) {
            addCriterion("protocol_subject_no between", value1, value2, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNoNotBetween(String value1, String value2) {
            addCriterion("protocol_subject_no not between", value1, value2, "protocolSubjectNo");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameIsNull() {
            addCriterion("protocol_subject_name is null");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameIsNotNull() {
            addCriterion("protocol_subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameEqualTo(String value) {
            addCriterion("protocol_subject_name =", value, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameNotEqualTo(String value) {
            addCriterion("protocol_subject_name <>", value, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameGreaterThan(String value) {
            addCriterion("protocol_subject_name >", value, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("protocol_subject_name >=", value, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameLessThan(String value) {
            addCriterion("protocol_subject_name <", value, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("protocol_subject_name <=", value, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameLike(String value) {
            addCriterion("protocol_subject_name like", value, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameNotLike(String value) {
            addCriterion("protocol_subject_name not like", value, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameIn(List<String> values) {
            addCriterion("protocol_subject_name in", values, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameNotIn(List<String> values) {
            addCriterion("protocol_subject_name not in", values, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameBetween(String value1, String value2) {
            addCriterion("protocol_subject_name between", value1, value2, "protocolSubjectName");
            return (Criteria) this;
        }

        public Criteria andProtocolSubjectNameNotBetween(String value1, String value2) {
            addCriterion("protocol_subject_name not between", value1, value2, "protocolSubjectName");
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

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Integer value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Integer value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Integer value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Integer value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Integer value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Integer> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Integer> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Integer value1, Integer value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Integer value1, Integer value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andCustomCriteria(String value) {
            addCriterion( "("+ value +")" );
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