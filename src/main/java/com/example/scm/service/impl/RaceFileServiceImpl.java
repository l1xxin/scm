package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.RaceFileDao;
import com.example.scm.entity.RaceFile;
import com.example.scm.service.RaceFileService;
import org.springframework.stereotype.Service;

/**
 * 比赛文件(RaceFile)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:44:25
 */
@Service("raceFileService")
public class RaceFileServiceImpl extends ServiceImpl<RaceFileDao, RaceFile> implements RaceFileService {

}

