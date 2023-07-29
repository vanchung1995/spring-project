package com.hust.chungvv.springmybatis.repository;

import com.hust.chungvv.springmybatis.entity.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    public void createUser(User user) {
        userMapper.createUser(user);
    }
}
