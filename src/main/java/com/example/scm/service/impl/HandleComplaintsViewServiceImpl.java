package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.HandleComplaintsViewDao;
import com.example.scm.entity.HandleComplaintsView;
import com.example.scm.service.HandleComplaintsViewService;
import org.springframework.stereotype.Service;

/**
 * (HandleComplaintsView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-10 01:59:08
 */
@Service("handleComplaintsViewService")
public class HandleComplaintsViewServiceImpl extends ServiceImpl<HandleComplaintsViewDao, HandleComplaintsView> implements HandleComplaintsViewService {

}

