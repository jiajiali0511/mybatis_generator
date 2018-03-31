package com.sankuai.mall.finance.fcs.dao.mapper;

import com.sankuai.mall.finance.fcs.dao.po.ProtocolCalculatePeriod;
import com.sankuai.mall.finance.fcs.dao.po.ProtocolCalculatePeriodCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtocolCalculatePeriodMapper {
    int countByExample(ProtocolCalculatePeriodCriteria example);

    int deleteByExample(ProtocolCalculatePeriodCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProtocolCalculatePeriod record);

    int insertSelective(ProtocolCalculatePeriod record);

    List<ProtocolCalculatePeriod> selectByExample(ProtocolCalculatePeriodCriteria example);

    ProtocolCalculatePeriod selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProtocolCalculatePeriod record, @Param("example") ProtocolCalculatePeriodCriteria example);

    int updateByExample(@Param("record") ProtocolCalculatePeriod record, @Param("example") ProtocolCalculatePeriodCriteria example);

    int updateByPrimaryKeySelective(ProtocolCalculatePeriod record);

    int updateByPrimaryKey(ProtocolCalculatePeriod record);
}