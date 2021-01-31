package com.example.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.example.pojo.User;
import org.example.service.UserService;

@Service(version = "1.0")
public class UserServiceImpl implements UserService {


    @Override
    public User getUserById(Integer id) {
        User user=new User();
        user.setAge(23);
        user.setName("wangliang");
        return user;
    }
}
