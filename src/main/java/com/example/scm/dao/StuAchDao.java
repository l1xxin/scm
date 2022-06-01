package com.example.scm.dao;

import com.example.scm.dto.StuAchDTO;

import java.util.List;

/**
 * @author lcx
 * @Description: 学生成果Dao
 * @date 2022/6/2 1:12
 */
public interface StuAchDao {
    /**
     * 根据id统计该学生所有获奖情况
     * @param id 学号
     * @return
     * @throws Exception
     */
    List<StuAchDTO> stuAchCount(Integer id) throws Exception;
}
