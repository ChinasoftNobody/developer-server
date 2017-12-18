package com.lgh.chinasoft.developer.controller;

import com.lgh.chinasoft.developer.dao.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class TestController {

    @Resource
    private UserMapper userMapper;



    @GetMapping("/test")
    public int test(){
        return userMapper.test();
    }


}
