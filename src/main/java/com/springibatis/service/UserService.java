package com.springibatis.service;

import com.springibatis.pojo.User;

public interface UserService {
    User getUserById(String userId);
    
    String addUser(User user);
    
    int updateUser(User user);
    
    int deleteUser(String userId);
}
