package com.example.scm.service.impl;

import com.example.scm.dao.StuAchDao;
import com.example.scm.dto.StuAchDTO;
import com.example.scm.service.StuAchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lcx
 * @Description:
 * @date 2022/6/2 1:17
 */
@Service
public class StuAchServiceImpl implements StuAchService {
    @Autowired
    private StuAchDao stuAchDao;

    @Override
    public List<StuAchDTO> listStuAch(Integer id) throws Exception {
        return stuAchDao.stuAchCount(id);
    }
}
