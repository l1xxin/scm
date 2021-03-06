package com.example.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.scm.entity.StudentTeam;
import com.example.scm.entity.Team;
import org.apache.ibatis.annotations.Param;

/**
 * 团队表(Team)表服务接口
 *
 * @author makejava
 * @since 2022-06-04 00:44:27
 */
public interface TeamService extends IService<Team> {
    int invite(Team team);
}

