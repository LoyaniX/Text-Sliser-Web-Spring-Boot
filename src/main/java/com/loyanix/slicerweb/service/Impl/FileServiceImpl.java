package com.loyanix.slicerweb.service.Impl;

import com.loyanix.slicerweb.entity.FileInfo;
import com.loyanix.slicerweb.repository.FileInfoRepository;
import com.loyanix.slicerweb.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FileServiceImpl implements FileService {

    private FileInfoRepository fileInfoRepository;

    @Autowired
    public void setFileInfoRepository(FileInfoRepository fileInfoRepository) {
        this.fileInfoRepository = fileInfoRepository;
    }

    @Override
    public FileInfo get(Integer id) {
        return fileInfoRepository.getOne(id);
    }

    @Override
    public List<FileInfo> findAll() {
        return fileInfoRepository.findAll();
    }
}
