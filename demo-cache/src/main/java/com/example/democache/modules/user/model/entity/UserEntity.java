package com.example.democache.modules.user.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.democache.config.mybatisPlus.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description 用户
 * @Author 故人听雨
 * @Date 2022/6/4 19:35
 * @Version 1.0
 */
@Data
@TableName("sys_user")
public class UserEntity extends BaseEntity<UserEntity> implements Serializable {

    private String userName;

}
