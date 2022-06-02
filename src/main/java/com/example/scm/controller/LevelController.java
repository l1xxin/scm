package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.Level;
import com.example.scm.service.LevelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 比赛级别表(Level)表控制层
 *
 * @author makejava
 * @since 2022-06-02 10:33:01
 */
@RestController
@RequestMapping("level")
public class LevelController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private LevelService levelService;

    /**
     * 分页查询所有数据
     *
     * @param page  分页对象
     * @param level 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Level> page, Level level) {
        return success(this.levelService.page(page, new QueryWrapper<>(level)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.levelService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param level 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Level level) {
        return success(this.levelService.save(level));
    }

    /**
     * 修改数据
     *
     * @param level 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Level level) {
        return success(this.levelService.updateById(level));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.levelService.removeByIds(idList));
    }
}

