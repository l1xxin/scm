package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 参赛表(TeamRace)表实体类
 *
 * @author makejava
 * @since 2022-06-02 10:33:15
 */
@SuppressWarnings("serial")
public class TeamRace extends Model<TeamRace> {
    //团队编号(自增长)
    private Integer teamId;
    //比赛编号
    private Integer raceId;
    //报名进度
    private Integer progress;
    //评分
    private Object score;
    //得奖情况：-1未评奖
    private Integer awardsId;
    //删除位
    private Integer state;


    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public Integer getAwardsId() {
        return awardsId;
    }

    public void setAwardsId(Integer awardsId) {
        this.awardsId = awardsId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.teamId;
    }
}

