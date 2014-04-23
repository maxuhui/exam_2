package com.springibatis.dao;

import com.springibatis.pojo.User;

public interface UserDao {
    User getUserById(String userId);
    
    String addUser(User user);
    
    int updateUser(User user);
    
    int deleteUser(String userId);
}
