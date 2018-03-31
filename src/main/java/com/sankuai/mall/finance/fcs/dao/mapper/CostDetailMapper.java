package com.sankuai.mall.finance.fcs.dao.mapper;

import com.sankuai.mall.finance.fcs.dao.po.CostDetail;
import com.sankuai.mall.finance.fcs.dao.po.CostDetailCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostDetailMapper {
    int countByExample(CostDetailCriteria example);

    int deleteByExample(CostDetailCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(CostDetail record);

    int insertSelective(CostDetail record);

    List<CostDetail> selectByExample(CostDetailCriteria example);

    CostDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CostDetail record, @Param("example") CostDetailCriteria example);

    int updateByExample(@Param("record") CostDetail record, @Param("example") CostDetailCriteria example);

    int updateByPrimaryKeySelective(CostDetail record);

    int updateByPrimaryKey(CostDetail record);
}