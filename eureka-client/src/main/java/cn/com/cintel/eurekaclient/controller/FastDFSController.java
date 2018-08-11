package cn.com.cintel.eurekaclient.controller;

import cn.com.cintel.fastdfs.FastDFSUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FastDFSController {

    private static Logger logger = LoggerFactory.getLogger(FastDFSController.class);

    @PostMapping(value = "/uploadFileToFast",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE) //new annotation since 4.3
    @ResponseBody
    public String uploadFileToFast(@RequestPart("file") MultipartFile file) {

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