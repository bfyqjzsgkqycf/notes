package com.lsj.notes.service;

import com.lsj.notes.model.base.ApiResponse;
import com.lsj.notes.model.vo.upload.ImageVO;
import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    /**
     * 上传图片
     */
    ApiResponse<ImageVO> uploadImage(MultipartFile file);
}