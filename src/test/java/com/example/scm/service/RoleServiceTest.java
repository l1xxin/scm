package com.example.scm.service;

import com.example.scm.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lcx
 * @Description: RoleService测试类
 * @date 2022/5/31 14:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RoleServiceTest {
    @Autowired
    private RoleService roleService;

    /**
     * 插入一条数据
     * @throws Exception
     */
    @Test
    public void save() throws Exception{
        Role role = new Role();
        role.setId(3);
        role.setName("管理员");
        role.setState(1);
        roleService.save(role);
    }

    /**
     * 更新数据
     * @ throws Exception
     */
    @Test
    public void update() throws Exception{
        Role role = new Role();
        role.setId(1);
        role.setName("管理员");
        role.setState(1);
        roleService.updateById(role);
    }


}
