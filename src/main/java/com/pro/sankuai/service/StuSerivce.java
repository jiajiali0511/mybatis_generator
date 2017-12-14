package com.pro.sankuai.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.pro.sankuai.dao.StuInfoInterface;
import com.pro.sankuai.pojo.StuInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * create by lijiajia on 2017/12/14
 */
@Service
public class StuSerivce {

    @Resource
    private StuInfoInterface stuInfoInterface;

    public StuInfo getStuInfo(int id) {
        return stuInfoInterface.selectStuInfoById(id);
    }

    public List<StuInfo> getStuInfos() {
        Map<String, Object> map = Maps.newHashMap();
        map.put("stuAge", 27);
        map.put("valid", 1);
        map.put("offset", 0);
        map.put("limit", 10);
        return stuInfoInterface.selectStuInfoByCondition(map);
    }

    public int insertOne() {
        StuInfo stuInfo = new StuInfo();
        stuInfo.setStuName("hahaha");
        stuInfo.setStuAge(18);
        stuInfo.setValid(1);
        stuInfo.setCtime(Long.valueOf(34234));
        stuInfo.setUtime(Long.valueOf(456456));
        return stuInfoInterface.insertOneStuInfo(stuInfo);
    }

    public int batchInsert() {
        List<StuInfo> stuInfos = Lists.newArrayList();
        StuInfo stuInfo1 = new StuInfo();
        stuInfo1.setStuName("lalaldfsdf");
        stuInfo1.setStuAge(18);
        stuInfo1.setValid(1);
        stuInfo1.setCtime(Long.valueOf(34234));
        stuInfo1.setUtime(Long.valueOf(456456));
        stuInfos.add(stuInfo1);
        StuInfo stuInfo2 = new StuInfo();
        stuInfo2.setStuName("sdfsadf");
        stuInfo2.setStuAge(23);
        stuInfo2.setValid(0);
        stuInfo2.setCtime(Long.valueOf(23423));
        stuInfo2.setUtime(Long.valueOf(435435));
        stuInfos.add(stuInfo2);
        int i = stuInfoInterface.batchInsertStuInfo(stuInfos);
        return i;
    }
}
