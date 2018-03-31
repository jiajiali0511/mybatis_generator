package com.sankuai.mall.finance.fcs.dao.po;

public class ProtocolCalculatePeriod {
    private Long id;

    private Long protocolId;

    private Long ruleId;

    private Long startTime;

    private Long endTime;

    private Integer calculateStatus;

    private Long calculateTime;

    private Long createTime;

    private Long updateTime;

    private String createBy;

    private String updateBy;

    private Integer valid;

    private Long actualCalculateTime;

    private Long statisticTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getCalculateStatus() {
        return calculateStatus;
    }

    public void setCalculateStatus(Integer calculateStatus) {
        this.calculateStatus = calculateStatus;
    }

    public Long getCalculateTime() {
        return calculateTime;
    }

    public void setCalculateTime(Long calculateTime) {
        this.calculateTime = calculateTime;
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

    public Long getActualCalculateTime() {
        return actualCalculateTime;
    }

    public void setActualCalculateTime(Long actualCalculateTime) {
        this.actualCalculateTime = actualCalculateTime;
    }

    public Long getStatisticTime() {
        return statisticTime;
    }

    public void setStatisticTime(Long statisticTime) {
        this.statisticTime = statisticTime;
    }
}