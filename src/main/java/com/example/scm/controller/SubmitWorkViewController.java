package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.SubmitWorkView;
import com.example.scm.service.SubmitWorkViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (SubmitWorkView)表控制层
 *
 * @author makejava
 * @since 2022-06-10 06:19:35
 */
@RestController
@RequestMapping("submitWorkView")
public class SubmitWorkViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SubmitWorkViewService submitWorkViewService;

    /**
     * 分页查询所有数据
     *
     * @param page           分页对象
     * @param submitWorkView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SubmitWorkView> page, SubmitWorkView submitWorkView) {
        return success(this.submitWorkViewService.page(page, new QueryWrapper<>(submitWorkView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.submitWorkViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param submitWorkView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SubmitWorkView submitWorkView) {
        return success(this.submitWorkViewService.save(submitWorkView));
    }

    /**
     * 修改数据
     *
     * @param submitWorkView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SubmitWorkView submitWorkView) {
        return success(this.submitWorkViewService.updateById(submitWorkView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.submitWorkViewService.removeByIds(idList));
    }
}

