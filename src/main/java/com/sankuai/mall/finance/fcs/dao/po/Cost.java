package com.sankuai.mall.finance.fcs.dao.po;

public class Cost {
    private Long id;

    private String costNo;

    private String protocolNo;

    private Long protocolId;

    private Long supplierId;

    private String supplierName;

    private Integer protocolType;

    private Integer protocolItemType;

    private Long amount;

    private Integer costStatus;

    private Long createTime;

    private Long updateTime;

    private String createBy;

    private String updateBy;

    private Integer valid;

    private String supplierCode;

    private String remark;

    private String settlementSubjectNo;

    private String settlementSubjectName;

    private Long calculatePeriodId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCostNo() {
        return costNo;
    }

    public void setCostNo(String costNo) {
        this.costNo = costNo == null ? null : costNo.trim();
    }

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo == null ? null : protocolNo.trim();
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Integer getCostStatus() {
        return costStatus;
    }

    public void setCostStatus(Integer costStatus) {
        this.costStatus = costStatus;
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

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Long getCalculatePeriodId() {
        return calculatePeriodId;
    }

    public void setCalculatePeriodId(Long calculatePeriodId) {
        this.calculatePeriodId = calculatePeriodId;
    }
}