package cn.com.cintel.cloudfeign.service;

import cn.com.cintel.cloudfeign.hystrix.FastDFSServiceHystrix;
import cn.com.cintel.cloudfeign.hystrix.FeignEntityServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "eureka-client",fallback = FastDFSServiceHystrix.class)
public interface FastDFSService {

    @PostMapping("/uploadFileToFast")
    String uploadFileToFast(@RequestParam("file") MultipartFile file);

}
