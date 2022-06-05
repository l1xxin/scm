package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.RaceViewDao;
import com.example.scm.entity.RaceView;
import com.example.scm.service.RaceViewService;
import org.springframework.stereotype.Service;

/**
 * (RaceView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-05 10:57:50
 */
@Service("raceViewService")
public class RaceViewServiceImpl extends ServiceImpl<RaceViewDao, RaceView> implements RaceViewService {

}

