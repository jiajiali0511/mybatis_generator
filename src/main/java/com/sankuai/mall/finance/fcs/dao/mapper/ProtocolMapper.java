package com.sankuai.mall.finance.fcs.dao.mapper;

import com.sankuai.mall.finance.fcs.dao.po.Protocol;
import com.sankuai.mall.finance.fcs.dao.po.ProtocolCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProtocolMapper {
    int countByExample(ProtocolCriteria example);

    int deleteByExample(ProtocolCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Protocol record);

    int insertSelective(Protocol record);

    List<Protocol> selectByExample(ProtocolCriteria example);

    Protocol selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Protocol record, @Param("example") ProtocolCriteria example);

    int updateByExample(@Param("record") Protocol record, @Param("example") ProtocolCriteria example);

    int updateByPrimaryKeySelective(Protocol record);

    int updateByPrimaryKey(Protocol record);
}