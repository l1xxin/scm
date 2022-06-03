package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.TeamDao;
import com.example.scm.entity.Team;
import com.example.scm.service.TeamService;
import org.springframework.stereotype.Service;

/**
 * 团队表(Team)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:44:27
 */
@Service("teamService")
public class TeamServiceImpl extends ServiceImpl<TeamDao, Team> implements TeamService {

}

