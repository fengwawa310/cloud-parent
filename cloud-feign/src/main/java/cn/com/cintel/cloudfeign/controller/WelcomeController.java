package cn.com.cintel.cloudfeign.controller;

import cn.com.cintel.cloudfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: sky
 * @Description:
 * @Date: Create in 16:47 2018/8/7
 * @Modified By:
 */
@RestController
public class WelcomeController {

    @Autowired
    FeignService feignService;

    @GetMapping(value = "/getUserName/{id}",produces = "application/json;charset=utf-8")
    public String getUserName(@PathVariable(value = "id")String id){
        return feignService.getUserName(id);
    }

}
