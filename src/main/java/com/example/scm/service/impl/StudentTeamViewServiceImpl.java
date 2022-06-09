package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.StudentTeamViewDao;
import com.example.scm.entity.StudentTeamView;
import com.example.scm.service.StudentTeamViewService;
import org.springframework.stereotype.Service;

/**
 * (StudentTeamView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-09 16:58:47
 */
@Service("studentTeamViewService")
public class StudentTeamViewServiceImpl extends ServiceImpl<StudentTeamViewDao, StudentTeamView> implements StudentTeamViewService {

}

