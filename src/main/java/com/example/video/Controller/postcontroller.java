package com.example.video.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class postcontroller {

    @PostMapping("/capture")
    public void video(@RequestParam MultipartFile file){
        MultipartFile file1 = file;
        System.out.println(file1.getName());
        System.out.println(file1.getSize());
        System.out.println(file1.getOriginalFilename());
        System.out.println(file1.getContentType());

    }
}
