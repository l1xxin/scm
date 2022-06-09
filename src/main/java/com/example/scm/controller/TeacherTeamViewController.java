package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.TeacherTeamView;
import com.example.scm.service.TeacherTeamViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (TeacherTeamView)表控制层
 *
 * @author makejava
 * @since 2022-06-09 16:59:48
 */
@RestController
@RequestMapping("teacherTeamView")
public class TeacherTeamViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TeacherTeamViewService teacherTeamViewService;

    /**
     * 分页查询所有数据
     *
     * @param page            分页对象
     * @param teacherTeamView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TeacherTeamView> page, TeacherTeamView teacherTeamView) {
        return success(this.teacherTeamViewService.page(page, new QueryWrapper<>(teacherTeamView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.teacherTeamViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param teacherTeamView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TeacherTeamView teacherTeamView) {
        return success(this.teacherTeamViewService.save(teacherTeamView));
    }

    /**
     * 修改数据
     *
     * @param teacherTeamView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TeacherTeamView teacherTeamView) {
        return success(this.teacherTeamViewService.updateById(teacherTeamView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.teacherTeamViewService.removeByIds(idList));
    }
}

