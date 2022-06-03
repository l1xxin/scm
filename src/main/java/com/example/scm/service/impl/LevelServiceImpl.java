package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.LevelDao;
import com.example.scm.entity.Level;
import com.example.scm.service.LevelService;
import org.springframework.stereotype.Service;

/**
 * 比赛级别表(Level)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:25:23
 */
@Service("levelService")
public class LevelServiceImpl extends ServiceImpl<LevelDao, Level> implements LevelService {

}

