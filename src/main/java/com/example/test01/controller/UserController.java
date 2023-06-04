package com.example.test01.controller;

import com.example.test01.dao.UserMapper;
import com.example.test01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/get")
    @ResponseBody
    public void getUser(){
        int id = 1;
        User user = userMapper.selectById(id);
        System.out.println(user);
    }
}
