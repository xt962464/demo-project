package com.example.democache.config.mybatisPlus.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description TODO
 * @Author 故人听雨
 * @Date 2022/6/4 19:32
 * @Version 1.0
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T>{
}
