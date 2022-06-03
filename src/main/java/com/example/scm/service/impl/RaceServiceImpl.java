package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.RaceDao;
import com.example.scm.entity.Race;
import com.example.scm.service.RaceService;
import org.springframework.stereotype.Service;

/**
 * 比赛表(Race)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:25:22
 */
@Service("raceService")
public class RaceServiceImpl extends ServiceImpl<RaceDao, Race> implements RaceService {

}

