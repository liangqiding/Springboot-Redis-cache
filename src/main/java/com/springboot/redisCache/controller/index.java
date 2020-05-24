package com.springboot.redisCache.controller;

import com.springboot.redisCache.domain.User;
import com.springboot.redisCache.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 梁其定
 * @version 1.0
 * @date 2020/5/24/024 18:08
 * @descriptio
 */
@RestController
public class index {
    @Autowired
    UserServiceImp userServiceImp;
    @RequestMapping("get")
    public User get(Integer id) {
        User user = new User();
        return userServiceImp.fineAllByID(new User().setId(id));
    }
}
