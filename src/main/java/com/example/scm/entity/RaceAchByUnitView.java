package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (RaceAchByUnitView)表实体类
 *
 * @author makejava
 * @since 2022-06-09 18:50:32
 */
@SuppressWarnings("serial")
public class RaceAchByUnitView extends Model<RaceAchByUnitView> {
    //比赛编号(自增长)
    private Integer race;

    private Long value;
    //单位名称
    private String name;


    public Integer getRace() {
        return race;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

