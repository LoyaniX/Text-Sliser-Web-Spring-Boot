package com.loyanix.slicerweb.repository;

import com.loyanix.slicerweb.entity.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileInfoRepository extends JpaRepository<FileInfo, Integer> {
}
