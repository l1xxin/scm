package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.UserView;
import com.example.scm.service.UserViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (UserView)表控制层
 *
 * @author makejava
 * @since 2022-06-04 14:15:22
 */
@RestController
@RequestMapping("userView")
public class UserViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UserViewService userViewService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param userView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UserView> page, UserView userView) {
        return success(this.userViewService.page(page, new QueryWrapper<>(userView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.userViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param userView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UserView userView) {
        return success(this.userViewService.save(userView));
    }

    /**
     * 修改数据
     *
     * @param userView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UserView userView) {
        return success(this.userViewService.updateById(userView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.userViewService.removeByIds(idList));
    }
}

