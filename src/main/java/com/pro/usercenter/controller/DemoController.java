package com.pro.usercenter.controller;


import com.pro.usercenter.dto.Demo;
import com.pro.usercenter.dto.User;
import com.pro.usercenter.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private UserService userService;

    @GetMapping("/insert")
    public User insert() {

        User user1 = new User();
        user1.setWxId("1");
        user1.setAvatarUrl("fff");
        user1.setBonus(300);
        Demo demo = new Demo();
        demo.setId("1");
        demo.setName("44");

        userService.insert(demo);
        User user2 = new User();
        user2.setId(1);
        return user2;
    }

    @GetMapping("/qu1")
    public List<User> query() {
        return userService.queryList("121");
    }

    @GetMapping("/qu")
    public User query(User user) {

        return userService.findById(1);
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
