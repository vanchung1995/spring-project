package com.hust.chungvv.restspringwithsecurity.controller;

import com.hust.chungvv.restspringwithsecurity.dto.SimpleRequest;
import com.hust.chungvv.restspringwithsecurity.entity.User;
import com.hust.chungvv.restspringwithsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/{id}/with-param")
    public Map<String, Object> getPathAndParam(@PathVariable String id, @Param("name") String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("path-variable", id);
        map.put("name", name);
        return map;
    }

    @GetMapping("/with-params")
    public Map<String, Object> getListParams(@ModelAttribute SimpleRequest simpleRequest) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", simpleRequest.getName());
        map.put("email", simpleRequest.getEmail());
        return map;
    }

    @PostMapping("/simple-post")
    public Map<String, Object> postSmth(@RequestBody SimpleRequest simpleRequest) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", simpleRequest.getName());
        map.put("email", simpleRequest.getEmail());
        return map;
    }

    @GetMapping("/exception")
    public String testException() {
        int num = 0;
        num = 1 / num;
        return "Done";
    }
}
