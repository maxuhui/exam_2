package com.springibatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springibatis.dao.UserDao;
import com.springibatis.pojo.User;
import com.springibatis.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(String userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public String addUser(User user) {
        return userDao.addUser(user);        
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);        
    }

    @Override
    public int deleteUser(String userId) {
        return userDao.deleteUser(userId);        
    }
}
