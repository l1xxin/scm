package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 比赛表(Race)表实体类
 *
 * @author makejava
 * @since 2022-06-05 10:57:25
 */
@SuppressWarnings("serial")
public class Race extends Model<Race> {
    //比赛编号(自增长)
    private Integer id;
    //竞赛编号
    private Integer competitionId;
    //比赛级别编号
    private Integer levelId;
    //单位编号
    private Integer unitId;
    //比赛名称
    private String name;
    //比赛要求
    private String request;
    //比赛地点
    private String place;
    //报名起始时间
    private Date registrationStart;
    //报名结束时间
    private Date registrationEnd;
    //比赛起始时间
    private Date raceStart;
    //比赛结束时间
    private Date raceEnd;
    //比赛团队最少人数
    private Integer numberMin;
    //比赛团队最多人数
    private Integer numberMax;
    //是否评奖
    private Integer status;
    //删除位
    private Integer state;
    //发布用户
    private Integer userId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}

