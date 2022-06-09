package com.example.scm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.UserDao;
import com.example.scm.entity.User;
import com.example.scm.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:44:32
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Override
    public User login(String account, String password) {
        // 构造条件构造器
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.last("Where account = " + account + " and password = " + password + " and state = 0");
        return super.baseMapper.login(wrapper);
    }
}

