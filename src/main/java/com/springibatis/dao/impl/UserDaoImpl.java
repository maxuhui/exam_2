package com.springibatis.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springibatis.dao.BaseDao;
import com.springibatis.dao.UserDao;
import com.springibatis.pojo.User;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao{
    @Override
    public User getUserById(String userId) {
        return (User) this.queryForObject("UserDao.getUserById", userId);
    }

    @Override
    public String addUser(User user) {
        return (String) this.insert("UserDao.addUser", user);        
    }

    @Transactional(readOnly = false)
    @Override
    public int updateUser(User user) {
        return this.update("UserDao.updateUser", user);        
    }

    @Override
    public int deleteUser(String userId) {
        return this.delete("UserDao.deleteUser", userId);
    }
}
