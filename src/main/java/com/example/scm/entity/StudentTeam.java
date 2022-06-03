package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 团队成员表(StudentTeam)表实体类
 *
 * @author makejava
 * @since 2022-06-04 00:44:26
 */
@SuppressWarnings("serial")
public class StudentTeam extends Model<StudentTeam> {
    //团队编号
    private Integer teamId;
    //学生编号
    private Integer studentId;
    //是否同意邀请

    private Integer status;
    //删除位
    private Integer state;


    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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

