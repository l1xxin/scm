package com.example.scm.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * MyBatis-Plus配置类
 * @author ZeyFra
 * @date 2021/2/16 13:27
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.example.scm.dao")
public class MybatisPlusConfig {

    @Bean("sqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Autowired @Qualifier("dataSource") DataSource dataSource) throws Exception {
        // 未使用MyBatis-Plus的分页插件的小伙伴可忽略此部分
        // MybatisPlus内部拦截器
        // 为自动分页插件设置DB类型
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));

        // 可添加自定义拦截器，没有自定义拦截器的小伙伴可忽略此部分
        // MybatisConfiguration
        MybatisConfiguration mybatisConfiguration = new MybatisConfiguration();
        mybatisConfiguration.addInterceptor(mybatisPlusInterceptor);

        // 开启缓存，可自行选择
        mybatisConfiguration.setCacheEnabled(true);

        // 使用MybatisSqlSessionFactoryBean
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();

        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);

        // 添加MybatisConfiguration
        sqlSessionFactoryBean.setConfiguration(mybatisConfiguration);

        // 设置mapper相应的xml路径
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapper/*.xml"));

        // 主键自增
        sqlSessionFactoryBean.getConfiguration().getGlobalConfig().getDbConfig().setIdType(IdType.AUTO);
        // 逻辑删除位
        sqlSessionFactoryBean.getConfiguration().getGlobalConfig().getDbConfig().setLogicDeleteField("state");
        // 插入和修改策略
        sqlSessionFactoryBean.getConfiguration().getGlobalConfig().getDbConfig().setUpdateStrategy(FieldStrategy.NOT_NULL);
        sqlSessionFactoryBean.getConfiguration().getGlobalConfig().getDbConfig().setInsertStrategy(FieldStrategy.NOT_NULL);

        // 配置打印sql语句
        sqlSessionFactoryBean.getConfiguration().setLogImpl(StdOutImpl.class);

        // 返回MybatisSqlSessionFactoryBean从而替代原生的sqlSessionFactory
        return sqlSessionFactoryBean.getObject();
    }

}