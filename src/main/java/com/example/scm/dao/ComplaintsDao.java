package com.example.scm.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.example.scm.entity.Complaints;

/**
 * 投诉表(Complaints)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-30 19:46:42
 */
public interface ComplaintsDao extends BaseMapper<Complaints> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Complaints> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Complaints> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Complaints> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Complaints> entities);

}

