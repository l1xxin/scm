package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.StudentTeamDao;
import com.example.scm.entity.StudentTeam;
import com.example.scm.service.StudentTeamService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 团队成员表(StudentTeam)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:44:26
 */
@Service("studentTeamService")
public class StudentTeamServiceImpl extends ServiceImpl<StudentTeamDao, StudentTeam> implements StudentTeamService {

    @Override
    public int insertBatch(List<StudentTeam> entities) {
        return super.baseMapper.insertBatch(entities);
    }

    @Override
    public int invite(StudentTeam studentTeam) {
        return super.baseMapper.invite(studentTeam);
    }
}

