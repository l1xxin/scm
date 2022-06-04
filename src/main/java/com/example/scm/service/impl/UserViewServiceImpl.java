package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.UserViewDao;
import com.example.scm.entity.UserView;
import com.example.scm.service.UserViewService;
import org.springframework.stereotype.Service;

/**
 * (UserView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 14:15:24
 */
@Service("userViewService")
public class UserViewServiceImpl extends ServiceImpl<UserViewDao, UserView> implements UserViewService {

}

