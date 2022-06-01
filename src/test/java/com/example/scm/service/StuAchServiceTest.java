package com.example.scm.service;

import com.example.scm.dto.StuAchDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcx
 * @Description: 学生成果测试类
 * @date 2022/6/2 1:31
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StuAchServiceTest {
    @Autowired
    private StuAchService stuAchService;

    /**
     * 按id查询该学生的获奖情况
     * @throws Exception
     */
    @Test
    public void stuAchCount() throws Exception{
        List<StuAchDTO> list = new ArrayList<>();
        list = stuAchService.listStuAch(3);
        for (StuAchDTO s : list){
            System.out.println(s.getId());
            System.out.println(s.getAwardName());
            System.out.println(s.getLevel());
            System.out.println(s.getTeacherName());
            System.out.println(s.getTeamName());
            System.out.println(s.getTime());
            System.out.println(s.getRaceName());
        }
    }
}
