package com.mycen.service.controller;

import com.mycen.service.client.UserClient;
import com.mycen.service.pojo.User;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("consumer/user")
public class UserController {

    @Autowired
    private UserClient userClient;


    @GetMapping("/select")
    public User  selectByid(String id){
       // String baseUrl="http://service-provider/user/select?id="+id;
        User  user=this.userClient.selectById(id);
        return user;
    }



}
