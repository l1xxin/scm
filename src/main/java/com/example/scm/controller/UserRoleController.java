package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.UserRole;
import com.example.scm.service.UserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 用户角色分配表(UserRole)表控制层
 *
 * @author makejava
 * @since 2022-06-02 10:33:23
 */
@RestController
@RequestMapping("userRole")
public class UserRoleController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UserRoleService userRoleService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param userRole 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UserRole> page, UserRole userRole) {
        return success(this.userRoleService.page(page, new QueryWrapper<>(userRole)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.userRoleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param userRole 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UserRole userRole) {
        return success(this.userRoleService.save(userRole));
    }

    /**
     * 修改数据
     *
     * @param userRole 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UserRole userRole) {
        return success(this.userRoleService.updateById(userRole));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.userRoleService.removeByIds(idList));
    }
}

