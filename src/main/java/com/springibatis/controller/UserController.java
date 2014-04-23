package com.springibatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springibatis.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;    
    
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public @ResponseBody Object userInfo(@PathVariable String userId) {
        return userService.getUserById(userId);
    }
}
