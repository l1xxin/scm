package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.SignProgressViewDao;
import com.example.scm.entity.SignProgressView;
import com.example.scm.service.SignProgressViewService;
import org.springframework.stereotype.Service;

/**
 * (SignProgressView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-09 17:39:43
 */
@Service("signProgressViewService")
public class SignProgressViewServiceImpl extends ServiceImpl<SignProgressViewDao, SignProgressView> implements SignProgressViewService {

}

