package com.sankuai.mall.finance.fcs.dao.po;

import java.util.ArrayList;
import java.util.List;

public class ProtocolCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ProtocolCriteria() {
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

        public Criteria andProtocolTypeIsNull() {
            addCriterion("protocol_type is null");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeIsNotNull() {
            addCriterion("protocol_type is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeEqualTo(Integer value) {
            addCriterion("protocol_type =", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotEqualTo(Integer value) {
            addCriterion("protocol_type <>", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeGreaterThan(Integer value) {
            addCriterion("protocol_type >", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("protocol_type >=", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeLessThan(Integer value) {
            addCriterion("protocol_type <", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeLessThanOrEqualTo(Integer value) {
            addCriterion("protocol_type <=", value, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeIn(List<Integer> values) {
            addCriterion("protocol_type in", values, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotIn(List<Integer> values) {
            addCriterion("protocol_type not in", values, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeBetween(Integer value1, Integer value2) {
            addCriterion("protocol_type between", value1, value2, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("protocol_type not between", value1, value2, "protocolType");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeIsNull() {
            addCriterion("protocol_item_type is null");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeIsNotNull() {
            addCriterion("protocol_item_type is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeEqualTo(Integer value) {
            addCriterion("protocol_item_type =", value, "protocolItemType");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeNotEqualTo(Integer value) {
            addCriterion("protocol_item_type <>", value, "protocolItemType");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeGreaterThan(Integer value) {
            addCriterion("protocol_item_type >", value, "protocolItemType");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("protocol_item_type >=", value, "protocolItemType");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeLessThan(Integer value) {
            addCriterion("protocol_item_type <", value, "protocolItemType");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("protocol_item_type <=", value, "protocolItemType");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeIn(List<Integer> values) {
            addCriterion("protocol_item_type in", values, "protocolItemType");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeNotIn(List<Integer> values) {
            addCriterion("protocol_item_type not in", values, "protocolItemType");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("protocol_item_type between", value1, value2, "protocolItemType");
            return (Criteria) this;
        }

        public Criteria andProtocolItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("protocol_item_type not between", value1, value2, "protocolItemType");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
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

        public Criteria andProtocolStatusIsNull() {
            addCriterion("protocol_status is null");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusIsNotNull() {
            addCriterion("protocol_status is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusEqualTo(Integer value) {
            addCriterion("protocol_status =", value, "protocolStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusNotEqualTo(Integer value) {
            addCriterion("protocol_status <>", value, "protocolStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusGreaterThan(Integer value) {
            addCriterion("protocol_status >", value, "protocolStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("protocol_status >=", value, "protocolStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusLessThan(Integer value) {
            addCriterion("protocol_status <", value, "protocolStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusLessThanOrEqualTo(Integer value) {
            addCriterion("protocol_status <=", value, "protocolStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusIn(List<Integer> values) {
            addCriterion("protocol_status in", values, "protocolStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusNotIn(List<Integer> values) {
            addCriterion("protocol_status not in", values, "protocolStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusBetween(Integer value1, Integer value2) {
            addCriterion("protocol_status between", value1, value2, "protocolStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("protocol_status not between", value1, value2, "protocolStatus");
            return (Criteria) this;
        }

        public Criteria andProtocolNoIsNull() {
            addCriterion("protocol_no is null");
            return (Criteria) this;
        }

        public Criteria andProtocolNoIsNotNull() {
            addCriterion("protocol_no is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolNoEqualTo(String value) {
            addCriterion("protocol_no =", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoNotEqualTo(String value) {
            addCriterion("protocol_no <>", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoGreaterThan(String value) {
            addCriterion("protocol_no >", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoGreaterThanOrEqualTo(String value) {
            addCriterion("protocol_no >=", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoLessThan(String value) {
            addCriterion("protocol_no <", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoLessThanOrEqualTo(String value) {
            addCriterion("protocol_no <=", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoLike(String value) {
            addCriterion("protocol_no like", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoNotLike(String value) {
            addCriterion("protocol_no not like", value, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoIn(List<String> values) {
            addCriterion("protocol_no in", values, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoNotIn(List<String> values) {
            addCriterion("protocol_no not in", values, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoBetween(String value1, String value2) {
            addCriterion("protocol_no between", value1, value2, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andProtocolNoNotBetween(String value1, String value2) {
            addCriterion("protocol_no not between", value1, value2, "protocolNo");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNull() {
            addCriterion("supplier_code is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNotNull() {
            addCriterion("supplier_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeEqualTo(String value) {
            addCriterion("supplier_code =", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotEqualTo(String value) {
            addCriterion("supplier_code <>", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThan(String value) {
            addCriterion("supplier_code >", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_code >=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThan(String value) {
            addCriterion("supplier_code <", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThanOrEqualTo(String value) {
            addCriterion("supplier_code <=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLike(String value) {
            addCriterion("supplier_code like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotLike(String value) {
            addCriterion("supplier_code not like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIn(List<String> values) {
            addCriterion("supplier_code in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotIn(List<String> values) {
            addCriterion("supplier_code not in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeBetween(String value1, String value2) {
            addCriterion("supplier_code between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotBetween(String value1, String value2) {
            addCriterion("supplier_code not between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoIsNull() {
            addCriterion("settlement_subject_no is null");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoIsNotNull() {
            addCriterion("settlement_subject_no is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoEqualTo(String value) {
            addCriterion("settlement_subject_no =", value, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoNotEqualTo(String value) {
            addCriterion("settlement_subject_no <>", value, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoGreaterThan(String value) {
            addCriterion("settlement_subject_no >", value, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_subject_no >=", value, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoLessThan(String value) {
            addCriterion("settlement_subject_no <", value, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoLessThanOrEqualTo(String value) {
            addCriterion("settlement_subject_no <=", value, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoLike(String value) {
            addCriterion("settlement_subject_no like", value, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoNotLike(String value) {
            addCriterion("settlement_subject_no not like", value, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoIn(List<String> values) {
            addCriterion("settlement_subject_no in", values, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoNotIn(List<String> values) {
            addCriterion("settlement_subject_no not in", values, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoBetween(String value1, String value2) {
            addCriterion("settlement_subject_no between", value1, value2, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNoNotBetween(String value1, String value2) {
            addCriterion("settlement_subject_no not between", value1, value2, "settlementSubjectNo");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameIsNull() {
            addCriterion("settlement_subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameIsNotNull() {
            addCriterion("settlement_subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameEqualTo(String value) {
            addCriterion("settlement_subject_name =", value, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameNotEqualTo(String value) {
            addCriterion("settlement_subject_name <>", value, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameGreaterThan(String value) {
            addCriterion("settlement_subject_name >", value, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_subject_name >=", value, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameLessThan(String value) {
            addCriterion("settlement_subject_name <", value, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("settlement_subject_name <=", value, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameLike(String value) {
            addCriterion("settlement_subject_name like", value, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameNotLike(String value) {
            addCriterion("settlement_subject_name not like", value, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameIn(List<String> values) {
            addCriterion("settlement_subject_name in", values, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameNotIn(List<String> values) {
            addCriterion("settlement_subject_name not in", values, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameBetween(String value1, String value2) {
            addCriterion("settlement_subject_name between", value1, value2, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andSettlementSubjectNameNotBetween(String value1, String value2) {
            addCriterion("settlement_subject_name not between", value1, value2, "settlementSubjectName");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdIsNull() {
            addCriterion("reconciliation_subject_id is null");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdIsNotNull() {
            addCriterion("reconciliation_subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdEqualTo(Integer value) {
            addCriterion("reconciliation_subject_id =", value, "reconciliationSubjectId");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdNotEqualTo(Integer value) {
            addCriterion("reconciliation_subject_id <>", value, "reconciliationSubjectId");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdGreaterThan(Integer value) {
            addCriterion("reconciliation_subject_id >", value, "reconciliationSubjectId");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reconciliation_subject_id >=", value, "reconciliationSubjectId");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdLessThan(Integer value) {
            addCriterion("reconciliation_subject_id <", value, "reconciliationSubjectId");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("reconciliation_subject_id <=", value, "reconciliationSubjectId");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdIn(List<Integer> values) {
            addCriterion("reconciliation_subject_id in", values, "reconciliationSubjectId");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdNotIn(List<Integer> values) {
            addCriterion("reconciliation_subject_id not in", values, "reconciliationSubjectId");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("reconciliation_subject_id between", value1, value2, "reconciliationSubjectId");
            return (Criteria) this;
        }

        public Criteria andReconciliationSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reconciliation_subject_id not between", value1, value2, "reconciliationSubjectId");
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