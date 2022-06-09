package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.ScoreView;
import com.example.scm.service.ScoreViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (ScoreView)表控制层
 *
 * @author makejava
 * @since 2022-06-10 06:17:50
 */
@RestController
@RequestMapping("scoreView")
public class ScoreViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ScoreViewService scoreViewService;

    /**
     * 分页查询所有数据
     *
     * @param page      分页对象
     * @param scoreView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<ScoreView> page, ScoreView scoreView) {
        return success(this.scoreViewService.page(page, new QueryWrapper<>(scoreView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.scoreViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param scoreView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody ScoreView scoreView) {
        return success(this.scoreViewService.save(scoreView));
    }

    /**
     * 修改数据
     *
     * @param scoreView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody ScoreView scoreView) {
        return success(this.scoreViewService.updateById(scoreView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.scoreViewService.removeByIds(idList));
    }
}

