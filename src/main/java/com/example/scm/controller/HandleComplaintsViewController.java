package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.HandleComplaintsView;
import com.example.scm.service.HandleComplaintsViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (HandleComplaintsView)表控制层
 *
 * @author makejava
 * @since 2022-06-10 01:59:06
 */
@RestController
@RequestMapping("handleComplaintsView")
public class HandleComplaintsViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private HandleComplaintsViewService handleComplaintsViewService;

    /**
     * 分页查询所有数据
     *
     * @param page                 分页对象
     * @param handleComplaintsView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<HandleComplaintsView> page, HandleComplaintsView handleComplaintsView) {
        return success(this.handleComplaintsViewService.page(page, new QueryWrapper<>(handleComplaintsView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.handleComplaintsViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param handleComplaintsView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody HandleComplaintsView handleComplaintsView) {
        return success(this.handleComplaintsViewService.save(handleComplaintsView));
    }

    /**
     * 修改数据
     *
     * @param handleComplaintsView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody HandleComplaintsView handleComplaintsView) {
        return success(this.handleComplaintsViewService.updateById(handleComplaintsView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.handleComplaintsViewService.removeByIds(idList));
    }
}

