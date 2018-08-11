package cn.com.cintel.cloudfeign.controller;


import cn.com.cintel.cloudfeign.service.FastDFSService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping("/fastdfs")
@Api(value = "测试文件上传到FastDFS")
public class FastDFSController {

    @Resource
    FastDFSService fastDFSService;

    @PostMapping(value = "/uploadFileToFast",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseBody
    @ApiOperation(value = "上传文件",notes = "上传单个文件到FastDFS")
    @ApiImplicitParam(name = "file",value = "上传的文件",required = true,dataType = "MultipartFile",paramType = "path")
    public String uploadFileToFast(@RequestPart("file")MultipartFile file){

        String result = "";

        if (file instanceof MultipartFile){
            System.out.println("file是MultipartFile类型");
            System.out.println(file.getOriginalFilename());
            result = fastDFSService.uploadFileToFast(file);
        }

        return result;
    }

}
