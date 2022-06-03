package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 比赛级别表(Level)表实体类
 *
 * @author makejava
 * @since 2022-06-04 00:44:22
 */
@SuppressWarnings("serial")
public class Level extends Model<Level> {
    //比赛级别编号(自增长)
    private Integer id;
    //比赛级别名称
    private String name;
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

