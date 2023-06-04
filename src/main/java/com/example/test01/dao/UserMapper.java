package com.example.test01.dao;

import com.example.test01.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String userName);

    int insertUser(User user);
    
}
