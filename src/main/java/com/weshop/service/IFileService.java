package com.weshop.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Rufy
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
