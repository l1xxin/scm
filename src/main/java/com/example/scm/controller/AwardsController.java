package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.Awards;
import com.example.scm.service.AwardsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 奖项表(Awards)表控制层
 *
 * @author makejava
 * @since 2022-06-04 00:44:16
 */
@RestController
@RequestMapping("awards")
public class AwardsController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private AwardsService awardsService;

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param awards 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Awards> page, Awards awards) {
        return success(this.awardsService.page(page, new QueryWrapper<>(awards)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.awardsService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param awards 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Awards awards) {
        return success(this.awardsService.save(awards));
    }

    /**
     * 修改数据
     *
     * @param awards 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Awards awards) {
        return success(this.awardsService.updateById(awards));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.awardsService.removeByIds(idList));
    }
}

