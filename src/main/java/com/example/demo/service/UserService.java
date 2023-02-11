package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {

    @Autowired
    UserMapper mapper;

    //Read処理
    public List<User> getListAll() {

        return mapper.selectOne();
    }

    //Insert処理
    public void create(User user) {
        mapper.add(user);
    }

}

