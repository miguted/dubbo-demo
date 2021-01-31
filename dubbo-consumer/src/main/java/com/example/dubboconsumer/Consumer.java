package com.example.dubboconsumer;

import org.apache.dubbo.config.annotation.Reference;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Consumer implements CommandLineRunner {

    @Reference(version = "1.0")
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        User user=userService.getUserById(2);
        System.out.println(user);

    }


}
