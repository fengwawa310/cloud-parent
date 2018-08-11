package cn.com.cintel.cloudfeign.service;

import feign.RequestLine;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

//@FeignClient(value = "eureka-client",fallback = FastDFSServiceHystrix.class)
public interface FastDFSService {

//    @PostMapping(value = "/uploadFileToFast",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
//            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @RequestLine(value = "POST /uploadFileToFast")
    String uploadFileToFast(@RequestPart("file") MultipartFile file);

}
