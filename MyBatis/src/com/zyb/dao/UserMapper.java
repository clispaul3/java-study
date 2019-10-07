package com.zyb.dao;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User getUser(@Param("username") String username, @Param("age") int age);
    int insertOne(User user);
    int updateOne(User user);
    int deleteOne(String username);
}
