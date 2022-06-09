package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.ReturnWorkView;
import com.example.scm.service.ReturnWorkViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (ReturnWorkView)表控制层
 *
 * @author makejava
 * @since 2022-06-10 06:16:53
 */
@RestController
@RequestMapping("returnWorkView")
public class ReturnWorkViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ReturnWorkViewService returnWorkViewService;

    /**
     * 分页查询所有数据
     *
     * @param page           分页对象
     * @param returnWorkView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<ReturnWorkView> page, ReturnWorkView returnWorkView) {
        return success(this.returnWorkViewService.page(page, new QueryWrapper<>(returnWorkView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.returnWorkViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param returnWorkView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody ReturnWorkView returnWorkView) {
        return success(this.returnWorkViewService.save(returnWorkView));
    }

    /**
     * 修改数据
     *
     * @param returnWorkView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody ReturnWorkView returnWorkView) {
        return success(this.returnWorkViewService.updateById(returnWorkView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.returnWorkViewService.removeByIds(idList));
    }
}

