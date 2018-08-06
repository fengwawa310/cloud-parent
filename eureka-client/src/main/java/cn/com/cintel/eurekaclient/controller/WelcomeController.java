package cn.com.cintel.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi", produces="application/json")
    public String sayHi(@RequestParam(value = "name",defaultValue = "eureka-client")String name){
        return "Hi " + name + " ,I am from port:" + port;
    }

}
