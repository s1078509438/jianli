package com.shi.system.controller;

import com.shi.system.model.UserPO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("system/user")
public class UserController {

    @GetMapping("getUser/{userName}")
    public UserPO getUser(@PathVariable("userName") String userName){
        UserPO userPO = new UserPO();
        userPO.setUserName("1078509438");
        userPO.setPassword("shi167943");
        userPO.setRealName("石龙峰");
        return userPO;
    }
}
