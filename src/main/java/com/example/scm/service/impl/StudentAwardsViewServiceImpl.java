package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.StudentAwardsViewDao;
import com.example.scm.entity.StudentAwardsView;
import com.example.scm.service.StudentAwardsViewService;
import org.springframework.stereotype.Service;

/**
 * (StudentAwardsView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-10 06:18:59
 */
@Service("studentAwardsViewService")
public class StudentAwardsViewServiceImpl extends ServiceImpl<StudentAwardsViewDao, StudentAwardsView> implements StudentAwardsViewService {

}

