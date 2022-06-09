package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (GiveAwardView)表实体类
 *
 * @author makejava
 * @since 2022-06-09 20:01:03
 */
@SuppressWarnings("serial")
public class GiveAwardView extends Model<GiveAwardView> {
    //比赛编号
    private Integer race;
    //用户姓名
    private String stu;
    //用户姓名
    private String teacher;
    //团队编号(自增长)
    private Integer teamId;
    //团队名称

    private String teamName;
    //评分
    private Integer score;
    //得奖情况：-1未评奖
    private Integer awardId;


    public Integer getRace() {
        return race;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public String getStu() {
        return stu;
    }

    public void setStu(String stu) {
        this.stu = stu;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAwardId() {
        return awardId;
    }

    public void setAwardId(Integer awardId) {
        this.awardId = awardId;
    }

}

