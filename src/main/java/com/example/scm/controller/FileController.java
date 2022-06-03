package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.File;
import com.example.scm.service.FileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 文件表(File)表控制层
 *
 * @author makejava
 * @since 2022-06-04 00:44:21
 */
@RestController
@RequestMapping("file")
public class FileController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private FileService fileService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param file 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<File> page, File file) {
        return success(this.fileService.page(page, new QueryWrapper<>(file)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.fileService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param file 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody File file) {
        return success(this.fileService.save(file));
    }

    /**
     * 修改数据
     *
     * @param file 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody File file) {
        return success(this.fileService.updateById(file));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.fileService.removeByIds(idList));
    }
}

