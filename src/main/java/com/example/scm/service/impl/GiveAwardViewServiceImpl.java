package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.GiveAwardViewDao;
import com.example.scm.entity.GiveAwardView;
import com.example.scm.service.GiveAwardViewService;
import org.springframework.stereotype.Service;

/**
 * (GiveAwardView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-09 20:01:04
 */
@Service("giveAwardViewService")
public class GiveAwardViewServiceImpl extends ServiceImpl<GiveAwardViewDao, GiveAwardView> implements GiveAwardViewService {

}

