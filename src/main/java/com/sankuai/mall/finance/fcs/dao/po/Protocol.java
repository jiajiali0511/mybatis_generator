package com.sankuai.mall.finance.fcs.dao.po;

public class Protocol {
    private Long id;

    private Integer protocolType;

    private Integer protocolItemType;

    private Long supplierId;

    private String supplierName;

    private Long createTime;

    private Long updateTime;

    private String createBy;

    private String updateBy;

    private Integer valid;

    private Integer protocolStatus;

    private String protocolNo;

    private String supplierCode;

    private String settlementSubjectNo;

    private String settlementSubjectName;

    private Integer reconciliationSubjectId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
    }

    public Integer getProtocolItemType() {
        return protocolItemType;
    }

    public void setProtocolItemType(Integer protocolItemType) {
        this.protocolItemType = protocolItemType;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getProtocolStatus() {
        return protocolStatus;
    }

    public void setProtocolStatus(Integer protocolStatus) {
        this.protocolStatus = protocolStatus;
    }

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo == null ? null : protocolNo.trim();
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public String getSettlementSubjectNo() {
        return settlementSubjectNo;
    }

    public void setSettlementSubjectNo(String settlementSubjectNo) {
        this.settlementSubjectNo = settlementSubjectNo == null ? null : settlementSubjectNo.trim();
    }

    public String getSettlementSubjectName() {
        return settlementSubjectName;
    }

    public void setSettlementSubjectName(String settlementSubjectName) {
        this.settlementSubjectName = settlementSubjectName == null ? null : settlementSubjectName.trim();
    }

    public Integer getReconciliationSubjectId() {
        return reconciliationSubjectId;
    }

    public void setReconciliationSubjectId(Integer reconciliationSubjectId) {
        this.reconciliationSubjectId = reconciliationSubjectId;
    }
}