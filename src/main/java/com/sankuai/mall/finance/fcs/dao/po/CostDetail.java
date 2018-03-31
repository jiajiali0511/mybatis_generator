package com.sankuai.mall.finance.fcs.dao.po;

public class CostDetail {
    private Long id;

    private Long costId;

    private Long poiId;

    private String poiName;

    private Long skuId;

    private String skuName;

    private String skuMallCode;

    private String skuCategory;

    private Integer tax;

    private Long amount;

    private String remark;

    private Long createTime;

    private Long updateTime;

    private String createBy;

    private String updateBy;

    private Integer valid;

    private Long originalPrice;

    private Long newPrice;

    private Long diffPrice;

    private Long quantity;

    private Long unitId;

    private String unitName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCostId() {
        return costId;
    }

    public void setCostId(Long costId) {
        this.costId = costId;
    }

    public Long getPoiId() {
        return poiId;
    }

    public void setPoiId(Long poiId) {
        this.poiId = poiId;
    }

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName == null ? null : poiName.trim();
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public String getSkuMallCode() {
        return skuMallCode;
    }

    public void setSkuMallCode(String skuMallCode) {
        this.skuMallCode = skuMallCode == null ? null : skuMallCode.trim();
    }

    public String getSkuCategory() {
        return skuCategory;
    }

    public void setSkuCategory(String skuCategory) {
        this.skuCategory = skuCategory == null ? null : skuCategory.trim();
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Long getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Long newPrice) {
        this.newPrice = newPrice;
    }

    public Long getDiffPrice() {
        return diffPrice;
    }

    public void setDiffPrice(Long diffPrice) {
        this.diffPrice = diffPrice;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }
}