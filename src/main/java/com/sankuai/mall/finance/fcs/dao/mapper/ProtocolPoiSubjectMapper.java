package com.sankuai.mall.finance.fcs.dao.mapper;

import com.sankuai.mall.finance.fcs.dao.po.ProtocolPoiSubject;
import com.sankuai.mall.finance.fcs.dao.po.ProtocolPoiSubjectCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtocolPoiSubjectMapper {
    int countByExample(ProtocolPoiSubjectCriteria example);

    int deleteByExample(ProtocolPoiSubjectCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProtocolPoiSubject record);

    int insertSelective(ProtocolPoiSubject record);

    List<ProtocolPoiSubject> selectByExample(ProtocolPoiSubjectCriteria example);

    ProtocolPoiSubject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProtocolPoiSubject record, @Param("example") ProtocolPoiSubjectCriteria example);

    int updateByExample(@Param("record") ProtocolPoiSubject record, @Param("example") ProtocolPoiSubjectCriteria example);

    int updateByPrimaryKeySelective(ProtocolPoiSubject record);

    int updateByPrimaryKey(ProtocolPoiSubject record);
}