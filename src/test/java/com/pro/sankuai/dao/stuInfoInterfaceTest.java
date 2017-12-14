package com.pro.sankuai.dao;

import com.alibaba.fastjson.JSON;
import com.pro.sankuai.pojo.StuInfo;
import com.pro.sankuai.service.StuSerivce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by lijiajia on 2017/12/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class stuInfoInterfaceTest {

    @Resource
    private StuSerivce stuSerivce;

    @Test
    public void selectStuInfoById() throws Exception {
        int id = 1;
        StuInfo stuInfo = stuSerivce.getStuInfo(id);
        System.out.println(JSON.toJSON(stuInfo));
    }

    @Test
    public void selectStuInfo() throws Exception {
        List<StuInfo> stuInfos = stuSerivce.getStuInfos();
        System.out.println(stuInfos.size());
        System.out.println(JSON.toJSON(stuInfos));
    }

    @Test
    public void insertOne() throws Exception {
        int i = stuSerivce.insertOne();
        System.out.println(i);
    }

    @Test
    public void batchInsert() throws Exception {
        System.out.println(stuSerivce.batchInsert());
    }

}