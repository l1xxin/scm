package com.example.scm.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (SignProgressView)表实体类
 *
 * @author makejava
 * @since 2022-06-09 17:39:43
 */
@SuppressWarnings("serial")
public class SignProgressView extends Model<SignProgressView> {
    //团队编号(自增长)
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

