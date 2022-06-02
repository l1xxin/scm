package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.TeamRaceDao;
import com.example.scm.entity.TeamRace;
import com.example.scm.service.TeamRaceService;
import org.springframework.stereotype.Service;

/**
 * 参赛表(TeamRace)表服务实现类
 *
 * @author makejava
 * @since 2022-06-02 10:33:16
 */
@Service("teamRaceService")
public class TeamRaceServiceImpl extends ServiceImpl<TeamRaceDao, TeamRace> implements TeamRaceService {

}

