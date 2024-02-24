package com.gsoc.controllers;

import com.gsoc.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileservice;
    @Value("${project.video}")
    private String path;

    @PostMapping("/upload")
    public String fileUpload(
            @RequestParam("video")MultipartFile video
            ) throws IOException {
        String fileName=this.fileservice.uploadVideo(path,video);
        return fileName;
    }


    @GetMapping("/allfiles")
    public ResponseEntity<List<String>>getAllVideos() throws Exception{
        File direc=new File(path);
        if(!direc.exists() || !direc.isDirectory()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        File[] files=direc.listFiles();
        List<String> videoNames=new ArrayList<>();
        if(files!=null){
            for(File file:files){
                if(file.isFile()){
                    videoNames.add(file.getName());
                }
            }
        }
        if(videoNames.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(videoNames,HttpStatus.OK);
    }

}
