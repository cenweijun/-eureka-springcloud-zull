package com.mycen.service.client;

import com.mycen.service.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements  UserClient{
    @Override
    public User selectById(String id) {
        User user = new User();
        user.setName("服务器繁忙，请稍后再试！");
        return user;
    }
}
