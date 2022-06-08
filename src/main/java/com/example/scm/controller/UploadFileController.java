package com.example.scm.controller;

import com.example.scm.entity.File;
import com.example.scm.factory.FileFactory;
import com.example.scm.service.FileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.scm.config.UploadConfig;
import com.example.scm.util.FileUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import static com.example.scm.util.FileUtils.generateFileName;
import static com.example.scm.util.UploadUtils.*;

/**
 * 文件上传
 */
@RestController
@RequestMapping("/uploadFile")
public class UploadFileController {
    @Resource
    private FileService fileService;

    @RequestMapping(value = {"/"}, method = RequestMethod.POST)
    public void upload(String name, String md5, Long size, int userId, Integer chunks, Integer chunk, MultipartFile file) throws IOException {
        if (chunks != null && chunks != 0) {
            String fileName = getFileName(md5, chunks);
            FileUtils.writeWithBlok(UploadConfig.path + fileName, size, file.getInputStream(), file.getSize(), chunks, chunk);
            addChunk(md5, chunk);
            if (isUploaded(md5)) {
                removeKey(md5);
                fileService.save(FileFactory.getInstance().
                        newFile(name, md5, userId, UploadConfig.path + fileName));
            }
        } else {
            String path = UploadConfig.path + generateFileName();
            FileUtils.write(path, file.getInputStream());
            fileService.save(FileFactory.getInstance().
                    newFile(name, md5, userId, path));
        }
    }

    @RequestMapping(value = "/server", method = RequestMethod.GET)
    public void getServerFilesByPath(String path, HttpServletResponse response) throws IOException {
        java.io.File file = new java.io.File(path);
        byte[] buffer = new byte[1024];
        BufferedInputStream bis = null;
        OutputStream os = null;
        try {
            //文件是否存在
            if (file.exists()) {
                os = response.getOutputStream();
                bis = new BufferedInputStream(new FileInputStream(file));
                while (bis.read(buffer) != -1) {
                    os.write(buffer);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (os != null) {
                    os.flush();
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
