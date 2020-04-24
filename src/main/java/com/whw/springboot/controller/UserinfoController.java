package com.whw.springboot.controller;

import com.whw.springboot.entity.Userinfo;
import com.whw.springboot.service.UserinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = "Userinfo接口")
//接口返回json数据，声明该类是Controller
@RestController
public class UserinfoController {

    @Autowired
    private UserinfoService userinfoService;

    /**
     * 查询单个用户
     */
    @ApiOperation(value = "用user_id查询单个user信息")
    @GetMapping(value = "userinfo/{user_id}")
    public Userinfo queryUserinfoById(@PathVariable("user_id") String user_id){
        Userinfo userinfo = userinfoService.queryUserinfoById(user_id);
        System.out.println(userinfo);
        return userinfo;

    }

    /**
     * 修改userinfo
     *

     */
    @ApiOperation(value = "按照userinfo 必须传入id 其他信息按照需求即可")
    @PutMapping( value = "userinfo")
    public int updataUser(Userinfo userinfo) {

        return userinfoService.updataUserinfo(userinfo);
    }

}
