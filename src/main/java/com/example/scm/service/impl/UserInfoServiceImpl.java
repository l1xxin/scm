package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.UserInfoDao;
import com.example.scm.entity.UserInfo;
import com.example.scm.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * 用户信息表(UserInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-05-30 19:46:41
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements UserInfoService {

}

