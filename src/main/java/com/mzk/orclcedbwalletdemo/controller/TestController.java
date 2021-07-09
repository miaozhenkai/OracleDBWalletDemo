package com.mzk.orclcedbwalletdemo.controller;

import com.mzk.orclcedbwalletdemo.mapper.TestTblMapper;
import com.mzk.orclcedbwalletdemo.pojo.TestTbl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author miaozhenkai
 * @version 2021-07-06  15:40
 */
@RestController
public class TestController {
    @Autowired
    TestTblMapper testTblMapper;

    @Value("${mybatis.mapper-locations}")
    private String title;

    @RequestMapping("/test")
    public Object test (@RequestBody Map<String, Object> param){
        System.out.println(title);
        TestTbl testTbl = TestTbl.builder().name("name1").build();
        int i = testTblMapper.insert(testTbl);
        System.out.println(testTbl);
        System.out.println(i);
        return "";

    }
}
