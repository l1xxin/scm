package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.AwardsDao;
import com.example.scm.entity.Awards;
import com.example.scm.service.AwardsService;
import org.springframework.stereotype.Service;

/**
 * 奖项表(Awards)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 19:46:48
 */
@Service("awardsService")
public class AwardsServiceImpl extends ServiceImpl<AwardsDao, Awards> implements AwardsService {

}

