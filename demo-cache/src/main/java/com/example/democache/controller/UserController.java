package com.example.democache.controller;

import com.example.democache.modules.user.model.entity.UserEntity;
import com.example.democache.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 用户控制器
 * @Author 故人听雨
 * @Date 2022/6/4 19:47
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("save")
    public boolean get(@RequestParam("name") String name) {
        UserEntity user = new UserEntity();
        user.setUserName(name);
        return userService.save(user);
    }

    @GetMapping("get")
    public UserEntity get(@RequestParam("id") Long userId) {
        return userService.getById(userId);
    }

    @GetMapping("update")
    public UserEntity update(@RequestParam("id") Long userId, @RequestParam("name") String name) {
        UserEntity user = userService.getById(userId);
        if (user != null) {
            user.setUserName(name);
            userService.updateUser(user);
        }
        return user;
    }

    @GetMapping("del")
    public int del(@RequestParam("id") Long userId) {
        return userService.deleteById(userId);
    }

}
