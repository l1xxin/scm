package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (RaceAchView)表实体类
 *
 * @author makejava
 * @since 2022-06-09 22:29:52
 */
@SuppressWarnings("serial")
public class RaceAchView extends Model<RaceAchView> {
    //比赛编号(自增长)
    private Integer race;
    //团队编号(自增长)
    private Integer team;
    //用户姓名
    private String stu;
    //团队名称

    private String name;
    //单位名称
    private String unit;
    //用户姓名
    private String teacher;
    //奖项名称
    private String award;


    public Integer getRace() {
        return race;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public String getStu() {
        return stu;
    }

    public void setStu(String stu) {
        this.stu = stu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

}

