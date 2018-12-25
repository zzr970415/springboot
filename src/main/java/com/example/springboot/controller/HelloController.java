package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyf@nbugs.com
 * @date 2018/7/24 上午10:41
 * @description springboot
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        //请勿在行尾加注释
        return "hellowww ";
    }

    @RequestMapping("/getMessage")
    public String getMessage(){
        System.out.println("aaaa");
        return "哈哈啊 ";
    }
}
