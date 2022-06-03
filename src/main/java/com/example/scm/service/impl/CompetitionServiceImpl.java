package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.CompetitionDao;
import com.example.scm.entity.Competition;
import com.example.scm.service.CompetitionService;
import org.springframework.stereotype.Service;

/**
 * 竞赛表
 * (Competition)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:25:19
 */
@Service("competitionService")
public class CompetitionServiceImpl extends ServiceImpl<CompetitionDao, Competition> implements CompetitionService {

}

