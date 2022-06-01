package com.example.scm.service;

import com.example.scm.dto.StuAchDTO;

import java.util.List;

/**
 * @author lcx
 * @Description:
 * @date 2022/6/2 1:17
 */
public interface StuAchService {

    List<StuAchDTO> listStuAch(Integer id) throws Exception;
}
