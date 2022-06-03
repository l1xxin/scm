package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.StudentTeam;
import com.example.scm.service.StudentTeamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 团队成员表(StudentTeam)表控制层
 *
 * @author makejava
 * @since 2022-06-04 00:25:25
 */
@RestController
@RequestMapping("studentTeam")
public class StudentTeamController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private StudentTeamService studentTeamService;

    /**
     * 分页查询所有数据
     *
     * @param page        分页对象
     * @param studentTeam 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<StudentTeam> page, StudentTeam studentTeam) {
        return success(this.studentTeamService.page(page, new QueryWrapper<>(studentTeam)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.studentTeamService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param studentTeam 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody StudentTeam studentTeam) {
        return success(this.studentTeamService.save(studentTeam));
    }

    /**
     * 修改数据
     *
     * @param studentTeam 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody StudentTeam studentTeam) {
        return success(this.studentTeamService.updateById(studentTeam));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.studentTeamService.removeByIds(idList));
    }
}

