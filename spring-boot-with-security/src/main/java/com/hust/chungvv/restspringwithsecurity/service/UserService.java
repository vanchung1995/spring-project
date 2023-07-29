package com.hust.chungvv.restspringwithsecurity.service;

import com.hust.chungvv.restspringwithsecurity.entity.User;
import com.hust.chungvv.restspringwithsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }
}
