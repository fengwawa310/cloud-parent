package cn.com.cintel.cloudfeign.service;

import cn.com.cintel.cloudfeign.config.FeignSpringFormEncoder;
import feign.Feign;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadService {

    public String uploadFile(MultipartFile file){
        FastDFSService fastDFSService = Feign.builder()
                .encoder(new FeignSpringFormEncoder())
                .target(FastDFSService.class, "http://127.0.0.1:8081");
        return fastDFSService.uploadFileToFast(file);
    }

}
