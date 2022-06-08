package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.TeamRaceViewDao;
import com.example.scm.entity.TeamRaceView;
import com.example.scm.service.TeamRaceViewService;
import org.springframework.stereotype.Service;

/**
 * (TeamRaceView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-08 22:17:19
 */
@Service("teamRaceViewService")
public class TeamRaceViewServiceImpl extends ServiceImpl<TeamRaceViewDao, TeamRaceView> implements TeamRaceViewService {

}

