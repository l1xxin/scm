package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.TeamViewDao;
import com.example.scm.entity.TeamView;
import com.example.scm.service.TeamViewService;
import org.springframework.stereotype.Service;

/**
 * (TeamView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-10 06:20:22
 */
@Service("teamViewService")
public class TeamViewServiceImpl extends ServiceImpl<TeamViewDao, TeamView> implements TeamViewService {

}

