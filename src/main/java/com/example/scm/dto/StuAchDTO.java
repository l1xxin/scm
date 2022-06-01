package com.example.scm.dto;

import java.io.Serializable;

/**
 * @author lcx
 * @Description: 学生成果DTO
 * @date 2022/6/2 0:44
 */
public class StuAchDTO  implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = 1L;
    /**
     * 学生id
     */
    private Integer id;
    /**
     * 比赛名称
     */
    private String raceName;
    /**
     * 奖项名称
     */
    private String awardName;
    /**
     * 时间
     */
    private String time;
    /**
     * 比赛等级
     */
    private String level;
    /**
     * 团队名称
     */
    private String teamName;
    /**
     * 指导教师名称
     */
    private String teacherName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
