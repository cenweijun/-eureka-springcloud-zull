package com.mycen.service.service;

import com.mycen.service.mapper.UserMapper;
import com.mycen.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSevice {
    @Autowired(required = false)
    private UserMapper userMapper;


    public User selectByid(String id){

        return userMapper.selectById(id);
    }
}
