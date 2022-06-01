package com.example.scm.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.RoleDao;
import com.example.scm.entity.Role;
import com.example.scm.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * 角色表(Role)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 19:46:44
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {

    @Override
    public boolean save(Role entity) {
        return super.save(entity);
    }
}

