package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.ReturnWorkViewDao;
import com.example.scm.entity.ReturnWorkView;
import com.example.scm.service.ReturnWorkViewService;
import org.springframework.stereotype.Service;

/**
 * (ReturnWorkView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-10 06:16:54
 */
@Service("returnWorkViewService")
public class ReturnWorkViewServiceImpl extends ServiceImpl<ReturnWorkViewDao, ReturnWorkView> implements ReturnWorkViewService {

}

