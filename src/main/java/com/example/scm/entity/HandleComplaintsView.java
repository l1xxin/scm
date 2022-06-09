package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (HandleComplaintsView)表实体类
 *
 * @author makejava
 * @since 2022-06-10 01:59:07
 */
@SuppressWarnings("serial")
public class HandleComplaintsView extends Model<HandleComplaintsView> {
    //投诉编号(自增长)
    private Integer cId;
    //用户编号(自增长)
    private Integer uId;
    //用户姓名
    private String uName;
    //团队编号(自增长)
    private Integer tId;
    //团队名称

    private String tName;
    //比赛名称
    private String rName;
    //描述
    private String description;
    //投诉进度
    private Integer progress;

    private String status;
    //比赛编号(自增长)
    private Integer rId;


    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public Integer getTId() {
        return tId;
    }

    public void setTId(Integer tId) {
        this.tId = tId;
    }

    public String getTName() {
        return tName;
    }

    public void setTName(String tName) {
        this.tName = tName;
    }

    public String getRName() {
        return rName;
    }

    public void setRName(String rName) {
        this.rName = rName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

}

