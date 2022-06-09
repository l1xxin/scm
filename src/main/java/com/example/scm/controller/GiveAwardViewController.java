package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.GiveAwardView;
import com.example.scm.service.GiveAwardViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (GiveAwardView)表控制层
 *
 * @author makejava
 * @since 2022-06-09 20:01:02
 */
@RestController
@RequestMapping("giveAwardView")
public class GiveAwardViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private GiveAwardViewService giveAwardViewService;

    /**
     * 分页查询所有数据
     *
     * @param page          分页对象
     * @param giveAwardView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<GiveAwardView> page, GiveAwardView giveAwardView) {
        return success(this.giveAwardViewService.page(page, new QueryWrapper<>(giveAwardView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.giveAwardViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param giveAwardView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody GiveAwardView giveAwardView) {
        return success(this.giveAwardViewService.save(giveAwardView));
    }

    /**
     * 修改数据
     *
     * @param giveAwardView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody GiveAwardView giveAwardView) {
        return success(this.giveAwardViewService.updateById(giveAwardView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.giveAwardViewService.removeByIds(idList));
    }
}

