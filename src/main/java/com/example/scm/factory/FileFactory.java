package com.example.scm.factory;

import com.example.scm.config.UploadConfig;
import com.example.scm.entity.File;

import java.util.Date;

//具体工厂：实现了文件的生成方法
public class FileFactory implements AbstractFileFactory {
    //保证 instance 在所有线程中同步
    private static volatile FileFactory instance = null;

    private FileFactory() {
    }

    //private 避免类在外部被实例化
    public static synchronized FileFactory getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new FileFactory();
        }
        return instance;
    }

    public File newFile(String name, String md5, int userId, String fileName) {
        File file = new File();
        file.setName(name);
        file.setMd5(md5);
        file.setPath(UploadConfig.path + fileName);
        file.setUploadTime(new Date());
        file.setUserId(userId);
        return file;
    }
}