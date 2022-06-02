package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.TeamWork;
import com.example.scm.service.TeamWorkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 团队比赛作品审核表(TeamWork)表控制层
 *
 * @author makejava
 * @since 2022-06-02 10:33:16
 */
@RestController
@RequestMapping("teamWork")
public class TeamWorkController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TeamWorkService teamWorkService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param teamWork 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TeamWork> page, TeamWork teamWork) {
        return success(this.teamWorkService.page(page, new QueryWrapper<>(teamWork)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.teamWorkService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param teamWork 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TeamWork teamWork) {
        return success(this.teamWorkService.save(teamWork));
    }

    /**
     * 修改数据
     *
     * @param teamWork 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TeamWork teamWork) {
        return success(this.teamWorkService.updateById(teamWork));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.teamWorkService.removeByIds(idList));
    }
}

