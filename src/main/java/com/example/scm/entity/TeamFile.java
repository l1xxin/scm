package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 团队比赛提交的文件表(TeamFile)表实体类
 *
 * @author makejava
 * @since 2022-05-30 19:46:48
 */
@SuppressWarnings("serial")
public class TeamFile extends Model<TeamFile> {
    //文件编号
    private Integer fileId;
    //团队编号
    private Integer teamId;
    //删除位
    private Integer state;


    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
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
        return this.fileId;
    }
}

