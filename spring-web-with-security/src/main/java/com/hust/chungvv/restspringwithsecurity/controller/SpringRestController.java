package com.hust.chungvv.restspringwithsecurity.controller;

import com.hust.chungvv.restspringwithsecurity.entity.User;
import com.hust.chungvv.restspringwithsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SpringRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/list-package")
    public List<String> getListPackage() {
        return Arrays.asList("main", "controller", "service", "repository", "entity");
    }

    @GetMapping("/users")
    public List<User> getListUser() {
        List<User> users = this.userService.getAllUser();
        return users;
    }
}
