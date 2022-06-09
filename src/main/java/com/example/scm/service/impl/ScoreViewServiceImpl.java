package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.ScoreViewDao;
import com.example.scm.entity.ScoreView;
import com.example.scm.service.ScoreViewService;
import org.springframework.stereotype.Service;

/**
 * (ScoreView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-10 06:17:51
 */
@Service("scoreViewService")
public class ScoreViewServiceImpl extends ServiceImpl<ScoreViewDao, ScoreView> implements ScoreViewService {

}

