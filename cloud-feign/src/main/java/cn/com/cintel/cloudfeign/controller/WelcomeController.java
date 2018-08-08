package cn.com.cintel.cloudfeign.controller;

import cn.com.cintel.cloudfeign.service.FeignEntityService;
import cn.com.cintel.cloudfeign.service.FeignService;
import cn.com.cintel.pojo.BUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: sky
 * @Description:
 * @Date: Create in 16:47 2018/8/7
 * @Modified By:
 */
@RestController
public class WelcomeController {

    @Resource
    FeignService feignService;
    @Resource
    FeignEntityService feignEntityService;

    @ApiIgnore//使用该注解忽略这个API
    @GetMapping(value = "/getUserName/{id}",produces = "application/json;charset=utf-8")
    public String getUserName(@PathVariable(value = "id")String id){
        return feignService.getUserName(id);
    }

    @ApiIgnore//使用该注解忽略这个API
    @PostMapping(value = "/getUser",produces = "application/json;charset=utf-8")
    @ResponseBody
    List<BUser> getUser(@RequestParam()String id){
        BUser bUser = new BUser();
        bUser.setId(id);
        return feignEntityService.getUser(bUser);
    }

}
