package cn.com.cintel.cloudfeign.service;

import cn.com.cintel.cloudfeign.hystrix.FeignEntityServiceHystrix;
import cn.com.cintel.pojo.BUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Auther: sky
 * @Description:
 * @Date: Create in 17:19 2018/8/7
 * @Modified By:
 */
@FeignClient(value = "eureka-client",fallback = FeignEntityServiceHystrix.class)
public interface FeignEntityService {

    @PostMapping(value = "/getUser",produces = "application/json;charset=utf-8")
    List<BUser> getUser(@RequestBody BUser bUser);

}
