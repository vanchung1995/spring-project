package com.hust.chungvv.restspringwithsecurity.repository;

import com.hust.chungvv.restspringwithsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}