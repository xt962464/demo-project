package com.example.democache.modules.user.service;

import com.example.democache.config.mybatisPlus.service.BaseServiceImpl;
import com.example.democache.modules.user.mapper.UserMapper;
import com.example.democache.modules.user.model.entity.UserEntity;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Description 用户服务实现类
 * @Author 故人听雨
 * @Date 2022/6/4 19:39
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, UserEntity> implements UserService {

    @Cacheable(value = "user-info", key = "#userId")
    @Override
    public UserEntity getById(Long userId) {
        System.out.println("查询用户: " + userId);
        return baseMapper.selectById(userId);
    }

    @CachePut(value = "user-info", key = "#result.id")
    @Override
    public UserEntity updateUser(UserEntity user) {
        System.out.println("更新用户: " + user.getId());
        baseMapper.updateById(user);
        return user;
    }

    @CacheEvict(value = "user-info", key = "#userId")
    @Override
    public int deleteById(Long userId) {
        System.out.println("删除用户: " + userId);
        return baseMapper.deleteById(userId);
    }


}
