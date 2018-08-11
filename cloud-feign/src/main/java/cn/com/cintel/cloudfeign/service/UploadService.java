package cn.com.cintel.cloudfeign.service;

import cn.com.cintel.cloudfeign.config.FeignFileEncoder;
import cn.com.cintel.cloudfeign.pojo.SystemConfig;
import feign.Feign;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Service
public class UploadService {

    @Resource
    SystemConfig systemConfig;

    public String uploadFile(MultipartFile file){
        FastDFSService fastDFSService = Feign.builder()
                .encoder(new FeignFileEncoder())
                .target(FastDFSService.class, systemConfig.getUploadUrl());
        return fastDFSService.uploadFileToFast(file);
    }

}
