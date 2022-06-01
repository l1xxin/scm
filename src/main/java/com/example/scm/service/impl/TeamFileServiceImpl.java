package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.TeamFileDao;
import com.example.scm.entity.TeamFile;
import com.example.scm.service.TeamFileService;
import org.springframework.stereotype.Service;

/**
 * 团队比赛提交的文件表(TeamFile)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 19:46:49
 */
@Service("teamFileService")
public class TeamFileServiceImpl extends ServiceImpl<TeamFileDao, TeamFile> implements TeamFileService {

}

