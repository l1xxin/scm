package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.ComplaintsDao;
import com.example.scm.entity.Complaints;
import com.example.scm.service.ComplaintsService;
import org.springframework.stereotype.Service;

/**
 * 投诉表(Complaints)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:25:20
 */
@Service("complaintsService")
public class ComplaintsServiceImpl extends ServiceImpl<ComplaintsDao, Complaints> implements ComplaintsService {

}

