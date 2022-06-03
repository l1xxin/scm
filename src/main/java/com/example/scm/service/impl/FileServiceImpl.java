package com.example.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.scm.dao.FileDao;
import com.example.scm.entity.File;
import com.example.scm.service.FileService;
import org.springframework.stereotype.Service;

/**
 * 文件表(File)表服务实现类
 *
 * @author makejava
 * @since 2022-06-04 00:25:21
 */
@Service("fileService")
public class FileServiceImpl extends ServiceImpl<FileDao, File> implements FileService {

}

