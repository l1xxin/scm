package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.TeacherTeamViewDao;
import com.example.scm.entity.TeacherTeamView;
import com.example.scm.service.TeacherTeamViewService;
import org.springframework.stereotype.Service;

/**
 * (TeacherTeamView)表服务实现类
 *
 * @author makejava
 * @since 2022-06-09 16:59:48
 */
@Service("teacherTeamViewService")
public class TeacherTeamViewServiceImpl extends ServiceImpl<TeacherTeamViewDao, TeacherTeamView> implements TeacherTeamViewService {

}

