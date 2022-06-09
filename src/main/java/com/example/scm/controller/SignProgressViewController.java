package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.SignProgressView;
import com.example.scm.service.SignProgressViewService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (SignProgressView)表控制层
 *
 * @author makejava
 * @since 2022-06-09 17:39:43
 */
@RestController
@RequestMapping("signProgressView")
public class SignProgressViewController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SignProgressViewService signProgressViewService;

    /**
     * 分页查询所有数据
     *
     * @param page             分页对象
     * @param signProgressView 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SignProgressView> page, SignProgressView signProgressView) {
        return success(this.signProgressViewService.page(page, new QueryWrapper<>(signProgressView)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.signProgressViewService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param signProgressView 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SignProgressView signProgressView) {
        return success(this.signProgressViewService.save(signProgressView));
    }

    /**
     * 修改数据
     *
     * @param signProgressView 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SignProgressView signProgressView) {
        return success(this.signProgressViewService.updateById(signProgressView));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.signProgressViewService.removeByIds(idList));
    }
}

