package com.example.scm.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.example.scm.entity.Unit;

/**
 * 单位表(Unit)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-04 00:25:30
 */
public interface UnitDao extends BaseMapper<Unit> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Unit> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Unit> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Unit> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Unit> entities);

}

