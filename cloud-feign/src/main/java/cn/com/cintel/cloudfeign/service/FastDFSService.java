package cn.com.cintel.cloudfeign.service;

import cn.com.cintel.cloudfeign.hystrix.FastDFSServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "eureka-client",fallback = FastDFSServiceHystrix.class)
public interface FastDFSService {

    @PostMapping(value = "/uploadFileToFast",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String uploadFileToFast(@RequestPart("file") MultipartFile file);

}
