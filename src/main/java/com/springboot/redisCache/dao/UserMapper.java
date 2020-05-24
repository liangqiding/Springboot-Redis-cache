package com.springboot.redisCache.dao;


import com.springboot.redisCache.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author 梁其定
 * @version 1.0
 * @date 2020/5/24/024 11:17
 * @descriptio
 */
@Mapper
@CacheConfig(cacheNames = "user")
public interface UserMapper {
       User fineAll();
       User fineAllByID(User user);
       int updateUser(User user);
       int delUser(Integer id);
       int InsertUser(User user);
}
