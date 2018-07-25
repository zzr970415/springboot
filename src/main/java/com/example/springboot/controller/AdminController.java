package com.example.springboot.controller;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
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

    private static Logger logger = Logger.getLogger(AdminController.class);

    @RequestMapping("/test")
    public String test(){
        logger.info("This is info message.");
        return "test ";
    }

    @RequestMapping("/getUser")
    public String getUser(){
        logger.debug("This is debug message.");
        Map<String,String> map =  new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        return JSON.toJSONString(map);
    }
}
