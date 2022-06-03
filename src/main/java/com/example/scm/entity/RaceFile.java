package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 比赛文件(RaceFile)表实体类
 *
 * @author makejava
 * @since 2022-06-04 00:44:24
 */
@SuppressWarnings("serial")
public class RaceFile extends Model<RaceFile> {
    //比赛编号
    private Integer raceId;
    //文件编号
    private Integer fileId;
    //删除位
    private Integer state;


    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
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
        return this.raceId;
    }
}

