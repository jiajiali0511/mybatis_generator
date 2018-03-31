package com.sankuai.mall.finance.fcs.dao.mapper;

import com.sankuai.mall.finance.fcs.dao.po.ProtocolRule;
import com.sankuai.mall.finance.fcs.dao.po.ProtocolRuleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtocolRuleMapper {
    int countByExample(ProtocolRuleCriteria example);

    int deleteByExample(ProtocolRuleCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(ProtocolRule record);

    int insertSelective(ProtocolRule record);

    List<ProtocolRule> selectByExample(ProtocolRuleCriteria example);

    ProtocolRule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProtocolRule record, @Param("example") ProtocolRuleCriteria example);

    int updateByExample(@Param("record") ProtocolRule record, @Param("example") ProtocolRuleCriteria example);

    int updateByPrimaryKeySelective(ProtocolRule record);

    int updateByPrimaryKey(ProtocolRule record);
}