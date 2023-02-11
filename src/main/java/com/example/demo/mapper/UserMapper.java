package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.User;


@Mapper
public interface UserMapper {

    //一件検索（Read処理)
    List<User> selectOne();

    //Insert処理
    void add(User user);

}

