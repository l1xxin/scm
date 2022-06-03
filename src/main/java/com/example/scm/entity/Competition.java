package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 竞赛表
 * (Competition)表实体类
 *
 * @author makejava
 * @since 2022-06-04 00:44:20
 */
@SuppressWarnings("serial")
public class Competition extends Model<Competition> {
    //竞赛编号(自增长)
    private Integer id;
    //竞赛名称
    private String name;
    //竞赛介绍
    private String content;
    //删除位
    private Integer state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return this.id;
    }
}

