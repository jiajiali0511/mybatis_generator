package com.pro.sankuai.dao;

import com.pro.sankuai.pojo.StuInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * create by lijiajia on 2017/12/14
 */
@Repository
public interface StuInfoInterface {
    StuInfo selectStuInfoById(int id);
    List<StuInfo> selectStuInfoByCondition(Map<String, Object> map);
    int insertOneStuInfo(StuInfo stuInfo);
    int batchInsertStuInfo(List<StuInfo> stuInfos);
}
