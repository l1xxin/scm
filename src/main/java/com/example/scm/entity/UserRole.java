package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 用户角色分配表(UserRole)表实体类
 *
 * @author makejava
 * @since 2022-05-30 19:46:43
 */
@SuppressWarnings("serial")
public class UserRole extends Model<UserRole> {
    //用户编号
    private Integer userId;
    //用户角色
    private Integer roleId;
    //删除位
    private Integer state;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
        return this.userId;
    }
}

