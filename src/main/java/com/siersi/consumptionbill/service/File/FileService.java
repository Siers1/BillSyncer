package com.siersi.consumptionbill.service.File;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    String uploadImage(MultipartFile file);
}
