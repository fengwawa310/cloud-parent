package cn.com.cintel.cloudfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: sky
 * @Description:
 * @Date: Create in 16:47 2018/8/7
 * @Modified By:
 */
@FeignClient(value = "eureka-client")
public interface FeignService {

    @GetMapping(value = "/getUserName/{id}",produces = "application/json;charset=utf-8")
    String getUserName(@PathVariable(value = "id")String id);

}
