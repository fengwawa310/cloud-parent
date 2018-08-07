package cn.com.cintel.eurekaclient.controller;

import cn.com.cintel.pojo.BUser;
import cn.com.cintel.service.BUserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class WelcomeController {

    @Resource
    BUserService bUserService;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi",produces = "application/json;charset=utf-8")
    public String sayHi(@RequestParam(value = "name",defaultValue = "eureka-client")String name){
        return "Hi " + name + " ,I am from port:" + port;
    }

    @GetMapping(value = "/getUserName/{id}",produces = "application/json;charset=utf-8")
    public String getUserName(@PathVariable("id") String id){
        return bUserService.selectByPrimaryKey(id);
    }

    @PostMapping(value = "/getUser",produces = "application/json;charset=utf-8")
    public List<BUser> getUser(@RequestBody BUser bUser){
        return bUserService.selectByExample(bUser);
    }

}
