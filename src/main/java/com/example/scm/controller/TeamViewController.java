package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.TeamView;
import com.example.scm.service.TeamViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (TeamView)表控制层
 *
 * @author makejava
 * @since 2022-06-10 06:20:21
 */
@RestController
@RequestMapping("teamView")
public class TeamViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TeamViewService teamViewService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param teamView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TeamView> page, TeamView teamView) {
        return success(this.teamViewService.page(page, new QueryWrapper<>(teamView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.teamViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param teamView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TeamView teamView) {
        return success(this.teamViewService.save(teamView));
    }

    /**
     * 修改数据
     *
     * @param teamView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TeamView teamView) {
        return success(this.teamViewService.updateById(teamView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.teamViewService.removeByIds(idList));
    }
}

