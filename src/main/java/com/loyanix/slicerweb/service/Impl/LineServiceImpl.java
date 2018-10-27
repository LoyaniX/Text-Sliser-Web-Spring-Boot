package com.loyanix.slicerweb.service.Impl;

import com.loyanix.slicerweb.entity.LineInfo;
import com.loyanix.slicerweb.repository.LineInfoRepository;
import com.loyanix.slicerweb.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineServiceImpl implements LineService {

    private LineInfoRepository lineInfoRepository;

    @Autowired
    public void setLineInfoRepository(LineInfoRepository lineInfoRepository) {
        this.lineInfoRepository = lineInfoRepository;
    }

    @Override
    public LineInfo get(Integer id) {
        return lineInfoRepository.getOne(id);
    }

    @Override
    public List<LineInfo> findAllOfFiles(Integer idFile) {
        return null;
    }

    @Override
    public List<LineInfo> findAll() {
        return lineInfoRepository.findAll();
    }
}
