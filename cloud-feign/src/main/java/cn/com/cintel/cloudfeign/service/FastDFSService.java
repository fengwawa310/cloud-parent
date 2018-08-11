package cn.com.cintel.cloudfeign.service;

import cn.com.cintel.cloudfeign.hystrix.FastDFSServiceHystrix;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "eureka-client",fallback = FastDFSServiceHystrix.class)
public interface FastDFSService {

    @RequestLine(value = "POST /uploadFileToFast")
    String uploadFileToFast(@Param("file") MultipartFile file);

}
