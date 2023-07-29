package com.hust.chungvv.springmybatis.controller;

import com.hust.chungvv.springmybatis.entity.User;
import com.hust.chungvv.springmybatis.service.UserService;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("/users")
    public String createNewUser(@ModelAttribute User user) {
        userService.createUser(user);
        return "ok";
    }
}
