package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 团队比赛作品审核表(TeamWork)表实体类
 *
 * @author makejava
 * @since 2022-06-02 10:33:17
 */
@SuppressWarnings("serial")
public class TeamWork extends Model<TeamWork> {
    //团队编号
    private Integer teamId;
    //返回意见
    private String comment;
    //审核状态
    private Integer status;
    //删除位
    private Integer state;


    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

