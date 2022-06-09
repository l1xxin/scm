package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (RaceAchByAwardView)表实体类
 *
 * @author makejava
 * @since 2022-06-09 23:00:57
 */
@SuppressWarnings("serial")
public class RaceAchByAwardView extends Model<RaceAchByAwardView> {
    //比赛编号(自增长)
    private Integer race;
    //奖项名称
    private String name;

    private Long value;


    public Integer getRace() {
        return race;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

}

