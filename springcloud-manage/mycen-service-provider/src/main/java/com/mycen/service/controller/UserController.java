package com.mycen.service.controller;

import com.mycen.service.pojo.User;
import com.mycen.service.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/")

public class UserController {
    @Autowired
    private UserSevice userSevice;

    @GetMapping("select")
    public User selectById(@RequestParam("id") String id){
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return userSevice.selectByid(id);
    }






}
