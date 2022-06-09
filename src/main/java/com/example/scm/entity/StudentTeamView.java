package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (StudentTeamView)表实体类
 *
 * @author makejava
 * @since 2022-06-09 16:58:47
 */
@SuppressWarnings("serial")
public class StudentTeamView extends Model<StudentTeamView> {
    //学生编号
    private Integer studentId;
    //用户姓名
    private String studentName;
    //用户姓名
    private String inviteName;
    //比赛名称
    private String race;
    //比赛编号(自增长)
    private Integer raceId;
    //团队编号
    private Integer teamId;
    //是否同意邀请

    private Integer status;
    //用户编号
    private Integer inviteId;


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

