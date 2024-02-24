package com.gsoc.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface FileService {
    public String uploadVideo(String path, MultipartFile file) throws IOException;
}
