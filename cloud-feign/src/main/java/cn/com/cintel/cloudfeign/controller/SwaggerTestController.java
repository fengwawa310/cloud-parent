package cn.com.cintel.cloudfeign.controller;

import cn.com.cintel.cloudfeign.pojo.Book;
import cn.com.cintel.pojo.BUser;
import io.swagger.annotations.*;
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
            @ApiImplicitParam(name = "bUser",value = "用户实体",required = true,dataType = "BUser")
    })
    public String updateBuser(@PathVariable(value = "id")String id,@RequestBody BUser bUser){
        bUser.setId(id);
        return bUser.getUserName();
    }


    @PostMapping(value = "/swaggerEntityDescribe")
    @ApiOperation(value = "实体类参数",notes = "json的字段中有详细说明,查看页面的Model选项")
    @ApiImplicitParam(name = "book",value = "书本实体",required = true,dataType = "Book",paramType = "body")
    public void swaggerEntityDescribe(@RequestBody Book book){
        System.out.println(book.getBookName());
    }


}
