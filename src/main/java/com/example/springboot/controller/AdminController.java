package com.example.springboot.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zyf@nbugs.com
 * @date 2018/7/24 下午5:33
 * @description springboot
 */
@RestController
public class AdminController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("test");
        return "test ";
    }

    @RequestMapping("/getUser")
    public String getUser(){
        Map<String,String> map =  new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        return JSON.toJSONString(map);
    }
}
