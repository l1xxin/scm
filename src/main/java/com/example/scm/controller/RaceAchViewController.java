package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.RaceAchView;
import com.example.scm.service.RaceAchViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (RaceAchView)表控制层
 *
 * @author makejava
 * @since 2022-06-09 22:29:52
 */
@RestController
@RequestMapping("raceAchView")
public class RaceAchViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RaceAchViewService raceAchViewService;

    /**
     * 分页查询所有数据
     *
     * @param page        分页对象
     * @param raceAchView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RaceAchView> page, RaceAchView raceAchView) {
        return success(this.raceAchViewService.page(page, new QueryWrapper<>(raceAchView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.raceAchViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param raceAchView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RaceAchView raceAchView) {
        return success(this.raceAchViewService.save(raceAchView));
    }

    /**
     * 修改数据
     *
     * @param raceAchView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RaceAchView raceAchView) {
        return success(this.raceAchViewService.updateById(raceAchView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.raceAchViewService.removeByIds(idList));
    }
}

