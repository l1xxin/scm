package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.RoleDao;
import com.example.scm.entity.Role;
import com.example.scm.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * 角色表(Role)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:25:25
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {

}

