package cn.com.cintel.eurekaclient.controller;

import cn.com.cintel.fastdfs.FastDFSUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FastDFSController {

    private static Logger logger = LoggerFactory.getLogger(FastDFSController.class);

    @PostMapping(value = "/uploadFileToFast",consumes = "multipart/form-data") //new annotation since 4.3
    @ResponseBody
    public String uploadFileToFast(@RequestParam("file") MultipartFile file) {

        String path = "";

        if (file.isEmpty()) {
            return "Please select a file to upload";
        }
        try {
            // Get the file and save it somewhere
            path = FastDFSUtils.saveFile(file);
            System.out.println("fileName:"+file.getOriginalFilename());
        } catch (Exception e) {
            logger.error("upload file failed",e);
        }
        return path;
    }


}