package com.sankuai.mall.finance.fcs.dao.mapper;

import com.sankuai.mall.finance.fcs.dao.po.ProtocolConditionSku;
import com.sankuai.mall.finance.fcs.dao.po.ProtocolConditionSkuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtocolConditionSkuMapper {
    int countByExample(ProtocolConditionSkuCriteria example);

    int deleteByExample(ProtocolConditionSkuCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProtocolConditionSku record);

    int insertSelective(ProtocolConditionSku record);

    List<ProtocolConditionSku> selectByExample(ProtocolConditionSkuCriteria example);

    ProtocolConditionSku selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProtocolConditionSku record, @Param("example") ProtocolConditionSkuCriteria example);

    int updateByExample(@Param("record") ProtocolConditionSku record, @Param("example") ProtocolConditionSkuCriteria example);

    int updateByPrimaryKeySelective(ProtocolConditionSku record);

    int updateByPrimaryKey(ProtocolConditionSku record);
}