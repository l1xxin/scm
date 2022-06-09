package com.example.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.scm.entity.StudentTeam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 团队成员表(StudentTeam)表服务接口
 *
 * @author makejava
 * @since 2022-06-04 00:44:26
 */
public interface StudentTeamService extends IService<StudentTeam> {
    int insertBatch(List<StudentTeam> entities);

    int invite(StudentTeam studentTeam);
}

