package cn.com.cintel.cloudfeign.controller;


import cn.com.cintel.cloudfeign.service.FastDFSService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping("/fastdfs")
@Api(value = "测试文件上传到FastDFS")
public class FastDFSController {

    @Resource
    FastDFSService fastDFSService;

    @PostMapping("/uploadFileToFast")
    @ApiOperation(value = "上传文件",notes = "上传单个文件到FastDFS")
    @ApiImplicitParam(name = "file",value = "上传的文件",required = true,dataType = "MultipartFile",paramType = "path")
    public String uploadFileToFast(@RequestParam("file")MultipartFile file){
        return fastDFSService.uploadFileToFast(file);
    }

}
