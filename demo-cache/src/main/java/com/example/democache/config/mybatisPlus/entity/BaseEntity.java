package com.example.democache.config.mybatisPlus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * @Description BaseEntity
 * @Author 故人听雨
 * @Date 2022/6/4 19:29
 * @Version 1.0
 */
@Data
public class BaseEntity<T extends Model<T>> extends Model<T> {

    @TableId
    @TableField("id")
    private Long id;



}
