package com.loyanix.slicerweb.service;

import com.loyanix.slicerweb.entity.FileInfo;

import java.util.List;

public interface FileService {

    FileInfo get(Integer id);
    List<FileInfo> findAll();
}
