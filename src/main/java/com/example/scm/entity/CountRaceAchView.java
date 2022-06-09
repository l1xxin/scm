package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (CountRaceAchView)表实体类
 *
 * @author makejava
 * @since 2022-06-09 18:57:13
 */
@SuppressWarnings("serial")
public class CountRaceAchView extends Model<CountRaceAchView> {
    //比赛编号(自增长)
    private Integer id;
    //比赛名称
    private String race;

    private String time;
    //单位名称
    private String unit;

    private Long win;

    private Long attend;
    //比赛级别名称
    private String level;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getWin() {
        return win;
    }

    public void setWin(Long win) {
        this.win = win;
    }

    public Long getAttend() {
        return attend;
    }

    public void setAttend(Long attend) {
        this.attend = attend;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}

