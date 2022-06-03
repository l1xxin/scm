package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.Unit;
import com.example.scm.service.UnitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 单位表(Unit)表控制层
 *
 * @author makejava
 * @since 2022-06-04 00:25:29
 */
@RestController
@RequestMapping("unit")
public class UnitController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UnitService unitService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param unit 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Unit> page, Unit unit) {
        return success(this.unitService.page(page, new QueryWrapper<>(unit)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.unitService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param unit 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Unit unit) {
        return success(this.unitService.save(unit));
    }

    /**
     * 修改数据
     *
     * @param unit 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Unit unit) {
        return success(this.unitService.updateById(unit));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.unitService.removeByIds(idList));
    }
}

