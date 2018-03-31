package com.sankuai.mall.finance.fcs.dao.mapper;

import com.sankuai.mall.finance.fcs.dao.po.OperateLog;
import com.sankuai.mall.finance.fcs.dao.po.OperateLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperateLogMapper {
    int countByExample(OperateLogCriteria example);

    int deleteByExample(OperateLogCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(OperateLog record);

    int insertSelective(OperateLog record);

    List<OperateLog> selectByExample(OperateLogCriteria example);

    OperateLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OperateLog record, @Param("example") OperateLogCriteria example);

    int updateByExample(@Param("record") OperateLog record, @Param("example") OperateLogCriteria example);

    int updateByPrimaryKeySelective(OperateLog record);

    int updateByPrimaryKey(OperateLog record);
}