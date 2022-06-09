package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.StudentTeamView;
import com.example.scm.service.StudentTeamViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (StudentTeamView)表控制层
 *
 * @author makejava
 * @since 2022-06-09 16:58:46
 */
@RestController
@RequestMapping("studentTeamView")
public class StudentTeamViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private StudentTeamViewService studentTeamViewService;

    /**
     * 分页查询所有数据
     *
     * @param page            分页对象
     * @param studentTeamView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<StudentTeamView> page, StudentTeamView studentTeamView) {
        return success(this.studentTeamViewService.page(page, new QueryWrapper<>(studentTeamView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.studentTeamViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param studentTeamView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody StudentTeamView studentTeamView) {
        return success(this.studentTeamViewService.save(studentTeamView));
    }

    /**
     * 修改数据
     *
     * @param studentTeamView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody StudentTeamView studentTeamView) {
        return success(this.studentTeamViewService.updateById(studentTeamView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.studentTeamViewService.removeByIds(idList));
    }
}

