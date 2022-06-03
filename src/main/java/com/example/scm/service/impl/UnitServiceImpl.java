package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.UnitDao;
import com.example.scm.entity.Unit;
import com.example.scm.service.UnitService;
import org.springframework.stereotype.Service;

/**
 * 单位表(Unit)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:44:31
 */
@Service("unitService")
public class UnitServiceImpl extends ServiceImpl<UnitDao, Unit> implements UnitService {

}

