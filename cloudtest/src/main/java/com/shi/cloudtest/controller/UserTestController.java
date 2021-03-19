package com.shi.cloudtest.controller;


import com.shi.cloudtest.model.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserTestController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping("getUser/{userName}")
    public UserPO getUser(@PathVariable("userName") String userName){
        UserPO forObject = restTemplate.getForObject("http://system/system/user/getUser/1", UserPO.class);
        return forObject;
    }
}
