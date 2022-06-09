package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (ReturnWorkView)表实体类
 *
 * @author makejava
 * @since 2022-06-10 06:16:54
 */
@SuppressWarnings("serial")
public class ReturnWorkView extends Model<ReturnWorkView> {
    //竞赛名称
    private String competitionName;
    //比赛级别名称
    private String levelName;
    //单位名称
    private String unitName;
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
    //审核状态
    private Integer workStatus;
    //返回意见
    private String returnComment;
    //学生编号
    private Integer studentId;


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

    public Integer getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(Integer workStatus) {
        this.workStatus = workStatus;
    }

    public String getReturnComment() {
        return returnComment;
    }

    public void setReturnComment(String returnComment) {
        this.returnComment = returnComment;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

}

