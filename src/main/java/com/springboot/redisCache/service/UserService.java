package com.springboot.redisCache.service;

import com.springboot.redisCache.domain.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author 梁其定
 * @version 1.0
 * @date 2020/5/24/024 18:01
 * @descriptio
 */
@CacheConfig(cacheNames = "user")
public interface UserService {
    @Cacheable(key = "#p0")
    User fineAllByID(User user);
    @Cacheable(key = "#p0")
    User fineAll();
    @CachePut(key = "#p0.id")
    int updateUser(User user);
    @CacheEvict(key = "#p0", allEntries = true)
    int delUser(Integer id);
    @CachePut(key = "#p0.id")
    int InsertUser(User user);
}
