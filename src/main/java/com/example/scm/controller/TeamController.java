package com.example.scm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.scm.entity.StudentTeam;
import com.example.scm.entity.Team;
import com.example.scm.entity.TeamRace;
import com.example.scm.service.SignProgressViewService;
import com.example.scm.service.TeamRaceService;
import com.example.scm.service.TeamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 团队表(Team)表控制层
 *
 * @author makejava
 * @since 2022-06-04 00:44:26
 */
@RestController
@RequestMapping("team")
public class TeamController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TeamService teamService;

    /**
     * 服务对象
     */
    @Resource
    private TeamRaceService teamRaceService;

    /**
     * 服务对象
     */
    @Resource
    private SignProgressViewService signProgressViewService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param team 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Team> page, Team team) {
        return success(this.teamService.page(page, new QueryWrapper<>(team)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.teamService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param team 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Team team) {
        return success(this.teamService.save(team));
    }

    /**
     * 修改数据
     *
     * @param team 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Team team) {
        return success(this.teamService.updateById(team));
    }

    /**
     * 修改数据
     *
     * @param team 实体对象
     * @return 修改结果
     */
    @RequestMapping(value = {"/invite"}, method = RequestMethod.PUT)
    public R invite(@RequestBody Team team) {
        int result = this.teamService.invite(team);
        if (signProgressViewService.getById(team.getId()) == null) {
            // 构造条件构造器
            UpdateWrapper<TeamRace> wrapper = new UpdateWrapper<>();
            wrapper.eq("team_id", team.getId());
            wrapper.set("progress", 1);
            teamRaceService.update(wrapper);
        }
        return success(result);
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.teamService.removeByIds(idList));
    }
}

