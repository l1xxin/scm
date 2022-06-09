package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.ExamineWorkView;
import com.example.scm.service.ExamineWorkViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (ExamineWorkView)表控制层
 *
 * @author makejava
 * @since 2022-06-10 06:16:17
 */
@RestController
@RequestMapping("examineWorkView")
public class ExamineWorkViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ExamineWorkViewService examineWorkViewService;

    /**
     * 分页查询所有数据
     *
     * @param page            分页对象
     * @param examineWorkView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<ExamineWorkView> page, ExamineWorkView examineWorkView) {
        return success(this.examineWorkViewService.page(page, new QueryWrapper<>(examineWorkView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.examineWorkViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param examineWorkView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody ExamineWorkView examineWorkView) {
        return success(this.examineWorkViewService.save(examineWorkView));
    }

    /**
     * 修改数据
     *
     * @param examineWorkView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody ExamineWorkView examineWorkView) {
        return success(this.examineWorkViewService.updateById(examineWorkView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.examineWorkViewService.removeByIds(idList));
    }
}

