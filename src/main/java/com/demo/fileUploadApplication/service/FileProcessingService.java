package com.demo.fileUploadApplication.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileProcessingService {
    public List<String> fileList();

    public String uploadFile(String fileName, MultipartFile multipartFile);

    public Resource downloadFile(String fileName);
}
