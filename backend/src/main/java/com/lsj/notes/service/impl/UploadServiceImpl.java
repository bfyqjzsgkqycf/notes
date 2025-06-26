package com.lsj.notes.service.impl;

import com.lsj.notes.model.base.ApiResponse;
import com.lsj.notes.model.vo.upload.ImageVO;
import com.lsj.notes.service.FileService;
import com.lsj.notes.service.UploadService;
import com.lsj.notes.utils.ApiResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    FileService fileService;

    @Override
    public ApiResponse<ImageVO> uploadImage(MultipartFile file) {
        String url = fileService.uploadImage(file);
        ImageVO imageVO = new ImageVO();
        imageVO.setUrl(url);
        return ApiResponseUtil.success("上传成功", imageVO);
    }
}