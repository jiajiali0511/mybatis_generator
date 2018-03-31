package com.sankuai.mall.finance.fcs.dao.mapper;

import com.sankuai.mall.finance.fcs.dao.po.Cost;
import com.sankuai.mall.finance.fcs.dao.po.CostCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostMapper {
    int countByExample(CostCriteria example);

    int deleteByExample(CostCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Cost record);

    int insertSelective(Cost record);

    List<Cost> selectByExample(CostCriteria example);

    Cost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Cost record, @Param("example") CostCriteria example);

    int updateByExample(@Param("record") Cost record, @Param("example") CostCriteria example);

    int updateByPrimaryKeySelective(Cost record);

    int updateByPrimaryKey(Cost record);
}