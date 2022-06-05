package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (RaceView)表实体类
 *
 * @author makejava
 * @since 2022-06-05 10:57:49
 */
@SuppressWarnings("serial")
public class RaceView extends Model<RaceView> {
    //比赛编号(自增长)
    private Integer id;
    //比赛名称
    private String name;
    //用户姓名
    private String userName;
    //竞赛名称
    private String competitionName;
    //比赛级别名称
    private String levelName;
    //单位名称
    private String unitName;
    //报名起始时间
    private Date registrationStart;
    //报名结束时间
    private Date registrationEnd;
    //比赛起始时间
    private Date raceStart;
    //比赛结束时间
    private Date raceEnd;
    //比赛要求
    private String request;
    //比赛地点
    private String place;
    //比赛团队最少人数
    private Integer numberMin;
    //比赛团队最多人数
    private Integer numberMax;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Date getRegistrationStart() {
        return registrationStart;
    }

    public void setRegistrationStart(Date registrationStart) {
        this.registrationStart = registrationStart;
    }

    public Date getRegistrationEnd() {
        return registrationEnd;
    }

    public void setRegistrationEnd(Date registrationEnd) {
        this.registrationEnd = registrationEnd;
    }

    public Date getRaceStart() {
        return raceStart;
    }

    public void setRaceStart(Date raceStart) {
        this.raceStart = raceStart;
    }

    public Date getRaceEnd() {
        return raceEnd;
    }

    public void setRaceEnd(Date raceEnd) {
        this.raceEnd = raceEnd;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getNumberMin() {
        return numberMin;
    }

    public void setNumberMin(Integer numberMin) {
        this.numberMin = numberMin;
    }

    public Integer getNumberMax() {
        return numberMax;
    }

    public void setNumberMax(Integer numberMax) {
        this.numberMax = numberMax;
    }

}

