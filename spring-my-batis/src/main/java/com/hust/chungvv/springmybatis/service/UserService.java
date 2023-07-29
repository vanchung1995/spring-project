package com.hust.chungvv.springmybatis.service;

import com.hust.chungvv.springmybatis.entity.User;
import com.hust.chungvv.springmybatis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }

    public void createUser(User user) {
        userRepository.createUser(user);
    }
}
