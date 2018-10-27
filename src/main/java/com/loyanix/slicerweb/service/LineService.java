package com.loyanix.slicerweb.service;


import com.loyanix.slicerweb.entity.LineInfo;

import java.util.List;

public interface LineService {

    LineInfo get(Integer id);
    List<LineInfo> findAllOfFiles(Integer idFile);
    List<LineInfo> findAll();
 }
