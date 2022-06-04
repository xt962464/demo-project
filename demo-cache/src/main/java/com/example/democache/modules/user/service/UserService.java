package com.example.democache.modules.user.service;

import com.example.democache.config.mybatisPlus.service.BaseService;
import com.example.democache.modules.user.model.entity.UserEntity;

public interface UserService extends BaseService<UserEntity> {

    UserEntity getById(Long userId);

    UserEntity updateUser(UserEntity user);

    int deleteById(Long userId);

}
