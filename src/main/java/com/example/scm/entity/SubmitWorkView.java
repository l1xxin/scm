package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (SubmitWorkView)表实体类
 *
 * @author makejava
 * @since 2022-06-10 06:19:35
 */
@SuppressWarnings("serial")
public class SubmitWorkView extends Model<SubmitWorkView> {
    //竞赛名称
    private String competitionName;
    //比赛级别名称
    private String levelName;
    //单位名称
    private String unitName;
    //学生编号
    private Integer studentId;
    //比赛编号
    private Integer raceId;
    //比赛名称
    private String raceName;
    //比赛要求
    private String raceRequest;
    //团队编号(自增长)
    private Integer teamId;
    //团队名称

    private String teamName;
    //报名进度
    private Integer progress;
    //指导教师编号
    private Integer teacherId;


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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getRaceRequest() {
        return raceRequest;
    }

    public void setRaceRequest(String raceRequest) {
        this.raceRequest = raceRequest;
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

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

}

