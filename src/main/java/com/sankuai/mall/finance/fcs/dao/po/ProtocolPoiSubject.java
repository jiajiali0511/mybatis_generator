package com.sankuai.mall.finance.fcs.dao.po;

public class ProtocolPoiSubject {
    private Long id;

    private Long protocolId;

    private Long poiId;

    private String poiName;

    private String poiSubjectNo;

    private String protocolSubjectNo;

    private String protocolSubjectName;

    private Long createTime;

    private Long updateTime;

    private String createBy;

    private String updateBy;

    private Integer valid;

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

    public String getPoiSubjectNo() {
        return poiSubjectNo;
    }

    public void setPoiSubjectNo(String poiSubjectNo) {
        this.poiSubjectNo = poiSubjectNo == null ? null : poiSubjectNo.trim();
    }

    public String getProtocolSubjectNo() {
        return protocolSubjectNo;
    }

    public void setProtocolSubjectNo(String protocolSubjectNo) {
        this.protocolSubjectNo = protocolSubjectNo == null ? null : protocolSubjectNo.trim();
    }

    public String getProtocolSubjectName() {
        return protocolSubjectName;
    }

    public void setProtocolSubjectName(String protocolSubjectName) {
        this.protocolSubjectName = protocolSubjectName == null ? null : protocolSubjectName.trim();
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
}