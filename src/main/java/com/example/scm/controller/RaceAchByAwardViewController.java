package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.RaceAchByAwardView;
import com.example.scm.service.RaceAchByAwardViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (RaceAchByAwardView)表控制层
 *
 * @author makejava
 * @since 2022-06-09 21:09:34
 */
@RestController
@RequestMapping("raceAchByAwardView")
public class RaceAchByAwardViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RaceAchByAwardViewService raceAchByAwardViewService;

    /**
     * 分页查询所有数据
     *
     * @param page               分页对象
     * @param raceAchByAwardView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RaceAchByAwardView> page, RaceAchByAwardView raceAchByAwardView) {
        return success(this.raceAchByAwardViewService.page(page, new QueryWrapper<>(raceAchByAwardView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.raceAchByAwardViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param raceAchByAwardView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RaceAchByAwardView raceAchByAwardView) {
        return success(this.raceAchByAwardViewService.save(raceAchByAwardView));
    }

    /**
     * 修改数据
     *
     * @param raceAchByAwardView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RaceAchByAwardView raceAchByAwardView) {
        return success(this.raceAchByAwardViewService.updateById(raceAchByAwardView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.raceAchByAwardViewService.removeByIds(idList));
    }
}

