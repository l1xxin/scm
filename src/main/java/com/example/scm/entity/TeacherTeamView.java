package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (TeacherTeamView)表实体类
 *
 * @author makejava
 * @since 2022-06-09 16:59:48
 */
@SuppressWarnings("serial")
public class TeacherTeamView extends Model<TeacherTeamView> {
    //指导教师编号
    private Integer teacherId;
    //用户姓名
    private String teacherName;
    //用户姓名
    private String inviteName;
    //比赛名称
    private String race;
    //比赛编号(自增长)
    private Integer raceId;
    //团队编号(自增长)
    private Integer teamId;
    //指导教师是否同意邀请
    private Integer status;
    //用户编号
    private Integer inviteId;


    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getInviteName() {
        return inviteName;
    }

    public void setInviteName(String inviteName) {
        this.inviteName = inviteName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getInviteId() {
        return inviteId;
    }

    public void setInviteId(Integer inviteId) {
        this.inviteId = inviteId;
    }

}

