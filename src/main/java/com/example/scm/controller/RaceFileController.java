package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.RaceFile;
import com.example.scm.service.RaceFileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 比赛文件(RaceFile)表控制层
 *
 * @author makejava
 * @since 2022-06-04 00:44:24
 */
@RestController
@RequestMapping("raceFile")
public class RaceFileController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RaceFileService raceFileService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param raceFile 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RaceFile> page, RaceFile raceFile) {
        return success(this.raceFileService.page(page, new QueryWrapper<>(raceFile)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.raceFileService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param raceFile 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RaceFile raceFile) {
        return success(this.raceFileService.save(raceFile));
    }

    /**
     * 修改数据
     *
     * @param raceFile 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RaceFile raceFile) {
        return success(this.raceFileService.updateById(raceFile));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.raceFileService.removeByIds(idList));
    }
}

