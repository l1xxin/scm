package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.Complaints;
import com.example.scm.service.ComplaintsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 投诉表(Complaints)表控制层
 *
 * @author makejava
 * @since 2022-06-04 00:44:20
 */
@RestController
@RequestMapping("complaints")
public class ComplaintsController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ComplaintsService complaintsService;

    /**
     * 分页查询所有数据
     *
     * @param page       分页对象
     * @param complaints 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Complaints> page, Complaints complaints) {
        return success(this.complaintsService.page(page, new QueryWrapper<>(complaints)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.complaintsService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param complaints 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Complaints complaints) {
        return success(this.complaintsService.save(complaints));
    }

    /**
     * 修改数据
     *
     * @param complaints 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Complaints complaints) {
        return success(this.complaintsService.updateById(complaints));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.complaintsService.removeByIds(idList));
    }
}

