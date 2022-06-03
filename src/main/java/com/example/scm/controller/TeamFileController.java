package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.TeamFile;
import com.example.scm.service.TeamFileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 团队比赛提交的文件表(TeamFile)表控制层
 *
 * @author makejava
 * @since 2022-06-04 00:25:27
 */
@RestController
@RequestMapping("teamFile")
public class TeamFileController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TeamFileService teamFileService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param teamFile 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TeamFile> page, TeamFile teamFile) {
        return success(this.teamFileService.page(page, new QueryWrapper<>(teamFile)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.teamFileService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param teamFile 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TeamFile teamFile) {
        return success(this.teamFileService.save(teamFile));
    }

    /**
     * 修改数据
     *
     * @param teamFile 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TeamFile teamFile) {
        return success(this.teamFileService.updateById(teamFile));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.teamFileService.removeByIds(idList));
    }
}

