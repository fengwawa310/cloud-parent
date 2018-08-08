package cn.com.cintel.cloudfeign.controller;

import cn.com.cintel.pojo.BUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * 需要访问http://localhost:8082/cloud-feign/swagger-ui.html
 */
@RestController
@RequestMapping("/swagger")
@Api(value = "测试swagger的controller")
public class SwaggerTestController {

    @GetMapping(value = "/{id}",produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取用户信息",notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id",value = "用户ID",required = true,dataType = "String",paramType = "path")
    public BUser getUser(@PathVariable(value = "id") String id){
        BUser bUser = new BUser();
        bUser.setUserName("swagger");
        bUser.setId(id);
        return bUser;
    }


    @PutMapping(value = "/updateBuser/{id}")
    @ApiOperation(value = "更新用户信息",notes = "根据url的id和用户实体来跟新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户ID",required = true,dataType = "String",paramType = "path"),
            @ApiImplicitParam(name = "buser",value = "用户实体",required = true,dataType = "BUser")
    })
    public String updateBuser(@PathVariable(value = "id")String id,@RequestBody BUser bUser){
        bUser.setUserName("swagger");
        bUser.setId(id);
        return bUser.getUserName();
    }

}
