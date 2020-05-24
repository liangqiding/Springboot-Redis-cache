package com.springboot.redisCache.service.imp;

import com.springboot.redisCache.dao.UserMapper;
import com.springboot.redisCache.domain.User;
import com.springboot.redisCache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author 梁其定
 * @version 1.0
 * @date 2020/5/24/024 18:01
 * @descriptio
 */
@Repository
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User fineAllByID(User user) {
        return userMapper.fineAllByID(user);
    }

    @Override
    public User fineAll() {
        return userMapper.fineAll();
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int delUser(Integer id) {
        return userMapper.delUser(id);
    }

    @Override
    public int InsertUser(User user) {
        return userMapper.InsertUser(user);
    }
}
