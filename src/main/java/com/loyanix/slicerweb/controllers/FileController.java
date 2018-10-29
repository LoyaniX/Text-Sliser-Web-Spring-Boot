package com.loyanix.slicerweb.controllers;

import com.loyanix.slicerweb.entity.FileInfo;
import com.loyanix.slicerweb.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FileController {

    private FileService fileService;

    @Autowired
    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/")
    public String list(Model model){
        List<FileInfo> fileInfos = fileService.findAll();
        model.addAttribute("filesInfo", fileInfos);
        return "index";
    }




}
