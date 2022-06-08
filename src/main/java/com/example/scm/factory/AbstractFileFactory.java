package com.example.scm.factory;

import com.example.scm.entity.File;

//抽象工厂：提供了文件的生成方法
public interface AbstractFileFactory {
    public File newFile(String name, String md5, int userId, String fileName);
}