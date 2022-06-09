package com.example.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.scm.entity.User;

/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2022-06-04 00:44:32
 */
public interface UserService extends IService<User> {
    User login(String account, String password);
}

