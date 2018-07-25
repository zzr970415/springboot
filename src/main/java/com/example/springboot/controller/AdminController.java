package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "getUser";
    }
}
