package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.UserRoleDao;
import com.example.scm.entity.UserRole;
import com.example.scm.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户角色分配表(UserRole)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 19:46:43
 */
@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {

}

