package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (StudentAwardsView)表实体类
 *
 * @author makejava
 * @since 2022-06-10 06:18:59
 */
@SuppressWarnings("serial")
public class StudentAwardsView extends Model<StudentAwardsView> {
    //得奖情况：-1未评奖
    private Integer awardsId;
    //奖项名称
    private String awardsName;
    //比赛名称
    private String raceName;
    //竞赛名称
    private String competitionName;
    //比赛级别名称
    private String levelName;
    //单位名称
    private String unitName;
    //团队编号(自增长)
    private Integer teamId;
    //团队名称

    private String teamName;
    //学生编号
    private Integer studentId;


    public Integer getAwardsId() {
        return awardsId;
    }

    public void setAwardsId(Integer awardsId) {
        this.awardsId = awardsId;
    }

    public String getAwardsName() {
        return awardsName;
    }

    public void setAwardsName(String awardsName) {
        this.awardsName = awardsName;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

}

