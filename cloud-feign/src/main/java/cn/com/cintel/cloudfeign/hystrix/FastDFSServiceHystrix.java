package cn.com.cintel.cloudfeign.hystrix;

import cn.com.cintel.cloudfeign.service.FastDFSService;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FastDFSServiceHystrix implements FastDFSService {

    @Override
    public String uploadFileToFast(MultipartFile file) {
        return "文件上传出现异常，请稍等。。。";
    }

}
