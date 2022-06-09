package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (ScoreView)表实体类
 *
 * @author makejava
 * @since 2022-06-10 06:17:51
 */
@SuppressWarnings("serial")
public class ScoreView extends Model<ScoreView> {
    //比赛编号
    private Integer raceId;
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
    //评分
    private Double score;
    //报名进度
    private Integer progress;


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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

}

